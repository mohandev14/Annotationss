package com.Annotation.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Annotations.KonnectgenFamily;

@RestController
public class Family {
	
	@Value("${wife.name: no wife}")
	String Wifename;
	
	@Autowired
	Mom mom;
	
	@Autowired
	 KonnectgenFamily  konnectgenFamily ;
	
	@GetMapping("family/dad")
	
	
	public  String dad()
{
		konnectgenFamily. konnectgenfamily();
		return "mom name=    " + mom.momname()+" ,    wife name=  " + Wifename ;
		
	}

}
