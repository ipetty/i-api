package net.ipetty.vo;

/**
 * UserForm43rdVO
 * 
 * @author luocanfeng
 * @date 2014年8月5日
 */
public class UserForm43rdVO extends BaseVO {

	private Integer id;
	private String email; // 邮箱
	private String nickname; // 昵称

	private Integer petId;
	private String petName; // 宠物名称
	private String petGender; // 宠物性别
	private String petFamily; // 宠物类型/血统

	public UserForm43rdVO() {
		super();
	}

	public UserForm43rdVO(Integer id, String email, String nickname, Integer petId, String petName, String petGender,
			String petFamily) {
		super();
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.petId = petId;
		this.petName = petName;
		this.petGender = petGender;
		this.petFamily = petFamily;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
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
