package net.ipetty.vo;

import java.util.Date;

/**
 * FeedbackVO
 * 
 * @author luocanfeng
 * @date 2014年6月5日
 */
public class FeedbackVO extends BaseVO {

	private Integer id;
	private String title; // 主题
	private String content; // 反馈内容
	private String contact; // 联系方式，非必填，用户未登录的情况下反馈意见时可留下联系方式
	private Integer createdBy;
	private Date createdOn;

	public FeedbackVO() {
		super();
	}

	public FeedbackVO(String title, String content, String contact, Integer createdBy) {
		super();
		this.title = title;
		this.content = content;
		this.contact = contact;
		this.createdBy = createdBy;
	}

	public FeedbackVO(Integer id, String title, String content, String contact, Integer createdBy, Date createdOn) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.contact = contact;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
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
