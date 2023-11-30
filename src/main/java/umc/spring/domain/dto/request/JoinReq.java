package umc.spring.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JoinReq {
    private String name;
    private Integer gender;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;
    private String address;
    private String specAddress;
    private List<Long> preferCategory;
}
