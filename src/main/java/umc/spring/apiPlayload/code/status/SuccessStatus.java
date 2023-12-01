package umc.spring.apiPlayload.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring.apiPlayload.code.BaseCode;
import umc.spring.apiPlayload.code.dto.ReasonDTO;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode{
    _OK(HttpStatus.OK,"COMMON200","정상 수행 완료.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ReasonDTO getReason() {

        return ReasonDTO.builder()
                .isSuccess(true)
                .message(message)
                .code(code)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {

        return ReasonDTO.builder()
                .isSuccess(true)
                .message(message)
                .code(code)
                .httpStatus(httpStatus)
                .build();
    }
}
