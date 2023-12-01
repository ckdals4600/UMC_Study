package umc.spring.service.store;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import umc.spring.apiPlayload.code.status.ErrorStatus;
import umc.spring.apiPlayload.exception.handler.TempHandler;
import umc.spring.converter.StoreConverter;
import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.domain.dto.request.AddStoreReq;
import umc.spring.domain.dto.response.AddStoreRes;
import umc.spring.repository.RegionRepository;
import umc.spring.repository.StoreRepository;
import umc.spring.service.region.RegionService;

@Service
@RequiredArgsConstructor
@Slf4j
public class StoreServiceImpl implements StoreService{
    public final StoreRepository storeRepository;
    public final RegionService regionService;

    public AddStoreRes add(AddStoreReq req){
        Store store = StoreConverter.from(req, regionService.findByName(req.getRegion()));

        return StoreConverter.toAddStoreRes(storeRepository.save(store));
    }
}