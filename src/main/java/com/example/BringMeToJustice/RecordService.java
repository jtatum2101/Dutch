package com.example.BringMeToJustice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RecordService {
    @Autowired
    private RecordsRepo repo;

    public List<Records> listAll() {
        return repo.findAll();
    }

    public void save(Records record) {
        repo.save(record);
    }

    public List<Records> findByTitle(String title) {
        return repo.findByTitle(title);
    }

    public List<Records> findByDate(String date) {
        return repo.findByDate(date);

    }

    public List<Records> findReportNumber(int reportNumber) {
        return repo.findByReportNumber(reportNumber);
    }

    public int deleteByTitle(String title) {
        return repo.deleteByTitle(title);
    }

}
