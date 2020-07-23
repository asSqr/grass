package com.assqr.grass;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrassController {

	@RequestMapping(value="/")
	private String showHome() {
		return "Hello, world!!";
	}
}
