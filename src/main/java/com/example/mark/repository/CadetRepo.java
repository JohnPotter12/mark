package com.example.mark.repository;

import com.example.mark.models.Cadet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadetRepo extends JpaRepository<Cadet, Long> {
}
