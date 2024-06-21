package ma.Anafal_Dahhani.airbnb_back.booking.mapper;

import ma.Anafal_Dahhani.airbnb_back.booking.application.dto.BookedDateDTO;
import ma.Anafal_Dahhani.airbnb_back.booking.application.dto.NewBookingDTO;
import ma.Anafal_Dahhani.airbnb_back.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

   Booking newBookingToBooking(NewBookingDTO newBookingDTO);
    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
