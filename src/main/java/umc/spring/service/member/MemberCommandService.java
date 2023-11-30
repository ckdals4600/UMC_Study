package umc.spring.service.member;

import umc.spring.domain.dto.request.JoinReq;
import umc.spring.domain.dto.response.JoinRes;

public interface MemberCommandService {
    JoinRes joinMember(JoinReq req);
}
