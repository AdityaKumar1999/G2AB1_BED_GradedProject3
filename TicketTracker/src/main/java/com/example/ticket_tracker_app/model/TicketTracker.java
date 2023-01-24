package com.example.ticket_tracker_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class TicketTracker {
public TicketTracker() {
	
}
public TicketTracker(String ticketTitle, String ticketShortDesc, String ticketCreatedOn) {
	this.ticketTitle= ticketTitle;
	this.ticketShortDesc=ticketShortDesc;
	this.ticketCreatedOn= ticketCreatedOn;
	
}
	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketShortDesc() {
		return ticketShortDesc;
	}

	public void setTicketShortDesc(String ticketShortDesc) {
		this.ticketShortDesc = ticketShortDesc;
	}

	public String getTicketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setTicketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "TICKET_TITLE")
	private String ticketTitle;

	@Column(name = "TICKET_SHORT_DESC")
	private String ticketShortDesc;
	
	@Column(name = "TICKET_CREATED_ON")
	private String ticketCreatedOn ;

}
