package com.doeg.dto.member;

import com.doeg.entity.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class MemberDto {

    @NotBlank(message = "이름을 입력해주세요.")
    @Size(min = 2, max = 10, message = "닉네임은 2자 이상 10자 이하로 입력해주세요.")
    private String name;

    @NotBlank(message = "휴대폰 번호를 입력해주세요.")
    @Pattern(regexp = "(01[016789])(\\d{3,4})(\\d{4})", message = "올바른 휴대폰 번호를 입력해주세요.")
    private String phone;

    @NotBlank(message = "로그인 아이디를 입력해주세요.")
    private String loginId;
    @NotBlank(message = "닉네임을 입력해주세요.")
    private String nickname;
    @NotBlank(message = "로그인 아이디를 입력해주세요.")
    private String email;
    @NotBlank(message = "로그인 아이디를 입력해주세요.")
    private String addr1;
    @NotBlank(message = "로그인 아이디를 입력해주세요.")
    private String addr2;
    @NotBlank(message = "로그인 아이디를 입력해주세요.")
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
