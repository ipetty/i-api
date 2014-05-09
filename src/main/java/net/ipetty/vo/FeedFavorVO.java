package net.ipetty.vo;

import java.util.Date;

/**
 * 赞VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class FeedFavorVO extends BaseVO {

	private Long id;
	private Integer createdBy;
	private Date createdOn;
	private Long feedId; // 赞的对象

	public FeedFavorVO() {
		super();
	}

	public FeedFavorVO(Long id, Integer createdBy, Date createdOn, Long feedId) {
		super();
		this.id = id;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.feedId = feedId;
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

}
