package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @description: 奖品信息表DAO
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Mapper
public interface IAwardDao {

    /**
     * 查询奖品信息
     *
     * @param awardId 奖品ID
     * @return        奖品信息
     */
    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     *
     * @param list 奖品配置
     */
    void insertList(List<Award> list);

}
