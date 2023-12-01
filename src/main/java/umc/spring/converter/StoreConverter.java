package umc.spring.converter;

import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.domain.dto.request.AddStoreReq;
import umc.spring.domain.dto.response.AddStoreRes;

public class StoreConverter {
    public static Store from(AddStoreReq req, Region region){
        return Store.builder()
                .name(req.getName())
                .address(req.getAddress())
                .region(region)
                .build();
    }

    public static AddStoreRes toAddStoreRes(Store store){
        return AddStoreRes.builder()
                .name(store.getName())
                .address(store.getAddress())
                .region(store.getRegion().getName())
                .build();
    }
}
