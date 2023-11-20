package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPlayload.ApiResponse;
import umc.spring.converter.TempConverter;
import umc.spring.web.dto.TempRes;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempTestController {

    @GetMapping("/test")
    public ApiResponse<TempRes.TempTestDTO> testAPI(){
        return ApiResponse.onSuccess(TempConverter.tempTestDTO());
    }
}
