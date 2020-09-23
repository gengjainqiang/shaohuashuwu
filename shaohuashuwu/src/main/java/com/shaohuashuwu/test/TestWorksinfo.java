package com.shaohuashuwu.test;

import com.shaohuashuwu.domain.WorksInfo;
import com.shaohuashuwu.service.WorksInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 作品测试用例
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestWorksinfo {
    @Autowired
    private WorksInfoService worksinfoService;
    private WorksInfo worksinfo;

    //添加书籍
    @Test
    public void testInsertworks_info(){
         worksinfo = new WorksInfo("仙逆",1,"玄幻",
                "东方玄幻",1,
                "这是一个作品介绍","这是作者给读者的话");
                 worksinfoService.insertworks_info(worksinfo);
    }

    //测试依据work_name查询是否成功
    @Test
    public void testisWorksinfo(){

       Boolean work_id =  worksinfoService.isWorksinfo("仙逆");
       System.out.println("1111--"+work_id);
    }

    //测试下架作品是否成功
    @Test
    public void testdeleteworksbyId(){
        Boolean result = worksinfoService.deleteworksbyId(1);
        System.out.println("1111--"+result);
    }

    //测试修改作品信息
    @Test
    public void testupdateWorksbyId(){
        worksinfo = new WorksInfo(14,null,"凌天传说",1,
                "仙侠","都市仙侠",1,
                "这是第二个修改类","我又在做修改啊！！！");
        Boolean result = worksinfoService.updateWorksbyId(worksinfo);
        System.out.println("1111--"+result);
    }



    //测试
    @Test
    public void test2(){
        WorksInfo worksinfo = new WorksInfo("失身");
        worksinfoService.test2(worksinfo);
    }

    //测试
    @Test
    public void test3(){
        WorksInfo worksinfo = new WorksInfo("仙剑奇侠传",1);
        worksinfoService.test3(worksinfo);

    }


}
