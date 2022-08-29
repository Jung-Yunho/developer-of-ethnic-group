package com.doeg.dto.member;

import com.doeg.entity.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

    private String name;
    private String phone;
    private String loginId;
    private String nickname;
    private String email;
    private String addr1;
    private String addr2;
    private String password;
    private String role;

    @Builder
    public MemberDto(String name, String phone, String loginId, String nickname, String email, String addr1, String addr2, String password, String role) {
        this.name = name;
        this.phone = phone;
        this.loginId = loginId;
        this.nickname = nickname;
        this.email = email;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.password = password;
        this.role = role;
    }

    public Member toEntity(){
        return Member.builder()
                .name(name)
                .phone(phone)
                .loginId(loginId)
                .nickname(nickname)
                .email(email)
                .addr1(addr1)
                .addr2(addr2)
                .password(password)
                .role(role)
                .build();
    }
}
