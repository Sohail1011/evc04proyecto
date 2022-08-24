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
@Table(name = "empleado")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempleado;

    @Column(name = "nrodocumento")
    private String nrodocumento;
    
    @Column(name = "nomempleado")
    private String nomempleado;

    @Column(name = "apepatempleado")
    private String apepatempleado;

    @Column(name = "apematempleado")
    private String apematempleado;

    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;

    @Column(name = "email")
    private String email;

    @Column(name = "idcargo")
    private String idcargo;
}
