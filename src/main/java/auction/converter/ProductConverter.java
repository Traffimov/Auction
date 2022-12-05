package auction.converter;

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
}
