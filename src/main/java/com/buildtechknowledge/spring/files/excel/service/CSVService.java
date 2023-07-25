package com.buildtechknowledge.spring.files.excel.service;

import java.io.IOException;
import java.util.List;

import com.buildtechknowledge.spring.files.excel.helper.CSVHelper;
import com.buildtechknowledge.spring.files.excel.model.Tutorial;
import com.buildtechknowledge.spring.files.excel.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
    @Autowired
   TutorialRepository tutorialRepository;
    public void save(MultipartFile file) {
        try {
            List<Tutorial> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
            tutorialRepository.saveAll(tutorials);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }
    public List<Tutorial> getAllTutorials() {
        return tutorialRepository.findAll();
    }
}
