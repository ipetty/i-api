package net.ipetty.sdk;

import java.util.List;

import net.ipetty.vo.RegisterVO;
import net.ipetty.vo.UserFormVO;
import net.ipetty.vo.UserStatisticsVO;
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
	 * 使用第三方帐号登陆
	 */
	public UserVO login3rd(String platform, String userId);

	/**
	 * 使用第三方帐号登陆或注册后登登陆返回
	 */
	public UserVO loginOrRegister3rd(String platform, String userId, String email, String userName);

	/**
	 * 登出
	 */
	public void logout();

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
	 * 根据用户ID获取用户统计信息
	 */
	public UserStatisticsVO getUserStatisticsByUserId(Integer userId);

	/**
	 * 根据uid获取用户帐号
	 */
	public UserVO getByUid(int uid);

	/**
	 * 根据爱宠号获取用户帐号
	 */
	public UserVO getByUniqueName(String uniqueName);

	/**
	 * 设置爱宠号，只能设置一次，一经设置不能变更
	 */
	public boolean updateUniqueName(String uniqueName);

	/**
	 * 修改密码
	 */
	public boolean changePassword(String oldPassword, String newPassword);

	/**
	 * 关注
	 */
	public boolean follow(Integer friendId);

	/**
	 * 是否已关注，true为已关注，false为未关注
	 */
	public boolean isFollow(Integer friendId);

	/**
	 * 取消关注
	 */
	public boolean unfollow(Integer friendId);

	/**
	 * 分页获取关注列表
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public List<UserVO> listFriends(Integer userId, int pageNumber, int pageSize);

	/**
	 * 获取粉丝列表
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public List<UserVO> listFollowers(Integer userId, int pageNumber, int pageSize);

	/**
	 * 获取好友列表（双向关注）
	 * 
	 * @param pageNumber
	 *            分页页码，从0开始
	 */
	public List<UserVO> listBiFriends(Integer userId, int pageNumber, int pageSize);

	/**
	 * 更新用户头像
	 */
	public String updateAvatar(String imagePath);

	/**
	 * 更新个人空间背景图片
	 */
	public String updateBackground(String imagePath);

	/**
	 * 修改用户个人信息
	 */
	public UserVO update(UserFormVO userFormVo);

}
