package auction.service;

import auction.dto.OfferDto;
import auction.model.Offer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OfferService {

    List<OfferDto> getAllOffer();

    OfferDto getById(Long id);

    OfferDto save(Offer offer);

    void delete(Long id);

//    List<OfferDto> getAllOfferByUserId(Long userId);
//
//    List<OfferDto> offerByUserName(String userName);
//
//    List<OfferDto> offerByOfferName(String oferName);
//
//    List<OfferDto> offerByProductName(String productName);
//
//    List<OfferDto> offerByPriceAndProductName(double price, String productName);

    void updateOffer(Offer offer);

}
