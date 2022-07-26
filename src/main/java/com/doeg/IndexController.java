package com.doeg;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/member/join")
    public String join(){
        return "join.html";
    }

    @GetMapping("/testSecurity")
    public String testSecurity(){
        return "testSecurity.html";
    }
}