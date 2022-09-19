package com.doeg;

import com.doeg.dto.member.MemberDto;
import com.doeg.services.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class SecurityTestController {

    private final MemberService memberService;

    @GetMapping("/pages/home")
    public String home(){
        return "pages/home.html";
    }

    @GetMapping("/pages/login")
    public String login(){
        return "pages/login.html";
    }

    @GetMapping("/pages/signUp")
    public String signUp(){
        return "pages/signUp.html";
    }

    @PostMapping("/pages/signUp")
    public String signUp(MemberDto memberDto){
        memberService.save(memberDto);
        return "redirect:/pages/login";
    }

    @PreAuthorize("hasRole('ROLE_MEMBER')")
    @GetMapping("/pages/member/info")
    public String userInfo() {
        return "pages/userinfo.html";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/pages/admin")
    public String admin() {
        return "pages/admin.html";
    }

    @GetMapping("/pages/denied")
    public String denied() {
        return "pages/denied.html";
    }
}
