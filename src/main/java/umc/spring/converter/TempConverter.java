package umc.spring.converter;

import umc.spring.web.dto.TempRes;

public class TempConverter {

    public static TempRes.TempTestDTO tempTestDTO(){
        return TempRes.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }
}
