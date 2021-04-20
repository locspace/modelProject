package com.locspace.baseProject.conroller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.locspace.baseProject.bean.Auto;
import com.locspace.baseProject.bean.Autochart;
import com.locspace.baseProject.bean.JpaData;
import com.locspace.baseProject.bean.ViewS6;
import com.locspace.baseProject.dao.AutoDao;
import com.locspace.baseProject.dao.AutochartDao;
import com.locspace.baseProject.dao.JpaDao;
import com.locspace.baseProject.dao.S6Dao;

@Controller
public class IndexController<E> {
	
	@Autowired
	private JpaDao jpaDao;
	@Autowired
	private AutoDao autoDao;
	@Autowired
	private AutochartDao autochartdao;
	@Autowired
	private S6Dao d6Dao;
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/index")
	public String index(ModelMap modelMap) {
		JpaData jpaData=new JpaData();
		modelMap.addAttribute("indexstring", "now is" +DateFormat.getDateTimeInstance().format(new Date()));
		
		Optional<JpaData> optional=jpaDao.findByName("2");
		if (optional.isPresent()) {
			System.out.println(jpaData.toString());
			 jpaData = optional.get();
		}
		
		modelMap.addAttribute("jpadata",jpaData);
		
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
	
	@RequestMapping("/auto")
	@ResponseBody
	public List<Autochart> getAuto() {
		
		List<Auto> autolist = autoDao.findByMyloc("loc");
		
//		Page<Autochart> aPage = autochartdao.findAll(PageRequest.of(0, 10000));
//		List<Autochart> listauto = aPage.getContent();
		List<Autochart> listauto = autochartdao.findAll();
		
		return listauto;
	}
	
	@RequestMapping("/count")
	@ResponseBody
	public ArrayList<String> getCount() {
		long count = autochartdao.count();
		ArrayList<String> list = new ArrayList<String>();
		long n=count%10000;
		for (int i = 0; i < n; i=i+1) {
			System.out.println(i);
//				PageRequest pageable = PageRequest.of(i, 10000);
//				Page<Autochart> page = autochartdao.findAll(pageable);
//				List<Autochart> plist = page.getContent();
//				list.addAll(plist);
			Page<Autochart> findAll = autochartdao.findAll(PageRequest.of(i, 10000));
			
			List<Autochart> contentlist = findAll.getContent();
			for (Autochart autochart : contentlist) {
				list.add(autochart.getUtime());
			}
			
			
		}
		
		return list ;
	}
	
	
	@RequestMapping("/s6")
	@ResponseBody
	public ArrayList<ArrayList<String>> gets(){

		ArrayList<ArrayList<String>> datalist = new ArrayList<ArrayList<String>>();
		
		List<ViewS6> list = d6Dao.findByLoadstate(2);
		for (ViewS6 viewS6 : list) {
			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add(String.valueOf(viewS6.getTime()));
			arrayList.add(String.valueOf(viewS6.getEnergy()));
			datalist.add(arrayList);
		}
		
		
		return  datalist;
	}
	
	@RequestMapping("/echart")
	public String ecString() {
		
		
		return "echart";
	}
	
}
