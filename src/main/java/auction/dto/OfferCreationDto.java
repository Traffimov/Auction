package auction.dto;

import auction.model.Product;
import auction.model.User;
import auction.model.enums.Status;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class OfferCreationDto {

    private String name;

    private LocalDate creationDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Status status;

    private double price;

    private int amount;

    private String description;

    private User user;

    private Product product;

}
