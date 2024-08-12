package com.Questions.QuestionsService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Questions.QuestionsService.Entity.Question;
import com.Questions.QuestionsService.Service.QuestionServices;

@RestController
@RequestMapping("/Question")
public class QuestionController {

	@Autowired
	private QuestionServices questionServices;
	
	@PostMapping("/addQuestion")
	
	public Question addQuestion(@RequestBody Question question){
		return questionServices.addQuestion(question);
	}
	
	@GetMapping("/getQuestions")
	
	public List<Question> getQuestions() {
		return questionServices.getQuestions();
	}
	
	@GetMapping("/getById/{id}")
	
	public Question getById(@PathVariable Long id) {
		return questionServices.getById(id);
	}
	
	
	@GetMapping("/questionsByQuizId/{quizId}")
	public List<Question> getQuestionByQuizId(@PathVariable Long quizId){
		return questionServices.getQuestionByQuizId(quizId);
	}
}
