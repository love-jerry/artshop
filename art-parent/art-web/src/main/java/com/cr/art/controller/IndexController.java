package com.cr.art.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/***
 * *
* @ClassName: IndexController
* @Description: 
* @author chenrui
* @date  2015年9月7日 下午2:50:16
 */
@Controller
public class IndexController {

	@RequestMapping(value="/index")
	@ResponseBody
	public Object toIndex() {
		Map<String,String> result = new HashMap<String,String>();
		
		//find art info by page
		
		
		return result;
	}
	
}
