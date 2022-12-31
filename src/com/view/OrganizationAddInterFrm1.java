/*
 * Created by JFormDesigner on Sat Jun 18 23:06:55 CST 2022
 */

package com.view;

import com.dao.OrganizationDao;
import com.dao.PeopleDao;
import com.model.Organization;
import com.util.JdbcUtil;
import com.util.StringUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 23
 */
public class OrganizationAddInterFrm1 extends JInternalFrame {
    private OrganizationDao organizationDao = new OrganizationDao();
    private Connection con = null;

    public OrganizationAddInterFrm1() {
        initComponents();
        this.setVisible(true);
        this.setSize(500,500);
    }

    /**
     * 添加按钮
     * @param e
     */
    private void button1ActionPerformed(ActionEvent e) {
        organizationAddActionPerformed(e);
    }

    /**
     * 重置按钮
     * @param e
     */
    private void button2ActionPerformed(ActionEvent e) {
        resetValue();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        有按钮 = new JRadioButton();
        无按钮 = new JRadioButton();
        组织名称文本 = new JTextField();
        支部书记文本 = new JTextField();
        委员文本 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        组织编号文本 = new JTextField();
        label6 = new JLabel();
        编号文本 = new JTextField();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setTitle("\u515a\u7ec4\u7ec7\u6dfb\u52a0");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7ec4\u7ec7\u540d\u79f0");

        //---- label2 ----
        label2.setText("\u7ec4\u7ec7\u7f16\u53f7");

        //---- label3 ----
        label3.setText("\u5730\u5740");

        //---- label4 ----
        label4.setText("\u652f\u90e8\u4e66\u8bb0");

        //---- label5 ----
        label5.setText("\u59d4\u5458");

        //---- 有按钮 ----
        有按钮.setText("\u6709");

        //---- 无按钮 ----
        无按钮.setText("\u65e0");
        无按钮.setSelected(true);

        //---- 组织名称文本 ----
        组织名称文本.setColumns(10);

        //---- 支部书记文本 ----
        支部书记文本.setColumns(10);

        //---- 委员文本 ----
        委员文本.setColumns(10);

        //---- button1 ----
        button1.setText("\u6dfb\u52a0");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- 组织编号文本 ----
        组织编号文本.setColumns(10);

        //---- label6 ----
        label6.setText("\u7f16\u53f7");

        //---- 编号文本 ----
        编号文本.setColumns(10);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(42, 42, 42)
                                .addComponent(编号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(18, 18, 18)
                                .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(18, 18, 18)
                                .addComponent(组织编号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(42, 42, 42)
                                .addComponent(有按钮)
                                .addGap(26, 26, 26)
                                .addComponent(无按钮))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(18, 18, 18)
                                .addComponent(支部书记文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(36, 36, 36)
                                .addComponent(委员文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(button1)
                                .addGap(96, 96, 96)
                                .addComponent(button2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 450, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(label6))
                            .addComponent(编号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label1))
                            .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label2))
                            .addComponent(组织编号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(label3))
                            .addComponent(有按钮)
                            .addComponent(无按钮))
                        .addGap(12, 12, 12)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label4))
                            .addComponent(支部书记文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label5))
                            .addComponent(委员文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addComponent(button1)
                            .addComponent(button2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 335, Short.MAX_VALUE)
        );

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(有按钮);
        buttonGroup1.add(无按钮);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JRadioButton 有按钮;
    private JRadioButton 无按钮;
    private JTextField 组织名称文本;
    private JTextField 支部书记文本;
    private JTextField 委员文本;
    private JButton button1;
    private JButton button2;
    private JTextField 组织编号文本;
    private JLabel label6;
    private JTextField 编号文本;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    /**
     * 党组织添加事件
     * @param evt
     */
    private void organizationAddActionPerformed(ActionEvent evt){
        String 编号 = this.编号文本.getText();
        String 组织名称 = this.组织名称文本.getText();
        String 组织编号 = this.组织编号文本.getText();
        String 支部书记 = this.支部书记文本.getText();
        String 委员 = this.委员文本.getText();

        if(StringUtil.isEmpty(组织名称)){
            JOptionPane.showMessageDialog(null,"组织名称不能为空！");
            if(StringUtil.isEmpty(组织编号)){
                JOptionPane.showMessageDialog(null,"组织编号不能为空！");
            }
        }

        String 地址 = "";
        if(无按钮.isSelected()){
            地址 = "无";
        }else if (有按钮.isSelected()){
            地址 = "有";
        }

        Organization organization = new Organization(组织名称,组织编号, 地址, 支部书记, 委员);

        try {
            con = JdbcUtil.getConnection();
            int addNo = organizationDao.add(con,organization);
            if(addNo >= 1){
                JOptionPane.showMessageDialog(null,"党组织信息添加成功");
                resetValue();
                return;
            }else{
                JOptionPane.showMessageDialog(null,"党组织信息添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JdbcUtil.close(null,null,con);
        }
    }

    //将所有文本域置空
    private void resetValue() {
        this.编号文本.setText("");
        this.组织名称文本.setText("");
        this.组织编号文本.setText("");
        this.无按钮.setSelected(true);
        this.支部书记文本.setText("");
        this.委员文本.setText("");
    }
}
