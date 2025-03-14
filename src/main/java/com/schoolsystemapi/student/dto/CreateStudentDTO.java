package com.schoolsystemapi.student.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentDTO {
    @Setter
    private String firstName;

    @Setter
    private String lastName;

    @Setter
    private String email;

    @Setter
    private String dob;

    @Setter
    private String address;

}
