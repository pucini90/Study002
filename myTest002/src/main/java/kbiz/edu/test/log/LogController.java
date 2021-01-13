package kbiz.edu.test.log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {

	@RequestMapping("/")
	public String firstPage() {
		return "/log/login";
	}
	
	@RequestMapping("login.check")
	public ModelAndView loginCheck(ModelAndView mav, HttpServletRequest request) {
		String id = request.getParameter("idInput");
		String password = request.getParameter("passwordInput");
		
		Map<String,String> info = new HashMap<String, String>();
		info.put("id", id);
		info.put("password", password);
		
//		List<Map<String,String>> list = 
		if() {
			mav.addObject("msg", "SUCCESS");
		}
		
				
		return mav;
	}
}
