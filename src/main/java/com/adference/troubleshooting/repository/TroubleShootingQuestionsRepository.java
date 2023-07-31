package com.adference.troubleshooting.repository;

import com.adference.troubleshooting.entity.TroubleShootingQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TroubleShootingQuestionsRepository extends JpaRepository<TroubleShootingQuestions, Long> {
    @Query(value = "SELECT * FROM trouble_shooting_questions WHERE previous_question_code = ?1 AND previous_question_answer = ?2", nativeQuery = true)
    TroubleShootingQuestions getQuestionByAnswerAndCode(String previousQuestionCode, String previousQuestionAnswer);

    TroubleShootingQuestions findByQuestionCode(String questionCode);
}