package std.com.ec.model.dao;

import org.springframework.data.repository.CrudRepository;
import std.com.ec.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer> {

}
