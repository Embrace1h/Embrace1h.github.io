package com.dao;

import com.model.Organization;
import com.model.People;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationDao {
    Connection con = null;
    PreparedStatement pstmt = null;

    /**
     * 增加
     * @param con
     * @param organization
     * @return
     * @throws SQLException
     */
    public int add(Connection con , Organization organization) throws SQLException {
        String sql = "insert into `organization` values(null,?,?,?,?,?)";
        try {//组织名称,组织编号,地址,支部书记,委员
            pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, String.valueOf(organization.getId()));
            pstmt.setString(1,organization.get组织名称());
            pstmt.setString(2,organization.get组织编号());
            pstmt.setString(3,organization.get地址());
            pstmt.setString(4,organization.get支部书记());
            pstmt.setString(5,organization.get委员());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt.executeUpdate();
    }

    /**
     * 查出所有信息
     * @param con
     * @param organization
     * @return
     * @throws Exception
     */
    public ResultSet list(Connection con, Organization organization) throws Exception{
        StringBuffer sb = new StringBuffer("select * from organization");
        if(organization.get组织名称() != null){//StringUtil.isNotEmpty(organization.get组织名称())
            sb.append(" and 组织名称 like '%"+organization.get组织名称()+"%'" );
        }
        pstmt = con.prepareStatement(sb.toString().replace("and","where"));
        return pstmt.executeQuery();
    }

    /**
     * 删除
     * @param con
     * @param id
     * @return
     * @throws Exception
     */
    public  int delete(Connection con,String id)throws Exception{
//        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            String sql = "delete from organization where id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1,id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pstmt.executeUpdate();
    }

    /**
     * 更新
     * @param con
     * @param organization
     * @return
     * @throws Exception
     */
    public int update(Connection con,Organization organization)throws Exception{
        String sql = "update organization set 组织名称 = ?,组织编号 = ?,地址 = ?,支部书记 = ?,委员 = ? where 编号 = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, organization.get组织名称());
        pstmt.setString(2, organization.get组织编号());
        pstmt.setString(3, organization.get地址());
        pstmt.setString(4, organization.get支部书记());
        pstmt.setString(5, organization.get委员());
        pstmt.setInt(6, organization.getId());
        return pstmt.executeUpdate();
    }
}
