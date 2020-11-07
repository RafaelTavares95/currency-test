package tech.jaya.currencytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class BaseController {

	@GetMapping
	public String test() {
		return "Ok";
	}
}
