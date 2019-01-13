package com.pukamoe.mp.diary.agent.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: pukamoe
 * @Date: 2019/1/10 上午12:07
 */
@Data
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
    private String diaryContent;
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

}
