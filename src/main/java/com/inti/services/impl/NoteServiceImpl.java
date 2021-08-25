package com.inti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Note;
import com.inti.repositories.NoteRepository;
import com.inti.services.interfaces.NoteService;

@Service
public class NoteServiceImpl implements NoteService {
	@Autowired
	NoteRepository noteRepository;

	@Override
	public Note saveNote(Note note) {
		return noteRepository.save(note);
	}

	@Override
	public List<Note> findAllNote() {
		return noteRepository.findAll();
	}

	@Override
	public Note findNoteById(Long id) {
		return noteRepository.findById(id).get();
	}

	@Override
	public void deleteNote(Long id) {
		noteRepository.deleteById(id);
	}

}
