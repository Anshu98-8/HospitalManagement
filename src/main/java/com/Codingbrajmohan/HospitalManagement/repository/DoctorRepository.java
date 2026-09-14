package com.Codingbrajmohan.HospitalManagement.repository;


import com.Codingbrajmohan.HospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}