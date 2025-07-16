package com.resumematcher.model;

import javax.persistence.*;

@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String description;

    @Column(nullable = false)
    private String skills; // Comma-separated string (e.g., "Java, SQL, JSP")

    @Column(name = "recruiterEmail", nullable = false)
    private String recruiterEmail;

    // Constructors
    public Job() {}

    public Job(String title, String description, String skills,String recruiterEmail) {
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.recruiterEmail = recruiterEmail;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getRecruiterEmail() {
		return recruiterEmail;
	}

	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}
    
    

    
}
