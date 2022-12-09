package com.example.jobsearch.controller;

import com.example.jobsearch.dto.CreateCandidateRequest;
import com.example.jobsearch.model.Candidate;
import com.example.jobsearch.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public List<Candidate> getall() {
        return candidateService.getall();
    }

    @PostMapping("/save")
    public Candidate save(@RequestBody CreateCandidateRequest request) {
        return candidateService.save(request);
    }
}
