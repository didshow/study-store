package com.Mapper;

import org.apache.ibatis.annotations.Mapper;
import com.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
public List<User> selectAll(@Param("start")int start,@Param("end") int end);
public Integer getCounts();


}
