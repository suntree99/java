package com.darmawan.budi.exercise.service;

import com.darmawan.budi.exercise.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {

    List<Mahasiswa> findAll();

    Mahasiswa findById(String id);

    Mahasiswa save(Mahasiswa value);

    Mahasiswa update(Mahasiswa value);

    boolean deleteById(String id);

}