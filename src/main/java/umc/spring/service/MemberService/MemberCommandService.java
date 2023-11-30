package umc.spring.service.MemberService;

import umc.spring.domain.Member;
import umc.spring.domain.dto.request.JoinReq;
import umc.spring.domain.dto.response.JoinRes;

public interface MemberCommandService {
    JoinRes joinMember(JoinReq req);
}
