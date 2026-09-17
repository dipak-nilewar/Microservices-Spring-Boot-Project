package com.quiz.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;
import com.quiz.services.QuestionClient;
import com.quiz.services.QuizService;

@Service
public class QuizServiceimpl implements QuizService {

    private QuizRepository quizRepository;

    private QuestionClient questionClien;

    public QuizServiceimpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClien = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {

        List<Quiz> quizzes = quizRepository.findAll();

        List<Quiz> newQuizList = quizzes.stream()
                .map(quiz -> {
                    quiz.setQuestions(
                            questionClien.getQuestionOfQuiz(quiz.getId()));

                    return quiz;
                })
                .collect(Collectors.toList());

        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {
        
    
       
      Quiz quiz =  quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz Not Found"));
quiz.setQuestions(questionClien.getQuestionOfQuiz(quiz.getId()));
         return quiz;
    }

}
