package com.art.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author Administrator
 *
 */
@Controller
public class IndexController {

	@RequestMapping(value="/index")
	@ResponseBody
	public Object toIndex() {
		Map<String,String> map = new HashMap<String,String>();
		map.put("code", "1");
		return map;
	}
	
}
