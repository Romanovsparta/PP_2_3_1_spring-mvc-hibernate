package app.service;

import org.springframework.stereotype.Component;
import app.dao.UserDAO;
import app.model.User;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
