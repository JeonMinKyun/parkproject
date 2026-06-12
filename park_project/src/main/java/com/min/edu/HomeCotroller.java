package com.min.edu;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeCotroller {

	@GetMapping
	public String getMethodName() {
		return "안녕하세요 Park 프로젝트 입니다";
	}
	
	
}
