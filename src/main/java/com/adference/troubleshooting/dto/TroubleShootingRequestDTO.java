package com.adference.troubleshooting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
public class TroubleShootingRequestDTO {

    @JsonProperty(value = "previous_question_code")
    private String previousQuestionCode;

    @JsonProperty(value = "answer")
    private String answer;
}