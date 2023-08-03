package std.com.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import std.com.ec.model.entity.Cliente;
import std.com.ec.model.services.IClienteService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping("/cliente/{id}")
    public Cliente show(@PathVariable Integer id) {
        return this.clienteService.findById(id);
    }

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        cliente.setFechaRegistro(new Date());
        this.clienteService.save(cliente);
        return cliente;
    }

    @PutMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id) {
        Cliente currentCliente = this.clienteService.findById(id);
        currentCliente.setNombre(cliente.getNombre());
        currentCliente.setApellido(cliente.getApellido());
        currentCliente.setCorreo(cliente.getCorreo());
        this.clienteService.save(currentCliente);
        return currentCliente;
    }

    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        Cliente currentCliente = this.clienteService.findById(id);
        this.clienteService.delete(currentCliente);
    }
}
