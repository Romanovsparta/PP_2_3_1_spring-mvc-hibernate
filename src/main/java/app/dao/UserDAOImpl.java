package app.dao;

import org.springframework.stereotype.Component;
import app.model.User;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    public User getUser(int id) {
        return (User) entityManager.createQuery("FROM User WHERE id = :id").setParameter("id", id).getSingleResult();
    }

    public void save(User user) {
        entityManager.persist(user);
    }

    public void update(int id, User upUser) {
        User userToBeUpdated = getUser(id);
        userToBeUpdated.setFirstName(upUser.getFirstName());
        userToBeUpdated.setSurName(upUser.getSurName());
        userToBeUpdated.setEmail(upUser.getEmail());
    }

    public void delete(int id) {
        entityManager.remove(getUser(id));
    }
}
