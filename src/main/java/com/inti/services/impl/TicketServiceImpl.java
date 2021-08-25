package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Ticket;
import com.inti.repositories.TicketRepository;
import com.inti.services.interfaces.TicketService;
@Service
public class TicketServiceImpl implements TicketService{
@Autowired
TicketRepository ticketRepository;
	@Override
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> findAllTicket() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket findTicketById(Long id) {
		return ticketRepository.findById(id).get();
	}

	@Override
	public void deleteTicket(Long id) {
		ticketRepository.deleteById(id);
	}

}
