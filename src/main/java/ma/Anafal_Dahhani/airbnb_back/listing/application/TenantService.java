package ma.Anafal_Dahhani.airbnb_back.listing.application;

import ma.Anafal_Dahhani.airbnb_back.booking.application.BookingService;
import ma.Anafal_Dahhani.airbnb_back.listing.application.dto.DisplayCardListingDTO;
import ma.Anafal_Dahhani.airbnb_back.listing.domain.BookingCategory;
import ma.Anafal_Dahhani.airbnb_back.listing.domain.Listing;
import ma.Anafal_Dahhani.airbnb_back.listing.mapper.ListingMapper;
import ma.Anafal_Dahhani.airbnb_back.listing.repository.ListingRepository;
import ma.Anafal_Dahhani.airbnb_back.user.application.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TenantService {
    private final ListingRepository listingRepository;

    private final ListingMapper listingMapper;

    private final UserService userService;


    public TenantService(ListingRepository listingRepository, ListingMapper listingMapper, UserService userService, BookingService bookingService) {
        this.listingRepository = listingRepository;
        this.listingMapper = listingMapper;
        this.userService = userService;

    }
    public Page<DisplayCardListingDTO> getAllByCategory(Pageable pageable, BookingCategory category) {
        Page<Listing> allOrBookingCategory;
        if (category == BookingCategory.ALL) {
            allOrBookingCategory = listingRepository.findAllWithCoverOnly(pageable);
        } else {
            allOrBookingCategory = listingRepository.findAllByBookingCategoryWithCoverOnly(pageable, category);
        }

        return allOrBookingCategory.map(listingMapper::listingToDisplayCardListingDTO);
    }
}
