public class Teacher extends User{
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String middleName) {
        super(firstName, secondName, middleName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

}
