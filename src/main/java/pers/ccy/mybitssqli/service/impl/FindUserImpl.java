package pers.ccy.mybitssqli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.ccy.mybitssqli.Dao.UserDao;
import pers.ccy.mybitssqli.domain.User;
import pers.ccy.mybitssqli.service.FindUser;

@Service
public class FindUserImpl implements FindUser {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(User user) {
        return userDao.findUser(user);
    }
}
