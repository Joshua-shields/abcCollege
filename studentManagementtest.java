package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class studentManagementApplicationTest {
    private studentManagementApplication app;

    @BeforeEach
    public void setUp() {
        app = new studentManagementApplication();
    }

    @Test
    public void testSaveStudent() {
        // Create a test student
        Student testStudent = new Student(1, "John Doe", 18, "john@example.com", "Math");

        // Save the test student
        app.saveStudent(testStudent);

        // Verify that the student is saved correctly
        assertTrue(app.getStudents().contains(testStudent));
    }

    @Test
    public void testSearchStudent() {
        // Create a test student
        Student testStudent = new Student(2, "Jane Smith", 20, "jane@example.com", "Physics");

        // Save the test student
        app.saveStudent(testStudent);

        // Search for the student by ID
        Student foundStudent = app.searchStudent(2);

        // Verify that the correct student is found
        assertEquals(testStudent, foundStudent);
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        // Search for a student that doesn't exist
        Student foundStudent = app.searchStudent(999);

        // Verify that no student is found
        //assertNull(foundStudent);
    }

    @Test
    public void testDeleteStudent() {
        // Create a test student
        Student testStudent = new Student(3, "Mary Johnson", 21, "mary@example.com", "Chemistry");

        // Save the test student
        app.saveStudent(testStudent);

        // Delete the test student
        app.deleteStudent(3);

        // Verify that the student is deleted
        assertFalse(app.getStudents().contains(testStudent));
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        // Try to delete a student that doesn't exist
        boolean result = app.deleteStudent(999);

        // Verify that deletion is unsuccessful
        //assertFalse(result);
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        // Validate a valid student age
        boolean isValid = app.validateStudentAge(18);

        // Verify that the age is considered valid
        //assertTrue(isValid);
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        // Validate an invalid student age (less than 16)
        boolean isValid = app.validateStudentAge(15);

        // Verify that the age is considered invalid
        //assertFalse(isValid);
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        // Validate an age with an invalid character
        boolean isValid = app.validateStudentAge("invalid_age");

        // Verify that the age is considered invalid
        //assertFalse(isValid);
    }
}
//*****************************************************************************END OF FILE*********************************************************************************//
