package net.ipetty.vo;

import java.util.Date;
import java.util.List;

/**
 * 以时间线查询消息列表的参数列表
 * 
 * @author luocanfeng
 * @date 2014年6月26日
 */
public class FeedTimelineQueryParams extends BaseVO {

	private Date timeline;
	private List<CachedUserVersion> cachedUserVersions;
	private int pageNumber;
	private int pageSize;

	public FeedTimelineQueryParams() {
		super();
	}

	public FeedTimelineQueryParams(Date timeline, List<CachedUserVersion> cachedUserVersions, int pageNumber,
			int pageSize) {
		super();
		this.timeline = timeline;
		this.cachedUserVersions = cachedUserVersions;
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
	}

	public Date getTimeline() {
		return timeline;
	}

	public void setTimeline(Date timeline) {
		this.timeline = timeline;
	}

	public List<CachedUserVersion> getCachedUserVersions() {
		return cachedUserVersions;
	}

	public void setCachedUserVersions(List<CachedUserVersion> cachedUserVersions) {
		this.cachedUserVersions = cachedUserVersions;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
