/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sandhika_m6.service;

import com.mycompany.sandhika_m6.model.MahasiswaModel;
import com.mycompany.sandhika_m6.repository.MahasiswaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class MahasiswaService {
    @Autowired
    private MahasiswaRepository repository;
    
    public void addMhs(MahasiswaModel mhs) {
        repository.save(mhs);
    }
    
    public MahasiswaModel getMhs(int id) {
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(MahasiswaModel mhs) {
        repository.save(mhs);
    }
    
    public void deleteMhs(int id) {
        repository.deleteById(id);
    }
    
    public List<MahasiswaModel> getAllMahasiswa() {
        return repository.findAll();
    }

}
