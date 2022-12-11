package auction.service;

import auction.dto.OfferCreationDto;
import auction.dto.OfferDto;
import auction.model.Offer;
import auction.model.enums.Status;

import java.util.List;

public interface OfferService {

    List<OfferDto> findOffersByUserName(String userName);

    List<OfferDto> findOffersByUserId(Long userId);

    List<OfferDto> findAllOffer();

    OfferDto findOfferById(Long id);

    OfferDto save(OfferCreationDto offerCreationDto);

    void delete(Long id);

    void updateOffer(OfferDto offerDto, Long id);

    void updateStatus(Status status, Long id);

}
