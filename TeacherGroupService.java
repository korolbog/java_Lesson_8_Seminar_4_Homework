import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroupService {
    private TeacherGroup teacherGroup = new TeacherGroup();

    public void createTeacher(String firstName, String secondName, String middleName) {
        teacherGroup.createTeacher(firstName, secondName, middleName);
    }
    public List<Teacher> getTeacherList() {
        return this.teacherGroup.getTeacherList();
    }

    public void editFirstName(int teacherId, String firstName){
        teacherGroup.editFirstName(teacherId, firstName);
    }

    public void editSecondName(int teacherId, String secondName){
        teacherGroup.editSecondName(teacherId, secondName);
    }

    public void editMiddleName(int teacherId, String middleName){
        teacherGroup.editMiddleName(teacherId, middleName);
    }
}
