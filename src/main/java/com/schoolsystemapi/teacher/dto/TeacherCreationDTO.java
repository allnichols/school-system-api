package com.schoolsystemapi.teacher.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class TeacherCreationDTO {
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    private String address;
    private String classesTaught;

    public TeacherCreationDTO() {
    }

    public TeacherCreationDTO(String firstName, String lastName, Date dob, String email, String address, String classesTaught) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.classesTaught = classesTaught;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassesTaught(String classesTaught) {
        this.classesTaught = classesTaught;
    }
}
