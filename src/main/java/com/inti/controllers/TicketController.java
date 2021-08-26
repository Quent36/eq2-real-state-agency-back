package com.inti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Role;
import com.inti.entities.Ticket;
import com.inti.services.interfaces.TicketService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionTickets")
public class TicketController {
	@Autowired
	TicketService ticketService;

	@PostMapping("/tickets")
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return ticketService.saveTicket(ticket);
	}

	@GetMapping("/tickets")
	public List<Ticket> findAllTicket() {
		return ticketService.findAllTicket();
	}

	@RequestMapping(value = "/tickets/{idTickets}", method = RequestMethod.GET)
	public Ticket findTicketById(@PathVariable("idTickets") Long id) {
		return ticketService.findTicketById(id);
	}

	@DeleteMapping("/tickets/{idTickets}")
	public void deleteTicket(@PathVariable("idTickets") Long id) {
		ticketService.deleteTicket(id);
	}

	@PutMapping("/tickets/{idTickets}")
	public Ticket updateTicket(@PathVariable("id") Long id_ticket, @RequestBody Ticket ticket) {

		Ticket currentTicket = ticketService.findTicketById(id_ticket);

		currentTicket.setOffre(ticket.getOffre());
		currentTicket.setQuestion(ticket.getQuestion());
		currentTicket.setReponse(ticket.getReponse());
		currentTicket.setTraitement(ticket.isTraitement());
		currentTicket.setUtilisateur(ticket.getUtilisateur());

		return ticketService.saveTicket(currentTicket);

	}

}
