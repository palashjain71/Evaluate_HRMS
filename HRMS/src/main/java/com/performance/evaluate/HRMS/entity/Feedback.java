package com.performance.evaluate.HRMS.entity;

import javax.persistence.Entity;


public class Feedback {

    private long feedbackID;
    private String feedbackDesc;

    public long getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(long feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getFeedbackDesc() {
        return feedbackDesc;
    }

    public void setFeedbackDesc(String feedbackDesc) {
        this.feedbackDesc = feedbackDesc;
    }
}
