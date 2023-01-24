package com.example.ticket_tracker_app.service;

import com.example.ticket_tracker_app.model.TicketTracker;

public interface TicketTrackerService {

	Object getAllTicketTrackers(String keyword);

	void saveTicketTracker(TicketTracker tickettracker);

	TicketTracker getTicketTrackerById(long id);

	void deleteTicketTrackerById(Long id);
}
