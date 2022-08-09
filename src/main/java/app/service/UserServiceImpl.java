package app.service;

import app.dao.UserDAO;
import app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(int id, User upUser) {
        userDAO.update(id, upUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
