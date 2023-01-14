package cl.custo.service;

import cl.custo.model.User;
import cl.custo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public User findById(UUID uuid) {
        return userRepository.findById(uuid).orElseThrow(() -> new NoSuchElementException());
    }

    public User saveUser(User car) {
        return userRepository.save(car);
    }

    public void deleteUser(UUID uuid) {
        userRepository.deleteById(uuid);
    }

    public User updateUser(User car) {
        return userRepository.save(car);
    }

    public boolean existById(UUID uuid) {
        return userRepository.existsById(uuid);
    }
}