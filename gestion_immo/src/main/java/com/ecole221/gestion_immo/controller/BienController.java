package com.ecole221.gestion_immo.controller;

import com.ecole221.gestion_immo.model.Bien;
import com.ecole221.gestion_immo.service.IBien;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/bien")
public class BienController {

    @Autowired
    private IBien bienService;

    @RequestMapping("/all")
    public String allBien(
            @RequestParam(value = "pageNo", defaultValue = "0")
                    Integer pageNo,
            @RequestParam(value = "pageSize", defaultValue = "3")
                    Integer pageSize,
            @RequestParam(value = "sortBy", defaultValue = "id")
                    String sortBy, Model model
            ){
        Page<Bien> biens = bienService.findAll(pageNo,pageSize,sortBy);
        if(biens.hasContent()){
            model.addAttribute("biens", biens.getContent());
            model.addAttribute("nbPages", biens.getTotalPages());
            model.addAttribute("pageNo", pageNo);
            model.addAttribute("pageSize", pageSize);
        }
        else{
            model.addAttribute("biens", new ArrayList<>());
        }


        return "allbien";
    }
}
