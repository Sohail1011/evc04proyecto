package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Empleado;
import edu.pe.idat.model.sp.EmpleadoSp;
import edu.pe.idat.repository.EmpleadoRepositoty;
import edu.pe.idat.repository.sp.EmpleadoSpRepositoty;

@Service
public class EmpleadoService {
    
    @Autowired
    EmpleadoSpRepositoty empleadoSpRepository;

    public List<EmpleadoSp> listarEmpleados() {
        return empleadoSpRepository.listarEmpleados();
    }

    @Autowired
    EmpleadoRepositoty empleadoRepositoty;

    public void registrarEmpleado(Empleado empleado) {
        empleadoRepositoty.save(empleado);
    }
}
