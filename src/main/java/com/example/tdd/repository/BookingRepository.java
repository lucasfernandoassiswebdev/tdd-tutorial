package com.example.tdd.repository;

import com.example.tdd.model.BookingModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BookingModel, String> {

	Optional<BookingModel> findByReserveName(String name);
}
