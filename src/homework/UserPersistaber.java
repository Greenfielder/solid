package homework;

public class UserPersistaber implements Persistable {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
