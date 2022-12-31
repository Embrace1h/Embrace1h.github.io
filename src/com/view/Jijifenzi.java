/*
 * Created by JFormDesigner on Sat Jun 18 14:08:02 CST 2022
 */

package com.view;

import com.dao.PeopleDao;
import com.model.People;
import com.util.JdbcUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author 23
 */
public class Jijifenzi extends JInternalFrame {

    private PeopleDao peopleDao = new PeopleDao();
    private JTable peopleTable = new JTable();


    public Jijifenzi() {
        initComponents();
        this.setVisible(true);
        this.setSize(800, 600);

    }

    private void button1ActionPerformed(ActionEvent e) {
        peopleSearchActionPerformed(e);
    }

    private void button2ActionPerformed(ActionEvent e) {
        peopleUpdateActionEvent(e);
    }


    private void button3ActionPerformed(ActionEvent e) {
        peopleUpdate1ActionEvent(e);
    }

    private void scrollPane1MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void button4ActionPerformed(ActionEvent e) {
        peopleUpdate2ActionEvent(e);
    }

    private void initComponents() {
        fillTable(new People());
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        peopleTable = new JTable();
        label1 = new JLabel();
        s_peopleNameTxt = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();
        nameTxt = new JTextField();
        button2 = new JButton();
        label3 = new JLabel();
        name1Txt = new JTextField();
        button3 = new JButton();
        label4 = new JLabel();
        name2Txt = new JTextField();
        button4 = new JButton();

        //======== this ========
        setVisible(true);
        setTitle("\u79ef\u6781\u5206\u5b50\u4fe1\u606f");
        setClosable(true);
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    scrollPane1MousePressed(e);
                }
            });

            //---- peopleTable ----
            peopleTable.setModel(new DefaultTableModel(
                new Object[][] {
                    {"", null, null, null, null, null, null, null, null, null, null, null},
                    {null, null, null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    "\u7f16\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u51fa\u751f\u65e5\u671f", "\u5b66\u5386\u5b66\u4f4d", "\u7c4d\u8d2f", "\u804c\u52a1\u804c\u79f0", "\u5165\u515a\u65f6\u95f4", "\u515a\u5185\u804c\u52a1", "\u8eab\u4efd\u8bc1\u53f7", "\u653f\u6cbb\u9762\u8c8c", "\u7ec4\u7ec7\u540d\u79f0"
                }
            ) {
                boolean[] columnEditable = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
            scrollPane1.setViewportView(peopleTable);
        }

        //---- label1 ----
        label1.setText("\u79ef\u6781\u5206\u5b50\u59d3\u540d");

        //---- button1 ----
        button1.setText("\u67e5\u8be2");
        button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});

        //---- label2 ----
        label2.setText("\u8bf7\u8f93\u5165\u9700\u8981\u53d1\u5c55\u6210\u4e3a\u9884\u5907\u515a\u5458\u7684\u59d3\u540d");

        //---- nameTxt ----
        nameTxt.setColumns(15);

        //---- button2 ----
        button2.setText("\u786e\u8ba4");
        button2.addActionListener(e -> button2ActionPerformed(e));

        //---- label3 ----
        label3.setText("\u8bf7\u8f93\u5165\u9700\u8981\u53d1\u5c55\u6210\u4e3a\u79ef\u6781\u5206\u5b50\u7684\u59d3\u540d");

        //---- button3 ----
        button3.setText("\u786e\u8ba4");
        button3.addActionListener(e -> button3ActionPerformed(e));

        //---- label4 ----
        label4.setText("\u8bf7\u8f93\u5165\u9700\u8981\u53d1\u5c55\u6210\u4e3a\u5171\u9752\u56e2\u5458\u7684\u59d3\u540d");

        //---- button4 ----
        button4.setText("\u786e\u8ba4");
        button4.addActionListener(e -> button4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(label1)
                            .addGap(43, 43, 43)
                            .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxt, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(name1Txt, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(name2Txt, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                            .addGap(36, 36, 36)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(button2)
                                .addComponent(button3)
                                .addComponent(button4))))
                    .addContainerGap(33, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1)
                        .addComponent(label1))
                    .addGap(32, 32, 32)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(name1Txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(name2Txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4))
                    .addContainerGap(96, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JLabel label1;
    private JTextField s_peopleNameTxt;
    private JButton button1;
    private JLabel label2;
    private JTextField nameTxt;
    private JButton button2;
    private JLabel label3;
    private JTextField name1Txt;
    private JButton button3;
    private JLabel label4;
    private JTextField name2Txt;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    //填充表格 显示信息
    private void fillTable(People people) {
        DefaultTableModel dtm = (DefaultTableModel) peopleTable.getModel();
        dtm.setRowCount(0);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            ResultSet rs = peopleDao.list(con, people);
            while (rs.next()) {//职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称
                Vector v = new Vector();
                v.add(rs.getString("id"));
                v.add(rs.getString("姓名"));
                v.add(rs.getString("性别"));
                v.add(rs.getString("出生日期"));
                v.add(rs.getString("学历学位"));
                v.add(rs.getString("籍贯"));
                v.add(rs.getString("职务职称"));
                v.add(rs.getString("入党时间"));
                v.add(rs.getString("党内职务"));
                v.add(rs.getString("身份证号"));
                v.add(rs.getString("政治面貌"));
                v.add(rs.getString("组织名称"));
                if (rs.getString("政治面貌") == "积极分子") {//.equals("积极分子")
                    dtm.addRow(v);//只有积极分子才能显示
                }
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //查询信息
    private void peopleSearchActionPerformed(ActionEvent evt) {
        String s_peopleName = this.s_peopleNameTxt.getText();
        People people = new People();
        people.setName(s_peopleName);
        this.fillTable(people);
    }
    //积极分子发展为预备党员
    private void peopleUpdateActionEvent(ActionEvent evt) {
        String name = nameTxt.getText();
        People people = new People(name);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            int modifyNo = peopleDao.update1(con,people);
            if (modifyNo >= 1) {
                JOptionPane.showMessageDialog(null, "修改成功！");
                this.nameTxt.setText("");
                this.fillTable(new People());
            } else {
                JOptionPane.showMessageDialog(null, "修改失败！");
            }
            fillTable(new People());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null,null,con);
        }
    }
    //共青团员发展为积极分子
    private void peopleUpdate1ActionEvent(ActionEvent evt) {
        String name1 = name1Txt.getText();
        People people = new People(name1);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            int modifyNo = peopleDao.update3(con,people);
            if (modifyNo >= 1) {
                JOptionPane.showMessageDialog(null, "修改成功！");
                this.name1Txt.setText("");
                this.fillTable(new People());
            } else {
                JOptionPane.showMessageDialog(null, "修改失败！");
            }
            fillTable(new People());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null,null,con);
        }
    }
    //群众发展为共青团员
    private void peopleUpdate2ActionEvent(ActionEvent evt) {
        String name2 = name2Txt.getText();
        People people = new People(name2);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            int modifyNo = peopleDao.update4(con,people);
            if (modifyNo >= 1) {
                JOptionPane.showMessageDialog(null, "修改成功！");
                this.name2Txt.setText("");
                this.fillTable(new People());
            } else {
                JOptionPane.showMessageDialog(null, "修改失败！");
            }
            fillTable(new People());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null,null,con);
        }
    }
}
