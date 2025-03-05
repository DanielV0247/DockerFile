package demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {

        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("admin") && password.equals("admin")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user1") && password.equals("qwerty")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else if (user.equals("user2") && password.equals("123456")) {
            Collections.addAll(authorities, Authorities.READ);
        }
        return authorities;
    }
}
