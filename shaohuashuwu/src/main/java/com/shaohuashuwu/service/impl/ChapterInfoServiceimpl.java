package com.shaohuashuwu.service.impl;

import com.shaohuashuwu.dao.ChapterInfoDao;
import com.shaohuashuwu.domain.ChapterInfo;
import com.shaohuashuwu.service.ChapterInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 章节业务流程层
 */
@Service("chapterInfoService")
public class ChapterInfoServiceimpl implements ChapterInfoService {

    @Autowired
    private ChapterInfoDao chapterinfoDao;

    /**
     * 作者上传小说
     * @param chapterinfo
     */
    @Override
    public Boolean insertChapterinfo(ChapterInfo chapterinfo) {
        int result = chapterinfoDao.insertChapterinfo(chapterinfo);
        if (result != 0){
            return true;
        }
        else{
            return false;
        }

    }
}
