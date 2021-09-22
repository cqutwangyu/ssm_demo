package com.wy.demo.mapper;

import com.wy.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    void insert(User user);

    List<User> selectAll();

    User selectById(@Param("flowId")String flowId);
}
