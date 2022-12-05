package auction.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;

    private String description;

    private String name;

    private double price;

}
