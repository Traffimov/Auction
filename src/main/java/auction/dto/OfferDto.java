package auction.dto;

import auction.model.Product;
import auction.model.User;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class OfferDto {

    private Long id;

    private String name;

    private LocalDate creationDate;

    private LocalDateTime endDate;

    private int amount;

    private String description;

    private User user;

    private Product product;

}
