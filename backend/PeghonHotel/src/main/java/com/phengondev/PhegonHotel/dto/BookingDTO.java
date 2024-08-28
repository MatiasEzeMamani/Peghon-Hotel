package com.phengondev.PhegonHotel.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {
	
	private Long id;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private int numOfAdults;
	private int numOfChildren;
	private int totalNumberGuest;
	private String bookingConfirmationCode;
	private UserDTO user;
	private RoomDTO room;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getNumOfAdults() {
		return numOfAdults;
	}
	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	public int getTotalNumberGuest() {
		return totalNumberGuest;
	}
	public void setTotalNumberGuest(int totalNumberGuest) {
		this.totalNumberGuest = totalNumberGuest;
	}
	public String getBookingConfirmationCode() {
		return bookingConfirmationCode;
	}
	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public RoomDTO getRoom() {
		return room;
	}
	public void setRoom(RoomDTO room) {
		this.room = room;
	}
}
