package com.performance.evaluate.HRMS.entity;

import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class LeaveType {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String id;

    @NotNull
    private String leaveName;

    @NotNull
    private String numberOfLeave;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberOfLeave() {
        return numberOfLeave;
    }

    public void setNumberOfLeave(String numberOfLeave) {
        this.numberOfLeave = numberOfLeave;
    }


    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public String getLeaveNumber() {
        return numberOfLeave;
    }

    public void setLeaveNumber(String leaveNumber) {
        this.numberOfLeave = leaveNumber;
    }


}
