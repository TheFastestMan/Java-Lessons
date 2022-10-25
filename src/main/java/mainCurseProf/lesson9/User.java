package mainCurseProf.lesson9;

import java.io.Serializable;

public class User implements Serializable {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
