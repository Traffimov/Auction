package auction.converter;

import auction.dto.OfferDto;
import auction.model.Offer;
import org.springframework.stereotype.Component;

@Component
public class OfferConverter implements Converter<OfferDto, Offer> {
    @Override
    public OfferDto toDto(Offer offer) {
        if (offer != null) {
            OfferDto offerDto = new OfferDto();
            offerDto.setId(offer.getId());
            offerDto.setDescription(offer.getDescription());
            offerDto.setAmount(offer.getAmount());
            offerDto.setCreationDate(offer.getCreationDate());
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
            offer.setAmount(offerDto.getAmount());
            offer.setCreationDate(offerDto.getCreationDate());
            offer.setEndDate(offerDto.getEndDate());
            offer.setUser(offerDto.getUser());
            offer.setProduct(offerDto.getProduct());
            return offer;
        } else {
            return null;
        }
    }
}
