package umc.spring.service.region;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import umc.spring.apiPlayload.code.status.ErrorStatus;
import umc.spring.apiPlayload.exception.handler.TempHandler;
import umc.spring.domain.Region;
import umc.spring.repository.RegionRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegionServiceImpl implements RegionService{

    public final RegionRepository regionRepository;

    @Override
    public Region findByName(String name) {
        return regionRepository.findByName(name)
                .orElseThrow(() -> new TempHandler(ErrorStatus.REGION_NOT_EXIST));
    }

    @Override
    public Region add(String name) {
        return regionRepository.save(Region.builder().name(name).build());
    }
}
