/*
 * Created by JFormDesigner on Wed Jun 15 00:28:23 CST 2022
 */

package com.window;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;

import com.dao.UserDao;
import com.model.People;
import com.model.User;
import com.util.JdbcUtil;
import com.util.StringUtil;
import net.miginfocom.swing.*;

/**
 * @author 23
 */
public class Register extends JFrame {
    public Register() {
        initComponents();
        this.setVisible(true);
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        label3 = new JLabel();
        nameTxt = new JTextField();
        label1 = new JLabel();
        userNameTxt = new JTextField();
        label2 = new JLabel();
        passwordTxt = new JTextField();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets 0,hidemode 3",
            // columns
            "[grow,fill]",
            // rows
            "[grow,fill]"));

        //======== panel1 ========
        {
            panel1.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label3 ----
            label3.setText("\u59d3\u540d");
            panel1.add(label3, "cell 1 1");
            panel1.add(nameTxt, "cell 2 1 3 1");

            //---- label1 ----
            label1.setText("\u8d26\u53f7");
            panel1.add(label1, "cell 1 2");
            panel1.add(userNameTxt, "cell 2 2 3 1");

            //---- label2 ----
            label2.setText("\u5bc6\u7801");
            panel1.add(label2, "cell 1 3");
            panel1.add(passwordTxt, "cell 2 3 3 1");

            //---- button1 ----
            button1.setText("\u6ce8\u518c");
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1, "cell 2 4");
        }
        contentPane.add(panel1, "cell 0 0");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JLabel label3;
    private JTextField nameTxt;
    private JLabel label1;
    private JTextField userNameTxt;
    private JLabel label2;
    private JTextField passwordTxt;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    /**
     * 注册按钮//注释
     * @param e
     */
    private void button1ActionPerformed(ActionEvent e) {
        //用户输入身份证号等信息后才可以注册
        //显示注册成功的窗口，窗口关闭后跳出登录界面
        String userName= this.userNameTxt.getText();
        String password = this.passwordTxt.getText();
        String name = this.nameTxt.getText();
        if(StringUtil.isEmpty(userName)){
            JOptionPane.showMessageDialog(null,"账号不能为空！");
            return;
        }
        if(StringUtil.isEmpty(password)){
            JOptionPane.showMessageDialog(null,"密码不能为空！");
            return;
        }
        Connection con = null;
        try {
//            User user = new User(userName,password);
            People people = new People(name,userName,password);
            con = JdbcUtil.getConnection();
            if(UserDao.register(con,people)){
                new LoginOnFrm();
            }
            else{
                JOptionPane.showMessageDialog(null,"注册失败！");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"注册成功！");
        this.setVisible(false);//注册成功后，注册窗口消失
    }
}
