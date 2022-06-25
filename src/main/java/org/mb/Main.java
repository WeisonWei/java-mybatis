package org.mb;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mb.domain.User;
import org.mb.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;


public class Main {
  public static void main(String[] args) throws IOException {
    InputStream inputStream = Main.class.getResourceAsStream("/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    System.out.println();

    try (SqlSession session = sqlSessionFactory.openSession()) {
      UserMapper mapper = session.getMapper(UserMapper.class);
      User user = mapper.selectByPrimaryKey(101);
      System.out.println();
    }
  }
}
