package com.pukamoe.mp.agent.entity;

import com.pukamoe.mp.utils.DataSource;

import java.util.Date;

/**
 * @Author: pukamoe
 * @Date: 2019/1/11 上午12:34
 */
public class UserInfoEntity {
    //用户编号
    private int userId;
    //用户账户名
    private String userAccount;
    //用户密码
    private String userPwd;
    //用户昵称
    private String nickName;
    //用户头像url
    private String avatorUrl;
    //用户所在地
    private String region;
    //用户所在城市
    private String city;
    //用户所在省份
    private String province;
    //用户所在国家
    private String country;
    //用户性别
    private String gender;
    //用户使用语言
    private String language;
    //用户当前小程序openID
    private String openID;
    //用户微信UnionID
    private String unionID;
    //用户是否订阅日记提醒
    private boolean isSubscribed;
    //用户是否授权
    private boolean isAutherized;
    //用户注册时间
    private Date registerTime;
    //用户更新信息时间
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatorUrl() {
        return avatorUrl;
    }

    public void setAvatorUrl(String avatorUrl) {
        this.avatorUrl = avatorUrl;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getUnionID() {
        return unionID;
    }

    public void setUnionID(String unionID) {
        this.unionID = unionID;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }

    public boolean isAutherized() {
        return isAutherized;
    }

    public void setAutherized(boolean autherized) {
        isAutherized = autherized;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
