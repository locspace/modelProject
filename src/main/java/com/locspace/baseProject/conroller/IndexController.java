package com.locspace.baseProject.conroller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.locspace.baseProject.bean.JpaData;
import com.locspace.baseProject.dao.JpaDao;

@Controller
public class IndexController {
	
	@Autowired
	private JpaDao jpaDao;
	
	
	@SuppressWarnings("deprecation")
	@RequestMapping({"/index","/"})
	public String index(ModelMap modelMap) {
		JpaData jpaData=new JpaData();
		modelMap.addAttribute("indexstring", "now is" +DateFormat.getDateTimeInstance().format(new Date()));
		
//		Optional<JpaData> optional=jpaDao.findByName("2");
//		if (optional.isPresent()) {
//			System.out.println(jpaData.toString());
//			 jpaData = optional.get();
//			 modelMap.addAttribute("jpadata",jpaData);
//		}
		
		List<JpaData> datas = jpaDao.findAll();
		if (null!=datas&&datas.size()>0) {
			 jpaData = datas.get(0);
			 modelMap.addAttribute("jpadata",jpaData);
		}
		
		
		return "index";
		
	}
	
	@RequestMapping("/adddata")
	public String addData(ModelMap modelMap) {
		JpaData jpaData = new JpaData();	
		jpaData.setId(String.valueOf(UUID.randomUUID().toString()));
		jpaData.setName(String.valueOf(new Random().nextInt()));
		jpaData.setMsg(DateFormat.getInstance().format(new Date()));
		jpaDao.save(jpaData);
		List<JpaData> datalist = jpaDao.findAll();
		modelMap.addAttribute("jpadata",jpaData);
		modelMap.addAttribute("datalist",datalist);
		
		
		return "datalist";
	}
	
	@RequestMapping("/datalist/{id}")
	@ResponseBody
	public  List<JpaData> datalist(@PathVariable("id")String id) {
		System.out.println(id);
		List<JpaData> jpaDatas = jpaDao.findAll();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "2");
		return jpaDatas;
		
	}
	
	
	@RequestMapping("/posttest")
	@ResponseBody
	public  Map<String, String> postme(@RequestBody Map<String, String> map) {
		System.out.println(map);
		List<JpaData> jpaDatas = jpaDao.findAll();
		System.out.println(map.toString());
		return map;
	}
	
	
	
	
	
	
	
	

	
	
}
