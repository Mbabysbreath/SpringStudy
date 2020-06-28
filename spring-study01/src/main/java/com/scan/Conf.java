package com.scan;

import com.pojo.Duck;
import com.pojo.DuckShop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaomin
 * @date 2020/6/21 21:30
 */
@Configuration
public class Conf {
    @Bean
    public Duck duck3(){
        return new Duck("333");
    }
    @Bean("duck4")
    public Duck duck444(){
        return new Duck("444");
    }
    @Bean
    public DuckShop duckShop(Duck duck5,Duck duck6){
        DuckShop duckShop=new DuckShop();
        duckShop.setName("鸭店");
        List<Duck> ducks = new ArrayList<>();
        System.out.println(duck5.getName()+" ");
        System.out.println(duck6.getName()+" ");
        ducks.add(duck5);
        ducks.add(duck6);
        duckShop.setList(ducks);
        return duckShop;
    }
}
