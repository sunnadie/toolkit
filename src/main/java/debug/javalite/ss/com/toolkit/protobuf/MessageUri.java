// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageUri.proto

package ss.com.toolkit.protobuf;

public final class MessageUri {
  private MessageUri() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  /**
   * Protobuf enum {@code ss.com.toolkit.protobuf.GameMessageReqUri}
   */
  public enum GameMessageReqUri
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>QuickStartRequestUri = 0;</code>
     */
    QuickStartRequestUri(0),
    /**
     * <code>MatchStartRequestUri = 1001;</code>
     */
    MatchStartRequestUri(1001),
    /**
     * <code>LeaveRoomRequestUri = 1002;</code>
     */
    LeaveRoomRequestUri(1002),
    /**
     * <code>UserStatRequestUri = 1003;</code>
     */
    UserStatRequestUri(1003),
    /**
     * <code>HeartbeatRequestUri = 1004;</code>
     */
    HeartbeatRequestUri(1004),
    /**
     * <code>HeartbeatEndRequestUri = 1005;</code>
     */
    HeartbeatEndRequestUri(1005),
    /**
     * <code>GameUserEmptyRequestUri = 1006;</code>
     */
    GameUserEmptyRequestUri(1006),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>QuickStartRequestUri = 0;</code>
     */
    public static final int QuickStartRequestUri_VALUE = 0;
    /**
     * <code>MatchStartRequestUri = 1001;</code>
     */
    public static final int MatchStartRequestUri_VALUE = 1001;
    /**
     * <code>LeaveRoomRequestUri = 1002;</code>
     */
    public static final int LeaveRoomRequestUri_VALUE = 1002;
    /**
     * <code>UserStatRequestUri = 1003;</code>
     */
    public static final int UserStatRequestUri_VALUE = 1003;
    /**
     * <code>HeartbeatRequestUri = 1004;</code>
     */
    public static final int HeartbeatRequestUri_VALUE = 1004;
    /**
     * <code>HeartbeatEndRequestUri = 1005;</code>
     */
    public static final int HeartbeatEndRequestUri_VALUE = 1005;
    /**
     * <code>GameUserEmptyRequestUri = 1006;</code>
     */
    public static final int GameUserEmptyRequestUri_VALUE = 1006;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameMessageReqUri valueOf(int value) {
      return forNumber(value);
    }

