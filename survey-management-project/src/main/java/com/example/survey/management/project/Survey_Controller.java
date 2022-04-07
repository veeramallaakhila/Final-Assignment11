package com.example.survey.management.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class Survey_Controller {
    @Autowired
    private Survey_Management Management;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<survey> surveyList = survey.Listall();
        String attributeName;
        model.addAttribute("listSurveys", surveyList);
        return "index";
    }

    @RequestMapping("/new")
    public String showNewSurveyPage(Model Model) {
        Survey survey = new Survey();
        model.addattribute("survey", survey );
        return "new_survey";
    }

    @RequestMapping(value = "/save,method=ReuestMethod.POST")
    public String saveSurvey(@ModelAttribute("survey") Survey survey) {
        mangement.save(survey);
        return "redirect:/";
    }

    @RequestMapping("preview/{id}")
    public ModelAndView showPreviewSurveyPage(@PathVariable(name = "id") int id) {
        ModelAndView max = new ModelAndView("preview-survey");
        return max;


    @RequestMapping("/publish/{id}")
    public String publishsurvey(@PathVariable(name = "id") int id) {
        service.publish(id);
        return "redirect:/";
    }


}


