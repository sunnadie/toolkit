package com.ss.opengl

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.opengl.GLES20
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.TextureView
import android.view.View
import android.view.View.OnAttachStateChangeListener
import com.apkfuns.logutils.LogUtils
import ss.com.toolkit.R

var surfaceView: SurfaceView? = null
var isExit: Boolean? = false

class OpenglWindowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.tag("nadiee").d("OpenglWindowActivity")
        setContentView(R.layout.opengl_window);
        initView();
    }

    private fun initView() {
        val textureView: TextureView? = null
        surfaceView = findViewById(R.id.surfaceView)
        surfaceView?.holder?.addCallback(object : SurfaceHolder.Callback {
            var holder: SurfaceHolder? = null
            override fun surfaceCreated(holder: SurfaceHolder) {
                LogUtils.tag("nadiee").d("surfaceCreated")
                this.holder = holder;
                GLThread(holder).start()
            }

            override fun surfaceChanged(
                holder: SurfaceHolder,
                format: Int,
                width: Int,
                height: Int
            ) {
                LogUtils.tag("nadiee").d("surfaceChanged")
                GLES20.glViewport(0, 0, width, height)
            }

            override fun surfaceDestroyed(holder: SurfaceHolder) {
                LogUtils.tag("nadiee").d("surfaceDestroyed")
            }
        })
        surfaceView?.addOnAttachStateChangeListener(object : OnAttachStateChangeListener {
            override fun onViewAttachedToWindow(v: View?) {

            }

            override fun onViewDetachedFromWindow(v: View?) {

            }
        })
    }

    fun openglWindow(view: View) {

    }

    class GLThread(h: SurfaceHolder?) : Thread() {
        var holder: SurfaceHolder? = h
        override fun run() {
            var c: Canvas? = null
            var count: Int = 0
            while (!isExit!!) {
                c = holder?.lockCanvas() //????????????????????????????????????????????????????????????????????????Canvas????????????????????????????????????  
                try {
                    holder?.let {
                        synchronized(it) {
                            c?.drawColor(Color.BLACK)//????????????????????????
                            var p = Paint() //????????????
                            p.setColor(Color.WHITE)
                            var r = Rect(100, 50, 300, 250)
                            c?.drawRect(r, p);
                            c?.drawText("?????????" + (count++) + "???", 100f, 310f, p)
                            Thread.sleep(1000);//???????????????1???
                        }
                    }
                } catch (e: Exception) {
                    e.printStackTrace();
                } finally {
                    if (c != null) {
                        holder?.unlockCanvasAndPost(c);//???????????????????????????????????????
                    }
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        isExit = true
    }
}