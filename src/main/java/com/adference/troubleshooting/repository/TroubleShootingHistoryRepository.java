package com.adference.troubleshooting.repository;

import com.adference.troubleshooting.entity.TroubleshootingHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TroubleShootingHistoryRepository extends JpaRepository<TroubleshootingHistory, Long> {
    List<TroubleshootingHistory> findByUserId(Long userId);

}