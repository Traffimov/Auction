package auction.model;

import auction.model.enums.Status;
import lombok.Data;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private LocalDate creationDate;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int amount;

    private double price;

    @Column(name = "status_id"/*, nullable = false*/)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "offer_status", joinColumns = @JoinColumn(name = "offer_id"))
    private Status status;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
