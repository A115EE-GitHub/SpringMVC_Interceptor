package com.A115EE.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class CustomInterceptor implements HandlerInterceptor {

	/**
	 * 预处理方法，Controller方法执行前执行该方法。
	 *
	 * @return true：代表放行。会执行下一个拦截器，如果没有，则执行Controller中的方法。
	 * @return false：代表不放行。
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("执行前：CustomInterceptor()方法执行了...");
		return true;

		//request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);
		//return false;
	}

	/**
	 * 后处理方法，Controller方法执行之后执行，success.jsp执行之前执行该方法。
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("执行后：CustomInterceptor()方法执行了...");
	}

	/**
	 * success.jsp页面执行后，该方法才会执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		System.out.println("执行最后：CustomInterceptor()方法执行了...");
	}

}
