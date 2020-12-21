package com.ecole221.gestion_immo.service;

import com.ecole221.gestion_immo.dao.BienRepository;
import com.ecole221.gestion_immo.model.Bien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BienService implements IBien {
    @Autowired
    private BienRepository bienRepository;

    @Override
    public Page<Bien> findAll(Integer pageNo, Integer pageSize,
                              String sortBy) {
        Pageable pageable = PageRequest.of(pageNo, pageSize,
                Sort.by(sortBy));
        Page<Bien> biens = bienRepository.findAll(pageable);
        return biens;
    }
}
