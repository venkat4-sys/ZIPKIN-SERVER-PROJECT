package com.ait.greetfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API")
public interface GreetFeign {
	
	@GetMapping("/get/msg")
	public String getGreet();

}
