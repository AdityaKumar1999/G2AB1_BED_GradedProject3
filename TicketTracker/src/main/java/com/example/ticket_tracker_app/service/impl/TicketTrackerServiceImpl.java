package com.example.ticket_tracker_app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticket_tracker_app.model.TicketTracker;
import com.example.ticket_tracker_app.repository.TicketTrackerRepository;
import com.example.ticket_tracker_app.service.TicketTrackerService;

@Service
public class TicketTrackerServiceImpl implements TicketTrackerService {

	@Autowired
	private TicketTrackerRepository tickettrackerRepository;

	public List<TicketTracker> getAllTicketTrackers(String keyword) {
		return tickettrackerRepository.getTicketByName(keyword);
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
	public void deleteTicketTrackerById(Long id) {
		this.tickettrackerRepository.deleteById(id);

	}

}