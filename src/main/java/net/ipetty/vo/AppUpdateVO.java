package net.ipetty.vo;

/**
 * AppUpdateVO
 * 
 * @author luocanfeng
 * @date 2014年7月7日
 */
public class AppUpdateVO {

	private String appName; // 应用名
	private String appKey; // 应用Key
	private Integer versionCode; // 数值版本号,用于版本更新比较
	private String versionName; // 字符串版本号，呈现给用户界面
	private String versionDescription; // 更新内容
	private String downloadUrl; // app下载地址（完整路径）

	public AppUpdateVO() {
		super();
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getVersionDescription() {
		return versionDescription;
	}

	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
}
