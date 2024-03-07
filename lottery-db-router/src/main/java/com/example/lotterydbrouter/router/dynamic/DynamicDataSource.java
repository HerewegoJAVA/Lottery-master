package com.example.lotterydbrouter.router.dynamic;

import com.example.lotterydbrouter.router.DBContextHolder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;



/**
 * @description:动态数据源获取，每当切换数据源，都要从这个里面进行获取
 * @author：1.9的阿云
 * @date: 2023/12/8
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Value("${mini-db-router.jdbc.datasource.default}")
    private String defaultDataSource;

    @Override
    protected Object determineCurrentLookupKey() {
        if (null == DBContextHolder.getDBKey()) {
            return defaultDataSource;
        } else {
            return "db" + DBContextHolder.getDBKey();
        }
    }

}
