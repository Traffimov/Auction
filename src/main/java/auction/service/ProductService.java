package auction.service;

import auction.dto.ProductCreationDto;
import auction.dto.ProductDto;
import auction.model.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> findProductsByName(String name);

    List<ProductDto> findAll();

    ProductDto findProductById(Long id);

    ProductDto save(ProductCreationDto productCreationDto);

    void delete(Long id);

}