package com.example.spring.controllers;


import com.example.spring.models.Checker;
import com.example.spring.models.Counter;
import com.example.spring.models.ReaderFile;
import com.example.spring.models.WriterFile;
import com.example.spring.models.dtos.MongoDBDTO;
import com.example.spring.models.dtos.MySQLDTO;
import com.example.spring.repository.MongoDBRepository;
import com.example.spring.repository.MySQLDTORepository;
import com.example.spring.ui.Checking;
import com.example.spring.ui.Counting;
import com.example.spring.ui.ReadingFile;
import com.example.spring.ui.WritingFile;
import enums.Inputter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MainController {

    ReadingFile readingFile = new ReaderFile();
    Checking checking = new Checker();
    Counting counting = new Counter();
    WritingFile writingFile = new WriterFile();

    String input, textInput, check, resultRead;

    @Autowired
    private MySQLDTORepository mySQLDTORepository;

    @Autowired
    private MongoDBRepository mongoDBRepository;

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/console")
    public String console(Model model) {
        model.addAttribute("consoleTxt", "");
        model.addAttribute("resultRead", "");
        return "console";
    }

    @PostMapping("/console")
    public void consoleAdd(@RequestParam String consoleText, Model model) {
        input = Inputter.CONSOLE.getInputer();
        check = checking.determine(consoleText);
        resultRead = counting.identify(check, input);
        model.addAttribute("consoleTxt", consoleText);
        model.addAttribute("resultRead", resultRead);
    }

    @GetMapping("/file")
    public String file(Model model) {
        input = Inputter.FILE.getInputer();
        textInput = readingFile.read();
        check = checking.determine(textInput);
        resultRead = counting.identify(check, input);
        writingFile.write(resultRead);
        model.addAttribute("text", textInput);
        model.addAttribute("resultRead", resultRead);
        return "file";
    }

    @GetMapping("/mysql")
    public String mysql(Model model) {
        long id = 1;
        Optional<MySQLDTO> sql = mySQLDTORepository.findById(id);
        textInput = sql.get().text;
        input = Inputter.DB.getInputer();
        check = checking.determine(textInput);
        resultRead = counting.identify(check, input);
        model.addAttribute("textMySQL", textInput);
        model.addAttribute("resultRead", resultRead);
        return "mysql";
    }

    @GetMapping("/mongodb")
    public String mongodb(Model model) {
        Optional<MongoDBDTO> mongoOptional = mongoDBRepository.findById("618525f61f0b795a8cd78de8");
        textInput = mongoOptional.get().textMongoDB;
        input = Inputter.DB.getInputer();
        check = checking.determine(textInput);
        resultRead = counting.identify(check, input);
        model.addAttribute("textMongoDB", textInput);
        model.addAttribute("resultRead", resultRead);
        return "mongodb";
    }
}
