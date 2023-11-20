package umc.spring.apiPlayload.code;

import umc.spring.apiPlayload.code.dto.ReasonDTO;

public interface BaseCode {
    ReasonDTO getReason();
    ReasonDTO getReasonHttpStatus();
}
