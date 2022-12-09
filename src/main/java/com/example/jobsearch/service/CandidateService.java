package com.example.jobsearch.service;

import com.example.jobsearch.dto.CreateCandidateRequest;
import com.example.jobsearch.model.Candidate;
import com.example.jobsearch.repository.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> getall() {
        return candidateRepository.findAll();
    }

    public Candidate save(CreateCandidateRequest request) {

        Candidate candidate = new Candidate(
                request.getEmail(),
                request.getPassword(),
                request.getFirstName(),
                request.getLastName(),
                request.getBirthOfYear(),
                request.getPhoneNumber()
                );

        return candidateRepository.save(candidate);
    }
}
