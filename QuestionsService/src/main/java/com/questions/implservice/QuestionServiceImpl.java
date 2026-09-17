package com.questions.implservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.questions.entities.Question;
import com.questions.repositories.QuestionRepository;
import com.questions.services.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    private  QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();

    }

    @Override
    public Question getone(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));

    }
 
    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }

}
