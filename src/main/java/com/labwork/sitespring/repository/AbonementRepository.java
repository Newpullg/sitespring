package com.labwork.sitespring.repository;


import com.labwork.sitespring.entity.Abonement;
import com.labwork.sitespring.exception.ServiceException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AbonementRepository {

    @PostConstruct
    public void init(){
        savedAbonement = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private List<Abonement> savedAbonement;

    public Abonement getAbonementById(final Long id){
        return savedAbonement.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Abonement with id: " + id + " not found ", null));
    }

    public List<Abonement> getAllAbonements(){
        return savedAbonement;
    }

    public Abonement createAbonement(final Abonement abonement){
        if(abonement.getId() != null){
            throw new ServiceException(400, "Abonement shouldn't have an id ", null);
        }

        ++lastId;
        abonement.setId(lastId);

        savedAbonement.add(abonement);

        return abonement;
    }

    public Abonement updateAbonement(final Abonement abonement){
        if(abonement.getId() == null){
            throw new ServiceException(400, "User shouldn't have an id ", null);
        }

        final Abonement savedAbonement = getAbonementById(abonement.getId());


        savedAbonement.setTitle(abonement.getTitle());
        savedAbonement.setPrice(abonement.getPrice());
        savedAbonement.setType(abonement.getType());

        return savedAbonement;
    }


    public void deleteAbonementById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedAbonement.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Abonement with id: " + id + " not found ", null));

        savedAbonement = savedAbonement.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }
}
