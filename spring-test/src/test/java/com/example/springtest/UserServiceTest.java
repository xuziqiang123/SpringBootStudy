package com.example.springtest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void userServiceTest() {
        userService.add();
    }
}
