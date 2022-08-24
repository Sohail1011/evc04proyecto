package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Proveedor;
import edu.pe.idat.model.sp.ProveedorSp;
import edu.pe.idat.repository.ProveedorRepository;
import edu.pe.idat.repository.sp.ProveedorSpRepository;

@Service
public class ProveedorService {
    
    @Autowired
    ProveedorSpRepository proveedorSpRepository;

    public List<ProveedorSp> listarProveedores() {
        return proveedorSpRepository.listarProveedores();
    }

    @Autowired
    ProveedorRepository proveedorRepository;

    public void registrarProveedor(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }
}
