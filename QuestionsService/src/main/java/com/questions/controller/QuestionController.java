package com.questions.controller;

import com.questions.entities.Question;
import com.questions.repositories.QuestionRepository;
import com.questions.services.QuestionService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/question")
public class QuestionController {

private final QuestionRepository questionRepository;
private QuestionService questionService;

   public QuestionController(QuestionService questionService, QuestionRepository questionRepository) {
        this.questionService = questionService;
        this.questionRepository = questionRepository;
    }

 public void questionController(QuestionService questionService){
    this.questionService = questionService;
}

@PostMapping
public Question create(@RequestBody Question question){
    return questionService.create(question);
}

@GetMapping
public List<Question>getall(){
    return questionService.get();
}

 @GetMapping("/{questionId}") 
public Question getall(@PathVariable Long questionId){
 return questionService.getone(questionId );
}

//get all quiz 

@GetMapping("/quiz/{quizId}")
public List<Question>getQuestionsOfQuiz(@PathVariable Long quizId) {
    return questionService.getQuestionsOfQuiz(quizId);
}

}
