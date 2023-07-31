package com.adference.troubleshooting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TroubleShootingResponseDTO {

    @JsonProperty(value = "question")
    private String question;

    @JsonProperty(value = "question_code")
    private String questionCode;

}