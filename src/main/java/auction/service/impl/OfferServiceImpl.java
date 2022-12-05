package auction.service.impl;

import auction.converter.OfferConverter;
import auction.dto.OfferDto;
import auction.model.Offer;
import auction.repository.OfferRepository;
import auction.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final OfferConverter offerConverter;

    @Override
    public List<OfferDto> getAllOffer() {
        return new ArrayList<>(offerRepository.findAll());
    }

    @Override
    public OfferDto getById(Long id) {
        return offerRepository.getById(id);
    }

    @Override
    public OfferDto save(Offer offer) {
        OfferDto offerDto = offerConverter.toDto(offer);
        return offerRepository.saveAndFlush(offerDto);
    }

    @Override
    public void delete(Long id) {
        OfferDto offerDto = offerRepository.getById(id);
        offerRepository.saveAndFlush(offerDto);
    }

    @Override
    public void updateOffer(Offer offer) {
        offerRepository.saveAndFlush(offerConverter.toDto(offer));
    }


}
