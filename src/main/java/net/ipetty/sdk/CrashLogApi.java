package net.ipetty.sdk;

import net.ipetty.vo.CrashLogVO;

/**
 * CrashLogApi
 * 
 * @author luocanfeng
 * @date 2014年8月4日
 */
public interface CrashLogApi {

	/**
	 * 保存崩溃日志
	 */
	public boolean save(CrashLogVO crashLog);

}
