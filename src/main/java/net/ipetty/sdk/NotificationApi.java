package net.ipetty.sdk;

import net.ipetty.vo.NotificationVO;

/**
 * NotificationApi
 * 
 * @author luocanfeng
 * @date 2014年7月31日
 */
public interface NotificationApi {

	/**
	 * 获取我的通知
	 */
	public NotificationVO getMyNotification();

}
