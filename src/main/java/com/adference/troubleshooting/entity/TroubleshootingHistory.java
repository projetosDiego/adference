package com.adference.troubleshooting.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="trouble_shooting_history")
public class TroubleshootingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "history_id")
    private Long historyId;

    @Column(name = "question_code")
    private String questionCode;

    @Column(name = "answer")
    private String answer;

    @Column(name = "user_id")
    private Long userId;

    public TroubleshootingHistory(String questionCode, String answer, Long userId) {
        this.questionCode = questionCode;
        this.answer = answer;
        this.userId = userId;
    }
}