package com.adference.troubleshooting.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="trouble_shooting_questions")
public class TroubleShootingQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "question")
    private String question;

    @Column(name = "question_code")
    private String questionCode;

    @Column(name = "previous_question_code")
    private String previousQuestionCode;

    @Column(name = "previous_question_answer")
    private String previousQuestionAnswer;

}