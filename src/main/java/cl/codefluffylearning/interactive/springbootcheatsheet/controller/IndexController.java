package cl.codefluffylearning.interactive.springbootcheatsheet.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/index")
    public String index(Model model) {
	
		String title= "Spring Boot Cheat-Sheet From Controller";
		
        model.addAttribute("title", title);
        return "index";
    }

}