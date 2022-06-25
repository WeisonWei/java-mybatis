package org.mb.service;

import org.mb.domain.User;
import org.mb.mapper.UserMapper;

public class UserServiceImpl implements UserService {

  private UserMapper userMapper;

  @Override
  public User getById(Integer id) {
    return userMapper.selectByPrimaryKey(id);
  }

  @Override
  public int insert(Integer id) {
    User user = new User();
    return userMapper.insert(user);
  }

  @Override
  public int delete(Integer id) {
    return userMapper.deleteById(id);
  }
}
