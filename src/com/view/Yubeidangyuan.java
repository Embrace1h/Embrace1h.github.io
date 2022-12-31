/*
 * Created by JFormDesigner on Sat Jun 18 21:58:41 CST 2022
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
public class Yubeidangyuan extends JInternalFrame {
    private PeopleDao peopleDao = new PeopleDao();
    private JTable peopleTable = new JTable();

    public Yubeidangyuan() {
        initComponents();
        this.setVisible(true);
        this.setSize(800, 600);
    }
    //查询按钮
    private void button1ActionPerformed(ActionEvent e) {
        peopleSearchActionPerformed(e);
    }
    //修改按钮
    private void button2ActionPerformed(ActionEvent e) {
        peopleUpdateActionEvent(e);
    }
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

    private void scrollPane1MousePressed(MouseEvent e) {
        // TODO add your code here
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

        //======== this ========
        setVisible(true);
        setClosable(true);
        setTitle("\u9884\u5907\u515a\u5458");
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
        label1.setText("\u9884\u5907\u515a\u5458\u59d3\u540d");

        //---- button1 ----
        button1.setText("\u67e5\u8be2");
        button1.addActionListener(e -> {
			button1ActionPerformed(e);
			button1ActionPerformed(e);
		});

        //---- label2 ----
        label2.setText("\u8bf7\u8f93\u5165\u9700\u8981\u53d1\u5c55\u6210\u4e3a\u515a\u5458\u7684\u59d3\u540d");

        //---- nameTxt ----
        nameTxt.setColumns(15);

        //---- button2 ----
        button2.setText("\u786e\u8ba4");
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(label1)
                                .addGap(43, 43, 43)
                                .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(button1))
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addComponent(button2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 650, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(label1))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addComponent(button1))
                        .addGap(32, 32, 32)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createParallelGroup()
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(label2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addComponent(button2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 440, Short.MAX_VALUE)
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private void peopleSearchActionPerformed(ActionEvent evt) {
        String s_peopleName = this.s_peopleNameTxt.getText();
        People people = new People();
        people.setName(s_peopleName);
        this.fillTable(people);
    }

    private void peopleUpdateActionEvent(ActionEvent evt) {
        String name = nameTxt.getText();
        People people = new People(name);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            int modifyNo = peopleDao.update2(con,people);
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
}
