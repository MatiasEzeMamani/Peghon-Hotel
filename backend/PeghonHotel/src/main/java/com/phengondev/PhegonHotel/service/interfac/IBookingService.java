package com.phengondev.PhegonHotel.service.interfac;

import com.phengondev.PhegonHotel.dto.Response;
import com.phengondev.PhegonHotel.model.Booking;

public interface IBookingService {
	
	Response saveBooking(Long roomId, Long userId, Booking bookingRequest);
	
	Response findBookingByConfirmationCode(String confirmationCode);

	Response getAllBookings();
	
	Response cancelBooking(Long bookingId);
}
