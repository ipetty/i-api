package net.ipetty.sdk;

/**
 * CrushLogApi
 * 
 * @author luocanfeng
 * @date 2014年8月4日
 */
public interface CrushLogApi {

	/**
	 * 保存崩溃日志
	 */
	public boolean save(String log);

}
