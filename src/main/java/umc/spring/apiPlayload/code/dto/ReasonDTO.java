package umc.spring.apiPlayload.code.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReasonDTO {
    private String message;
    private String code;
    private Boolean isSuccess;
    private HttpStatus httpStatus;
}
