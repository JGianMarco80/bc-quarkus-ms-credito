package com.nttd.ms.credito.service.impl;

import com.nttd.ms.credito.entity.Credito;
import com.nttd.ms.credito.repository.CreditoRepository;
import com.nttd.ms.credito.service.CreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CreditoServiceImpl implements CreditoService {

    @Inject
    CreditoRepository creditoRepository;

    @Override
    public List<Credito> findAll() {
        List<Credito> creditos = creditoRepository.listAll();
        List<Credito> creditosActivos = new ArrayList<>();

        for (Credito credito : creditos) {
            if(credito.getEstado().equals("1")){
                creditosActivos.add(credito);
            }
        }

        return creditosActivos;
    }

    @Override
    public Credito findById(Long id) {
        return creditoRepository.findById(id);
    }

    @Override
    public void save(Credito credito) {
        creditoRepository.persist(credito);
    }

    @Override
    public void update(Long id, Credito credito) {
        Credito cObtenido = creditoRepository.findById(id);
        cObtenido.setFechaInicio(credito.getFechaInicio());
        cObtenido.setCuota(credito.getCuota());
        cObtenido.setFechaPagoMensual(credito.getFechaPagoMensual());
        cObtenido.setSaldoInicial(credito.getSaldoInicial());
        cObtenido.setSaldoActual(credito.getSaldoActual());
        cObtenido.setNumeroCredito(credito.getNumeroCredito());
        creditoRepository.persist(cObtenido);
    }

    @Override
    public void delete(Long id) {
        Credito cObtenido = creditoRepository.findById(id);
        cObtenido.setEstado("0");
        creditoRepository.persist(cObtenido);
    }
}
