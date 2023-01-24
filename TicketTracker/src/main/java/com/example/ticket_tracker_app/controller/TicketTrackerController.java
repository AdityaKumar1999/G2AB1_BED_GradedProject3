package com.example.ticket_tracker_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ticket_tracker_app.model.TicketTracker;
import com.example.ticket_tracker_app.service.TicketTrackerService;
import com.example.ticket_tracker_app.service.impl.TicketTrackerServiceImpl;

@Controller
public class TicketTrackerController {
	@Autowired
	private TicketTrackerServiceImpl tickettrackerServiceimpl;

	// Display list of TicketTrackers
	@GetMapping("/")
	public String viewHomePage(Model model ,@Param("keyword") String keyword) {
		model.addAttribute("keyword", keyword);
		model.addAttribute("listTicketTrackers", tickettrackerServiceimpl.getAllTicketTrackers(keyword));
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
		tickettrackerServiceimpl.saveTicketTracker(tickettracker);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		TicketTracker tickettracker = tickettrackerServiceimpl.getTicketTrackerById(id);
		model.addAttribute("tickettracker", tickettracker);
		return "update_tickettracker";
	}

	@GetMapping("/deleteTicketTracker/{id}")
	public String deleteTicketTracker(@PathVariable(value = "id") Long id) {

		// call delete ticket tracker method
		tickettrackerServiceimpl.deleteTicketTrackerById(id);
		return "redirect:/";
	}

}