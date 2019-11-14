package tk.mybatis.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.mybatis.springboot.mapper.CountryMapper;
import tk.mybatis.springboot.model.Country;

@RestController
public class IndexController {
	
	@Autowired
	CountryMapper countryMapper;
	
	@RequestMapping("/")
	public List<Country> index() {
		return countryMapper.selectAll();
	}
	
	
}
