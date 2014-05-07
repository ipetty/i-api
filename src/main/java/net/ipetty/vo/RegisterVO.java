package net.ipetty.vo;

/**
 * RegisterVO
 * 
 * @author luocanfeng
 * @date 2014年5月7日
 */
public class RegisterVO extends BaseVO {

	private String email; // 邮箱
	private String password; // 密码
	private String nickname; // 昵称
	private String gender; // 性别

	private String petName; // 宠物名称
	private String petGender; // 宠物性别
	private String petFamily; // 宠物类型/血统

	public RegisterVO() {
		super();
	}

	public RegisterVO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public RegisterVO(String email, String password, String nickname, String gender) {
		super();
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.gender = gender;
	}

	public RegisterVO(String email, String password, String nickname, String gender, String petName, String petGender,
			String petFamily) {
		super();
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.gender = gender;
		this.petName = petName;
		this.petGender = petGender;
		this.petFamily = petFamily;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public String getPetFamily() {
		return petFamily;
	}

	public void setPetFamily(String petFamily) {
		this.petFamily = petFamily;
	}

}
