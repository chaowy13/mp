package com.pukamoe.mp.agent.dao;

import com.pukamoe.mp.agent.entity.DiaryEntity;
import com.pukamoe.mp.utils.DataSource;
import java.util.List;

public interface IDairyDAO {

    @DataSource("read")
    List<DiaryEntity> getDiaryList(DiaryEntity diaryEntity) throws Exception;
    @DataSource("read")
    DiaryEntity getDiary(DiaryEntity diaryEntity) throws Exception;
    @DataSource("write")
    long insertDiary(DiaryEntity diaryEntity) throws Exception;
    @DataSource("write")
    long updateDiary(DiaryEntity diaryEntity) throws Exception;
}
