package com.phengondev.PhegonHotel.service.interfac;

import com.phengondev.PhegonHotel.dto.LoginRequest;
import com.phengondev.PhegonHotel.dto.Response;
import com.phengondev.PhegonHotel.model.User;

public interface IUserService {
	
	Response register(User user);

	Response login(LoginRequest loginRequest);
	
	Response getAllUsers();
	
	Response getUserBookingHistory(String userId);
	
	Response deleteUser(String userId);
	
	Response getUserById(String userId);
	
	Response getMyInfo(String email);
	
}
