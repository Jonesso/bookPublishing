package ru.pavlinina.ecommerce.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.pavlinina.ecommerce.models.User;
import ru.pavlinina.ecommerce.repositories.UserRepository;

/**
 * @author Sofia Pavlinina
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
