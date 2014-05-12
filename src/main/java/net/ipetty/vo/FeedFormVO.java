package net.ipetty.vo;

/**
 * 用于发布消息的VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class FeedFormVO {

	private String text; // 文本内容
	private String imagePath; // 图片文件路径
	private LocationFormVO location; // 位置信息

	public FeedFormVO() {
		super();
	}

	public FeedFormVO(String text, String imagePath, LocationFormVO location) {
		super();
		this.text = text;
		this.imagePath = imagePath;
		this.location = location;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public LocationFormVO getLocation() {
		return location;
	}

	public void setLocation(LocationFormVO location) {
		this.location = location;
	}

}
