package com.adference.troubleshooting.service;

import com.adference.troubleshooting.dto.TroubleShootingHistoryDTO;
import com.adference.troubleshooting.dto.TroubleShootingRequestDTO;
import com.adference.troubleshooting.dto.TroubleShootingResponseDTO;
import com.adference.troubleshooting.entity.TroubleShootingQuestions;
import com.adference.troubleshooting.entity.TroubleshootingHistory;
import com.adference.troubleshooting.exception.HistoryNotFoundException;
import com.adference.troubleshooting.exception.TroubleShootingAnswersException;
import com.adference.troubleshooting.repository.TroubleShootingHistoryRepository;
import com.adference.troubleshooting.repository.TroubleShootingQuestionsRepository;
import com.adference.troubleshooting.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TroubleShootingService {

    private final TroubleShootingQuestionsRepository questionsRepository;
    private final TroubleShootingHistoryRepository historyRepository;

    @Autowired
    public TroubleShootingService(final TroubleShootingQuestionsRepository questionsRepository,
                                  final TroubleShootingHistoryRepository historyRepository) {
        this.questionsRepository = questionsRepository;
        this.historyRepository = historyRepository;
    }

    /**
     * method responsible for fetch the first troubleshooting question
     * @return TroubleShootingResponseDTO
     */
    public TroubleShootingResponseDTO getFirstQuestion() {
        TroubleShootingQuestions troubleShootingQuestions = questionsRepository.findByQuestionCode(
                Constants.FIRST_TROUBLESHOOTING_QUESTION_CODE);

        return new TroubleShootingResponseDTO(troubleShootingQuestions.getQuestionCode(),
                troubleShootingQuestions.getQuestion());
    }

    /**
     * method responsible for add the answer for troubleshooting(YES/NO) based on last question, fetch the next question
     * and populate the history table
     * @param answer
     * @return TroubleShootingResponseDTO
     */
    public TroubleShootingResponseDTO addTroubleshootingAnswer(TroubleShootingRequestDTO answer) {
        historyRepository.save(new TroubleshootingHistory(
                answer.getPreviousQuestionCode(),
                answer.getAnswer(),
                1L));

        TroubleShootingQuestions troubleShootingQuestions = questionsRepository.getQuestionByAnswerAndCode(
                answer.getPreviousQuestionCode(),
                answer.getAnswer());

        if (troubleShootingQuestions == null) {
            throw new TroubleShootingAnswersException(Constants.TROUBLE_SHOOTING_EXCEPTION);
        }

        return new TroubleShootingResponseDTO(troubleShootingQuestions.getQuestion(),
                troubleShootingQuestions.getQuestionCode());
    }

    /**
     * method responsible for fetching the troubleshooting history based on user id
     * @param userId
     * @return List<TroubleShootingHistoryDTO>
     */
    public List<TroubleShootingHistoryDTO> getTroubleshootingHistoryByUser(Long userId) {
        List<TroubleshootingHistory> history = historyRepository.findByUserId(userId);

        if (history.isEmpty()) {
            throw new HistoryNotFoundException(Constants.HISTORY_NOT_FOUND_EXCEPTION);
        }

        return history.stream().map(o -> new TroubleShootingHistoryDTO(
                o.getQuestionCode(),
                o.getAnswer())).collect(Collectors.toList());
    }
}