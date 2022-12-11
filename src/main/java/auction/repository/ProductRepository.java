package auction.repository;

import auction.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findProductsByName(String name);

    List<Product> findAllBy();

    Product findProductById(Long id);
}
