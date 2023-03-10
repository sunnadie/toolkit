package ss.com.toolkit.util.rx;

import io.reactivex.Scheduler;

/**
 * Created by charles on 2018/5/15.
 */

public class RxThreadComposeUtil {
    /**
     * 主要用来切换线程,无参数时按如下设置，也可以指定线程
     * subscribeOn（Schedulers.io()）
     * obserceOn(AndroidSchedulers.mainThread())
     * @param <T>
     * @return
     */
    public static <T> ThreadTransformer<T> applySchedulers() {
        return new ThreadTransformer<>();
    }

    public static <T> ThreadTransformer<T> applySchedulers(final Scheduler subscribeOnScheduler,
                                                           final Scheduler observeOnScheduler ) {
        return new ThreadTransformer<>(subscribeOnScheduler,observeOnScheduler);
    }

    /*public static <T> ObservableSubscribeProxy<T> autoRelease(Observable<T> observable , LifecycleOwner owner){
        return observable.as(AutoDispose.<T>autoDisposable(AndroidLifecycleScopeProvider.from(owner , Lifecycle.Event.ON_DESTROY)));
    }*/
}
