package org.gfg.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
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
}
