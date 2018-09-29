package com.olx.webui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdController {
	@RequestMapping(value="/postad")
	public String postAd(Model model)
	{
		return "postAdv";
	}

}
