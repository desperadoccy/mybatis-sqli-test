package pers.ccy.mybitssqli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.ccy.mybitssqli.domain.User;
import pers.ccy.mybitssqli.service.FindUser;

@RestController
@RequestMapping("/test")
public class TestSqlI {
    @Autowired
    private FindUser find;

    @RequestMapping("/query")
    public String findUser(User user)
    {
        System.out.println(user);
        User u = find.findUser(user);
        return "这是你的信息" + u;
    }
}
