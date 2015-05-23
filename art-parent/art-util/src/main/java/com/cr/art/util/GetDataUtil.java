package com.cr.art.util;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONObject;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

public class GetDataUtil {
	private static final Logger logger = LoggerFactory.getLogger(GetDataUtil.class);

	/**
	 * 请求url获取数据
	 * @param path 请求地址
	 * @param paraMap 请求参数
	 * @return
	 * @throws Exception
	 */
	public static String getData(String path, Map<String, Object> paraMap) throws Exception {
		logger.info("请求path=" + path + "，入参：" + paraMap);
		try {
			if (StringUtil.isBlank(path) || null == paraMap || paraMap.isEmpty()) { throw new IllegalArgumentException("请求参数不完整"); }
			StringBuffer url = new StringBuffer();
			url.append(path);
			Set<String> paramsSet = paraMap.keySet();
			Iterator<String> iterator = paramsSet.iterator();
			String key;
			boolean isFirstParam = true;
			while (iterator.hasNext()) {
				key = iterator.next();
				if (isFirstParam) {
					url.append("?").append(key).append("=").append(paraMap.get(key));
				} else {
					url.append("&").append(key).append("=").append(paraMap.get(key));
				}
				isFirstParam = false;
			}
			String result = "";
			HttpGet httpGet = new HttpGet(url.toString());
			@SuppressWarnings({ "deprecation", "resource" })
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response = httpClient.execute(httpGet);
			int reqStatus = response.getStatusLine().getStatusCode();
			logger.info("请求响应code=" + reqStatus);
			if (reqStatus == 200) {
				HttpEntity entity = response.getEntity();
				result = EntityUtils.toString(entity, "UTF-8");
				logger.info("请求成功,响应result=" + result);
				return result;
			}
			throw new Exception("url请求错误，响应code=" + reqStatus);
		} catch (Exception e) {
			logger.error("请求url发生异常" + e);
			throw new Exception("请求url发生异常");
		}
	}

	/**
	 * POST请求url获取数据
	 * @param path
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static JSONObject postJson(String path, Map<String, String> params) throws Exception {
		logger.info("请求path=" + path + "，入参：" + params);
		try {
			if (StringUtil.isBlank(path) || null == params || params.isEmpty()) {
				throw new IllegalArgumentException("请求参数不完整");
			}
			
			@SuppressWarnings({ "deprecation", "resource" })
			HttpClient client = new DefaultHttpClient();
			HttpPost post = new HttpPost(path);
			StringEntity s = new StringEntity(JSONObject.fromObject(params).toString());
			s.setContentEncoding("UTF-8");
			s.setContentType("application/json");
			post.setEntity(s);

			// 请求
			HttpResponse response = client.execute(post);
			int reqStatus = response.getStatusLine().getStatusCode();
			
			logger.info("请求响应code=" + reqStatus);
			if (reqStatus == HttpStatus.OK.value()) {
				HttpEntity entity = response.getEntity();
				String result = EntityUtils.toString(entity, "UTF_8");
				logger.info("请求成功,响应result=" + result);
				return JSONObject.fromObject(result);
			}
			throw new Exception("url请求错误，响应code=" + reqStatus);
		} catch (Exception e) {
			logger.error("请求url发生异常", e);
			throw new Exception("请求url发生异常");
		}
	}
	
	
}
