package net.ipetty.sdk;

import java.util.List;

import net.ipetty.vo.PetVO;

/**
 * PetApi
 * 
 * @author luocanfeng
 * @date 2014年6月24日
 */
public interface PetApi {

	/**
	 * 新增宠物
	 */
	public PetVO save(PetVO pet);

	/**
	 * 根据ID获取宠物
	 */
	public PetVO getById(Integer id);

	/**
	 * 根据uid获取宠物
	 */
	public PetVO getByUid(int uid);

	/**
	 * 根据爱宠唯一标识获取宠物
	 */
	public PetVO getByUniqueName(String uniqueName);

	/**
	 * 获取指定用户的所有宠物
	 */
	public List<PetVO> listByUserId(Integer userId);

	/**
	 * 更新宠物信息
	 */
	public PetVO update(PetVO pet);

	/**
	 * 设置爱宠唯一标识，只能设置一次，一经设置不能变更
	 */
	// public PetVO updateUniqueName(Integer id, String uniqueName);

}
