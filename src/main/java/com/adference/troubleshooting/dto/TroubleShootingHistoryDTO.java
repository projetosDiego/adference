package com.adference.troubleshooting.dto;

import com.adference.troubleshooting.entity.TroubleshootingHistory;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TroubleShootingHistoryDTO {

    @JsonProperty(value = "question")
    private String question;

    @JsonProperty(value = "answer")
    private String answer;

    public TroubleShootingHistoryDTO(TroubleshootingHistory x) {
    }
}