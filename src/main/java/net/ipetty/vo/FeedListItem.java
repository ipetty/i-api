package net.ipetty.vo;

import java.util.Date;
import java.util.List;

/**
 * 首页返回的消息列表中的消息对象
 * 
 * @author luocanfeng
 * @date 2014年6月26日
 */
public class FeedListItem extends BaseVO {

	private Long id;
	private Integer createdBy;
	private Date createdOn;

	private String text; // 文本内容

	private String imageSmallURL;
	private String imageOriginalURL;

	private Long locationId; // 发表位置ID

	private List<Integer> displayedFavorUsers; // 仅列出界面上要显示的几个已赞的用户
	private List<CommentVO> displayedComments; // 仅列出界面上要显示的几个评论

	// 统计信息
	private int commentCount; // 评论数
	private int favorCount; // 赞的数量

	private boolean favored; // 我是否赞过；游客全部显示未赞，点赞时提示需要注册或登录

	public FeedListItem() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImageSmallURL() {
		return imageSmallURL;
	}

	public void setImageSmallURL(String imageSmallURL) {
		this.imageSmallURL = imageSmallURL;
	}

	public String getImageOriginalURL() {
		return imageOriginalURL;
	}

	public void setImageOriginalURL(String imageOriginalURL) {
		this.imageOriginalURL = imageOriginalURL;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public List<Integer> getDisplayedFavorUsers() {
		return displayedFavorUsers;
	}

	public void setDisplayedFavorUsers(List<Integer> displayedFavorUsers) {
		this.displayedFavorUsers = displayedFavorUsers;
	}

	public List<CommentVO> getDisplayedComments() {
		return displayedComments;
	}

	public void setDisplayedComments(List<CommentVO> displayedComments) {
		this.displayedComments = displayedComments;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getFavorCount() {
		return favorCount;
	}

	public void setFavorCount(int favorCount) {
		this.favorCount = favorCount;
	}

	public boolean isFavored() {
		return favored;
	}

	public void setFavored(boolean favored) {
		this.favored = favored;
	}

}
