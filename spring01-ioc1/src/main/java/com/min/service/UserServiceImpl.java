package com.min.service;

import com.min.dao.UserDao;
import com.min.dao.UserDaoImpl;
import com.min.dao.UserDaoMysqlImpl;

/**
 * @author zhaomin
 * @date 2020/6/20 11:46
 */
public class UserServiceImpl implements UserService {
    //业务层调用DAO
//    private UserDao userDao=new UserDaoImpl();
    //private  UserDao userDao=new UserDaoMysqlImpl();

    //改进,使用set进行动态实现值得注入
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
