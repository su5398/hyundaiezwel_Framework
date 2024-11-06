package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter{

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteAddr = "remoteAddr: "+req.getRemoteAddr()+"\n";
		String uri = "uri: "+req.getRequestURI()+"\n";
		String url = "url: "+req.getRequestURL().toString()+"\n";
		String queryString = "queryString: "+req.getQueryString()+"\n";
		
		String referer = "referer: "+req.getHeader("referer")+"\n";
		String agent = "agent: "+req.getHeader("User-Agent")+"\n";
		
		logger.info("LOG FILTER\n"+remoteAddr+uri+url+queryString+referer+agent);
		
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		
	}
	
}
