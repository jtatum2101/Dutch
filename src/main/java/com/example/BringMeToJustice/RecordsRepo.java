package com.example.BringMeToJustice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface RecordsRepo extends JpaRepository<Records, Long> {

    @Query(value = "SELECT * FROM Records r WHERE r.title =:title", nativeQuery = true)
    Records findByTitle(String title);

    @Query(value = "SELECT * FROM Records r WHERE CONCAT(r.date) LIKE %?1%", nativeQuery = true)
    public List<Records> findByDate(String date);

    @Query(value = "SELECT * FROM Records r WHERE r.report_number =?1", nativeQuery = true)
    List<Records> findByReportNumber(int reportNumber);
    @Transactional
    @Modifying
    @Query(value = "DELETE * FROM Records r WHERE r.title=:title", nativeQuery = true)
    void deleteByTitle(@Param("title") String title);
}
