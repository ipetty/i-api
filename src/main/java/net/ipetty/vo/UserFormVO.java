package net.ipetty.vo;

import java.util.Date;

/**
 * 修改用户个人信息VO
 * 
 * @author luocanfeng
 * @date 2014年5月4日
 */
public class UserFormVO extends BaseVO {

	private Integer id;
	private String nickname; // 昵称
	private String gender; // 性别
	private String stateAndRegion; // 地区
	private String signature; // 个性签名
	private Date birthday; // 生日

	public UserFormVO() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStateAndRegion() {
		return stateAndRegion;
	}

	public void setStateAndRegion(String stateAndRegion) {
		this.stateAndRegion = stateAndRegion;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
