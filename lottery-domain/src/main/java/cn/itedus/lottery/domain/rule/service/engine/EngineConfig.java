package cn.itedus.lottery.domain.rule.service.engine;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.domain.rule.service.logic.LogicFilter;
import cn.itedus.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import cn.itedus.lottery.domain.rule.service.logic.impl.UserGenderFilter;
import jdk.nashorn.internal.ir.annotations.Reference;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @description:规则配置
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;
    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }

}
