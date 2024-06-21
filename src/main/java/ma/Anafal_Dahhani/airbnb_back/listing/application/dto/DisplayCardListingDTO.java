package ma.Anafal_Dahhani.airbnb_back.listing.application.dto;


import ma.Anafal_Dahhani.airbnb_back.listing.application.dto.sub.PictureDTO;
import ma.Anafal_Dahhani.airbnb_back.listing.application.dto.vo.PriceVO;
import ma.Anafal_Dahhani.airbnb_back.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
