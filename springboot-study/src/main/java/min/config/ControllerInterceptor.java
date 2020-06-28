package min.config;

import min.model.Duck;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaomin
 * @date 2020/6/29 0:37
 */
@ControllerAdvice
@Configuration
public class ControllerInterceptor {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Duck handle(){
        return new Duck("异常鸭子",11);
    }
}
