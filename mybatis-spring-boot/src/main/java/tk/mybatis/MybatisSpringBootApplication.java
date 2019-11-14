package tk.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import tk.mybatis.springboot.filter.TestFilter1;
import tk.mybatis.springboot.filter.TestFilter2;

@SpringBootApplication
public class MybatisSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean(new TestFilter1());
		registration.addUrlPatterns("/"); //
		registration.addInitParameter("paramName", "paramValue"); //
		registration.setName("testFilter");
		registration.setOrder(1);
		return registration;
	}
 
	@Bean
	public FilterRegistrationBean authFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean(new TestFilter2());
		registration.addUrlPatterns("/*"); //
		registration.addInitParameter("paramName", "paramValue"); //
		registration.setName("authFilter");
		registration.setOrder(2);
		return registration;
	}

}
