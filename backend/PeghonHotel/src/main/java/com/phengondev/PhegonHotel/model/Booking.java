package com.phengondev.PhegonHotel.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="bookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Check-in date is required")
	private LocalDate checkInDate;
	
	@Future(message = "Check-out date must be in the future")
	private LocalDate checkOutDate;
	
	@Min(value = 1, message = "Number of adults must not be less that 1")
	private int numOfAdults;
	
	@Min(value = 0, message = "Number of children must not be less that 0")
	private int numOfChildren;
	private int totalNumOfGuest;
	private String bookingConfirmationCode;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "room_id")
	private Room room;

	public void calculatedTotalNumberOfGuest() {
		this.totalNumOfGuest = this.numOfAdults + this.numOfChildren;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
		calculatedTotalNumberOfGuest();
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
		calculatedTotalNumberOfGuest();
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", numOfAdults=" + numOfAdults + ", numOfChildren=" + numOfChildren + ", totalNumOfGuest="
				+ totalNumOfGuest + ", bookingConfirmationCode=" + bookingConfirmationCode + ", user=" + user
				+ ", room=" + room + "]";
	}

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

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public String getBookingConfirmationCode() {
		return bookingConfirmationCode;
	}

	public void setBookingConfirmationCode(String bookingConfirmationCode) {
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}
	
}
