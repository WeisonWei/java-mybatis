package org.mb.mapper;


import org.apache.ibatis.annotations.Select;
import org.mb.domain.User;

public interface UserMapper {
  int deleteById(Integer id);

  int insert(User user);

  int insertSelective(User user);

  User selectByPrimaryKey(Integer id);

  int updateByPrimaryKeySelective(User user);

  int updateByPrimaryKey(User user);

  @Select("SELECT * FROM user WHERE id = #{id}")
  User selectUser(int id);
}