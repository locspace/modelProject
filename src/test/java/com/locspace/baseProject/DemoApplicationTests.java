package com.locspace.baseProject;

import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.locspace.baseProject.bean.JpaData;
import com.locspace.baseProject.dao.JpaDao;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private JpaDao jpaDao;
	
	@Autowired
	private TestRestTemplate template;
	
	
	
	@Test
	void testlist() {
		String requestResult = this.template.getForObject("http://127.0.0.1:"+port+"/datalist/"+port, String.class);
		System.out.println("requestResult"+requestResult);
		Gson gson = new Gson();			
		
		JsonArray jsonArray = JsonParser.parseString(requestResult).getAsJsonArray();
		
		System.out.println(jsonArray);
		
		ArrayList<JpaData> dataList = new ArrayList<JpaData>();
		
		
		for (JsonElement jpa : jsonArray) {
			JpaData jpaData = gson.fromJson(jpa, JpaData.class);
			dataList.add(jpaData);
		}
		
		Assertions.assertThat(requestResult).contains("去");
	}
	
	@Test
	void test2() {
		Assertions.assertThat("123").contains("5");
	}
	

}

