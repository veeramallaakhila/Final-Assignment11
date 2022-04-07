package com.example.survey.management.project;

import net.bytebuddy.asm.Advice;
voidimport org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public class Survey_Management {
    @Service
    @Transactional
    public class Survey_Management {
        @Autowired
        private SurveyRepository repo;

        public list<Survey> surveylist();

        Return repo.findAll();

    }
    public void save (survey survey) {
        repo.save(survey);
    }
    public Survey get(Long id) {
        Return repo.FindbyId(id).get();
    }
    public void delete(Long,id){
        repo.deleteById(id);

    }

}
