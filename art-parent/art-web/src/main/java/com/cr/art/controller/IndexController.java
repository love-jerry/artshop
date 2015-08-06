package com.cr.art.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(value="/index")
	@ResponseBody
	public Object test() {
		Map<String,String> result = new HashMap<String,String>();
		result.put("yishi", "run");
		return result;
	}
	
}
