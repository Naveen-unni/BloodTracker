package com.example.bloodtracker.service;

import com.example.bloodtracker.model.BloodRequest;
import com.example.bloodtracker.repository.BloodRequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BloodRequestService {
    private final BloodRequestRepository bloodRequestRepository;

    public BloodRequestService(BloodRequestRepository bloodRequestRepository) {
        this.bloodRequestRepository = bloodRequestRepository;
    }

    public List<BloodRequest> getAllRequests() {
        return bloodRequestRepository.findAll();
    }

    public BloodRequest addRequest(BloodRequest request) {
        return bloodRequestRepository.save(request);
    }

    public void deleteRequest(Long id) {
        bloodRequestRepository.deleteById(id);
    }
}
