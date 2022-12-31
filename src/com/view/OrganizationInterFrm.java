/*
 * Created by JFormDesigner on Sat Jun 18 20:50:06 CST 2022
 */

package com.view;

import java.awt.event.*;
import com.dao.OrganizationDao;
import com.model.Organization;
import com.model.People;
import com.util.JdbcUtil;
import com.util.StringUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author 23
 */
public class OrganizationInterFrm extends JInternalFrame {
    private JTable organizationTable = new JTable();
    private OrganizationDao organizationDao = new OrganizationDao();
    private Connection con = null;

    public OrganizationInterFrm() {
        initComponents();
        this.setVisible(true);
        this.setSize(800, 600);
    }

    /**
     * 查询 按钮
     * @param e
     */
    private void button1ActionPerformed(ActionEvent e) {
        organizationSearchActionPerformed(e);
    }



    private void initComponents() {
        this.fillTable(new Organization());
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        organizationTable = new JTable();
        label1 = new JLabel();
        s_organizationNameTxt = new JTextField();
        button1 = new JButton();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setTitle("\u515a\u7ec4\u7ec7\u4fe1\u606f");
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                }
            });

            //---- organizationTable ----
            organizationTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null},
                    {null, null, null, null, null, null},
                },
                new String[] {
                    "\u7f16\u53f7", "\u7ec4\u7ec7\u540d\u79f0", "\u7ec4\u7ec7\u7f16\u53f7", "\u5730\u5740(\u6709/\u65e0)", "\u652f\u90e8\u4e66\u8bb0", "\u59d4\u5458"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane1.setViewportView(organizationTable);
        }

        //---- label1 ----
        label1.setText("\u7ec4\u7ec7\u540d\u79f0");

        //---- s_organizationNameTxt ----
        s_organizationNameTxt.setColumns(10);

        //---- button1 ----
        button1.setText("\u67e5\u8be2");
        button1.addActionListener(e -> button1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addComponent(label1)
                            .addGap(35, 35, 35)
                            .addComponent(s_organizationNameTxt, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                            .addGap(94, 94, 94)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(s_organizationNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JLabel label1;
    private JTextField s_organizationNameTxt;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    /**
     * 填充表格
     * @param organization
     */
    private void fillTable(Organization organization) {
        DefaultTableModel dtm = (DefaultTableModel) organizationTable.getModel();
        dtm.setRowCount(0);
//        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            ResultSet rs = organizationDao.list(con, organization);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("编号"));
                v.add(rs.getString("组织名称"));
                v.add(rs.getString("组织编号"));
                v.add(rs.getString("地址"));
                v.add(rs.getString("支部书记"));
                v.add(rs.getString("委员"));
//                if(rs.getString("政治面貌").equals("党员")){
//                    dtm.addRow(v);//只有党员才能显示
//                }
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null, null, con);
        }
    }


    /**
     * 查询 党组织信息
     * @param evt
     */
    private void organizationSearchActionPerformed(ActionEvent evt) {
        String s_organizationName = this.s_organizationNameTxt.getText();
        Organization organization = new Organization();
        organization.set组织名称(s_organizationName);
        this.fillTable(organization);
    }

}
