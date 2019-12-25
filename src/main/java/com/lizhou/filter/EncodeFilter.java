package com.lizhou.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 设置request的编码
 * @author bojiangzhou
 *
 */
public class EncodeFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse rep, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) rep;
		//设置编码格式
		request.setCharacterEncoding("UTF-8");
		//设置返回类型
		response.setContentType("text/html; charset=utf-8");
		//放行资源
		chain.doFilter(request, response);
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
