package com.wangtingzheng.myorm.test;

import com.wangtingzheng.myorm.annotation.OrmDatabase;
import com.wangtingzheng.myorm.annotation.OrmTable;
import com.wangtingzheng.myorm.enums.DatabaseTypeEnum;

/**
 * @author WangTingZheng
 * @date 2020/7/8 9:44
 * @features
 */
@OrmDatabase(type = DatabaseTypeEnum.MYSQL)
public class MyDatabase {
    @OrmTable()
    public MyTable myTable;
}
