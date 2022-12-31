/*
 * Created by JFormDesigner on Tue Jun 14 20:12:11 CST 2022
 */

package com.window;

import com.view.TCPSerrverChat;
import com.view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author 23
 */
public class MainFrm1 extends JFrame {
    public MainFrm1() {
        initComponents();
        this.setVisible(true);
        this.setLocation(0,0);
        this.setSize(850,800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * 添加党员 按钮
     * @param e
     */
    private void menuItem3ActionPerformed(ActionEvent e) {
        PeopleInterFrm1 peopleInterFrm1 = new PeopleInterFrm1();
        peopleInterFrm1.setVisible(true);
        table.add(peopleInterFrm1);
    }

    /**
     * 所有人员信息 按钮
     * @param e
     */
    private void menuItem2ActionPerformed(ActionEvent e) {
        PeopleManageInterFrm peopleManageInterFrm = new PeopleManageInterFrm();
        peopleManageInterFrm.setVisible(true);
        table.add(peopleManageInterFrm);
    }

    /**
     * 退出登录 按钮
     * @param e
     */
    private void menuItem1ActionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null,"是否退出登录");
        //是0，否1，取消2
        if(result == 0){
            dispose();
        }
    }
    /**
     * 添加党组织 按钮
     * @param e
     */
    private void menuItem5ActionPerformed(ActionEvent e) {
        OrganizationAddInterFrm1 organizationAddInterFrm = new OrganizationAddInterFrm1();
//        organizationAddInterFrm.setVisible(true);
        table.add(organizationAddInterFrm);
    }
    /**
     * 显示所有党组织 按钮
     * @param e
     */
    private void menuItem4ActionPerformed(ActionEvent e) {
        OrganizationInterFrm organizationInterFrm = new OrganizationInterFrm();
//        organizationInterFrm.setVisible(true);
        table.add(organizationInterFrm);
    }

    /**
     * 积极分子 按钮
     * @param e
     */
    private void menuItem8ActionPerformed(ActionEvent e) {
        Jijifenzi jijifenzi = new Jijifenzi();
        jijifenzi.setVisible(true);
        table.add(jijifenzi);
    }

    /**
     * 预备党员 按钮
     * @param e
     */
    private void menuItem9ActionPerformed(ActionEvent e) {
        Yubeidangyuan yubeidangyuan = new Yubeidangyuan();
        yubeidangyuan.setVisible(true);
        table.add(yubeidangyuan);
    }
//显示问题反馈对话框
    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new TCPSerrverChat().setVisible(true);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menu2 = new JMenu();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menu3 = new JMenu();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        menu5 = new JMenu();
        menu6 = new JMenu();
        menuItem1 = new JMenuItem();
        table = new JPanel();
        panel1 = new JPanel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("\u4eba\u5458\u4fe1\u606f\u7ba1\u7406");

                //---- menuItem2 ----
                menuItem2.setText("\u6240\u6709\u4eba\u5458\u4fe1\u606f");
                menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
                menu1.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("\u6dfb\u52a0\u515a\u5458");
                menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
                menu1.add(menuItem3);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("\u515a\u7ec4\u7ec7\u7ba1\u7406");

                //---- menuItem4 ----
                menuItem4.setText("\u515a\u7ec4\u7ec7\u4fe1\u606f");
                menuItem4.addActionListener(e -> {
			menuItem4ActionPerformed(e);
			menuItem4ActionPerformed(e);
		});
                menu2.add(menuItem4);

                //---- menuItem5 ----
                menuItem5.setText("\u515a\u7ec4\u7ec7\u6dfb\u52a0");
                menuItem5.addActionListener(e -> {
			menuItem5ActionPerformed(e);
			menuItem5ActionPerformed(e);
		});
                menu2.add(menuItem5);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("\u515a\u5458\u53d1\u5c55\u7ba1\u7406");

                //---- menuItem8 ----
                menuItem8.setText("\u79ef\u6781\u5206\u5b50");
                menuItem8.addActionListener(e -> menuItem8ActionPerformed(e));
                menu3.add(menuItem8);

                //---- menuItem9 ----
                menuItem9.setText("\u9884\u5907\u515a\u5458");
                menuItem9.addActionListener(e -> menuItem9ActionPerformed(e));
                menu3.add(menuItem9);
            }
            menuBar1.add(menu3);

            //======== menu5 ========
            {
                menu5.setText("\u7591\u96be\u89e3\u7b54");
            }
            menuBar1.add(menu5);

            //======== menu6 ========
            {
                menu6.setText("\u9000\u51fa\u767b\u5f55");

                //---- menuItem1 ----
                menuItem1.setText("\u9000\u51fa\u8d26\u53f7");
                menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
                menu6.add(menuItem1);
            }
            menuBar1.add(menu6);
        }
        setJMenuBar(menuBar1);

        //======== table ========
        {

            //======== panel1 ========
            {

                //---- button1 ----
                button1.setText("\u5bf9\u8bdd\u6846");
                button1.addActionListener(e -> button1ActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(241, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                            .addGap(236, 236, 236))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(button1)
                            .addGap(0, 261, Short.MAX_VALUE))
                );
            }

            GroupLayout tableLayout = new GroupLayout(table);
            table.setLayout(tableLayout);
            tableLayout.setHorizontalGroup(
                tableLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            tableLayout.setVerticalGroup(
                tableLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(table, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(table, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenu menu2;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenu menu3;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenu menu5;
    private JMenu menu6;
    private JMenuItem menuItem1;
    private JPanel table;
    private JPanel panel1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
