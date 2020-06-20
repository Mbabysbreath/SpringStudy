import com.min.dao.UserDaoMysqlImpl;
import com.min.service.UserService;
import com.min.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaomin
 * @date 2020/6/20 11:49
 */
public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用业务层，DAO层不需要接触
//        UserServiceImpl userService=new UserServiceImpl();
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        //获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
