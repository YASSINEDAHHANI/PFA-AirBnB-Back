package ma.Anafal_Dahhani.airbnb_back.booking.application;


import ma.Anafal_Dahhani.airbnb_back.booking.domain.Booking;
import ma.Anafal_Dahhani.airbnb_back.booking.mapper.BookingMapper;
import ma.Anafal_Dahhani.airbnb_back.booking.repository.BookingRepository;
import ma.Anafal_Dahhani.airbnb_back.listing.application.LandlordService;
import ma.Anafal_Dahhani.airbnb_back.sharedKernel.service.State;
import ma.Anafal_Dahhani.airbnb_back.user.application.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper bookingMapper;
    private final UserService userService;
    private final LandlordService landlordService;

    public BookingService(BookingRepository bookingRepository, BookingMapper bookingMapper,
                          UserService userService, LandlordService landlordService) {
        this.bookingRepository = bookingRepository;
        this.bookingMapper = bookingMapper;
        this.userService = userService;
        this.landlordService = landlordService;
    }


}
