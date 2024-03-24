import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TeacherGroup {

    private int lastId = 0;
    private List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {

        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String secondName, String middleName) {
        teacherList.add(new Teacher(this.lastId, firstName, secondName, middleName));
        this.lastId+=1;
    }
    public Teacher findByTeacherId(int teacherId) {
        for (Teacher teacher: this.teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    public void editFirstName(int teacherId, String firstName){
        Teacher teacher = findByTeacherId(teacherId);
        if (teacher != null) {
            teacher.setFirstName(firstName);
        }
    }

    public void editSecondName(int teacherId, String secondName){
        Teacher teacher = findByTeacherId(teacherId);
        if (teacher != null) {
            teacher.setSecondName(secondName);
        }
    }

    public void editMiddleName(int teacherId, String middleName){
        Teacher teacher = findByTeacherId(teacherId);
        if (teacher != null) {
            teacher.setMiddleName(middleName);
        }
    }

}
