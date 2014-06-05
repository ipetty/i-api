package net.ipetty.sdk;

import net.ipetty.vo.FeedbackVO;

/**
 * FeedbackApi
 * 
 * @author luocanfeng
 * @date 2014年6月5日
 */
public interface FeedbackApi {

	/**
	 * 反馈意见
	 */
	public FeedbackVO feedback(String title, String content, String contact);

}
