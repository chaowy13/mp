package com.pukamoe.mp.diary.service.impl;

import com.pukamoe.mp.diary.agent.dao.IDiaryDAO;
import com.pukamoe.mp.diary.agent.entity.DiaryEntity;
import com.pukamoe.mp.diary.service.DiaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: pukamoe
 * @Date: 2019/1/12 下午10:48
 */

@Service
public class DiaryServiceImpl implements DiaryService {

    @Resource
    private IDiaryDAO diaryDAO;


    /**
     * 获取用户日记列表
     *
     * @Param: [userId]
     */
    @Override
    public List<DiaryEntity> findDiaryListByUserId(int userId) {

        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setUserId(userId);

        try {
//            return diaryDAO.getDiaryList(diaryEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     *  获取单个任务详情
     *
     * @Param: [taskId]
     */
    @Override
    public DiaryEntity findDiaryById(int taskId) {

        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setId(taskId);

        try {
//            return diaryDAO.getDiary(diaryEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    /**
     *  更改日记内容信息
     *
     * @Param: [userId, taskId, diaryTitle, dairyContext]
     */
    @Override
    public Long updateStatus(int userId, int taskId, String diaryTitle, String dairyContext){

        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setId(taskId);
        diaryEntity.setUserId(userId);
        diaryEntity.setDiaryTitle(diaryTitle);
        diaryEntity.setDiaryContext(diaryTitle);
        diaryEntity.setDairyLength(dairyContext.length());

        try {
//            return diaryDAO.updateDiary(diaryEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }



}
