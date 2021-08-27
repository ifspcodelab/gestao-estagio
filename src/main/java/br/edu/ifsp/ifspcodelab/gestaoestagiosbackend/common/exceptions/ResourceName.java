package br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.common.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResourceName {
    USER("User"),
    CITY("City"),
    CAMPUS("Campus"),
    DEPARTMENT("Department"),
    COURSE("Course"),
    CURRICULUM("Curriculum");

    private String name;
}
