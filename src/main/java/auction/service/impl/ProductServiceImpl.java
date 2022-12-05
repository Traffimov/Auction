package auction.service.impl;

import auction.converter.ProductConverter;
import auction.dto.ProductDto;
import auction.model.Product;
import auction.repository.ProductRepository;
import auction.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    @Override
    public List<ProductDto> getAllByName(String name) {
        return productRepository.getProductByName(name);
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return null;
    }

    @Override
    public ProductDto getById(Long id) {
        return productConverter.toDto(productRepository.getById(id));
    }

    @Override
    public ProductDto save(Product product) {
        return productConverter.toDto(productRepository.saveAndFlush(product));
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.getById(id);
        productRepository.delete(product);
    }
}
