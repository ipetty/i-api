package net.ipetty.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页返回的消息列表对象
 * 
 * @author luocanfeng
 * @date 2014年6月26日
 */
public class FeedList extends BaseVO {

	private List<FeedListItem> feeds = new ArrayList<FeedListItem>();
	private List<UserVO> updatedUsers = new ArrayList<UserVO>();

	public FeedList() {
		super();
	}

	public FeedList(List<FeedListItem> feeds, List<UserVO> updatedUsers) {
		super();
		this.feeds = feeds;
		this.updatedUsers = updatedUsers;
	}

	public List<FeedListItem> getFeeds() {
		return feeds;
	}

	public void setFeeds(List<FeedListItem> feeds) {
		this.feeds = feeds;
	}

	public List<UserVO> getUpdatedUsers() {
		return updatedUsers;
	}

	public void setUpdatedUsers(List<UserVO> updatedUsers) {
		this.updatedUsers = updatedUsers;
	}

}
