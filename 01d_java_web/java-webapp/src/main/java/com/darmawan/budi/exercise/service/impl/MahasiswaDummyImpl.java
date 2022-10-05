package com.darmawan.budi.exercise.service.impl;

import com.darmawan.budi.exercise.model.Mahasiswa;
import com.darmawan.budi.exercise.service.MahasiswaService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MahasiswaDummyImpl implements MahasiswaService {
    @Override
    public List<Mahasiswa> findAll() {
        return Arrays.asList(
                Mahasiswa.builder()
                        .namaLengkap("Dimas Maryanto")
                        .saldo(new BigDecimal(10000000))
                        .tanggalLahir(new Date(731091600000L))
                        .aktif(true)
                        .build(),
                Mahasiswa.builder()
                        .namaLengkap("Muhamad Yusuf")
                        .saldo(new BigDecimal(1000000))
                        .tanggalLahir(new Date(699555600000L))
                        .aktif(false)
                        .build()
        );
    }

    @Override
    public Mahasiswa findById(String id) {
        return Mahasiswa.builder()
                .namaLengkap("Dimas Maryanto")
                .saldo(new BigDecimal(10000000))
                .tanggalLahir(new Date(731091600000L))
                .build();
    }

    @Override
    public Mahasiswa save(Mahasiswa value) {
        return value;
    }

    @Override
    public Mahasiswa update(Mahasiswa value) {
        return value;
    }

    @Override
    public boolean deleteById(String id) {
        return true;
    }
}
