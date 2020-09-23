package com.shaohuashuwu.dao;

import com.shaohuashuwu.domain.WorksInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 作品信息Dao
 */

//将事务交给spring管理
@Repository
public interface WorksInfoDao {


    //添加作品信息
    @Insert("insert into works_info(work_name,user_id,work_main_label,work_vice_label,work_serial_state,work_introduct,work_other_word) values(#{work_name},#{user_id},#{work_main_label},#{work_vice_label},#{work_serial_state},#{work_introduct},#{work_other_word})")
    public int insertworks_info (WorksInfo works_info);

    //判断作品是否已经存在
    @Select("select work_id from works_info where work_name = #{worke_name}")
    public int selectWorksinfobywork_name(String work_name);


    //根据work_id删除作品
    @Delete("delete  " +
            " from works_info " +
            " where work_id = #{work_id}")
    public int deleteworksbyId(int work_id);

    //依据owrk_id修改作品信息
    @Update("update works_info" +
            " set work_name = #{work_name},user_id = #{user_id},work_main_label = #{work_main_label},work_vice_label = #{work_vice_label},work_serial_state = #{work_serial_state},work_introduct = #{work_introduct},work_other_word = #{work_other_word} " +
            " where work_id = #{work_id}")
    public int updateWorksbyId(WorksInfo worksinfo);






    //测试
    @Insert("insert into works_info(work_main_label) values(#{work_main_label})")
    public void test2 (WorksInfo works_info);

    //测试
    @Insert("insert into works_info(work_name,user_id) values(#{work_name},#{user_id})")
    public void test3 (WorksInfo works_info);

}
