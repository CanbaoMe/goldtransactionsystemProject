package com.czb.Mapper;

import com.czb.Model.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String idCard);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String idCard);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}