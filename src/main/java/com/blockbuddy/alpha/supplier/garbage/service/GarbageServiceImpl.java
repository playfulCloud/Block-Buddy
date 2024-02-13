package com.blockbuddy.alpha.supplier.garbage.service;

import com.blockbuddy.alpha.supplier.garbage.repository.GarbageRepository;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public class GarbageServiceImpl implements GarbageService{

    private final GarbageRepository garbageRepository;


    public GarbageServiceImpl(GarbageRepository garbageRepository) {
        this.garbageRepository = garbageRepository;
    }

    @Override
    public List<Garbage> findAll() {
        return garbageRepository.findAll();
    }

    @Override
    public Optional<Garbage> findById(int id) {
        Optional<Garbage> flat = garbageRepository.findById(id);
        if (flat.isPresent()) {
            return flat;
        } else {
            throw new RuntimeException("dupa blada");
        }
    }

    @Override
    @Transactional
    public Garbage save(Garbage garbage) {
        return garbageRepository.save(building);
    }

    @Override
    public String deleteById(int id) {
        garbageRepository.deleteById(id);
        return "Garbage deleted";
    }

    @Override
    public Optional<Garbage> findByName(String name) {
        return garbageRepository.findByName(name);
    }
}
