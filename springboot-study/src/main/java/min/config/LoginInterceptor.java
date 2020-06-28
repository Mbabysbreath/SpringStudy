package min.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhaomin
 * @date 2020/6/29 0:04
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * Controller类方法调用前，如果匹配到拦截器的url，就
     * 会调研preHandel进行处理
     *
     * @param request
     * @param response
     * @param handler
     * @return true能够继续访问，（可以调用Controller中的方法或访问某个页面）
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession(false);//获取Session，如果灭有，返回null
        if (session != null) {
            Object user = session.getAttribute("user");
            if(user!=null){
                return true;
            }
        }
        response.sendRedirect("/login.html");
        return false;
    }
}
