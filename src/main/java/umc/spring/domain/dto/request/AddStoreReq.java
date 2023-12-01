package umc.spring.domain.dto.request;

import lombok.*;
import umc.spring.domain.Region;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddStoreReq {
    @NotBlank(message = "가게 이름은 필수입니다.")
    private String name;
    @Size(min = 5, max = 12, message = "주소는 최소 5글자에서 최대 12글자 입니다,")
    private String address;
    @NotBlank(message = "지역 선택은 필수입니다.")
    private String region;
}
