package com.questions.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.questions.entities.Question;

public interface QuestionRepository  extends JpaRepository<Question, Long>{

    List<Question>findByQuizId(Long id);

}
