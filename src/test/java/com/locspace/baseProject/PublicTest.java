package com.locspace.baseProject;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class PublicTest {

	

	public static void main(String[] args) {
		
		
		String s="11,100,15,300";
		String[] t = s.split(",");
		
		System.out.println(Arrays.deepToString(t));
		
		
		 String start = String.valueOf((Integer.parseInt(t[0]) * 1000 + Double.parseDouble(t[1])) / 1000);
		 String end = String.valueOf((Integer.parseInt(t[2]) * 1000 + Double.parseDouble(t[3])) / 1000);
		
		double sd = Double.parseDouble(start);
		double ed = Double.parseDouble(end);
		System.out.println(sd);
		System.out.println(ed);
		if (sd>ed) {
			System.out.println("normal");
			
		}else {
			System.out.println("exception");
		}
		
	}
}
