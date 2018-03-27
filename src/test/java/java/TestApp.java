package test.java.java;

import controller.LaboratoriesController;
import model.Student;
import org.junit.Test;

public class TestApp {



    @Test
    public void AddStudentTestOk(){
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success  = controller.saveStudent(new Student("asdf1236", "Name Surname", 931));

        assert (success);
    }


    @Test
    public void AddStudentTestFails(){
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success2 = controller.saveStudent(new Student("asdwaldk1p2oeko1eklawd,a,", "dwakfjawdaw", 1298312638));

        assert(success2);
    }
}
