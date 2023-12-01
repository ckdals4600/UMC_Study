package umc.spring.domain;

import lombok.*;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.mapping.MemberAgree;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Terms extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String title;

    private String text;

    private Boolean optional;

    @OneToMany(mappedBy = "terms", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgrees = new ArrayList<>();
}
