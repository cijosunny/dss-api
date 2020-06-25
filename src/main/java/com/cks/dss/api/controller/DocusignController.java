package com.cks.dss.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cks.dss.api.config.DssApiBaseConfig;

@RestController
public class DocusignController {
	@Autowired
	private DssApiBaseConfig dssApiBaseConfig;
	
	@GetMapping("/listdocusign")
	public List<String> getDocusignList(){
		if(dssApiBaseConfig.getDocusignEnabled().equalsIgnoreCase("true")) {
			return new ArrayList<>(Arrays.asList("package1","package2"));
		} else {
			return new ArrayList<>();
		}
	}
}
