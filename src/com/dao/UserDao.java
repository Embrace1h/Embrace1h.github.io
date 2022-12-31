package com.dao;

import com.model.People;
import com.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 用户Dao类
 * @author Embrace
 */
public class UserDao {
    /**
     * 登录验证
     * @param con
     * @param user
     * @return
     * @throws Exception
     */
  public static User login(Connection con,User user) throws Exception {
      User resultUser = null;
      String sql = "select * from `information` where userName=? and password=?";
      PreparedStatement pstmt = con.prepareStatement(sql);
      pstmt.setString(1,user.getUserName());
      pstmt.setString(2,user.getPassword());

      ResultSet rs = pstmt.executeQuery();
      if(rs.next()){
          resultUser = new User();
          resultUser.setId(rs.getInt("id"));
          resultUser.setUserName(rs.getString("userName"));
          resultUser.setPassword(rs.getString("password"));

      }
      return resultUser;
  }

    /**
     * 注册账户  新注册的账户只有姓名，账户名，密码  且默认注册账户的政治面貌是党员
     * @param con
     * @param people
     * @return
     * @throws Exception
     */
  public static boolean register(Connection con, People people) throws Exception{
      String sql = "insert into `information` values (null,?,null,null,null,null,null,null,null,null,'党员',null,?,?,100)";
      PreparedStatement pstmt = con.prepareStatement(sql);
      pstmt.setString(1,people.getName());
      pstmt.setString(2,people.getUserName());
      pstmt.setString(3,people.getPassword());
      int a = pstmt.executeUpdate();
      if(a>=1){
          return true;
      }
      else{
          return false;
      }
  }
}
