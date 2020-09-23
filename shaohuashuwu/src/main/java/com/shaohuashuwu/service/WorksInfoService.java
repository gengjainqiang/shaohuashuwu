package com.shaohuashuwu.service;

import com.shaohuashuwu.domain.WorksInfo;

public interface WorksInfoService {

    //添加一个新作品
    public int insertworks_info(WorksInfo work_name);

    //判断作品是否已经存在
    public Boolean isWorksinfo(String work_name);

    //根据work_id删除作品
    public Boolean deleteworksbyId(int work_id);

    //依据owrk_id修改作品信息
    public Boolean updateWorksbyId(WorksInfo worksinfo);


    //测试
    public void test2(WorksInfo worksinfo);
    //测试
    public void test3(WorksInfo worksinfo);


}
