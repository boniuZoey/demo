package cn.zoey.ssm.model;

import java.io.Serializable;

/**
 * Description: 用户信息类
 *
 * @author By zhangting
 * @date 2018/06/08
 */
public class PersonInfo implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
