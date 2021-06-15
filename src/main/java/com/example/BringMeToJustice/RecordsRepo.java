package com.example.BringMeToJustice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Access;
import java.util.Collection;
import java.util.List;
import java.util.Map;


public interface RecordsRepo extends JpaRepository<Records, Long> {
    @Query(value = "SELECT r FROM Records r WHERE r.title =?1", nativeQuery = true)
    List<Records> findByTitle(String title);
    @Query(value = "SELECT r FROM Records r WHERE r.date =?1", nativeQuery = true)
    List<Records> findByDate(String date);
    @Query(value = "SELECT r FROM Records r WHERE r.reportNumber =?1", nativeQuery = true)
    List<Records> findByReportNumber(int reportNumber);
    @Query(value = "DELETE r FROM Records r WHERE r.title =?1", nativeQuery = true)
    int deleteByTitle(String title);
}
