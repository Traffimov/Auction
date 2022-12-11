package auction.service.impl;

import auction.converter.OfferConverter;
import auction.dto.OfferCreationDto;
import auction.dto.OfferDto;
import auction.model.Offer;
import auction.model.enums.Status;
import auction.repository.OfferRepository;
import auction.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
    private final OfferConverter offerConverter;

    @Override
    public List<OfferDto> findOffersByUserName(String nickname) {
        return offerRepository.findOffersByUserName(nickname).stream()
                .map(offerConverter::toDto).collect(Collectors.toList());
    }

    @Override
    public List<OfferDto> findOffersByUserId(Long userId) {
        return offerRepository.findOffersByUserId(userId).stream()
                .map(offerConverter::toDto).collect(Collectors.toList());
    }

    @Override
    public List<OfferDto> findAllOffer() {
        return offerRepository.findAllBy().stream().map(offerConverter::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public OfferDto findOfferById(Long id) {
        return offerConverter.toDto(offerRepository.findOfferById(id));
    }

    @Override
    public OfferDto save(OfferCreationDto offerCreationDto) {
        Offer offer = offerConverter.toEntity(offerCreationDto);
        return offerConverter.toDto(offerRepository.save(offer));
    }

    @Override
    public void delete(Long id) {
        offerRepository.delete(offerRepository.findOfferById(id));
    }

    @Override
    public void updateOffer(OfferDto offerDto, Long id) {
        Offer oldOffer = offerRepository.findOfferById(id);
        oldOffer.setName(offerDto.getName());
        oldOffer.setAmount(offerDto.getAmount());
        oldOffer.setCreationDate(offerDto.getCreationDate());
        oldOffer.setUser(offerDto.getUser());
        oldOffer.setPrice(offerDto.getPrice());
        oldOffer.setEndDate(offerDto.getEndDate());
        oldOffer.setStartDate(offerDto.getStartDate());
        oldOffer.setStatus(offerDto.getStatus());
        oldOffer.setProduct(offerDto.getProduct());
        offerRepository.save(oldOffer);
    }

    @Override
    public void updateStatus(Status status, Long id) {
        Offer oldOffer = offerRepository.findOfferById(id);
        oldOffer.setStatus(status);
        offerRepository.save(oldOffer);
    }
}
