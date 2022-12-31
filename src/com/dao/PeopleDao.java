package com.dao;

import com.model.People;
import com.model.User;
import com.util.JdbcUtil;
import com.util.StringUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 党员信息Dao类
 * @auther Embrace
 */
public class PeopleDao {


    Connection con = null;
    PreparedStatement pstmt = null;

    /**
     * 增加党员信息
     * @param con
     * @param people
     * @return
     * @throws SQLException
     */
    public int add(Connection con , People people) throws SQLException {
        String sql = "insert into `information` values(?,?,?,?,?,?,?,?,?,?,?,?,null,null)";
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, String.valueOf(people.getId()));
            pstmt.setString(2,people.getName() );
            pstmt.setString(3,people.getGender());
            pstmt.setString(4, people.getDate());
            pstmt.setString(5, people.getDegree());
            pstmt.setString(6, people.getHome());
            pstmt.setString(7,people.get职务职称());
            pstmt.setString(8,people.get入党时间());
            pstmt.setString(9,people.get党内职务());
            pstmt.setString(10,people.get身份证号());
            pstmt.setString(11,people.get政治面貌());
            pstmt.setString(12,people.get组织名称());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt.executeUpdate();
    }

    /**
     * 列举党员信息
     * @param con
     * @param people
     * @return
     * @throws Exception
     */
    public ResultSet list(Connection con,People people) throws Exception{
        StringBuffer sb = new StringBuffer("select * from information");
        if(people.getName() != null){//StringUtil.isNotEmpty(people.getName())
            sb.append(" and 姓名 like '%"+people.getName()+"%'" );
        }
        pstmt = con.prepareStatement(sb.toString().replace("and","where"));
        return pstmt.executeQuery();
    }
    /**
     * 删除党员信息
     * @param con
     * @param id
     * @return
     * @throws Exception
     */
    public  int delete(Connection con,String id)throws Exception{
        try {
            String sql = "delete from information where id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt.executeUpdate();
    }

    /**
     * 更新信息
     * @param con
     * @param people
     * @return
     * @throws Exception
     */
    public int update(Connection con,People people)throws Exception{
        String sql = "update information set 姓名 = ?,性别 = ?,出生日期 = ?,学历学位 = ?,籍贯 = ?,职务职称 = ?,入党时间 = ?" +
                ",党内职务 = ?,身份证号 = ?,政治面貌 = ?,组织名称 = ? where id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, people.getName());
        pstmt.setString(2, people.getGender());
        pstmt.setString(3, people.getDate());
        pstmt.setString(4, people.getDegree());
        pstmt.setString(5, people.getHome());
        pstmt.setString(6,people.get职务职称());
        pstmt.setString(7,people.get入党时间());
        pstmt.setString(8,people.get党内职务());
        pstmt.setString(9,people.get身份证号());
        pstmt.setString(10,people.get政治面貌());
        pstmt.setString(11,people.get组织名称());
        pstmt.setInt(12, people.getId());
        return pstmt.executeUpdate();
    }

    /**
     * 积极分子发展为预备党员
     * @param con
     * @param people
     * @return
     * @throws Exception
     */
    public int update1(Connection con,People people)throws Exception{
        String sql = "update information set 政治面貌 = '预备党员' where 姓名 = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, people.getName());

        return pstmt.executeUpdate();
    }

    /**
     * 预备党员发展成为党员
     * @param con
     * @param people
     * @return
     * @throws SQLException
     */
    public int update2(Connection con,People people) throws SQLException {
        String sql = "update information set 政治面貌 = '党员' where 姓名 = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, people.getName());

        return pstmt.executeUpdate();
    }

    /**
     * 共青团员发展成为积极分子
     * @param con
     * @param people
     * @return
     * @throws Exception
     */
    public int update3(Connection con,People people)throws Exception{
        String sql = "update information set 政治面貌 = '积极分子' where 姓名 = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, people.getName());

        return pstmt.executeUpdate();
    }

    public int update4(Connection con,People people)throws Exception{
        String sql = "update information set 政治面貌 = '共青团员' where 姓名 = ?";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, people.getName());

        return pstmt.executeUpdate();
    }
}
