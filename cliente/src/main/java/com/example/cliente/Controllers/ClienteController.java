package com.example.cliente.Controllers;

import com.example.cliente.Entity.Cliente;
import com.example.cliente.Request.ClienteRequest;
import com.example.cliente.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crearCliente(@RequestBody ClienteRequest clienteRequest) {

        Cliente clientaAGuardar= new Cliente(
              clienteRequest.getNombre(),
              clienteRequest.getApellido(),
              clienteRequest.getFechaNac()
        );
        return ResponseEntity.ok(clienteService.crearCliente(clientaAGuardar));
    }
    @GetMapping(value = "leer/{id}")
    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
        return ResponseEntity.ok(clienteService.obtenerClientePorID(id));
    }
}
