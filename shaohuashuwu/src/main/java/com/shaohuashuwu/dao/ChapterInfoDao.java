package com.shaohuashuwu.dao;

import com.shaohuashuwu.domain.ChapterInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 章节dao
 */
@Repository
public interface ChapterInfoDao {

    //新建章节
    @Insert("Insert " +
            " into chapter_info " +
            " (chapter_pid,chapter_title,chapter_time,chapter_word_num,chapter_content,chapter_other_word,chapter_state,chapter_charge) " +
            " values (#{chapter_pid},#{chapter_title},#{chapter_time},#{chapter_word_num},#{chapter_content},#{chapter_other_word},#{chapter_state},#{chapter_charge})")
    public int insertChapterinfo(ChapterInfo chapterinfo);

}
