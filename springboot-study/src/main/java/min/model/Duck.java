package min.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhaomin
 * @date 2020/6/22 10:04
 */
@Setter
@Getter
public class Duck {
    private String username;
    private Integer age;

    public Duck(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
