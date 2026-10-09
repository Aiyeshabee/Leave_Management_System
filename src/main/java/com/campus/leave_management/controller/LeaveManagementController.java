package com.campus.leave_management.controller;

import com.campus.leave_management.entity.Leave;
import com.campus.leave_management.service.LeaveService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave-management")
public class LeaveManagementController {

    private final LeaveService leaveService;

    public LeaveManagementController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    // GET ALL LEAVES
    @GetMapping("/leaves")
    public List<Leave> getAllLeaves() {
        return leaveService.getAllLeaves();
    }

    // GET LEAVE BY ID
    @GetMapping("/leaves/{id}")
    public Leave getLeaveById(@PathVariable Long id) {
        return leaveService.getLeaveById(id);
    }

    // APPLY FOR LEAVE
    @PostMapping("/leaves")
    public Leave applyLeave(@RequestBody @Valid Leave leave) {
        return leaveService.applyLeave(leave);
    }

    // UPDATE LEAVE
    @PutMapping("/leaves/{id}")
    public Leave updateLeave(
            @PathVariable Long id,
            @RequestBody @Valid Leave leave) {

        return leaveService.updateLeave(id, leave);
    }

    // DELETE / CANCEL LEAVE
    @DeleteMapping("/leaves/{id}")
    public String deleteLeave(@PathVariable Long id) {
        return leaveService.deleteLeave(id);
    }
}


Your API endpoints will now be:

GET /leave-management/leaves → Get all leaves
GET /leave-management/leaves/{id} → Get a specific leave
POST /leave-management/leaves → Apply for leave
PUT /leave-management/leaves/{id} → Update leave
DELETE /leave-management/leaves/{id} → Cancel/delete leave

If by "change into leave management system" you mean you want a complete Spring Boot Leave Management System with Employee, Leave, Admin approval/rejection, leave balance, database, Service, Repository, Entity, and Controller, I can structure the complete project for you.