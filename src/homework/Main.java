package homework;

public class Main{
    static UserPersistaber userPersistaber = new UserPersistaber();
    static UserReport userReport = new UserReport();
    public static void main(String[] args){

        User user = new User("Ancle Bob");
        userPersistaber.save(user);
        userReport.report(user);

    }
}