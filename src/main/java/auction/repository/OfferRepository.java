package auction.repository;

import auction.dto.OfferDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<OfferDto, Long> {

    List<OfferDto> offerByUserId(Long id);

}
