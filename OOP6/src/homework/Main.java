package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Report report = new Report(user);
        Persister persister = new Persister(user);
        report.report();
        persister.save();
    }
}