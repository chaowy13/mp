package com.pukamoe.mp.user.agent.dao;

import com.pukamoe.mp.user.agent.entity.UserInfoEntity;

/**
 * @Author: pukamoe
 * @Date: 2019/1/11 上午1:12
 */
public interface IUserInfoDAO {

    UserInfoEntity getUserInfo(UserInfoEntity userInfoEntity)throws Exception;

    long insertUserInfo(UserInfoEntity userInfoEntity)throws Exception;

    long updateUserInfo(UserInfoEntity userInfoEntity)throws Exception;
}
