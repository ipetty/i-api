package net.ipetty.vo;

import java.util.Date;

/**
 * BonusPointVO
 * 
 * @author luocanfeng
 * @date 2014年6月10日
 */
public class BonusPointVO extends BaseVO {

	private Long id;
	private Long activityId;
	private int bonus;
	private boolean expired = false;
	private boolean spent = false;
	private Integer createdBy;
	private Date createdOn;

	public BonusPointVO() {
		super();
	}

	public BonusPointVO(Long id, Long activityId, int bonus, boolean expired, boolean spent, Integer createdBy,
			Date createdOn) {
		super();
		this.id = id;
		this.activityId = activityId;
		this.bonus = bonus;
		this.expired = expired;
		this.spent = spent;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public boolean isExpired() {
		return expired;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public boolean isSpent() {
		return spent;
	}

	public void setSpent(boolean spent) {
		this.spent = spent;
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
