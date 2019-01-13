package com.pukamoe.mp.dairy.agent.entity;

import java.util.Date;

/**
 * @Author: pukamoe
 * @Date: 2019/1/10 上午12:07
 */
public class DiaryEntity {
    //日记创建时间
    private Date createTime;
    //日记更改时间
    private Date updateTime;
    //日记编号
    private int id;
    //日记创建人编号
    private int userId;
    //日记标题
    private String diaryTitle;
    //日记内容
    private String diaryContext;
    //日记字数
    private int dairyLength;
    //是否是星标日记
    private boolean isStarred;
    //是否是上锁日记
    private boolean isLocked;
    //是否是秘密日记
    private boolean isSecret;
    //秘密日记的谜底
    private String secretAnswer;

    private boolean isDeleted;

    /**
     * 笑脸指数：
     * 0 =>  unknown
     * 1 =>  :(  sad
     * 2 =>  :|  bored
     * 3 =>  :)  smile
     * 4 =>  X)  wink
     */
    private int faceIndex;
    /**
     * 天气指数
     * 0 => unknown
     * 1 => ❄  snowy️
     * 2 => 🌧 rainy
     * 3 => ☁️ cloudy
     * 4 => ☀️ sunny
     */
    private int weatherIndex;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle;
    }

    public String getDiaryContext() {
        return diaryContext;
    }

    public void setDiaryContext(String diaryContext) {
        this.diaryContext = diaryContext;
    }

    public int getDairyLength() {
        return dairyLength;
    }

    public void setDairyLength(int dairyLength) {
        this.dairyLength = dairyLength;
    }

    public int getFaceIndex() {
        return faceIndex;
    }

    public void setFaceIndex(int faceIndex) {
        this.faceIndex = faceIndex;
    }

    public int getWeatherIndex() {
        return weatherIndex;
    }

    public void setWeatherIndex(int weatherIndex) {
        this.weatherIndex = weatherIndex;
    }

    public boolean isStarred() {
        return isStarred;
    }

    public void setStarred(boolean starred) {
        isStarred = starred;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isSecret() {
        return isSecret;
    }

    public void setSecret(boolean secret) {
        isSecret = secret;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }
}
