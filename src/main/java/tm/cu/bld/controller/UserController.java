package tm.cu.bld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tm.cu.bld.entity.User;
import tm.cu.bld.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestParam String username, @RequestParam String password) {
        return userService.registerUser(username, password);
    }
}
