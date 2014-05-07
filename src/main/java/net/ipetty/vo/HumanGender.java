package net.ipetty.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 性别
 * 
 * @author luocanfeng
 * @date 2014年5月7日
 */
public class HumanGender {

	public static final String MALE = "男";
	public static final String FEMALE = "女";
	public static final String OTHERS = "其他";

	private static final List<String> ALL = new ArrayList<String>(3);

	static {
		ALL.add(MALE);
		ALL.add(FEMALE);
		ALL.add(OTHERS);
	}

	/**
	 * 获取性别列表（供选择）
	 */
	public static final List<String> list() {
		return ALL;
	}

}
