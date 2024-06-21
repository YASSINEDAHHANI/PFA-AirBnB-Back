package ma.Anafal_Dahhani.airbnb_back.listing.application.dto;

import ma.Anafal_Dahhani.airbnb_back.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}
