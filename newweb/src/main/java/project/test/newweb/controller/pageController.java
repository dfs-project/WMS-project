package project.test.newweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

	/**
	 * 首页
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	/**
	 * 跳转
	 * 
	 * @return
	 */
	@RequestMapping("/redirect")
	public String redirect() {
		return "redirect/redirect";
	}

	@RequestMapping("/brandimglist")
	public String brandimglist() {
		return "brandlist";
	}
}