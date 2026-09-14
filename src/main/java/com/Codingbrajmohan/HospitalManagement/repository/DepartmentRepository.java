package com.Codingbrajmohan.HospitalManagement.repository;

import com.Codingbrajmohan.HospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}