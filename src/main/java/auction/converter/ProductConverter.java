package auction.converter;

import auction.dto.ProductCreationDto;
import auction.dto.ProductDto;
import auction.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<ProductDto, Product> {
    @Override
    public ProductDto toDto(Product product) {
        if (product != null) {
            ProductDto productDto = new ProductDto();
            productDto.setDescription(product.getDescription());
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setPrice(product.getPrice());
            return productDto;
        } else {
            return null;
        }
    }

    @Override
    public Product toEntity(ProductDto productDto) {
        if (productDto != null) {
            Product product = new Product();
            product.setDescription(productDto.getDescription());
            product.setId(productDto.getId());
            product.setName(productDto.getName());
            product.setPrice(productDto.getPrice());
            return product;
        } else {
            return null;
        }
    }

    public Product toEntity(ProductCreationDto productCreationDto) {
        if (productCreationDto != null) {
            Product product = new Product();
            product.setDescription(productCreationDto.getDescription());
            product.setName(productCreationDto.getName());
            product.setPrice(productCreationDto.getPrice());
            return product;
        } else {
            return null;
        }
    }

    public ProductDto toDto(ProductCreationDto productCreationDto) {
        if (productCreationDto != null) {
            ProductDto productDto = new ProductDto();
            productDto.setDescription(productCreationDto.getDescription());
            productDto.setName(productCreationDto.getName());
            productDto.setPrice(productCreationDto.getPrice());
            return productDto;
        } else {
            return null;
        }
    }
}
