package com.questions.services;

import java.util.List;

import com.questions.entities.Question;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getone(Long id);

    List<Question>getQuestionsOfQuiz(Long quizId);
 

}
