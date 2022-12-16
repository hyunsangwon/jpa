package com.dw.jpa.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class Interceptor implements HandlerInterceptor{

	private final Logger logger = LoggerFactory.getLogger(Interceptor.class); 
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String requestUrl = request.getRequestURI();//접속 URL 호출
		String httpMethod = request.getMethod(); //HTTP 메소드 호출
		String userIP = request.getRemoteAddr();
		
		logger.info("요청 URL : "+requestUrl);
		logger.info("요청 HTTP Method : "+httpMethod);
		logger.info("사용자 IP : "+userIP);
		
		return true;
	}
	
}
