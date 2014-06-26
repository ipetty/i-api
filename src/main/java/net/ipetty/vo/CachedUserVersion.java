package net.ipetty.vo;

/**
 * 缓存用户版本信息
 * 
 * @author luocanfeng
 * @date 2014年6月26日
 */
public class CachedUserVersion extends BaseVO {

	private Integer id;
	private int version;

	public CachedUserVersion() {
		super();
	}

	public CachedUserVersion(Integer id, int version) {
		super();
		this.id = id;
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
