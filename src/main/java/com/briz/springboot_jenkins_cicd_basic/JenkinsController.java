package com.briz.springboot_jenkins_cicd_basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController
{
@RequestMapping("/test")
public String test()
{
	return "this is jenkins automation test";
}
}
