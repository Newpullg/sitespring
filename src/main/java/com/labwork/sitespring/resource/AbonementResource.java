package com.labwork.sitespring.resource;

import com.labwork.sitespring.dto.AbonementDTO;
import com.labwork.sitespring.service.AbonementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AbonementResource {
    @Autowired
    private AbonementService abonementService;

    @GetMapping("/abonements/{id}")
    public AbonementDTO getAbonementById(final @PathVariable Long id){
        return abonementService.getAbonementById(id);
    }

    @GetMapping("/abonements")
    public List<AbonementDTO> getAllAbonements(){
        return abonementService.getAllAbonements();
    }

    @PostMapping("/abonements")
    public AbonementDTO createAbonement(final @RequestBody AbonementDTO abonementDTO){
        return abonementService.createAbonement(abonementDTO);
    }

    @PutMapping("/abonements/")
    public AbonementDTO updateAbonement(final @RequestBody AbonementDTO abonementDTO){
        return abonementService.updateAbonement(abonementDTO);
    }

    @DeleteMapping("/abonements/{id}")
    public void deleteAbonementById(final @PathVariable Long id){
        abonementService.deleteAbonementById(id);
    }

}
