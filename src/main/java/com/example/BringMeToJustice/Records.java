package com.example.BringMeToJustice;

import javax.persistence.*;

@Entity
@Table(name = "records")
public class Records {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false, unique = true, length = 100)
    private String title;
    @Column(name = "date", nullable = false, length = 10)
    private String date;
    @Column(name = "report_number", nullable = false)
    private int reportNumber;
    @Column(name = "victim_name", nullable = false, length = 80)
    private String victimName;
    @Column(name = "has_suspect", nullable = false)
    private boolean hasSuspect;
    @Column(name = "suspect1name")
    private String suspect1Name;
    @Column(name = "suspect1hair")
    private String suspect1Hair;
    @Column(name = "suspect1eye")
    private String suspect1Eye;
    @Column(name = "suspect1race")
    private String suspect1Race;
    @Column(name = "suspect2name")
    private String suspect2Name;
    @Column(name = "suspect2hair")
    private String suspect2Hair;
    @Column(name = "suspect2eye")
    private String suspect2Eye;
    @Column(name = "suspect2race")
    private String suspect2Race;
    @Column(name = "suspect3name")
    private String suspect3Name;
    @Column(name = "suspect3hair")
    private String suspect3Hair;
    @Column(name = "suspect3eye")
    private String suspect3Eye;
    @Column(name = "suspect3race")
    private String suspect3Race;
    @Column(name = "suspect4name")
    private String suspect4Name;
    @Column(name = "suspect4hair")
    private String suspect4Hair;
    @Column(name = "suspect4eye")
    private String suspect4Eye;
    @Column(name = "suspect4race")
    private String suspect4Race;
    @Column(name = "suspect5name")
    private String suspect5Name;
    @Column(name = "suspect5hair")
    private String suspect5Hair;
    @Column(name = "suspect5eye")
    private String suspect5Eye;
    @Column(name = "suspect5race")
    private String suspect5Race;
    @Column(name = "has_warrants")
    private boolean hasWarrants;
    @Column(name = "who_has_warrants")
    private String whoHasWarrants;
    @Column(name = "suspect1warrant_date", length = 10)
    private String suspect1WarrantDate;
    @Column(name = "suspect1warrant_description")
    private String suspect1WarrantDescription;
    @Column(name = "suspect2warrant_date", length = 10)
    private String suspect2WarrantDate;
    @Column(name = "suspect2warrant_description")
    private String suspect2WarrantDescription;
    @Column(name = "suspect3warrant_date", length = 10)
    private String suspect3WarrantDate;
    @Column(name = "suspect3warrant_description")
    private String suspect3WarrantDescription;
    @Column(name = "suspect4warrant_date", length = 10)
    private String suspect4WarrantDate;
    @Column(name = "suspect4warrant_description")
    private String suspect4WarrantDescription;
    @Column(name = "suspect5warrant_date", length = 10)
    private String suspect5WarrantDate;
    @Column(name = "suspect5warrant_description")
    private String suspect5WarrantDescription;
    @Column(name = "description_of_report", nullable = false)
    private String descriptionOfReport;


    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public boolean getHasSuspect() {
        return hasSuspect;
    }

    public void setHasSuspect(boolean hasSuspect) {
        this.hasSuspect = hasSuspect;
    }

    public String getSuspect1Name() {
        return suspect1Name;
    }

    public void setSuspect1Name(String suspect1Name) {
        this.suspect1Name = suspect1Name;
    }

    public String getSuspect1Hair() {
        return suspect1Hair;
    }

    public void setSuspect1Hair(String suspect1Hair) {
        this.suspect1Hair = suspect1Hair;
    }

    public String getSuspect1Eye() {
        return suspect1Eye;
    }

    public void setSuspect1Eye(String suspect1Eye) {
        this.suspect1Eye = suspect1Eye;
    }

    public String getSuspect1Race() {
        return suspect1Race;
    }

    public void setSuspect1Race(String suspect1Race) {
        this.suspect1Race = suspect1Race;
    }

    public String getSuspect2Name() {
        return suspect2Name;
    }

    public void setSuspect2Name(String suspect2Name) {
        this.suspect2Name = suspect2Name;
    }

    public String getSuspect2Hair() {
        return suspect2Hair;
    }

    public void setSuspect2Hair(String suspect2Hair) {
        this.suspect2Hair = suspect2Hair;
    }

    public String getSuspect2Eye() {
        return suspect2Eye;
    }

    public void setSuspect2Eye(String suspect2Eye) {
        this.suspect2Eye = suspect2Eye;
    }

    public String getSuspect2Race() {
        return suspect2Race;
    }

    public void setSuspect2Race(String suspect2Race) {
        this.suspect2Race = suspect2Race;
    }

    public String getSuspect3Name() {
        return suspect3Name;
    }

    public void setSuspect3Name(String suspect3Name) {
        this.suspect3Name = suspect3Name;
    }

    public String getSuspect3Hair() {
        return suspect3Hair;
    }

    public void setSuspect3Hair(String suspect3Hair) {
        this.suspect3Hair = suspect3Hair;
    }

    public String getSuspect3Eye() {
        return suspect3Eye;
    }

    public void setSuspect3Eye(String suspect3Eye) {
        this.suspect3Eye = suspect3Eye;
    }

    public String getSuspect3Race() {
        return suspect3Race;
    }

    public void setSuspect3Race(String suspect3Race) {
        this.suspect3Race = suspect3Race;
    }

    public String getSuspect4Name() {
        return suspect4Name;
    }

    public void setSuspect4Name(String suspect4Name) {
        this.suspect4Name = suspect4Name;
    }

    public String getSuspect4Hair() {
        return suspect4Hair;
    }

    public void setSuspect4Hair(String suspect4Hair) {
        this.suspect4Hair = suspect4Hair;
    }

    public String getSuspect4Eye() {
        return suspect4Eye;
    }

    public void setSuspect4Eye(String suspect4Eye) {
        this.suspect4Eye = suspect4Eye;
    }

    public String getSuspect4Race() {
        return suspect4Race;
    }

    public void setSuspect4Race(String suspect4Race) {
        this.suspect4Race = suspect4Race;
    }

    public String getSuspect5Name() {
        return suspect5Name;
    }

    public void setSuspect5Name(String suspect5Name) {
        this.suspect5Name = suspect5Name;
    }

    public String getSuspect5Hair() {
        return suspect5Hair;
    }

    public void setSuspect5Hair(String suspect5Hair) {
        this.suspect5Hair = suspect5Hair;
    }

    public String getSuspect5Eye() {
        return suspect5Eye;
    }

    public void setSuspect5Eye(String suspect5Eye) {
        this.suspect5Eye = suspect5Eye;
    }

    public String getSuspect5Race() {
        return suspect5Race;
    }

    public void setSuspect5Race(String suspect5Race) {
        this.suspect5Race = suspect5Race;
    }

    public boolean getHasWarrants() {
        return hasWarrants;
    }

    public void setHasWarrants(boolean hasWarrants) {
        this.hasWarrants = hasWarrants;
    }

    public String getWhoHasWarrants() {
        return whoHasWarrants;
    }

    public void setWhoHasWarrants(String whoHasWarrants) {
        this.whoHasWarrants = whoHasWarrants;
    }

    public String getSuspect1WarrantDate() {
        return suspect1WarrantDate;
    }

    public void setSuspect1WarrantDate(String suspect1WarrantDate) {
        this.suspect1WarrantDate = suspect1WarrantDate;
    }

    public String getSuspect1WarrantDescription() {
        return suspect1WarrantDescription;
    }

    public void setSuspect1WarrantDescription(String suspect1WarrantDescription) {
        this.suspect1WarrantDescription = suspect1WarrantDescription;
    }

    public String getSuspect2WarrantDate() {
        return suspect2WarrantDate;
    }

    public void setSuspect2WarrantDate(String suspect2WarrantDate) {
        this.suspect2WarrantDate = suspect2WarrantDate;
    }

    public String getSuspect2WarrantDescription() {
        return suspect2WarrantDescription;
    }

    public void setSuspect2WarrantDescription(String suspect2WarrantDescription) {
        this.suspect2WarrantDescription = suspect2WarrantDescription;
    }

    public String getSuspect3WarrantDate() {
        return suspect3WarrantDate;
    }

    public void setSuspect3WarrantDate(String suspect3WarrantDate) {
        this.suspect3WarrantDate = suspect3WarrantDate;
    }

    public String getSuspect3WarrantDescription() {
        return suspect3WarrantDescription;
    }

    public void setSuspect3WarrantDescription(String suspect3WarrantDescription) {
        this.suspect3WarrantDescription = suspect3WarrantDescription;
    }

    public String getSuspect4WarrantDate() {
        return suspect4WarrantDate;
    }

    public void setSuspect4WarrantDate(String suspect4WarrantDate) {
        this.suspect4WarrantDate = suspect4WarrantDate;
    }

    public String getSuspect4WarrantDescription() {
        return suspect4WarrantDescription;
    }

    public void setSuspect4WarrantDescription(String suspect4WarrantDescription) {
        this.suspect4WarrantDescription = suspect4WarrantDescription;
    }

    public String getSuspect5WarrantDate() {
        return suspect5WarrantDate;
    }

    public void setSuspect5WarrantDate(String suspect5WarrantDate) {
        this.suspect5WarrantDate = suspect5WarrantDate;
    }

    public String getSuspect5WarrantDescription() {
        return suspect5WarrantDescription;
    }

    public void setSuspect5WarrantDescription(String suspect5WarrantDescription) {
        this.suspect5WarrantDescription = suspect5WarrantDescription;
    }

    public String getDescriptionOfReport() {
        return descriptionOfReport;
    }

    public void setDescriptionOfReport(String descriptionOfReport) {
        this.descriptionOfReport = descriptionOfReport;
    }

}
