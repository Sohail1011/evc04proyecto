package edu.pe.idat.model.sp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class ClienteSp {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String tipodocumento;
    private String nrodocumento;
    private String nomcliente;
    private String apepatcliente;
    private String apematcliente;
    private String direccion;
    private String telefono;
    private String email;
}
