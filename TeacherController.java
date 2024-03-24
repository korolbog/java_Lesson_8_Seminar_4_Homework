public class TeacherController implements UserController<Teacher> {
    private final TeacherGroupService teacherGroupService = new TeacherGroupService();

    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String middleName) {
        teacherGroupService.createTeacher(firstName, secondName, middleName);
    }

    public void printTeacherList() {
        teacherView.sendOnConsole(teacherGroupService.getTeacherList());
    }

    public void editFirstName(int teacherId, String firstName){
        teacherGroupService.editFirstName(teacherId, firstName);
    }

    public void editSecondName(int teacherId, String secondName){
        teacherGroupService.editSecondName(teacherId, secondName);
    }

    public void editMiddleName(int teacherId, String middleName){
        teacherGroupService.editMiddleName(teacherId, middleName);
    }
}
