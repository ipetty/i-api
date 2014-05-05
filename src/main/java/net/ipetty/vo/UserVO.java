package net.ipetty.vo;

/**
 * 用户信息VO
 * 
 * @author luocanfeng
 * @date 2014年5月4日
 */
public class UserVO extends BaseVO {

	private Integer id;
	private int uid; // uid
	private String account; // 爱宠号
	private String email; // 邮箱地址
	private String nickname; // 昵称
	private String avatar; // 头像
	private String gender; // 性别
	private String stateAndRegion; // 地区
	private String signature; // 个性签名

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
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

}
