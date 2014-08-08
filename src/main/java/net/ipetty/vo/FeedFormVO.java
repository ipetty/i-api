package net.ipetty.vo;

/**
 * 用于发布消息的VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class FeedFormVO extends BaseVO {

	private String text; // 文本内容
	private String imagePath; // 图片文件路径
	private LocationVO location; // 位置信息

	public FeedFormVO() {
		super();
	}

	public FeedFormVO(String text, String imagePath, LocationVO location) {
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

	public LocationVO getLocation() {
		return location;
	}

	public void setLocation(LocationVO location) {
		this.location = location;
	}

}
