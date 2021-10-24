package br.edu.ifsp.ifspcodelab.gestaoestagiosbackend.common.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResourceName {
    USER("User"),
    ADVISOR("Advisor"),
    STUDENT("Student"),
    CITY("City"),
    CAMPUS("Campus"),
    DEPARTMENT("Department"),
    COURSE("Course"),
    CURRICULUM("Curriculum"),
    ADVISOR_REQUEST("Advisor Request");

    private String name;
}
