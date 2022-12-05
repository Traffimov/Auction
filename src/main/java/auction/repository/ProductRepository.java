package auction.repository;

import auction.dto.ProductDto;
import auction.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<ProductDto> getProductByName(String name);
}
