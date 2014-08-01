package net.ipetty.sdk;

import java.util.List;

import net.ipetty.vo.ActivityVO;

/**
 * ActivityApi
 * 
 * @author luocanfeng
 * @date 2014年6月10日
 */
public interface ActivityApi {

	/**
	 * 获取我的事件流
	 */
	public List<ActivityVO> listActivities(int pageNumber, int pageSize);

	/**
	 * 获取某人相关的事件流
	 */
	public List<ActivityVO> listRelatedActivities(int pageNumber, int pageSize);

	/**
	 * 获取新粉丝事件列表
	 */
	public List<ActivityVO> listNewFansActivities();

	/**
	 * 获取新回复事件列表
	 */
	public List<ActivityVO> listNewRepliesActivities();

	/**
	 * 获取新赞事件列表
	 */
	public List<ActivityVO> listNewFavorsActivities();

	/**
	 * 获取用户的新粉丝、新回复、新赞事件列表
	 */
	public List<ActivityVO> listNewActivities();

	/**
	 * 分页（包括历史时间列表）获取用户的新粉丝、新回复、新赞事件列表
	 */
	public List<ActivityVO> listNewActivities(int pageNumber, int pageSize);

}
