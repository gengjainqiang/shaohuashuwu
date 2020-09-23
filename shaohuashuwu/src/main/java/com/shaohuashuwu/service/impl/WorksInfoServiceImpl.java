package com.shaohuashuwu.service.impl;

import com.shaohuashuwu.dao.WorksInfoDao;
import com.shaohuashuwu.domain.WorksInfo;
import com.shaohuashuwu.service.WorksInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作品信息实现类
 */

//Service作用：将事务交给spring处理
@Service("worksInfoService")
public class WorksInfoServiceImpl implements WorksInfoService {

    @Autowired
    private WorksInfoDao worksinfoDao;

    /**
     * 新建作品
     */
    public  int  insertworks_info(WorksInfo worksinfo){
        System.out.println("业务层，添加新作品");
        int sureorno = worksinfoDao.insertworks_info(worksinfo);
        System.out.println("是否受到影响："+sureorno);

        return sureorno;
    }

    /**
     * 判断用户输入作品作品表是否已经存在
     * @param work_name
     * @return
     */
    @Override
    public Boolean isWorksinfo(String work_name) {
        int work_id = worksinfoDao.selectWorksinfobywork_name(work_name);
        System.out.println("输出内容：--"+work_id);
        if(work_id != 0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * 下架作品
     * @param work_id
     * @return
     */
    @Override
    public Boolean deleteworksbyId(int work_id) {
        int result = worksinfoDao.deleteworksbyId(work_id);
        System.out.println("输出内容：--"+result);
        if(result != 0){
            return true;
        }else {
            return false;
        }

    }

    /**
     * 修改作品信息
     */
    @Override
    public Boolean updateWorksbyId(WorksInfo worksinfo)  {
        System.out.println("修改了--");
        int result = worksinfoDao.updateWorksbyId(worksinfo);
        System.out.println("修改了--"+result);
        if (result!=0){
            return true;
        }else {
            return false;
        }

    }




































    @Override
    public void test2(WorksInfo worksinfo) {
        System.out.println("业务层，test");
        worksinfoDao.test2(worksinfo);
    }

    @Override
    public void test3(WorksInfo worksinfo) {
        System.out.println("业务层，test");
        worksinfoDao.test3(worksinfo);
    }


}
