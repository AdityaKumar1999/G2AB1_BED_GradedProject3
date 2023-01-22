package com.example.ticket_tracker_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticket_tracker_app.model.TicketTracker;

@Repository
public interface TicketTrackerRepository extends JpaRepository<TicketTracker, Long> {

}
