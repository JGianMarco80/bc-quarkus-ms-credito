package com.nttd.ms.credito.repository;

import com.nttd.ms.credito.entity.Credito;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CreditoRepository implements PanacheRepository<Credito> {
}
