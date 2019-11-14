package tk.mybatis.springboot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter2 implements Filter{

	  @Override
	  public void init(FilterConfig filterConfig) throws ServletException {

	  }

	  @Override
	  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
	      throws IOException, ServletException {
	    System.out.println("TestFilter2");
	    filterChain.doFilter(servletRequest,servletResponse);
	  }

	  @Override
	  public void destroy() {

	  }
}
