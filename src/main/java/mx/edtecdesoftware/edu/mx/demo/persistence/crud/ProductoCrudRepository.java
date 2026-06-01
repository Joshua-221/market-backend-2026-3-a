package mx.edtecdesoftware.edu.mx.demo.persistence.crud;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository<Producto>
        extends CrudRepository<Producto, Integer> {

}