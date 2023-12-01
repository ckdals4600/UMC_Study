package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPlayload.ApiResponse;
import umc.spring.domain.dto.request.AddStoreReq;
import umc.spring.domain.dto.response.AddStoreRes;
import umc.spring.service.store.StoreService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/store")
public class StoreController {
    private final StoreService storeService;

    @PostMapping("/add")
    public ApiResponse<AddStoreRes> addStore(@RequestBody AddStoreReq req){
        return ApiResponse.onSuccess(storeService.add(req));
    }
}
