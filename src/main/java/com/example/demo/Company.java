package com.example.demo;


import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Column(name = "Name")
    private String Name;

    @Column(name = "address")
    private String address;


    @Column(name = "description")
    private String description;

    @Column(name = "pass")
    private String pass;

    @Column(name = "Jobs")
    private String Jobs;


    public Company(String c_Name, String pass, String description, String jobs, String address){
        this.setName(c_Name);
        this.setPassword(pass);
        this.setAddress(address);
        this.setDescription(description);
        this.setJobs(jobs);
    }
    public Company(){}

public  Company(String Name,String pass){
        this.setName(Name);
        this.setPassword(pass);
}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
/*
    public void setForms(List <Form> forms) {
        this.forms =  forms;
    }
    */

   /* @Column(name = "created_at", nullable = false)
    @CreatedDate
    private Date createdAt;
    @Column(name = "created_by", nullable = false)
    @CreatedBy
    private String createdBy;
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    private String updatedBy;*/

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    public String getJobs() {
        return Jobs;
    }

    public void setJobs(String jobs) {
        Jobs = jobs;
    }





    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }


}


