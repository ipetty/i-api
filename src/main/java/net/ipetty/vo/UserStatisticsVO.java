package net.ipetty.vo;

/**
 * UserStatisticsVO
 * 
 * @author luocanfeng
 * @date 2014年6月24日
 */
public class UserStatisticsVO extends BaseVO {

	private Integer userId; // 用户ID
	private int bonusOfHistory; // 历史积分总数
	private int bonusCurrent; // 当前有效积分总数
	private int friendsNum; // 关注数
	private int followerNum; // 粉丝数
	private int feedNum; // 消息数
	private int commentNum; // 评论数
	private int favorNum; // 获得的赞数
	private int loginNum; // 登录次数

	public UserStatisticsVO() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getBonusOfHistory() {
		return bonusOfHistory;
	}

	public void setBonusOfHistory(int bonusOfHistory) {
		this.bonusOfHistory = bonusOfHistory;
	}

	public int getBonusCurrent() {
		return bonusCurrent;
	}

	public void setBonusCurrent(int bonusCurrent) {
		this.bonusCurrent = bonusCurrent;
	}

	public int getFriendsNum() {
		return friendsNum;
	}

	public void setFriendsNum(int friendsNum) {
		this.friendsNum = friendsNum;
	}

	public int getFollowerNum() {
		return followerNum;
	}

	public void setFollowerNum(int followerNum) {
		this.followerNum = followerNum;
	}

	public int getFeedNum() {
		return feedNum;
	}

	public void setFeedNum(int feedNum) {
		this.feedNum = feedNum;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getFavorNum() {
		return favorNum;
	}

	public void setFavorNum(int favorNum) {
		this.favorNum = favorNum;
	}

	public int getLoginNum() {
		return loginNum;
	}

	public void setLoginNum(int loginNum) {
		this.loginNum = loginNum;
	}

}
