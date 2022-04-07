package com.example.survey.management.project;
@entity
public class Survey {
    private Long id;
    private String SurveyName;
    private  String Surveytype;
    private String StartDate;
    private String enddate;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurveyName() {
        return SurveyName;
    }

    public void setSurveyName(String surveyName) {
        SurveyName = surveyName;
    }

    public String getSurveytype() {
        return Surveytype;
    }

    public void setSurveytype(String surveytype) {
        Surveytype = surveytype;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public Survey(Long id, String surveyName, String surveytype, String startDate, String enddate) {
        this.id = id;
        SurveyName = surveyName;
        Surveytype = surveytype;
        StartDate = startDate;
        this.enddate = enddate;
    }
}

