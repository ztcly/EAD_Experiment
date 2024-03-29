package com.grouppdzs.shop.DAO;

import com.grouppdzs.shop.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(String id);
    String selectByName(String name);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}