package net.ipetty.sdk;

import net.ipetty.vo.AppUpdateVO;

/**
 * AppUpdateApi
 * 
 * @author luocanfeng
 * @date 2014年7月7日
 */
public interface AppUpdateApi {

	/**
	 * 检查应用版本信息
	 */
	public AppUpdateVO latestVersion(String appKey);

}
