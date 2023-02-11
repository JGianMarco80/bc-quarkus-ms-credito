package com.nttd.ms.credito.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "credito")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Credito {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "cuota")
    private Integer cuota;

    @Column(name = "fecha_pago_mensual")
    private LocalDate fechaPagoMensual;

    @Column(name = "saldo_inicial")
    private Double saldoInicial;

    @Column(name = "saldo_actual")
    private Double saldoActual;

    @Column(name = "numero_credito")
    private String numeroCredito;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "estado")
    private String estado = "1";
}
