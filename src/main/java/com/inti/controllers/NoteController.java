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

import com.inti.entities.Evaluation;
import com.inti.entities.Note;
import com.inti.services.interfaces.NoteService;

@CrossOrigin
@RestController
@RequestMapping(value = "/gestionNotes")
public class NoteController {
	@Autowired
	NoteService noteService;

	@PostMapping("/notes")
	public Note saveNote(@RequestBody Note note) {
		return noteService.saveNote(note);
	}

	@GetMapping("/notes")
	public List<Note> findAllNote() {
		return noteService.findAllNote();
	}

	@RequestMapping(value = "/notes/{idNotes}", method = RequestMethod.GET)
	public Note findNoteById(@PathVariable("idNotes") Long id) {
		return noteService.findNoteById(id);
	}

	@DeleteMapping("/notes/{idNotes}")
	public void deleteNote(@PathVariable("idNotes") Long id) {
		noteService.deleteNote(id);
	}

	@PutMapping("/notes/{idNotes}")
	public Note updateNote(@PathVariable("id") Long id_note, @RequestBody Note note) {

		Note currentNote = noteService.findNoteById(id_note);

		currentNote.setEtoile(note.getEtoile());

		return noteService.saveNote(currentNote);

	}

}
