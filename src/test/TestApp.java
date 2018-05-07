

import main.java.model.Laboratory;
import main.java.model.Student;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TestApp {

    @Test
    public void testA(){
        //Adding a new student

        main.java.controller.LaboratoriesController controller = new main.java.controller.LaboratoriesController("students.txt", "laboratories.txt");
        boolean success = controller.saveStudent(new Student("tcie2026", "Tamas Cristian", 931));

        assert(success);

    }

    @Test
    public void testB() throws ParseException, IOException {
        //Adding a new student + assigning a laboratory and a grade for a student

        main.java.controller.LaboratoriesController controller = new main.java.controller.LaboratoriesController("students.txt", "laboratories.txt");
        boolean s1 = controller.saveStudent(new Student("tcie2026", "Tamas Cristian", 931));
        boolean s2 = controller.saveLaboratory(new Laboratory(10, "08/05/2018", 6, "tcie2026"));
        boolean s3 = controller.addGrade("tcie2026", "10", (float) 9.0);

        assert(s1);
        assert(s2);
        assert(s3);
    }

    @Test
    public void testC() throws ParseException, IOException {
        //Adding a new student + assigning a laboratory and a grade for a student + listing passing students

        main.java.controller.LaboratoriesController controller = new main.java.controller.LaboratoriesController("students.txt", "laboratories.txt");
        boolean s1 = controller.saveStudent(new Student("tcie2026", "Tamas Cristian", 931));
        boolean s2 = controller.saveLaboratory(new Laboratory(10, "08/05/2018", 6, "tcie2026"));
        boolean s3 = controller.addGrade("tcie2026", "10", (float) 9.0);
        List<Student> list = controller.passedStudents();


        assert(s1);
        assert(s2);
        assert(s3);
        assert(list.size()>0);
    }
}
