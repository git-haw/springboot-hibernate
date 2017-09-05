package top.haw358.springboot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.haw358.springboot.pojo.User;

/**
 * Created by haw on 17-8-30.
 */
public interface UserService {
    Page<User> getUsers(String username, Pageable pageable);
}
