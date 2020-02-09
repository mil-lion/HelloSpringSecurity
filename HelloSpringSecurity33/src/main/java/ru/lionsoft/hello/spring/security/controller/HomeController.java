package ru.lionsoft.hello.spring.security.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Администратор
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("msg", "Welcome '" + principal.getName()
                + "' into Spring Boot OAuth and OIDC authentication.");
        }
        return "home";
    }
}
