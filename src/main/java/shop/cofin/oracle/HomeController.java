package shop.cofin.oracle;

import javax.servlet.http.HttpServletRequest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	
	@RequestMapping(value = "/joinform", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		
		return "/user/Join";
	}
	
}
