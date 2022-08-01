package app.dao;

import org.springframework.stereotype.Component;
import app.model.User;
/*import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;*/

import java.util.ArrayList;
import java.util.List;

@Component
//@Transactional(readOnly = true)
public class UserDAO {
    private static int USERS_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++USERS_COUNT, "Леонид", "Романов", "romanovsparta@ya.ru"));
        users.add(new User(++USERS_COUNT, "Евгений", "Горский", "eugen@mail.ru"));
        users.add(new User(++USERS_COUNT, "Рамиль", "Арсланов", "ramil@mail.ru"));
        users.add(new User(++USERS_COUNT, "Борис", "Акумов", "boris@mail.ru"));
    }

    /*@PersistenceContext
    private EntityManager entityManager;*/

    public List<User> getAllUsers() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    //@Transactional
    public void save(User user) {
        user.setId(++USERS_COUNT);
        users.add(user);
        //entityManager.persist(user);
    }

    public void update(int id, User upUser) {
        User userToBeUpdated = show(id);
        userToBeUpdated.setFirstName(upUser.getFirstName());
        userToBeUpdated.setSurName(upUser.getSurName());
        userToBeUpdated.setEmail(upUser.getEmail());
    }

    public void delete(int id) {
        users.removeIf(p -> p.getId() == id);
    }
}
