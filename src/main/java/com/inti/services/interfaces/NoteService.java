package com.inti.services.interfaces;

import java.util.List;

import com.inti.entities.Note;

public interface NoteService {
	Note saveNote(Note note);

	List<Note> findAllNote();

	Note findNoteById(Long id);

	void deleteNote(Long id);

}
