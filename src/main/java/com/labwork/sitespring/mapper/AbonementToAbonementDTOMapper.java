package com.labwork.sitespring.mapper;

import com.labwork.sitespring.dto.AbonementDTO;
import com.labwork.sitespring.entity.Abonement;
import org.springframework.stereotype.Component;

@Component
public class AbonementToAbonementDTOMapper {
    public Abonement toEntity(final AbonementDTO abonementDTO){
        final Abonement abonement = new Abonement();

        abonement.setId(abonementDTO.getId());
        abonement.setPrice(abonementDTO.getPrice());
        abonement.setTitle(abonementDTO.getTitle());
        abonement.setType(abonementDTO.getType());

        return abonement;
    }

    public AbonementDTO toDTO(Abonement abonement){
        AbonementDTO abonementDTO = new AbonementDTO();

        abonementDTO.setId(abonement.getId());
        abonementDTO.setPrice(abonement.getPrice());
        abonementDTO.setTitle(abonement.getTitle());
        abonementDTO.setType(abonement.getType());

        return abonementDTO;
    }

}
