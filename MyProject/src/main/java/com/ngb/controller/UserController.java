package com.ngb.controller;

import com.ngb.service.UserService;
import com.ngb.vo.UserDetailVO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({ "/user" })
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/findAll" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public List<UserDetailVO> findAll() {
		List<UserDetailVO> vos = this.userService.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login");
		mv.addObject("userVOs", vos);
		return vos;
	}
}