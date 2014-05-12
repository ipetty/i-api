package net.ipetty.vo;

/**
 * 发布消息时的位置VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class LocationFormVO extends BaseVO {

	private Long longitude; // 经度
	private Long latitude; // 纬度
	private String address; // 地点文本信息

	public LocationFormVO() {
		super();
	}

	public LocationFormVO(Long longitude, Long latitude, String address) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
