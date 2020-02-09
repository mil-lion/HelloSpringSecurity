/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright 2005-2020 LionSoft LLC.
 */

package ru.lionsoft.hello.spring.security.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Igor Morenko <morenko at lionsoft.ru>
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("msg", "Welcome '" + principal.getName() 
                    + "' into Spring Boot custom and in-memory managed user using BASIC authentication.");
        }
        return "home";
    }
    
}
