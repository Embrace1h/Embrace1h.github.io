/*
 * Created by JFormDesigner on Thu Jun 16 21:21:08 CST 2022
 */

package com.view;

import com.dao.PeopleDao;
import com.model.People;
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
public class PeopleInterFrm1 extends JInternalFrame {
    private PeopleDao peopleDao = new PeopleDao();
    public PeopleInterFrm1() {
        initComponents();
        this.setSize(700,500);
        this.setResizable(false);
    }


    private void button2ActionPerformed(ActionEvent e) {
        resetValueActionPreformed(e);
    }

    private void button1ActionPerformed(ActionEvent e) {
        peopleAddActionPerformed(e);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        idTxt = new JTextField();
        nameTxt = new JTextField();
        genderTxt = new JTextField();
        dateTxt = new JTextField();
        homeTxt = new JTextField();
        degreeTxt = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        职务职称文本 = new JTextField();
        入党时间文本 = new JTextField();
        党内职务文本 = new JTextField();
        身份证号文本 = new JTextField();
        政治面貌文本 = new JTextField();
        组织名称文本 = new JTextField();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setTitle("\u515a\u5458\u6dfb\u52a0");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("id");

        //---- label2 ----
        label2.setText("\u59d3\u540d");

        //---- label3 ----
        label3.setText("\u6027\u522b");

        //---- label4 ----
        label4.setText("\u51fa\u751f\u65e5\u671f");

        //---- label5 ----
        label5.setText("\u5b66\u5386\u5b66\u4f4d");

        //---- label6 ----
        label6.setText("\u7c4d\u8d2f");

        //---- idTxt ----
        idTxt.setColumns(8);

        //---- nameTxt ----
        nameTxt.setColumns(10);

        //---- genderTxt ----
        genderTxt.setColumns(10);

        //---- dateTxt ----
        dateTxt.setColumns(10);

        //---- homeTxt ----
        homeTxt.setColumns(10);

        //---- degreeTxt ----
        degreeTxt.setColumns(10);

        //---- button1 ----
        button1.setText("\u6dfb\u52a0");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- label7 ----
        label7.setText("\u804c\u52a1\u804c\u79f0");

        //---- label8 ----
        label8.setText("\u5165\u515a\u65f6\u95f4");

        //---- label9 ----
        label9.setText("\u515a\u5185\u804c\u52a1");

        //---- label10 ----
        label10.setText("\u8eab\u4efd\u8bc1\u53f7");

        //---- label11 ----
        label11.setText("\u653f\u6cbb\u9762\u8c8c");

        //---- label12 ----
        label12.setText("\u7ec4\u7ec7\u540d\u79f0");

        //---- 职务职称文本 ----
        职务职称文本.setColumns(10);

        //---- 入党时间文本 ----
        入党时间文本.setColumns(10);

        //---- 党内职务文本 ----
        党内职务文本.setColumns(10);

        //---- 身份证号文本 ----
        身份证号文本.setColumns(10);

        //---- 政治面貌文本 ----
        政治面貌文本.setColumns(10);

        //---- 组织名称文本 ----
        组织名称文本.setColumns(10);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2)
                        .addComponent(label3)
                        .addComponent(label4)
                        .addComponent(label5)
                        .addComponent(label6))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(homeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(degreeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
                            .addComponent(label12)
                            .addComponent(label11)
                            .addComponent(label10))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
                            .addComponent(label9)
                            .addComponent(label7, GroupLayout.Alignment.TRAILING)
                            .addComponent(label8, GroupLayout.Alignment.TRAILING)))
                    .addGap(16, 16, 16)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(职务职称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(入党时间文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(党内职务文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(身份证号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(政治面貌文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(79, 79, 79))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(226, 226, 226)
                    .addComponent(button1)
                    .addGap(146, 146, 146)
                    .addComponent(button2)
                    .addContainerGap(177, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(职务职称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label7)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(入党时间文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label8)
                        .addComponent(label2)
                        .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(党内职务文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label9)
                        .addComponent(label3)
                        .addComponent(genderTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label10)
                        .addComponent(身份证号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4)
                        .addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label11)
                        .addComponent(政治面貌文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5)
                        .addComponent(degreeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label12)
                        .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label6)
                        .addComponent(homeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button2)
                        .addComponent(button1))
                    .addContainerGap(71, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField idTxt;
    private JTextField nameTxt;
    private JTextField genderTxt;
    private JTextField dateTxt;
    private JTextField homeTxt;
    private JTextField degreeTxt;
    private JButton button1;
    private JButton button2;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JTextField 职务职称文本;
    private JTextField 入党时间文本;
    private JTextField 党内职务文本;
    private JTextField 身份证号文本;
    private JTextField 政治面貌文本;
    private JTextField 组织名称文本;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void resetValueActionPreformed(ActionEvent evt){
        this.resetValue();
    }
    /**
     * 重置表单
     */
    private void resetValue(){
        this.idTxt.setText("");
        this.nameTxt.setText("");
        this.genderTxt.setText("");
        this.dateTxt.setText("");
        this.homeTxt.setText("");
        this.degreeTxt.setText("");
        this.职务职称文本.setText("");
        this.入党时间文本.setText("");
        this.党内职务文本.setText("");
        this.身份证号文本.setText("");
        this.政治面貌文本.setText("");
        this.组织名称文本.setText("");
    }

    /**
     * 添加党员信息
     * @param e
     */
    private void peopleAddActionPerformed(ActionEvent e){
        Connection con = null;

        String name = this.nameTxt.getText();
        String gender = this.genderTxt.getText();
        String date = this.dateTxt.getText();
        String degree = this.degreeTxt.getText();
        String home = this.homeTxt.getText();
        String 职务职称 = this.职务职称文本.getText();
        String 入党时间 = this.入党时间文本.getText();
        String 党内职务 = this.党内职务文本.getText();
        String 身份证号 = this.身份证号文本.getText();
        String 政治面貌 = this.政治面貌文本.getText();
        String 组织名称 = this.组织名称文本.getText();

        if(StringUtil.isEmpty(name)){
            JOptionPane.showMessageDialog(null,"姓名不能为空！");
        }
        try {//职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称
            People people = new People(name, gender,date,degree,home,职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称);
            con = JdbcUtil.getConnection();
            int n = peopleDao.add(con,people);
            if(n>=1){
                JOptionPane.showMessageDialog(null,"党员信息添加成功!");
                resetValue();
            }else{
                JOptionPane.showMessageDialog(null,"党员信息添加失败!");
            }
        } catch (Exception ec) {
            ec.printStackTrace();
            JOptionPane.showMessageDialog(null,"党员信息添加失败!请输入正确的日期格式！");
        }finally {
            JdbcUtil.close(null,null,con);
        }
    }
}
