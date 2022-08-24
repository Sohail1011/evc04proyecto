package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Cliente;
import edu.pe.idat.model.sp.ClienteSp;
import edu.pe.idat.repository.ClienteRepository;
import edu.pe.idat.repository.sp.ClienteSpRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteSpRepository clienteSpRepository;

    public List<ClienteSp> listarClientes() {
        return clienteSpRepository.listarClientes();
    }

    @Autowired
    ClienteRepository clienteRepository;

    public void registrarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
