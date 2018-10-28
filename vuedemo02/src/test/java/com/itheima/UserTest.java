package com.itheima;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindOne(){
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void testUpdate(){
        User user = userService.findById(1);
        System.out.println(user);
        user.setAge(55);

        userService.updateUser(user);

        user = userService.findById(1);
        System.out.println(user);
    }

}
