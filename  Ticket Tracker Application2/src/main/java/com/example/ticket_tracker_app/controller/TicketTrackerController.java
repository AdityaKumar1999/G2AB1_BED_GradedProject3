package com.example.ticket_tracker_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ticket_tracker_app.model.TicketTracker;
import com.example.ticket_tracker_app.service.TicketTrackerService;

@Controller
public class TicketTrackerController {
	@Autowired
	private TicketTrackerService tickettrackerService;

	// Display list of TicketTrackers
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listTicketTrackers", tickettrackerService.getAllTicketTrackers());
		return "index";
	}

	@GetMapping("/showNewTicketTrackerForm")
	public String showNewTicketTrackerForm(Model model) {

		TicketTracker tickettracker = new TicketTracker();
		model.addAttribute("tickettracker", tickettracker);
		return "new_tickettracker";
	}

	@PostMapping("/saveTicketTracker")
	public String saveTicketTracker(@ModelAttribute("tickettracker") TicketTracker tickettracker) {
		// save ticket tracker to database
		tickettrackerService.saveTicketTracker(tickettracker);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get ticket tracker from the service
		TicketTracker tickettracker = tickettrackerService.getTicketTrackerById(id);

		// set ticket tracker as a model attribute to pre-populate the form
		model.addAttribute("tickettracker", tickettracker);
		return "update_tickettracker";
	}

	@GetMapping("/deleteTicketTracker/{id}")
	public String deleteTicketTracker(@PathVariable(value = "id") long id) {

		// call delete ticket tracker method
		this.tickettrackerService.getTicketTrackerById(id);
		return "redirect:/";
	}
}