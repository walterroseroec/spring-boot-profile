package std.com.ec.model.services;

import std.com.ec.model.entity.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> findAll();

    void save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

}
