package com.labwork.sitespring.service;

import com.labwork.sitespring.dto.AbonementDTO;

import java.util.List;

public interface AbonementService {

    AbonementDTO getAbonementById(Long id);
    List<AbonementDTO> getAllAbonements();
    AbonementDTO createAbonement(AbonementDTO abonementDTO);
    AbonementDTO updateAbonement(AbonementDTO abonementDTO);
    void deleteAbonementById(Long id);
}
