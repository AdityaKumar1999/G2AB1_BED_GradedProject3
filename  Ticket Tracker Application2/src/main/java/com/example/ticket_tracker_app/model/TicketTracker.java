package com.example.ticket_tracker_app.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TicketTracker")
public class TicketTracker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "ticketTitle")
	private String ticketTitle;

	@Column(name = "ticket_Short_Desc")
	private String ticket_Short_Desc;

	@Column(name = "ticket_Created_On")
	private Date ticket_Created_On;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketShortDesc() {
		return ticket_Short_Desc;
	}

	public void setTicketShortDesc(String ticket_Short_Desc) {
		this.ticket_Short_Desc = ticket_Short_Desc;
	}

	public Date getTickectCreatedOn() {
		return ticket_Created_On;
	}

	public void setEmail(Date ticket_Created_On) {
		this.ticket_Created_On = ticket_Created_On;
	}

}
