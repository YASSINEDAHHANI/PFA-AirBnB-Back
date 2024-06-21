package ma.Anafal_Dahhani.airbnb_back.listing.application.dto;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import ma.Anafal_Dahhani.airbnb_back.booking.application.dto.BookedDateDTO;
import ma.Anafal_Dahhani.airbnb_back.listing.application.dto.sub.ListingInfoDTO;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}
