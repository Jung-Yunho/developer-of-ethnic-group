package com.doeg.entity.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Integer memberId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @Column(name = "login_id", nullable = false)
    private String loginId;

    @Column(nullable = false)
    private String nickname;

    @Column
    private String email;

    @Column
    private String addr1;

    @Column
    private String addr2;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @Column(name = "create_dt", nullable = false)
    @CreatedDate
    private LocalDateTime createDt;

    @Column(name = "update_dt", nullable = false)
    @LastModifiedDate
    private LocalDateTime updateDt;

    @Builder
    public Member(Integer memberId, String name, String phone, String loginId, String nickname, String email, String addr1, String addr2, String password, String role, LocalDateTime createDt, LocalDateTime updateDt) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.loginId = loginId;
        this.nickname = nickname;
        this.email = email;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.password = password;
        this.role = role;
        this.createDt = createDt;
        this.updateDt = updateDt;
    }
}
