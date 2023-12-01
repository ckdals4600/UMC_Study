package umc.spring.apiPlayload.code;

import umc.spring.apiPlayload.code.dto.ErrorReasonDTO;

public interface BaseErrorCode {
    ErrorReasonDTO getReason();
    ErrorReasonDTO getReasonHttpStatus();
}
