package com.example.lotterydbrouter.router;

/**
 * @description:数据源基础配置
 * @author：1.9的阿云
 * @date: 2023/12/8
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
