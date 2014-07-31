package net.ipetty.vo;

/**
 * 选项列表中的选项值
 * 
 * @author luocanfeng
 * @date 2014年6月13日
 */
public class Option extends BaseVO {

	private String group; // 所属选项组
	private String value; // 选项值，用于存储数据库
	private String label; // 选项Label，用于展现给用户
	private String icon; // 选项图标
	private String tips; // 选项简述

	public Option() {
		super();
	}

	public Option(String group, String value, String label) {
		super();
		this.group = group;
		this.value = value;
		this.label = label;
	}

	public Option(String group, String value, String label, String icon) {
		super();
		this.group = group;
		this.value = value;
		this.label = label;
		this.icon = icon;
	}

	public Option(String group, String value, String label, String icon, String tips) {
		super();
		this.group = group;
		this.value = value;
		this.label = label;
		this.icon = icon;
		this.tips = tips;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

}
