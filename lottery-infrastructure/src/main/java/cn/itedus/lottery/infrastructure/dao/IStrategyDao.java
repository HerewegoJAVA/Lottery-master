package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;


/**
 * @description: 策略表DAO
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Mapper
public interface IStrategyDao {

    /**
     * 查询策略配置
     *
     * @param strategyId 策略ID
     * @return           策略配置信息
     */
    Strategy queryStrategy(Long strategyId);

    /**
     * 插入策略配置
     *
     * @param req 策略配置
     */
    void insert(Strategy req);

}
