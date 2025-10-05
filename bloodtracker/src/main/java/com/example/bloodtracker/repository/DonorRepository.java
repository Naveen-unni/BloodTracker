package com.example.bloodtracker.repository;

import com.example.bloodtracker.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor, Long> {
}
