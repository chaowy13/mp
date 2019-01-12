package com.pukamoe.mp.agent.dao;

import com.pukamoe.mp.agent.entity.UserInfoEntity;
import com.pukamoe.mp.utils.DataSource;

/**
 * @Author: pukamoe
 * @Date: 2019/1/11 上午1:12
 */
public interface IUserInfoDAO {
    @DataSource("read")
    UserInfoEntity getUserInfo(UserInfoEntity userInfoEntity)throws Exception;
    @DataSource("write")
    long insertUserInfo(UserInfoEntity userInfoEntity)throws Exception;
    @DataSource("write")
    long updateUserInfo(UserInfoEntity userInfoEntity)throws Exception;
}
