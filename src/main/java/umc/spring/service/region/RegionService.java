package umc.spring.service.region;

import umc.spring.domain.Region;

public interface RegionService {
    Region findByName(String name);
    Region add(String name);
}
