package edu.pe.idat.model.sp;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class UsuarioSp {
    
    @Id
    private String idusuario;
    private String contrasenia;
    private String email;
    private String tipo;
}
