package net.ipetty.sdk;

import net.ipetty.sdk.common.ApiContext;
import net.ipetty.sdk.common.BaseApi;
import net.ipetty.vo.UserVO;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * UserApiImpl
 * 
 * @author luocanfeng
 * @date 2014年5月6日
 */
public class UserApiImpl extends BaseApi implements UserApi {

	private static final String URI_LOGIN = "/login";
	private static final String URI_REGISTER = "/register";
	private static final String URI_CHECK_EMAIL_AVAILABLE = "/user/checkEmailAvailable";

	public UserApiImpl(ApiContext context) {
		super(context);
	}

	/**
	 * 用户登陆验证
	 */
	@Override
	public UserVO login(String username, String password) {
		MultiValueMap<String, String> request = new LinkedMultiValueMap<String, String>();
		request.set("username", username);
		request.set("password", password);
		UserVO user = context.getRestTemplate().postForObject(buildUri(URI_LOGIN), request, UserVO.class);
		context.setAuthorized(true);
		context.setCurrUserId(user.getId());
		return user;
	}

	/**
	 * 注册用户
	 */
	@Override
	public UserVO register(String email, String password) {
		MultiValueMap<String, String> request = new LinkedMultiValueMap<String, String>();
		request.set("email", email);
		request.set("password", password);
		return context.getRestTemplate().postForObject(buildUri(URI_REGISTER), request, UserVO.class);
	}

	/**
	 * 检查用户名是否可用，true表示可用，false表示不可用
	 */
	@Override
	public boolean checkEmailAvailable(String email) {
		return context.getRestTemplate().getForObject(buildUri(URI_CHECK_EMAIL_AVAILABLE, "email", email),
				Boolean.class);
	}

}
