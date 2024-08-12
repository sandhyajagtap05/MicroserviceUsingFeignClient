package com.Questions.QuestionsService.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Questions.QuestionsService.Entity.Question;

public interface QuestionRepository extends JpaRepository<Question,Long>{

	
	List<Question> findByQuizId(Long quizId);
	
}
