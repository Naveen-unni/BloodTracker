package com.example.bloodtracker.controller;

import com.example.bloodtracker.model.BloodRequest;
import com.example.bloodtracker.service.BloodRequestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class BloodRequestController {
    private final BloodRequestService bloodRequestService;

    public BloodRequestController(BloodRequestService bloodRequestService) {
        this.bloodRequestService = bloodRequestService;
    }

    @GetMapping
    public List<BloodRequest> getAllRequests() {
        return bloodRequestService.getAllRequests();
    }

    @PostMapping
    public BloodRequest addRequest(@RequestBody BloodRequest request) {
        return bloodRequestService.addRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        bloodRequestService.deleteRequest(id);
    }
}
