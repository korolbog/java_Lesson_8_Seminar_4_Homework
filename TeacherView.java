import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list) {
            System.out.println("Teacher id: " + teacher.getTeacherId() +
                    " Teacher full name: " + teacher.getFirstName() +
                    " " + teacher.getMiddleName() +
                    " " + teacher.getSecondName() + ".");
        }
    }
}
