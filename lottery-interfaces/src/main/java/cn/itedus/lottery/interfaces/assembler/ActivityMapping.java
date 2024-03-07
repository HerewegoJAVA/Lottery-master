package cn.itedus.lottery.interfaces.assembler;

import cn.itedus.lottery.domain.activity.model.vo.ActivityVO;
import cn.itedus.lottery.domain.strategy.model.vo.DrawAwardVO;
import cn.itedus.lottery.rpc.activity.booth.dto.AwardDTO;
import cn.itedus.lottery.rpc.activity.deploy.dto.ActivityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;


/**
 * @description:  活动对象转换配置
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ActivityMapping extends IMapping<ActivityVO, ActivityDTO>{

    @Override
    List<ActivityDTO> sourceToTarget(List<ActivityVO> var1);

}
