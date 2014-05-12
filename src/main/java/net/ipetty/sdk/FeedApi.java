package net.ipetty.sdk;

import net.ipetty.vo.FeedFormVO;
import net.ipetty.vo.FeedVO;

/**
 * FeedApi
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public interface FeedApi {

	/**
	 * 发布消息
	 */
	public FeedVO publish(FeedFormVO feed);

}
