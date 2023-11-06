package b14.service;

import b14.entity.Student;
import b14.exception.FullNameException;

public class ValidateService {
    public static void validatedStudent(Student student) throws FullNameException {
        validateFullName(student.getFullName());
    }

    public static void validateFullName(String fullName) throws FullNameException {
        if (fullName.length() < 10 || fullName.length() > 50) {
            throw new FullNameException();
        }
    }
}
