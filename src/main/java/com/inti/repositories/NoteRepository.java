package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Note;
@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
