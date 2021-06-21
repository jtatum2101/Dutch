package com.example.BringMeToJustice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RecordsRepo recordsRepo;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register_success")
    public String processRegister(Users user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Users> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @Autowired
    private RecordService service;

    @RequestMapping("/viewAll")
    public String viewAllPage(Model model) {
        List<Records> listRecords = service.listAll();
        model.addAttribute("listRecords", listRecords);

        return "viewAll";
    }

    @RequestMapping("/new")
    public String showNewRecordPage(Model model) {
        Records record = new Records();
        model.addAttribute("record", record);
        return "new_record";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("record") Records record) {
        service.save(record);

        return "redirect:/";
    }

    @GetMapping("{title}/details")
    public String getRecordByTitle(@PathVariable("title") String title, Model model) {
        Records record = recordsRepo.findByTitle(title);
        model.addAttribute("record", record);
        return "record_details";
    }

    @GetMapping("/searchByDate")
    public String searchingRecordByTitle() {

        return "searchByDate";
    }

    @GetMapping("/found_report_by_date")
    public String viewByDatePage(@RequestParam(name = "date", required = false) String date, Model model) {
        if (date != null) {
            model.addAttribute("listRecords", recordsRepo.findByDate(date));
        } else {
            model.addAttribute("listRecords", recordsRepo.findAll());
        }
        System.out.print(date);
        return "found_report_by_date";
    }

    @GetMapping("/searchByReportNum")
    public String searchingReportByReportNumber() {
        return "searchByReportNum";
    }

    @GetMapping("/found_report_by_report_num")
    public String viewByNumPage(@RequestParam(name = "reportNum", required = false) Integer reportNumber, Model model) {
        if (reportNumber != 0) {
            model.addAttribute("listRecords", recordsRepo.findByReportNumber(reportNumber));
        } else {
            model.addAttribute("listRecords", recordsRepo.findAll());
        }
        System.out.print(reportNumber);
        return "found_report_by_report_num";
    }

    @GetMapping("/updateByTitle")
    public String updatingReportByTitle() {
        return "updateByTitle";
    }

    @GetMapping("/found_updated_report")
    public String updatedByTitlePage(@RequestParam(name = "title", required = false) String title, Model model) {
        if (title != null) {
            model.addAttribute("record", recordsRepo.findByTitle(title));

        } else {
            return "record_not_exist";
        }
        System.out.println(title);
        return "found_updated_report";

    }
}
