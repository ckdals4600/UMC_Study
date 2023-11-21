package umc.spring.apiPlayload.exception;

import lombok.AllArgsConstructor;
import umc.spring.apiPlayload.code.BaseErrorCode;
import umc.spring.apiPlayload.code.dto.ErrorReasonDTO;

@AllArgsConstructor
public class GeneralException extends RuntimeException{
    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason(){
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
