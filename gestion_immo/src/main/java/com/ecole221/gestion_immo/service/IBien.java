package com.ecole221.gestion_immo.service;

import com.ecole221.gestion_immo.model.Bien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBien {
    public Page<Bien> findAll(Integer pageNo, Integer pageSize,
                              String sortBy);
}
