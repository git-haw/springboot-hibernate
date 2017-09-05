package top.haw358.springboot.controller;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;
import top.haw358.springboot.pojo.User;
import top.haw358.springboot.pojo.UserResource;

/**
 * Created by haw on 17-9-1.
 */
@Component
public class UserResourceAssembler extends ResourceAssemblerSupport<User, UserResource> {

    public UserResourceAssembler() {
        super(UserController.class, UserResource.class);
    }

    @Override
    public UserResource toResource(User user) {
        return super.createResourceWithId(user.getId(), user);
    }
}
