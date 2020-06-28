import com.min.pojo.User;
import com.min.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaomin
 * @date 2020/6/20 13:45
 */
public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applications.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT user=(UserT)context.getBean("u2");
        user.show();
    }
}