    public static GameMessageReqUri forNumber(int value) {
      switch (value) {
        case 0: return QuickStartRequestUri;
        case 1001: return MatchStartRequestUri;
        case 1002: return LeaveRoomRequestUri;
        case 1003: return UserStatRequestUri;
        case 1004: return HeartbeatRequestUri;
        case 1005: return HeartbeatEndRequestUri;
        case 1006: return GameUserEmptyRequestUri;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameMessageReqUri>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameMessageReqUri> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameMessageReqUri>() {
            public GameMessageReqUri findValueByNumber(int number) {
              return GameMessageReqUri.forNumber(number);
            }
          };

    private final int value;

    private GameMessageReqUri(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ss.com.toolkit.protobuf.GameMessageReqUri)
  }

  /**
   * Protobuf enum {@code ss.com.toolkit.protobuf.GameMessageRespUri}
   */
  public enum GameMessageRespUri
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>QuickStartResponseUri = 0;</code>
     */
    QuickStartResponseUri(0),
    /**
     * <code>MatchStartResponseUri = 2001;</code>
     */
    MatchStartResponseUri(2001),
    /**
     * <code>LeaveRoomResponseUri = 2002;</code>
     */
    LeaveRoomResponseUri(2002),
    /**
     * <code>UserStatResponseUri = 2003;</code>
     */
    UserStatResponseUri(2003),
    /**
     * <code>HeartbeatResponseUri = 2004;</code>
     */
    HeartbeatResponseUri(2004),
    /**
     * <code>HeartbeatEndResponseUri = 2005;</code>
     */
    HeartbeatEndResponseUri(2005),
    /**
     * <code>GameUserEmptyResponseUri = 2006;</code>
     */
    GameUserEmptyResponseUri(2006),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>QuickStartResponseUri = 0;</code>
     */
    public static final int QuickStartResponseUri_VALUE = 0;
    /**
     * <code>MatchStartResponseUri = 2001;</code>
     */
    public static final int MatchStartResponseUri_VALUE = 2001;
    /**
     * <code>LeaveRoomResponseUri = 2002;</code>
     */
    public static final int LeaveRoomResponseUri_VALUE = 2002;
    /**
     * <code>UserStatResponseUri = 2003;</code>
     */
    public static final int UserStatResponseUri_VALUE = 2003;
    /**
     * <code>HeartbeatResponseUri = 2004;</code>
     */
    public static final int HeartbeatResponseUri_VALUE = 2004;
    /**
     * <code>HeartbeatEndResponseUri = 2005;</code>
     */
    public static final int HeartbeatEndResponseUri_VALUE = 2005;
    /**
     * <code>GameUserEmptyResponseUri = 2006;</code>
     */
    public static final int GameUserEmptyResponseUri_VALUE = 2006;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameMessageRespUri valueOf(int value) {
      return forNumber(value);
    }

    public static GameMessageRespUri forNumber(int value) {
      switch (value) {
        case 0: return QuickStartResponseUri;
        case 2001: return MatchStartResponseUri;
        case 2002: return LeaveRoomResponseUri;
        case 2003: return UserStatResponseUri;
        case 2004: return HeartbeatResponseUri;
        case 2005: return HeartbeatEndResponseUri;
        case 2006: return GameUserEmptyResponseUri;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameMessageRespUri>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameMessageRespUri> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameMessageRespUri>() {
            public GameMessageRespUri findValueByNumber(int number) {
              return GameMessageRespUri.forNumber(number);
            }
          };

    private final int value;

    private GameMessageRespUri(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ss.com.toolkit.protobuf.GameMessageRespUri)
  }

  /**
   * Protobuf enum {@code ss.com.toolkit.protobuf.GameMessageNoticeUri}
   */
  public enum GameMessageNoticeUri
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>RoomPreparedNoticeUri = 0;</code>
     */
    RoomPreparedNoticeUri(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RoomPreparedNoticeUri = 0;</code>
     */
    public static final int RoomPreparedNoticeUri_VALUE = 0;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameMessageNoticeUri valueOf(int value) {
      return forNumber(value);
    }

    public static GameMessageNoticeUri forNumber(int value) {
      switch (value) {
        case 0: return RoomPreparedNoticeUri;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameMessageNoticeUri>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameMessageNoticeUri> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameMessageNoticeUri>() {
            public GameMessageNoticeUri findValueByNumber(int number) {
              return GameMessageNoticeUri.forNumber(number);
            }
          };

    private final int value;

    private GameMessageNoticeUri(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ss.com.toolkit.protobuf.GameMessageNoticeUri)
  }

  /**
   * Protobuf enum {@code ss.com.toolkit.protobuf.GameRoomNoticeUri}
   */
  public enum GameRoomNoticeUri
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>EditMapNoticeUri = 0;</code>
     */
    EditMapNoticeUri(0),
    /**
     * <code>SeatChangeNoticeUri = 4001;</code>
     */
    SeatChangeNoticeUri(4001),
    /**
     * <code>InviteGameFriendNoticeUri = 4002;</code>
     */
    InviteGameFriendNoticeUri(4002),
    /**
     * <code>HouseholderLeaveRoomNoticeUri = 4003;</code>
     */
    HouseholderLeaveRoomNoticeUri(4003),
    /**
     * <code>StartGameNoticeUri = 4004;</code>
     */
    StartGameNoticeUri(4004),
    /**
     * <code>UserLevelScoreNoticeUri = 4005;</code>
     */
    UserLevelScoreNoticeUri(4005),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EditMapNoticeUri = 0;</code>
     */
    public static final int EditMapNoticeUri_VALUE = 0;
    /**
     * <code>SeatChangeNoticeUri = 4001;</code>
     */
    public static final int SeatChangeNoticeUri_VALUE = 4001;
    /**
     * <code>InviteGameFriendNoticeUri = 4002;</code>
     */
    public static final int InviteGameFriendNoticeUri_VALUE = 4002;
    /**
     * <code>HouseholderLeaveRoomNoticeUri = 4003;</code>
     */
    public static final int HouseholderLeaveRoomNoticeUri_VALUE = 4003;
    /**
     * <code>StartGameNoticeUri = 4004;</code>
     */
    public static final int StartGameNoticeUri_VALUE = 4004;
    /**
     * <code>UserLevelScoreNoticeUri = 4005;</code>
     */
    public static final int UserLevelScoreNoticeUri_VALUE = 4005;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GameRoomNoticeUri valueOf(int value) {
      return forNumber(value);
    }

    public static GameRoomNoticeUri forNumber(int value) {
      switch (value) {
        case 0: return EditMapNoticeUri;
        case 4001: return SeatChangeNoticeUri;
        case 4002: return InviteGameFriendNoticeUri;
        case 4003: return HouseholderLeaveRoomNoticeUri;
        case 4004: return StartGameNoticeUri;
        case 4005: return UserLevelScoreNoticeUri;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GameRoomNoticeUri>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GameRoomNoticeUri> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GameRoomNoticeUri>() {
            public GameRoomNoticeUri findValueByNumber(int number) {
              return GameRoomNoticeUri.forNumber(number);
            }
          };

    private final int value;

    private GameRoomNoticeUri(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ss.com.toolkit.protobuf.GameRoomNoticeUri)
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
