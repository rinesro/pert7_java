/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sandhika_m6.controller;

import com.mycompany.sandhika_m6.model.MahasiswaModel;
import com.mycompany.sandhika_m6.service.MahasiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author LENOVO
 */
@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public String addMahasiswa(@RequestBody MahasiswaModel mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa added successfully";
    }
    
    public MahasiswaModel getMahasiswa(@PathVariable int id) {
        return mahasiswaService.getMhs(id);
    }
    
    public String updateMahasiswa(@RequestBody MahasiswaModel mhs){
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa updated successfully";
    }
    
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa deleted successfuly";
    }
    
    public List<MahasiswaModel> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

}
