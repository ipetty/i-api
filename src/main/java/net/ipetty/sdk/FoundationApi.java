package net.ipetty.sdk;

import java.util.List;

import net.ipetty.vo.Option;

/**
 * FoundationApi
 * 
 * @author luocanfeng
 * @date 2014年6月13日
 */
public interface FoundationApi {

	/**
	 * 获取指定选项组的所有选项
	 */
	public List<Option> listOptionsByGroup(String group);

}
