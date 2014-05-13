package net.ipetty.sdk;

import java.util.Date;
import java.util.List;

import net.ipetty.vo.CommentVO;
import net.ipetty.vo.FeedFavorVO;
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

	/**
	 * 根据ID获取消息
	 */
	public FeedVO getById(Long id);

	/**
	 * 根据时间线分页获取消息（广场）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public List<FeedVO> listByTimelineForSquare(Date timeline, int pageNumber, int pageSize);

	/**
	 * 根据时间线分页获取消息（我和我关注人的）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public List<FeedVO> listByTimelineForHomePage(Date timeline, int pageNumber, int pageSize);

	/**
	 * 评论
	 */
	public FeedVO comment(CommentVO comment);

	/**
	 * 赞
	 */
	public FeedVO favor(FeedFavorVO favor);

	/**
	 * 取消赞
	 */
	public FeedVO unfavor(FeedFavorVO favor);

}
