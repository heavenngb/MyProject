package com.ngb.controller;

import com.ngb.service.UserFunctionMenuService;
import com.ngb.vo.UserFunctionMenuVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/menu" })
public class UserFunctionMenuController {

	@Autowired
	private UserFunctionMenuService userService;

	@ResponseBody
	@RequestMapping(value = { "/findAll" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public List<UserFunctionMenuVO> findAll() {
		List<UserFunctionMenuVO> vos = this.userService.findAll();
		return vos;
	}
}