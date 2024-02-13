package com.blockbuddy.alpha.supplier.garbage.service;

import com.blockbuddy.alpha.supplier.garbage.entity.Garbage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GarbageService {
    List<Garbage> findAll();
    Optional<Garbage> findById(int id);
    Garbage save(Garbage Garbage);
    String deleteById(int id);
    Optional<Garbage> findByName(String name);
}
