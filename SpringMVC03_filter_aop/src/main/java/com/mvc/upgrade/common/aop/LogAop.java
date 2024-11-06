package com.mvc.upgrade.common.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogAop {
	
	public void before(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("-----AOP Start-----");
		
		Object[] args = join.getArgs();
		if(args != null) {
			logger.info("method: "+join.getSignature().getName());//메소드 정보
			for(int i = 0; i<args.length; i++) {
				logger.info(i+"번째: "+args[i]);
			}
		}
 	}
	
	public void after(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("-----AOP End-----");
	}
	
	public void afterThrowing(JoinPoint join) {
		Logger logger = LoggerFactory.getLogger(join.getTarget()+"");
		logger.info("-----Error Log-----");
		logger.info("Error: "+join.getArgs());
		logger.info("Error: "+join.toString());
	}
}
