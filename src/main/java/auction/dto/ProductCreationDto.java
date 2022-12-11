package auction.dto;

import lombok.Data;

@Data
public class ProductCreationDto {

    private String description;

    private String name;

    private double price;
}
