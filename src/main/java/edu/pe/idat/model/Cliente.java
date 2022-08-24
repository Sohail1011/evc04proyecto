package edu.pe.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    @Column(name = "tipodocumento")
    private String tipodocumento;

    @Column(name = "nrodocumento")
    private String nrodocumento;
    
    @Column(name = "nomcliente")
    private String nomcliente;

    @Column(name = "apepatcliente")
    private String apepatcliente;

    @Column(name = "apematcliente")
    private String apematcliente;

    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;
}
