package io.learnk8s.knote.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.learnk8s.knote.model.Note;

@Repository
public interface NotesRepository extends MongoRepository<Note, String> {

}
