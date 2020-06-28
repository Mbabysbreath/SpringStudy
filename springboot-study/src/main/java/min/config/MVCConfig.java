package min.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhaomin
 * @date 2020/6/28 23:59
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {
    //根据url进行懒觉，调用配置的拦截器进行处理
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //除了这两url请求，其他都被拦截
        //所以的拦截器一次执行：
        // intercepor.preHandle()--controller.映射方法--interceptor.postHandle
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login.html")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/error");

    }
}
