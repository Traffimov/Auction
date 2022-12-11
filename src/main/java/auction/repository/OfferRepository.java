package auction.repository;

import auction.model.Offer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OfferRepository extends CrudRepository<Offer, Long> {

    List<Offer> findOffersByUserId(Long userId);

    List<Offer> findOffersByUserName(String userName);

    Offer findOfferById(Long id);

    List<Offer> findAllBy();

}
