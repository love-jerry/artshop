package com.cr.art.controller.user;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cr.art.user.ArtUserService;

/**
* @ClassName: ArtUserController 
* @Description: 用户信息控制器
* @author chenrui
* @date 2015年8月8日 下午10:52:28
 */
@Controller
public class ArtUserController {

	private static final Logger logger = LoggerFactory.getLogger(ArtUserService.class);
	
	@RequestMapping(value="/index")
	@ResponseBody
	public Object findUserInfo(String userId) {
		logger.info("find user info!");
		Map<String,String> result = new HashMap<String,String>();
		result.put("hello", "word");
		return result;
	}
	
}
