package com.resumematcher.model;

import javax.persistence.*;

@Entity
@Table(name = "matched_profile")
public class MatchedProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "student_email", nullable = false)
    private String studentEmail;

    @Column(name = "job_id", nullable = false)
    private int jobId;

    @Column(name = "recruiter_email", nullable = false)
    private String recruiterEmail;

    public MatchedProfile() {
    }

    public MatchedProfile(String studentEmail, int jobId, String recruiterEmail) {
        this.studentEmail = studentEmail;
        this.jobId = jobId;
        this.recruiterEmail = recruiterEmail;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getRecruiterEmail() {
        return recruiterEmail;
    }

    public void setRecruiterEmail(String recruiterEmail) {
        this.recruiterEmail = recruiterEmail;
    }
}
