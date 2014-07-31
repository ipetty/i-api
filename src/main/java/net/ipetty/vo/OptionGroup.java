package net.ipetty.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * 选项分组
 * 
 * @author luocanfeng
 * @date 2014年6月13日
 */
public class OptionGroup extends BaseVO {

	public static final String HUMAN_GENDER = "human_gender"; // 性别
	public static final String PET_GENDER = "pet_gender"; // 宠物性别
	public static final String PET_FAMILY = "pet_family"; // 宠物家族

	public static final Set<String> ALL = new HashSet<String>();

	static {
		ALL.add(HUMAN_GENDER);
		ALL.add(PET_GENDER);
		ALL.add(PET_FAMILY);
	}

}
