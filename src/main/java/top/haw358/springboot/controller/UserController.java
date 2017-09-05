package top.haw358.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.haw358.springboot.pojo.User;
import top.haw358.springboot.pojo.UserResource;
import top.haw358.springboot.repositories.jpa.UserRepository;

/**
 * Created by haw on 17-8-30.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserResourceAssembler userResourceAssembler;

    @RequestMapping("/test")
    @ResponseBody
    public User test(User user){
        user.setUsername("haw");
        Example<User> example = Example.of(user);
        return userRepository.findOne(example);
//        userRepository.findAll(CustomerSpecs.get());
    }

    @RequestMapping("/page")
    @ResponseBody
    public Page<User> page() {
//        return userRepository.findAll(new PageRequest(1,10));
        return userRepository.findByUsername("haw", new PageRequest(0, 10));
    }

    @RequestMapping("/{id}")
    public String showUserForm(@PathVariable("id") User user, Model model) {

        model.addAttribute("user", user);
        return "userForm";
    }

    @RequestMapping
    @ResponseBody
    public Page<User> showUsers(Model model, Pageable pageable) {
        return userRepository.findAll(pageable);
//        model.addAttribute("users", userRepository.findAll(pageable));
//        return "users";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    HttpEntity users(Pageable pageable, PagedResourcesAssembler assembler) {
        Page<User> users = userRepository.findAll(pageable);
        return new ResponseEntity(assembler.toResource(users, userResourceAssembler), HttpStatus.OK);
    }

    @RequestMapping(value = "/user1", method = RequestMethod.GET)
    HttpEntity<Resource<UserResource>> users1() {
        UserResource userResource = new UserResource();
        userResource.setUsername("haw");
        Resource<UserResource> resource = new Resource<>(userResource, new Link("http://localhost:8080/users/user1"));
        return ResponseEntity.ok(resource);
    }

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    String index(Model model, @QuerydslPredicate(root = User.class) Predicate predicate,
                 Pageable pageable, @RequestParam MultiValueMap<String, String> parameters) {

        model.addAttribute("users", userRepository.findAll(predicate, pageable));

        return "index";
    }*/
}
