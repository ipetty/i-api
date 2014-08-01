package net.ipetty.vo;

import java.util.Date;

/**
 * ActivityVO
 * 
 * @author luocanfeng
 * @date 2014年6月10日
 */
public class ActivityVO extends BaseVO {

	private Long id;
	private String type; // ActivityType
	private Long targetId; // 目标ID
	private String feedImageUrl; // 目标是主题消息时的主题消息图片
	private String content; // 内容，目前仅在回复事件时才有内容值
	private boolean read = false; // 是否已读过
	private Integer createdBy;
	private Date createdOn;

	public ActivityVO() {
		super();
	}

	public ActivityVO(Long id, String type, Long targetId, Integer createdBy, Date createdOn) {
		super();
		this.id = id;
		this.type = type;
		this.targetId = targetId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public ActivityVO(Long id, String type, Long targetId, String content, Integer createdBy, Date createdOn) {
		super();
		this.id = id;
		this.type = type;
		this.targetId = targetId;
		this.content = content;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public ActivityVO(Long id, String type, Long targetId, String feedImageUrl, String content, Integer createdBy,
			Date createdOn) {
		super();
		this.id = id;
		this.type = type;
		this.targetId = targetId;
		this.feedImageUrl = feedImageUrl;
		this.content = content;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTargetId() {
		return targetId;
	}

	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}

	public String getFeedImageUrl() {
		return feedImageUrl;
	}

	public void setFeedImageUrl(String feedImageUrl) {
		this.feedImageUrl = feedImageUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
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

}
