package auction.service;

import auction.dto.OfferDto;
import auction.model.Offer;

import java.util.List;

public interface OfferService {

    List<OfferDto> getAllOffer();

    OfferDto getById(Long id);

    OfferDto save(Offer offer);

    void delete(Long id);

    void updateOffer(Offer offer);

}
