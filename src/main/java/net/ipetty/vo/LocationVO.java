package net.ipetty.vo;

/**
 * 位置VO
 * 
 * @author luocanfeng
 * @date 2014年5月9日
 */
public class LocationVO extends BaseVO {

	private Long id;
	private Long longitude; // 经度
	private Long latitude; // 纬度
	private String geoHash; // GEO哈希值
	private String address; // 地点文本信息

	public LocationVO() {
		super();
	}

	public LocationVO(Long id, Long longitude, Long latitude, String geoHash, String address) {
		super();
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.geoHash = geoHash;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getGeoHash() {
		return geoHash;
	}

	public void setGeoHash(String geoHash) {
		this.geoHash = geoHash;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
