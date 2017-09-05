package top.haw358.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.haw358.springboot.repositories.jpa.UserRepository;
import top.haw358.springboot.pojo.User;
import top.haw358.springboot.service.UserService;

/**
 * Created by haw on 17-8-30.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> getUsers(String username, Pageable pageable) {
       return userRepository.findByUsername(username, pageable);
    }
}
