package com.example.ticket_tracker_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticket_tracker_app.model.TicketTracker;
import com.example.ticket_tracker_app.repository.TicketTrackerRepository;

@Service
public class TicketTrackerServiceImpl implements TicketTrackerService {

	@Autowired
	private TicketTrackerRepository tickettrackerRepository;

	@Override
	public List<TicketTracker> getAllTicketTrackers() {
		return tickettrackerRepository.findAll();
	}

	@Override
	public void saveTicketTracker(TicketTracker ticketTracker) {
		this.tickettrackerRepository.save(ticketTracker);
	}

	@Override
	public TicketTracker getTicketTrackerById(long id) {
		Optional<TicketTracker> optional = tickettrackerRepository.findById(id);
		TicketTracker ticketTracker = null;
		if (optional.isPresent()) {
			ticketTracker = optional.get();
		} else {
			throw new RuntimeException(" TicketTracker not found for id :: " + id);
		}
		return ticketTracker;

	}

	@Override
	public void deleteTicketTrackerById(long id) {
		this.tickettrackerRepository.deleteById(id);

	}

	@Override
	public List<TicketTracker> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(TicketTracker ticketTracker) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TicketTracker getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		
	}

}