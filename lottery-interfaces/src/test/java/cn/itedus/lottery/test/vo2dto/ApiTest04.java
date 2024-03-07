package cn.itedus.lottery.test.vo2dto;

import cn.itedus.lottery.test.vo2dto.ccc.User;


/**
 * @description:Redis 继承对象转换
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public class ApiTest04 {

    public void test_vo2dto(User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserNickName(user.getUserNickName());
        userDTO.setUserHead(user.getUserHead());
        userDTO.setPage(user.getPage());
        userDTO.setRows(user.getRows());


    }

}
