package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.cos.blog 패키지이하를 스캔해서 모든 파일을 메모리에 new하는것은 아니고,
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IOC) 스프링컨테이너에 관리해준다.
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello") //getmapping으로 주소설정
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}

}