public class Student implements StudentObserver{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"I got the msg"+message);

    }
}
