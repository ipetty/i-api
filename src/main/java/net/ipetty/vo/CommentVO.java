package net.ipetty.vo;

import java.util.Date;

/**
 * 评论VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class CommentVO extends BaseVO {

	private Long id;
	private Integer createdBy;
	private Date createdOn;
	private Long feedId; // 评论的主题ID
	private Long replyToCommentId; // 针对的评论ID，大部分情况下为空
	private Integer replyToUserId; // 针对的评论作者ID，大部分情况下为空
	private String text; // 评论内容

	public CommentVO() {
		super();
	}

	public CommentVO(Long id, Integer createdBy, Date createdOn, Long feedId, String text) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.feedId = feedId;
		this.text = text;
	}

	public CommentVO(Long id, Integer createdBy, Date createdOn, Long feedId, Long replyToCommentId,
			Integer replyToUserId, String text) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.feedId = feedId;
		this.replyToCommentId = replyToCommentId;
		this.replyToUserId = replyToUserId;
		this.text = text;
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

	public Long getFeedId() {
		return feedId;
	}

	public void setFeedId(Long feedId) {
		this.feedId = feedId;
	}

	public Long getReplyToCommentId() {
		return replyToCommentId;
	}

	public void setReplyToCommentId(Long replyToCommentId) {
		this.replyToCommentId = replyToCommentId;
	}

	public Integer getReplyToUserId() {
		return replyToUserId;
	}

	public void setReplyToUserId(Integer replyToUserId) {
		this.replyToUserId = replyToUserId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
