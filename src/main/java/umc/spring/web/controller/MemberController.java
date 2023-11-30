package umc.spring.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPlayload.ApiResponse;
import umc.spring.domain.dto.request.JoinReq;
import umc.spring.domain.dto.response.JoinRes;
import umc.spring.service.MemberService.MemberCommandService;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<JoinRes> join(@RequestBody @Valid JoinReq request){
        JoinRes member = memberCommandService.joinMember(request);
        return ApiResponse.onSuccess(member);
    }
}
