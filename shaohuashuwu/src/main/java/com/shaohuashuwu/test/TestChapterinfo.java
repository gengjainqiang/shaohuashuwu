package com.shaohuashuwu.test;


import com.shaohuashuwu.domain.ChapterInfo;
import com.shaohuashuwu.service.ChapterInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;

/**
 * 章节测试用例
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestChapterinfo {

    @Autowired
    private ChapterInfoService chapterinfoService;
    private ChapterInfo chapterinfo;

    //添加章节
    @Test
    public void testinsertChapterinfo() throws ParseException {
//        String ss="2014-07-07";
//            long date=new SimpleDateFormat("yyyy-MM-dd").parse(ss).getTime();
        chapterinfo = new ChapterInfo(1,"第一章:斗之气三段",null,2300,
                "啊啊啊啊，让我new个对象吧！","new 对象",1,0);

        Boolean result = chapterinfoService.insertChapterinfo(chapterinfo);
        System.out.println("存储结果-----"+result);
    }


}
