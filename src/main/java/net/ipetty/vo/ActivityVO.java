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
