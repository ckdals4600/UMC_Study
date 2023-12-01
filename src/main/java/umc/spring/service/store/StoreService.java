package umc.spring.service.store;


import umc.spring.domain.dto.request.AddStoreReq;
import umc.spring.domain.dto.response.AddStoreRes;

public interface StoreService {
    AddStoreRes add(AddStoreReq req);
}