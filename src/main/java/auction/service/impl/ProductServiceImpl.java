package auction.service.impl;

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

    @Override
    public List<ProductDto> getAllByName(String name) {
        return productRepository.getProductByName(name);
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return null;
        // return new ArrayList<ProductDto>(productRepository.findAll());
    }

    @Override
    public ProductDto getById(Long id) {
//        Product product = productRepository.getById(id);
//        return productConverter.toDto(product);
        return null;
    }

    @Override
    public ProductDto save(Product product) {
        //Product product = productConverter.toDto(product);
//        ProductDto productDto = productConverter.toDto(product);
//        return productRepository.saveAndFlush(productDto);
        return null;
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.getById(id);
        productRepository.delete(product);
    }
}
