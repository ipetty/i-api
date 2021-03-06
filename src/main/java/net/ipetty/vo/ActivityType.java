package net.ipetty.vo;

/**
 * ActivityType
 * 
 * @author luocanfeng
 * @date 2014年5月23日
 */
public interface ActivityType {

	public static final String SIGN_UP = "sign_up"; // 注册
	public static final String LOGIN = "login"; // 登录
	public static final String LOGOUT = "logout"; // 登出
	public static final String SIGN_IN = "sign_in"; // 签到
	public static final String UPDATE_EMAIL = "update_email";
	public static final String UPDATE_UNIQUE_NAME = "update_un";
	public static final String CHANGE_PASSWORD = "change_password";
	public static final String UPDATE_AVATAR = "update_avatar";
	public static final String UPDATE_BACKGROUND = "update_background";
	public static final String FOLLOW = "follow";
	public static final String UNFOLLOW = "unfollow";

	public static final String NEW_PET = "new_pet";
	public static final String UPDATE_PET = "update_pet";
	public static final String UPDATE_PET_UNIQUE_NAME = "update_pet_un";

	public static final String PUBLISH_FEED = "publish_feed";
	public static final String DELETE_FEED = "delete_feed";
	public static final String COMMENT = "comment";
	public static final String DELETE_COMMENT = "delete_comment";
	public static final String FEED_FAVOR = "feed_favor";
	public static final String FEED_UNFAVOR = "feed_unfavor";

	public static final String INVITE = "invite";
	public static final String ACCEPT_INVITE = "accept_invite";

	public static final String FEEDBACK = "feedback";

	public static final String LOCATE = "locate";

}
