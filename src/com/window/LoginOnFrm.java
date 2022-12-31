/*
 * Created by JFormDesigner on Wed Jun 15 17:06:57 CST 2022
 */

package com.window;

import com.dao.UserDao;
import com.model.User;
import com.util.JdbcUtil;
import com.util.StringUtil;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Embrace
 */
public class LoginOnFrm extends JFrame {

    public static String password;

    public void setPassword(String password) {
        this.password = this.passwordTxt.getText();
    }

    public static String getPassword() {
        return password;
    }


    public LoginOnFrm() {
        initComponents();
        this.setVisible(true);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginOnFrm();
        new LoginOnFrm();
    }

    private void button1ActionPerformed(ActionEvent e) {
        loginActionPerformed(e);
    }

    /**
     * 登录 事件处理
     * @param evt
     */
    private void loginActionPerformed(ActionEvent evt){
        String userName= this.userNameTxt.getText();
        password = this.passwordTxt.getText();

        if(StringUtil.isEmpty(userName)){
            JOptionPane.showMessageDialog(null,"身份证号不能为空！");
           return;
        }
        if(StringUtil.isEmpty(password)){
            JOptionPane.showMessageDialog(null,"密码不能为空！");
            return;
        }
        User user = new User(userName,password);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            User currentUser = UserDao.login(con,user);
            if(currentUser != null){
                //登录成功进入主页面  注意区分管理员身份与用户身份
                dispose();
                if(password.equals("0001") && userName.equals("java1")){
                    new MainFrm1().setVisible(true);
                }
                else{
                    new UserPage().setVisible(true);
                }
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"用户名或密码错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 注册 事件处理
     * @param e
     */
    private void button2ActionPerformed(ActionEvent e) {
        new Register();
        this.setVisible(false);//点击注册后原来的登录界面消失，接下来的注册成功后还会有登录界面
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        userNameTxt = new JTextField();
        label3 = new JLabel();
        passwordTxt = new JTextField();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u9ad8\u6821\u515a\u52a1\u7ba1\u7406\u7cfb\u7edf");
        label1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));

        //---- label2 ----
        label2.setText("\u5e10\u53f7\uff1a");

        //---- label3 ----
        label3.setText("\u5bc6\u7801\uff1a");

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- button2 ----
        button2.setText("\u6ce8\u518c");
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3))
                            .addGap(67, 67, 67)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordTxt, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(userNameTxt, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)))
                    .addContainerGap(83, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addContainerGap(41, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField userNameTxt;
    private JLabel label3;
    private JTextField passwordTxt;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
