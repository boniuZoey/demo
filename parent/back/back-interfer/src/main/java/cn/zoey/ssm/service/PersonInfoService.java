package cn.zoey.ssm.service;

import cn.zoey.ssm.model.PersonInfo;

/**
 * Description: 用户基本信息
 *
 * @author By zhangting
 * @date 2018/06/08
 */
public interface PersonInfoService {
     PersonInfo queryPersonInfoByName(String Name);
}
