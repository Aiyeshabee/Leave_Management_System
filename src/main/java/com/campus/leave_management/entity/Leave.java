package com.campus.leave_management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "leaves")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String employeeName;

    @Column(nullable = false)
    private String leaveType;

    @Column(nullable = false)
    private String fromDate;

    @Column(nullable = false)
    private String toDate;

    private String reason;

    private String status;

    // Default constructor required by JPA
    public Leave() {
    }

    // Parameterized constructor
    public Leave(String employeeName, String leaveType,
                 String fromDate, String toDate,
                 String reason, String status) {

        this.employeeName = employeeName;
        this.leaveType = leaveType;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
        this.status = status;
    }

    // Getter
    public Long getId() {
        return id;
    }

    // Getter
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter
    public String getLeaveType() {
        return leaveType;
    }

    // Setter
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    // Getter
    public String getFromDate() {
        return fromDate;
    }

    // Setter
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    // Getter
    public String getToDate() {
        return toDate;
    }

    // Setter
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    // Getter
    public String getReason() {
        return reason;
    }

    // Setter
    public void setReason(String reason) {
        this.reason = reason;
    }

    // Getter
    public String getStatus() {
        return status;
    }

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
