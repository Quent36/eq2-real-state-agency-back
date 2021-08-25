package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Ticket;

public interface TicketService {
	
	Ticket saveTicket(Ticket ticket);

	List<Ticket> findAllTicket();

	Ticket findTicketById(Long id);

	void deleteTicket(Long id);
	


}
