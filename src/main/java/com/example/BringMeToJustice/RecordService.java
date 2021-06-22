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
    public Records findByTitle(String title){
        if(title != null){
            return repo.findByTitle(title);
        }
        return null;
    }
    public List<Records> listAll() {
        return repo.findAll();
    }

    public void save(Records record) {
        repo.save(record);
    }

    public void updateRecord(String title, Records updatedRecord){

        Records oldRecord = repo.findByTitle(title);
        oldRecord.setDate(updatedRecord.getDate());
        oldRecord.setVictimName(updatedRecord.getVictimName());
        oldRecord.setHasSuspect(updatedRecord.getHasSuspect());
        oldRecord.setSuspect1Name(updatedRecord.getSuspect1Name());
        oldRecord.setSuspect1Hair(updatedRecord.getSuspect1Hair());
        oldRecord.setSuspect1Eye(updatedRecord.getSuspect1Eye());
        oldRecord.setSuspect1Race(updatedRecord.getSuspect1Race());
        oldRecord.setSuspect2Name(updatedRecord.getSuspect2Name());
        oldRecord.setSuspect2Hair(updatedRecord.getSuspect2Hair());
        oldRecord.setSuspect2Eye(updatedRecord.getSuspect2Eye());
        oldRecord.setSuspect2Race(updatedRecord.getSuspect2Race());
        oldRecord.setSuspect3Name(updatedRecord.getSuspect3Name());
        oldRecord.setSuspect3Hair(updatedRecord.getSuspect3Hair());
        oldRecord.setSuspect3Eye(updatedRecord.getSuspect3Eye());
        oldRecord.setSuspect3Race(updatedRecord.getSuspect3Race());
        oldRecord.setSuspect4Name(updatedRecord.getSuspect4Name());
        oldRecord.setSuspect4Hair(updatedRecord.getSuspect4Hair());
        oldRecord.setSuspect4Eye(updatedRecord.getSuspect4Eye());
        oldRecord.setSuspect4Race(updatedRecord.getSuspect4Race());
        oldRecord.setSuspect5Name(updatedRecord.getSuspect5Name());
        oldRecord.setSuspect5Hair(updatedRecord.getSuspect5Hair());
        oldRecord.setSuspect5Eye(updatedRecord.getSuspect5Eye());
        oldRecord.setSuspect5Race(updatedRecord.getSuspect5Race());
        oldRecord.setHasWarrants(updatedRecord.getHasWarrants());
        oldRecord.setWhoHasWarrants(updatedRecord.getWhoHasWarrants());
        oldRecord.setSuspect1WarrantDate(updatedRecord.getSuspect1WarrantDate());
        oldRecord.setSuspect1WarrantDescription(updatedRecord.getSuspect1WarrantDescription());
        oldRecord.setSuspect2WarrantDate(updatedRecord.getSuspect2WarrantDate());
        oldRecord.setSuspect2WarrantDescription(updatedRecord.getSuspect2WarrantDescription());
        oldRecord.setSuspect3WarrantDate(updatedRecord.getSuspect3WarrantDate());
        oldRecord.setSuspect3WarrantDescription(updatedRecord.getSuspect3WarrantDescription());
        oldRecord.setSuspect4WarrantDate(updatedRecord.getSuspect4WarrantDate());
        oldRecord.setSuspect4WarrantDescription(updatedRecord.getSuspect4WarrantDescription());
        oldRecord.setSuspect5WarrantDate(updatedRecord.getSuspect5WarrantDate());
        oldRecord.setSuspect5WarrantDescription(updatedRecord.getSuspect5WarrantDescription());
        oldRecord.setDescriptionOfReport(updatedRecord.getDescriptionOfReport());
        repo.save(oldRecord);
    }

    public List<Records> findByDate(String date) {
        if(date != null){
            return repo.findByDate(date);
        }
        return repo.findAll();
    }

    public List<Records> findReportNumber(int reportNumber) {
        if(reportNumber != 0){
            return repo.findByReportNumber(reportNumber);
        }
        return repo.findAll();

    }

    public void deleteByTitle(String title) {
        repo.deleteByTitle(title);
    }

}
