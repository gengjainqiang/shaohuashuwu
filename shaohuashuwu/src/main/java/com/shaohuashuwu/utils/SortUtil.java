package com.shaohuashuwu.utils;

import com.shaohuashuwu.domain.Account;
import com.shaohuashuwu.domain.WorksInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@Service("sortUtil")
public class SortUtil {


    //依据推荐票排序
    public List<Account> sortbbyAllrecommend(List list) {


        System.out.println("排序前---------" + list + "\n");
        Collections.sort(list, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                if (o1.getMoney() > o2.getMoney()) {
                    return 1;
                } else if (o1.getMoney() < o2.getMoney()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

//
//        List<Account> accounts = new ArrayList<Account>();
//
//        double money[] = new double [list.size()];
//        for(int i = 0;i < list.size();i++){
//            money[i] = ((Account)list.get(i)).getMoney();
//        }
//        sort(money);
//        for (int i =0;i < money.length;i++){
//            for (int j = 0;j< list.size();j++){
//                if(money[i] == ((Account)list.get(j)).getMoney()){
//                    accounts.add((Account)list.get(j));
//                    list.remove(j);
//                    break;
//                }
//            }
//            for(int i1 = 0; i1 < accounts.size(); i1++){
//                Account p = (Account)accounts.get(i1);
//                System.out.println(p.getName()+"  ："+p.getMoney());
//            }
//        }
//        System.out.println("排序后---"+list);
        return list;
    }
}
//    public static  void  sort(double[] values){
//        double temp;
//        int j = 0;
//        for (int i = 1;i < values.length;i++){
//            if(values[i] < values[i-1]){
//                temp = values[i];
//                //数据往后移
//                for(j = i-1;j > 0 && temp<values[j];j--){
//                    values[j+1] = values[j];
//                }
//                //将数据插入到j+1位置
//                values[j+1] = temp;
//                System.out.println("");
//            }
//        }
//    }
//}
