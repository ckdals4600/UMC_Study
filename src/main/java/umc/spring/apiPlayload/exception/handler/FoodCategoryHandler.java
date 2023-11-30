package umc.spring.apiPlayload.exception.handler;

import umc.spring.apiPlayload.code.BaseErrorCode;
import umc.spring.apiPlayload.code.status.ErrorStatus;
import umc.spring.apiPlayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(ErrorStatus code) {
        super(code);
    }
}
