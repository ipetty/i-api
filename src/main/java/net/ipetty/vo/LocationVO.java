package net.ipetty.vo;

/**
 * 位置VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class LocationVO extends BaseVO {

	private Double longitude; // 经度
	private Double latitude; // 纬度
	private String coorType; // 坐标系类型
	private Float radius; // 定位精度半径，单位是米
	private String province; // 省
	private String city; // 市
	private String district; // 区/县
	private String street; // 街道
	private String streetNumber; // 门牌号
	private String address; // 地点文本信息
	private boolean silent = true; // true为默默收集，界面不展现；false为用户指定，界面展现。

	public LocationVO() {
		super();
	}

	public LocationVO(Double longitude, Double latitude, String coorType, Float radius, String province, String city,
			String district, String address, boolean silent) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.coorType = coorType;
		this.radius = radius;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.silent = silent;
	}

	public LocationVO(Double longitude, Double latitude, String coorType, Float radius, String province, String city,
			String district, String street, String streetNumber, String address, boolean silent) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.coorType = coorType;
		this.radius = radius;
		this.province = province;
		this.city = city;
		this.district = district;
		this.street = street;
		this.streetNumber = streetNumber;
		this.address = address;
		this.silent = silent;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getCoorType() {
		return coorType;
	}

	public void setCoorType(String coorType) {
		this.coorType = coorType;
	}

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isSilent() {
		return silent;
	}

	public void setSilent(boolean silent) {
		this.silent = silent;
	}

}
