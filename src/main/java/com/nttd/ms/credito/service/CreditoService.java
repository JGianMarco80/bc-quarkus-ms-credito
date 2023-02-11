package com.nttd.ms.credito.service;

import com.nttd.ms.credito.entity.Credito;
import java.util.List;

public interface CreditoService {

    List<Credito> findAll();

    Credito findById(Long id);

    void save(Credito credito);

    void update(Long id, Credito credito);

    void delete(Long id);

}
