package test.java.java;

import main.java.controller.LaboratoriesController;
import main.java.model.Student;
import org.junit.Test;

public class TestApp {



    @Test
    public void addStudentTest_tc1(){
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success  = controller.saveStudent(new Student("asdf1236", "Tamas Cristian", 931));

        assert (success);
    }


    @Test
    public void addStudentTest_tc2(){
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success2 = controller.saveStudent(new Student("tci23459", "Name name", 931));

        assert(success2);
    }

    @Test
    public void addStudentTest_tc3(){
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success2 = controller.saveStudent(new Student("tcie2026", "Tamas Cristian", -1));

        assert(success2);
    }


}
