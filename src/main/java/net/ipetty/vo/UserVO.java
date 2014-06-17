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
	private String uniqueName; // 爱宠号
	private String email; // 邮箱地址
	private String nickname; // 昵称
	private String avatar; // 头像
	private String background; // 背景图片
	private String gender; // 性别
	private String stateAndRegion; // 地区
	private String signature; // 个性签名
	private boolean followed; // 是否已关注

	public UserVO() {
		super();
	}

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

	public String getUniqueName() {
		return uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
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

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
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

	public boolean isFollowed() {
		return followed;
	}

	public void setFollowed(boolean followed) {
		this.followed = followed;
	}

}
