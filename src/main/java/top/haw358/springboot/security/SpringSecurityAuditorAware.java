package top.haw358.springboot.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.AuditorAware;
//import org.springframework.data.domain.Example;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import top.haw358.springboot.pojo.User;
//import top.haw358.springboot.repositories.jpa.UserRepository;

/**
 * Created by haw on 17-9-1.
 */
public class SpringSecurityAuditorAware{// implements AuditorAware<User> {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public User getCurrentAuditor() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return null;
//        }
//        String username = (String) authentication.getPrincipal();
//        User user = new User();
//        user.setUsername(username);
//        return userRepository.findOne(Example.of(user));
//    }
}
