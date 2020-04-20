package com.pbasco.DojoSurvey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SurveyController {
	@RequestMapping("/")
	public String survey() {
		return "survey.jsp";
	}
}
