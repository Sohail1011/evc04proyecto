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
public class EmpleadoSp {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    private String nrodocumento;
    private String nomempleado;
    private String apepatempleado;
    private String apematempleado;
    private String direccion;
    private String telefono;
    private String email;
    private String idcargo;
    private String nomcargo;
}
