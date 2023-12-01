package umc.spring.domain;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.enums.MemberStatus;
import umc.spring.domain.enums.SocialType;
import umc.spring.domain.mapping.MemberAgree;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.domain.mapping.MemberPrefer;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@DynamicUpdate
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Integer birthYear;
    @Column(nullable = false)
    private Integer birthMonth;
    @Column(nullable = false)
    private Integer birthDay;

    @Column(nullable = false, length = 40)
    private String address;

    @Column(name = "spec_address", nullable = false, length = 40)
    private String specAddress;

    @Column(nullable = false, length = 50)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private MemberStatus memberStatus;

    @Column(name = "inactive_date")
    private LocalDateTime inactiveDate;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private SocialType socialType;

    @ColumnDefault("0")
    private Integer point;


    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgreesList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberPrefer> memberPreferList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();
}
