package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPlayload.ApiResponse;
import umc.spring.domain.Region;
import umc.spring.service.region.RegionService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/region")
public class RegionController {
    public final RegionService regionService;
    @GetMapping("/add")
    public ApiResponse<Region> add(@RequestParam String region){
        return ApiResponse.onSuccess(regionService.add(region));
    }
}
