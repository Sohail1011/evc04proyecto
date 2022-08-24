package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Producto;
import edu.pe.idat.model.sp.ProductoSp;
import edu.pe.idat.repository.ProductoRepository;
import edu.pe.idat.repository.sp.ProductoSpRepository;

@Service
public class ProductoService {
    
    @Autowired
    ProductoSpRepository productoSpRepository;

    public List<ProductoSp> listarProductos() {
        return productoSpRepository.listarProductos();
    }

    @Autowired
    ProductoRepository productoRepository;

    public void registrarProducto(Producto producto) {
        productoRepository.save(producto);
    }
}
