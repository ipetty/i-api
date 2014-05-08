package net.ipetty.sdk;

import net.ipetty.vo.RegisterVO;
import net.ipetty.vo.UserVO;

/**
 * UserApi
 * 
 * @author luocanfeng
 * @date 2014年5月6日
 */
public interface UserApi {

	/**
	 * 用户登陆验证
	 */
	public UserVO login(String username, String password);

	/**
	 * 注册
	 */
	public UserVO register(RegisterVO register);

	/**
	 * 检查用户名是否可用，true表示可用，false表示不可用
	 */
	public boolean checkEmailAvailable(String email);

	/**
	 * 根据ID获取用户帐号
	 */
	public UserVO getById(Integer id);

	/**
	 * 根据uid获取用户帐号
	 */
	public UserVO getByUid(int uid);

	/**
	 * 根据爱宠号获取用户帐号
	 */
	public UserVO getByUniqueName(String uniqueName);

	/**
	 * 更新爱宠号
	 */
	public boolean updateUniqueName(Integer id, String uniqueName);

}
