package org.gfg.securitydemo;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

    @GetMapping("/security-demo")
    public String getSecurityDemoApi(){
        return "security-demo";
    }
    @GetMapping("/home")
    public String getHome(){
        return "home...";
    }
    @GetMapping("/user")
    public String getUser(){
        return "user ... ";
    }
    @GetMapping("/admin")
    public String getAdmin(){
        return "admin";
    }

    @PostMapping("/username/{name}")
    public String getUsername(@PathVariable String name){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUser user =  (MyUser) authentication.getPrincipal();
        return "hey "+user.getUsername();

    }


}
