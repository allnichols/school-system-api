package com.schoolsystemapi.teacher.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.NonFinal;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class TeacherCreationDTO {
    @NonNull
    private String name;
    @NonNull
    private Integer age;

}
