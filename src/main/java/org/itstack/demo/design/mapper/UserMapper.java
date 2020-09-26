package org.itstack.demo.design.mapper;

import org.itstack.demo.design.agent.Select;

public interface UserMapper {
    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
