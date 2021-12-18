package test.authentication;

public class CredsData {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "CredsData{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
