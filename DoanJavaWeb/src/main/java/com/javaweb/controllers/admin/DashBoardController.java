package com.javaweb.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin/dashboard")
public class DashBoardController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String dashboard1() {
		return "admin_template";
	}
}
