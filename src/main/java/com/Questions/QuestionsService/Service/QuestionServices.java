package com.Questions.QuestionsService.Service;

import java.util.List;

import com.Questions.QuestionsService.Entity.Question;

public interface QuestionServices {

	Question addQuestion(Question question);

	List<Question> getQuestions();

	Question getById(Long id);

   List<Question> getQuestionByQuizId(Long quizId);
}
