package com.example.tdd.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class BookingModel {

	@Id
	private String id;
	private String reserveName;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private int numberGuests;
}
