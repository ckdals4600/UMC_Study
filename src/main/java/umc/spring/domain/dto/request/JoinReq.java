package umc.spring.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.validation.annotation.ExistCategories;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JoinReq {
    @NotBlank
    String name;
    @NotNull
    Integer gender;
    @NotNull
    Integer birthYear;
    @NotNull
    Integer birthMonth;
    @NotNull
    Integer birthDay;
    @Size(min = 5, max = 12)
    String address;
    @Size(min = 5, max = 12)
    String specAddress;
    @ExistCategories
    private List<Long> preferCategory;
}
