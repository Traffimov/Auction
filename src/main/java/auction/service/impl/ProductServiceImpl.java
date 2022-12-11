package auction.service.impl;

import auction.converter.ProductConverter;
import auction.dto.ProductCreationDto;
import auction.dto.ProductDto;
import auction.model.Product;
import auction.repository.ProductRepository;
import auction.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    @Override
    public List<ProductDto> findProductsByName(String name) {
        return productRepository.findProductsByName(name).stream()
                .map(productConverter::toDto).collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> findAll() {
        return productRepository.findAllBy().stream()
                .map(productConverter::toDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto findProductById(Long id) {
        return productConverter.toDto(productRepository.findProductById(id));
    }

    @Override
    public ProductDto save(ProductCreationDto productCreationDto) {
        Product product = productConverter.toEntity(productCreationDto);
        return productConverter.toDto(productRepository.save(product));
    }

    @Override
    public void delete(Long id) {
        Product product = productRepository.findProductById(id);
        productRepository.delete(product);
    }
}
