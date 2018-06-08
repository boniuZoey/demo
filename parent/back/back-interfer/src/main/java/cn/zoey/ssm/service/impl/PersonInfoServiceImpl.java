package cn.zoey.ssm.service.impl;

import cn.zoey.ssm.model.PersonInfo;
import cn.zoey.ssm.service.PersonInfoService;

/**
 * Description: 用户基本信息实现类
 *
 * @author By zhangting
 * @date 2018/06/08
 */
public class PersonInfoServiceImpl implements PersonInfoService {


    @Override
    public PersonInfo queryPersonInfoByName(String Name) {
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName(Name);
        return personInfo;
    }
}
