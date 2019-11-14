package tk.mybatis.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tk.mybatis.web.model.SysDict;
import tk.mybatis.web.service.DictService;

@Controller
@RequestMapping("/dicts")
public class DictController {

	@Autowired
	DictService dictService;
	
	@RequestMapping
	public String dicts(SysDict sysDict, Integer offset, Integer limit, Model model) {
		List<SysDict> sysDicts = dictService.findBySysDict(sysDict, offset, limit);
		model.addAttribute("dicts", sysDicts);
		
		return "dicts";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(Long id, Model model) {
		SysDict sysDict;
		if(id == null) {
			sysDict = new SysDict();
		}else {
			sysDict = dictService.findById(id);
		}
		
		model.addAttribute("dict", sysDict);
		
		return "dict_add";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String save(SysDict sysDict) {
		dictService.saveOrUpdate(sysDict);
		return "redirect:/dicts";
	}
	
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String delete(Long id) {
		dictService.deleteById(id);
		return "redirect:/dicts";
	}
}
