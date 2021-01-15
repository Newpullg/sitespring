package com.labwork.sitespring.service.impl;

import com.labwork.sitespring.dto.AbonementDTO;
import com.labwork.sitespring.exception.ServiceException;
import com.labwork.sitespring.mapper.AbonementToAbonementDTOMapper;
import com.labwork.sitespring.repository.AbonementRepository;
import com.labwork.sitespring.service.AbonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AbonementServiceImpl implements AbonementService {

    @Autowired
    private AbonementRepository abonementRepository;

    @Autowired
    private AbonementToAbonementDTOMapper abonementToAbonementDTOMapper;

    @Override
    public AbonementDTO getAbonementById(final Long id) {

        return abonementToAbonementDTOMapper.toDTO(abonementRepository.getAbonementById(id));
    }

    @Override
    public List<AbonementDTO> getAllAbonements() {
        return abonementRepository.getAllAbonements().stream()
                .map(e -> abonementToAbonementDTOMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public AbonementDTO createAbonement(final AbonementDTO abonementDTO) {
        if(abonementDTO.getId() != null){
            throw new ServiceException(400, "Abonement shouldn't have an id ", null);
        }

        return abonementToAbonementDTOMapper.toDTO(abonementRepository.createAbonement(abonementToAbonementDTOMapper.toEntity(abonementDTO)));
    }

    @Override
    public AbonementDTO updateAbonement(final AbonementDTO abonementDTO) {
        if(abonementDTO.getId() == null){
            throw new ServiceException(400, "Abonement have an id ", null);
        }

        return abonementToAbonementDTOMapper.toDTO(abonementRepository.updateAbonement(abonementToAbonementDTOMapper.toEntity(abonementDTO)));
    }

    @Override
    public void deleteAbonementById(final Long id) {
        abonementRepository.deleteAbonementById(id);
    }
}
