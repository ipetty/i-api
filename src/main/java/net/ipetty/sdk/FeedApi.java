package net.ipetty.sdk;

import java.util.Date;
import java.util.List;

import net.ipetty.vo.CommentVO;
import net.ipetty.vo.FeedFavorVO;
import net.ipetty.vo.FeedFormVO;
import net.ipetty.vo.FeedList;
import net.ipetty.vo.FeedTimelineQueryParams;
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
	 * 发布消息（带地理位置信息）
	 */
	public FeedVO publishWithLocation(FeedFormVO feed);

	/**
	 * 根据ID获取消息
	 */
	public FeedVO getById(Long id);

	/**
	 * 删除消息
	 */
	public boolean delete(Long id);

	/**
	 * 根据时间线分页获取消息（广场）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	@Deprecated
	public List<FeedVO> listByTimelineForSquare(Date timeline, int pageNumber, int pageSize);

	/**
	 * 根据时间线分页获取消息（我和我关注人的）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	@Deprecated
	public List<FeedVO> listByTimelineForHomePage(Date timeline, int pageNumber, int pageSize);

	/**
	 * 根据时间线分页获取指定用户空间的消息
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	@Deprecated
	public List<FeedVO> listByTimelineForSpace(Integer userId, Date timeline, int pageNumber, int pageSize);

	/**
	 * 根据时间线分页获取消息（广场）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public FeedList listByTimelineForSquare(FeedTimelineQueryParams queryParams);

	/**
	 * 根据时间线分页获取消息（我和我关注人的）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public FeedList listByTimelineForHomePage(FeedTimelineQueryParams queryParams);

	/**
	 * 根据时间线分页获取指定用户空间的消息
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public FeedList listByTimelineForSpace(FeedTimelineQueryParams queryParams);

	/**
	 * 获取指定消息的评论列表
	 */
	public List<CommentVO> listCommentsByFeedId(Long feedId);

	/**
	 * 获取指定消息的赞列表
	 */
	public List<FeedFavorVO> listFavorsByFeedId(Long feedId);

	/**
	 * 评论
	 */
	public FeedVO comment(CommentVO comment);

	/**
	 * 删除评论
	 */
	public boolean deleteComment(Long id);

	/**
	 * 赞
	 */
	public FeedVO favor(FeedFavorVO favor);

	/**
	 * 取消赞
	 */
	public FeedVO unfavor(FeedFavorVO favor);

}
