public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Adolf", "Dassler", "-");
        teacherController.create("Rudolf", "Dassler", "-");
        teacherController.create("Stan", "Smith", "-");
        teacherController.editFirstName(0, "Karl");
        teacherController.editSecondName(1, "Reebok");
        teacherController.editMiddleName(2, "Alex");
        teacherController.printTeacherList();
    }
}