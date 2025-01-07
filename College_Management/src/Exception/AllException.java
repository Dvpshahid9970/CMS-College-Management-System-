package Exception;

public class AllException {

    public static void throwStudentNotFoundException() throws Exception {
        throw new Exception("Student not found.");
    }

    public static void throwTeacherNotFoundException() throws Exception {
        throw new Exception("Teacher not found.");
    }

    public static void throwLibrarianNotFoundException() throws Exception {
        throw new Exception("Librarian not found.");
    }

    public static void throwSecurityGuardNotFoundException() throws Exception {
        throw new Exception("Security Guard not found.");
    }

    public static void throwSportTeacherNotFoundException() throws Exception {
        throw new Exception("Sport Teacher not found.");
    }

    public static void throwInvalidChoiceException() throws Exception {
        throw new Exception("\nWrong Choice\nNot Found\nPlease Choose from the Given Professions.");
    }
}
