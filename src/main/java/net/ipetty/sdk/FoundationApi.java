package net.ipetty.sdk;

import java.util.List;
import java.util.Map;

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

	/**
	 * 获取指定选项组的所有选项，并映射成值与文本描述的Map返回
	 */
	public Map<String, String> getOptionValueLabelMapByGroup(String group);

}
