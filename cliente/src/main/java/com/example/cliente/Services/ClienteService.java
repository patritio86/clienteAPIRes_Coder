package com.example.cliente.Services;

import com.example.cliente.Entity.Cliente;
import com.example.cliente.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente crearCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    public Cliente obtenerClientePorID(final Long id) {
        return clienteRepository.save(clienteRepository.getReferenceById(id));
    }
    // Metodo para calcular la edad de una persona ingresando el id
    public Integer  calcularEdad(Long id){
        Optional<Cliente> cliente=clienteRepository.findById(id);
        return Period.between(cliente.get().getFechaNac(), LocalDate.now()).getYears();
    }
}
