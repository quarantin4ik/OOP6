package homework;

public class Report {
    private final User user;

    
    public Report(User user){
        this.user = user;
    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
