package com.scan;

import com.pojo.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhaomin
 * @date 2020/6/21 21:31
 */
//@Controller("Bean的名字")
//@Controller默认以类名，首字母小写的方式注册Bean对象
@Controller
public class LoginController {
    //装配Bean
    //1.    @Autowired:Spring注解，只能Spring
    //2.@Resource JDK的注解
    @Autowired
    private LoginService loginService;
    @Autowired
    private Duck duck3;

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public Duck getDuck3() {
        return duck3;
    }

    public void setDuck3(Duck duck3) {
        this.duck3 = duck3;
    }
}
