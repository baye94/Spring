package com.ecole221.gestion_immo.dao;

import com.ecole221.gestion_immo.model.Bien;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BienRepository extends
        PagingAndSortingRepository<Bien, Long> {
}
