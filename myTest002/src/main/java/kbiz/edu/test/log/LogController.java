package kbiz.edu.test.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {

	@RequestMapping("/")
	public String firstPage() {
		return "/log/login";
	}
	
	@RequestMapping("log.in")
	public ModelAndView loginCheck(ModelAndView mav, HttpServletRequest request) {
		String id = request.getParameter("idInput");
		String password = request.getParameter("passwordInput");
		
		Map<String,String> info = new HashMap<String, String>();
		info.put("id", id);
		info.put("password", password);
		
//		List<Map<String,String>> list = 
		if(password.length() > 0) {
			mav.addObject("msg", "SUCCESS");
		} else {
			mav.addObject("msg", "FAIL");
		}
		mav.setViewName("main");
				
		return mav;
	}
	
	@RequestMapping("log.out")
	public ModelAndView logout(ModelAndView mav, HttpSession session) {
		
		mav.addObject("test","validate");
		mav.setViewName("/log/login");
		
		return mav;
	}
}
