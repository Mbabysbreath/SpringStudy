package min.controller;

import min.model.Duck;
import min.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhaomin
 * @date 2020/6/22 10:03
 */

@Controller
@RequestMapping(value = "/user")
public class LoginController {
    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(User user,HttpServletRequest request){

        System.out.println("username=" + user.getUsername());
        System.out.println("password=" + user.getPassword());
        //校验用户名和密码,校验通过，设置用户身份信息到Session
        if("abc".equals(user.getUsername())&&"123".equals(user.getPassword())) {
            HttpSession session = request.getSession();//默认true,如果获取不到，就创建一个
            session.setAttribute("user", user);
            return "redirect:/user/login6";//登录成返回首页
        }else if("a".equals(user.getUsername())){
            throw new RuntimeException("用户名为a出错了");
        }else {
            return "/login.html";
        }
    }

    @RequestMapping(value = "/login_0",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Duck login_0(User user) {
        System.out.println("username=" + user.getUsername());
        System.out.println("username=" + user.getPassword());
        return new Duck("zhaomin11", 20);
    }

    @RequestMapping(value = "/login2",method = RequestMethod.GET)
    public  String login2(HttpServletRequest request, HttpServletResponse response ){
        return "/login.html";
    }
    @RequestMapping("/login3")
    public String login3(){
        //先做一部分业务操作
        //重定向
        return "redirect:/user/login";
    }
    @RequestMapping(value = "/{id}/login4",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Duck login4(@PathVariable("id") Integer id) {
        System.out.println("id="+id);
        return new Duck("zhaomin", 20);
    }

    @RequestMapping(value = "/login5",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Duck login5(@RequestBody User user) {
        System.out.println("username=" + user.getUsername());
        System.out.println("password=" + user.getPassword());
        return new Duck("zhaomin123", 20);
    }

    @RequestMapping("/login6")
    public String login6(Model model) {//返回freemarker动态网页模版生成的网页内容
        model.addAttribute("duck",new Duck("zhaomin123", 20));
        return "index";
    }
    /**
     * 两个问题：
     * （1）如果方法抛异常了，怎么办
     * （2）如果设计敏感url，比如需要登陆后才可以访问url
     */

}
