package auction.converter;

import auction.dto.OfferCreationDto;
import auction.dto.OfferDto;
import auction.model.Offer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class OfferConverter implements Converter<OfferDto, Offer> {
    @Override
    public OfferDto toDto(Offer offer) {
        if (offer != null) {
            OfferDto offerDto = new OfferDto();
            offerDto.setId(offer.getId());
            offerDto.setDescription(offer.getDescription());
            offerDto.setStatus(offer.getStatus());
            offerDto.setPrice(offer.getPrice());
            offerDto.setAmount(offer.getAmount());
            offerDto.setCreationDate(LocalDate.now());
            offerDto.setStartDate(offer.getStartDate());
            offerDto.setEndDate(offer.getEndDate());
            offerDto.setUser(offer.getUser());
            offerDto.setProduct(offer.getProduct());
            return offerDto;
        } else {
            return null;
        }
    }

    @Override
    public Offer toEntity(OfferDto offerDto) {
        if (offerDto != null) {
            Offer offer = new Offer();
            offer.setId(offerDto.getId());
            offer.setDescription(offerDto.getDescription());
            offer.setStatus(offerDto.getStatus());
            offer.setPrice(offerDto.getPrice());
            offer.setAmount(offerDto.getAmount());
            offer.setCreationDate(LocalDate.now());
            offer.setStartDate(offerDto.getStartDate());
            offer.setEndDate(offerDto.getEndDate());
            offer.setUser(offerDto.getUser());
            offer.setProduct(offerDto.getProduct());
            return offer;
        } else {
            return null;
        }
    }

    public Offer toEntity(OfferCreationDto offerCreationDto) {
        if (offerCreationDto != null) {
            Offer offer = new Offer();
            offer.setDescription(offerCreationDto.getDescription());
            offer.setStatus(offerCreationDto.getStatus());
            offer.setPrice(offerCreationDto.getPrice());
            offer.setAmount(offerCreationDto.getAmount());
            offer.setCreationDate(LocalDate.now());
            offer.setStartDate(offerCreationDto.getStartDate());
            offer.setEndDate(offerCreationDto.getEndDate());
            offer.setUser(offerCreationDto.getUser());
            offer.setProduct(offerCreationDto.getProduct());
            return offer;
        } else {
            return null;
        }
    }

    public OfferDto toDto(OfferCreationDto offerCreationDto) {
        if (offerCreationDto != null) {
            OfferDto offerDto = new OfferDto();
            offerDto.setDescription(offerCreationDto.getDescription());
            offerDto.setStatus(offerCreationDto.getStatus());
            offerDto.setAmount(offerCreationDto.getAmount());
            offerDto.setPrice(offerCreationDto.getPrice());
            offerDto.setCreationDate(LocalDate.now());
            offerDto.setStartDate(offerCreationDto.getStartDate());
            offerDto.setEndDate(offerCreationDto.getEndDate());
            offerDto.setUser(offerCreationDto.getUser());
            offerDto.setProduct(offerCreationDto.getProduct());
            return offerDto;
        } else {
            return null;
        }
    }
}
