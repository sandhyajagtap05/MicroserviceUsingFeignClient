package com.Questions.QuestionsService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Questions.QuestionsService.Dao.QuestionRepository;
import com.Questions.QuestionsService.Entity.Question;

@Service
public class QuestionServicesImpl implements QuestionServices {

	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getById(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
	}

	@Override
	public List<Question> getQuestionByQuizId(Long quizId) {
		// TODO Auto-generated method stub
		System.out.println("quizId"+quizId);
		return questionRepository.findByQuizId(quizId);
	}
	
	
	

}
