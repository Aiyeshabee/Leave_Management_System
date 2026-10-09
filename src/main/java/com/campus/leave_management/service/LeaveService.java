package com.campus.leave_management.service;

import com.campus.leave_management.entity.Leave;
import com.campus.leave_management.repository.LeaveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {

    private final LeaveRepository leaveRepository;

    public LeaveService(LeaveRepository leaveRepository) {

        this.leaveRepository = leaveRepository;
    }

    // CREATE
    public Leave createLeave(Leave leave) {

        return leaveRepository.save(leave);
    }

    // READ ALL
    public List<Leave> getAllLeaves() {

        return leaveRepository.findAll();
    }
}