package auction.service;

import auction.dto.ProductDto;
import auction.model.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAllByName(String name);

    List<ProductDto> getAllProduct();

    ProductDto getById(Long id);

    ProductDto save(Product product);

    void delete(Long id);

}