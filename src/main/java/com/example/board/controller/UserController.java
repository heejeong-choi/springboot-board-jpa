package com.example.board.controller;

import com.example.board.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static java.time.LocalDate.now;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class UserController {
    private static List<User> userList = new ArrayList<User>(); {
        userList.add(new User(1, "user01", "user01@gmail.com", "최희정", new Date()));
        userList.add(new User(2, "user02", "user02@gmail.com", "김자바", new Date()));
        userList.add(new User(3, "user03", "user03@gmail.com", "나건대", new Date()));
        userList.add(new User(4, "user04", "user04@gmail.com", "어제수", new Date()));
    }

    @RequestMapping("/user")
    public ResponseEntity<List<User>> getUserList() {
        HashMap<String, Object> resultList = new HashMap();
        resultList.put("result", userList);
        return new ResponseEntity(resultList, OK);
    }

    @RequestMapping("/user/{uid}")
    public ResponseEntity<User> getUserInfo(@PathVariable int uid) {
        User user = userList.get(uid);
        return new ResponseEntity(user, OK);
    }
}
