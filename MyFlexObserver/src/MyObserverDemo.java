public class MyObserverDemo {
    public static void main(String[] args) {
        Admin akila=new Admin();
        Student shehan=new Student("Akila");

        akila.addObserver(shehan);
        akila.sendMessage();

    }
}
