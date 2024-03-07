package cn.itedus.lottery.infrastructure.dao;

import cn.itedus.lottery.infrastructure.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;


/**
 * @description: 规则树配置DAO
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Mapper
public interface RuleTreeDao {

    /**
     * 规则树查询
     * @param id ID
     * @return   规则树
     */
    RuleTree queryRuleTreeByTreeId(Long id);

    /**
     * 规则树简要信息查询
     * @param treeId 规则树ID
     * @return       规则树
     */
    RuleTree queryTreeSummaryInfo(Long treeId);

}
