package auction.controller;

import auction.dto.OfferCreationDto;
import auction.dto.OfferDto;
import auction.model.enums.Status;
import auction.service.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class OfferController {

    private final OfferService offerService;

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateUser(@RequestBody OfferDto offerDto,
                                           @PathVariable Long id) {
        offerService.updateOffer(offerDto, id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/updateStatus/{status}")
    public ResponseEntity<Void> updateStatus(@RequestBody Status status,
                                             @PathVariable Long id) {
        offerService.updateStatus(status, id);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<OfferDto> save(@RequestBody OfferCreationDto offerCreationDto) {
        return ResponseEntity.created(URI.create("/ok"))
                .body(offerService.save(offerCreationDto));
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        offerService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{nickName}")
    public ResponseEntity<List<OfferDto>> findOffersByUserName(@PathVariable String nickName) {
        return ResponseEntity.ok(offerService.findOffersByUserName(nickName));
    }

    @GetMapping("/{id}")
    public ResponseEntity<OfferDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(offerService.findOfferById(id));
    }

    @GetMapping("/allOffers")
    public ResponseEntity<List<OfferDto>> findAllOffer() {
        return ResponseEntity.ok(offerService.findAllOffer());
    }
}
