package com.pukamoe.mp.dairy.service;

import com.pukamoe.mp.dairy.agent.entity.DiaryEntity;

import java.util.List;

/**
 * @Author: pukamoe
 * @Date: 2019/1/12 下午8:28
 */

public interface DiaryService {
    /**
     * 获取用户日记列表
     *
     * @Param: [userId]
     */
    List<DiaryEntity> findDiaryListByUserId(int userId);


    /**
     *  获取单个任务详情
     *
     * @Param: [taskId]
     */
    DiaryEntity findDiaryById(int taskId);

    /**
     *  更改日记内容信息
     *
     * @Param: [userId, taskId, diaryTitle, dairyContext]
     */

    Long updateStatus(int userId, int taskId, String diaryTitle, String dairyContext);

}
