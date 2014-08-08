package net.ipetty.vo;

/**
 * FeedWithLocationVO
 * 
 * @author luocanfeng
 * @date 2014年8月8日
 */
public class FeedWithLocationVO extends BaseVO {

	private String text;
	private Long imageId;
	private LocationVO location;

	public FeedWithLocationVO() {
		super();
	}

	public FeedWithLocationVO(String text, Long imageId, LocationVO location) {
		super();
		this.text = text;
		this.imageId = imageId;
		this.location = location;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public LocationVO getLocation() {
		return location;
	}

	public void setLocation(LocationVO location) {
		this.location = location;
	}

}
