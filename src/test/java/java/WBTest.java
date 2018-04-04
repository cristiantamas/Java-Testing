package test.java.java;

import main.java.controller.LaboratoriesController;
import main.java.model.Laboratory;
import main.java.model.Student;
import org.junit.Test;

import java.text.ParseException;

public class WBTest {

    @Test
    public void assignLab_tc1() throws ParseException {
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success  = controller.saveLaboratory(new Laboratory(10, "07/06/2018", 7, "tcie2026"));

        assert (success);

    }

    @Test
    public void assignLab_tc2() throws ParseException {
        LaboratoriesController controller = new LaboratoriesController( "students.txt", "laboratories.txt");
        boolean success  = controller.saveLaboratory(new Laboratory(10, "01/01/2018", 7, "tcie2026"));

        assert (success);
    }
}
