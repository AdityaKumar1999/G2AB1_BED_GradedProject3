package com.example.ticket_tracker_app.service;

import java.util.List;

import com.example.ticket_tracker_app.model.TicketTracker;

public interface TicketTrackerService {
	List<TicketTracker> getAllEmployees();

	void saveEmployee(TicketTracker ticketTracker);

	TicketTracker getEmployeeById(long id);

	void deleteEmployeeById(long id);

	Object getAllTicketTrackers();

	void saveTicketTracker(TicketTracker tickettracker);

	TicketTracker getTicketTrackerById(long id);

	void deleteTicketTrackerById(long id);
}
