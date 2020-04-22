package pers.ccy.mybitssqli.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.ccy.mybitssqli.domain.User;

@Mapper
public interface UserDao {
    @Select("select * from sqlITest where name = '${name}' and password = '${password}'")
    User findUser(User user);
}
