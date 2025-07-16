package com.resumematcher.model;

import javax.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_email", nullable = false)
    private String userEmail;  // Email of student who uploaded the resume

    @Column(name = "resume_text", columnDefinition = "TEXT")
    private String resumeText; // Parsed resume content from PDF/Docx

    @Column(name = "uploaded_date")
    private String uploadedDate;

    // Constructors
    public Resume() {}

    public Resume(String userEmail, String resumeText, String uploadedDate) {
        this.userEmail = userEmail;
        this.resumeText = resumeText;
        this.uploadedDate = uploadedDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getResumeText() {
        return resumeText;
    }

    public void setResumeText(String resumeText) {
        this.resumeText = resumeText;
    }

    public String getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(String uploadedDate) {
        this.uploadedDate = uploadedDate;
    }
}
