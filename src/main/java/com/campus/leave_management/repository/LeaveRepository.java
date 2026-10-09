package com.campus.leave_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.leave_management.entity.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {
}