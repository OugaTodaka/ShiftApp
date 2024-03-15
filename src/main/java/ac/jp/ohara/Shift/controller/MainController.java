package ac.jp.ohara.Shift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ac.jp.ohara.Shift.model.Shift;
import ac.jp.ohara.Shift.model.ShiftAdd;
import ac.jp.ohara.Shift.model.User;
import ac.jp.ohara.Shift.model.UserAdd;
import ac.jp.ohara.Shift.service.ShiftService;
import ac.jp.ohara.Shift.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	@Autowired
	private ShiftService shiftService;

	@RequestMapping("/")
	public ModelAndView login(ModelAndView model) {
		model.setViewName("login");
		model.addObject("User",new User());
		return model;
	}

	@RequestMapping("/index")
	public ModelAndView index(ModelAndView model) {
		model.setViewName("index");
		List<Shift>list = shiftService.searchAll();
		model.addObject("list", list);
		return model;
	}

	@RequestMapping("/user")
	public ModelAndView worker(ModelAndView model) {
		model.setViewName("user");
		List<User>list = userService.searchAll();
		model.addObject("list", list);
		return model;
	}

	@GetMapping("/useradd")
	public String useradd(@ModelAttribute UserAdd useradd) {
		return "useradd";
	}

	@PostMapping("/useradd")
	public String useradd_run(@ModelAttribute UserAdd useradd) {
		return "redirect:/user";
	}

	@GetMapping("/shiftadd")
	public ModelAndView shiftadd(@ModelAttribute ShiftAdd shiftadd, ModelAndView model) {
		model.setViewName("shiftadd");
		List<User>list = userService.searchAll();
		model.addObject("users",list);
		return model;
	}
	
	@PostMapping("/shiftadd")
	public String shiftadd_run(@ModelAttribute ShiftAdd shiftadd ) {
		return "redirect:/index";
	}
}
