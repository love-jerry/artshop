package com.cr.art.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cr.art.user.data.UserInfoData;

/**
* @ClassName: ArtUserService 
* @Description: 用户服务类
* @author chenrui
* @date 2015年8月8日 下午10:45:16
 */
@Service
public class ArtUserService {

	private static final Logger logger = LoggerFactory.getLogger(ArtUserService.class);
	
	public UserInfoData findUserInfo(String userId) {
		
		return null;
	}
	
}
