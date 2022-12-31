/*
 * Created by JFormDesigner on Tue Jun 14 14:38:46 CST 2022
 */

package com.window;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;

import com.view.TCPClientChat;
import com.util.JdbcUtil;
import net.miginfocom.swing.*;

/**
 * @author 23
 */


public class UserPage extends JFrame {
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs;

    public UserPage() {
        initComponents();
        this.setVisible(true);
        this.setSize(750,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UserPage();
    }
    /**
     * 退出登录 按钮
     * @param e
     */
    private void button1ActionPerformed(ActionEvent e) {
        int result = JOptionPane.showConfirmDialog(null,"是否退出登录");
//      //是0，否1，取消2
        if(result == 0){
            dispose();
        }
    }

    /**
     * 缴费 OK 按钮
     * @param e
     */
    private void button3ActionPerformed(ActionEvent e) {
            //OK按钮  实现账户余额的减少
            String money = this.MoneyTxt.getText();
            String name = null;
            try {
                con = JdbcUtil.getConnection();
                String password = LoginOnFrm.getPassword();
                String s = "select 姓名 from information where password = ?";
                pstmt = con.prepareStatement(s);
                pstmt.setString(1,password);
                ResultSet rs = pstmt.executeQuery();
                while(rs.next()){
                    name = rs.getString("姓名");
                }
                String sql = "update information set balance = balance - ? where 姓名 = ?";
                pstmt = con.prepareStatement(sql);
                pstmt.setString(1,money);
                pstmt.setString(2,name);

                int i = pstmt.executeUpdate();
                if(i>0){
                    JOptionPane.showMessageDialog(null,"缴费成功");
                    this.MoneyTxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"缴费失败");
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                JdbcUtil.close(null,pstmt,con);
            }
        }

    /**
     * 点击panel空白处 显示个人信息
     * @param e
     */
    private void tabbedPane12MouseClicked(MouseEvent e) {
            try {
                String password = LoginOnFrm.getPassword();//获取登录界面密码
//                System.out.println("password=" + password);//输出密码是否正确
                con = JdbcUtil.getConnection();
                pstmt = con.prepareStatement("select * from information where password = ?");
                pstmt.setString(1,password);
                rs = pstmt.executeQuery();

                while(rs.next()){
                    idTxt3.setText(rs.getString("id"));
                    姓名Txt4.setText(rs.getString("姓名"));
                    性别Txt4.setText(rs.getString("性别"));
                    出生日期Txt3.setText(rs.getString("出生日期"));
                    学历学位Txt3.setText(rs.getString("学历学位"));
                    籍贯Txt3.setText(rs.getString("籍贯"));
                    职务职称Txt3.setText(rs.getString("职务职称"));
                    入党时间Txt4.setText(rs.getString("入党时间"));
                    党内职务Txt3.setText(rs.getString("党内职务"));
                    身份证号Txt4.setText(rs.getString("身份证号"));
                    政治面貌Txt4.setText(rs.getString("政治面貌"));
                    组织名称Txt3.setText(rs.getString("组织名称"));
                    balanceTxt.setText(rs.getString("balance"));
                }
                return;

            } catch (Exception exception) {
                exception.printStackTrace();
            }finally {
                JdbcUtil.close(rs,pstmt,con);
            }
        }

    //发送按钮 不会实现
    private void button2MouseClicked(MouseEvent e) {
    }

    private void tabbedPane10MouseClicked(MouseEvent e) {
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        new TCPClientChat().setVisible(true);
    }

    private void button4ActionPerformed(ActionEvent e) {
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        tabbedPane1 = new JTabbedPane();
        tabbedPane12 = new JTabbedPane();
        panel9 = new JPanel();
        label45 = new JLabel();
        idTxt3 = new JTextField();
        label46 = new JLabel();
        职务职称Txt3 = new JTextField();
        label47 = new JLabel();
        姓名Txt4 = new JTextField();
        label48 = new JLabel();
        入党时间Txt4 = new JTextField();
        label49 = new JLabel();
        性别Txt4 = new JTextField();
        label50 = new JLabel();
        党内职务Txt3 = new JTextField();
        label51 = new JLabel();
        出生日期Txt3 = new JTextField();
        label52 = new JLabel();
        政治面貌Txt4 = new JTextField();
        label53 = new JLabel();
        学历学位Txt3 = new JTextField();
        label54 = new JLabel();
        身份证号Txt4 = new JTextField();
        label55 = new JLabel();
        籍贯Txt3 = new JTextField();
        label56 = new JLabel();
        组织名称Txt3 = new JTextField();
        label1 = new JLabel();
        balanceTxt = new JTextField();
        tabbedPane7 = new JTabbedPane();
        tabbedPane9 = new JTabbedPane();
        internalFrame1 = new JInternalFrame();
        label19 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        label20 = new JLabel();
        MoneyTxt = new JTextField();
        button3 = new JButton();
        scrollPane3 = new JScrollPane();
        tabbedPane10 = new JTabbedPane();
        panel6 = new JPanel();
        textField1 = new JTextField();
        label18 = new JLabel();
        button2 = new JButton();
        tabbedPane11 = new JTabbedPane();
        button1 = new JButton();
        tabbedPane2 = new JTabbedPane();
        tabbedPane4 = new JTabbedPane();
        panel2 = new JPanel();
        label10 = new JLabel();
        label14 = new JLabel();
        tabbedPane3 = new JTabbedPane();
        panel5 = new JPanel();
        label17 = new JLabel();
        label16 = new JLabel();
        tabbedPane5 = new JTabbedPane();
        panel3 = new JPanel();
        label11 = new JLabel();
        label13 = new JLabel();
        tabbedPane6 = new JTabbedPane();
        panel4 = new JPanel();
        label12 = new JLabel();
        label15 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== tabbedPane1 ========
        {

            //======== tabbedPane12 ========
            {
                tabbedPane12.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        tabbedPane12MouseClicked(e);
                    }
                });

                //======== panel9 ========
                {
                    panel9.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
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
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]"));

                    //---- label45 ----
                    label45.setText("id\uff1a");
                    panel9.add(label45, "cell 0 1");

                    //---- idTxt3 ----
                    idTxt3.setColumns(10);
                    panel9.add(idTxt3, "cell 1 1");

                    //---- label46 ----
                    label46.setText("\u804c\u52a1\u804c\u79f0\uff1a");
                    panel9.add(label46, "cell 5 1");

                    //---- 职务职称Txt3 ----
                    职务职称Txt3.setColumns(10);
                    panel9.add(职务职称Txt3, "cell 8 1");

                    //---- label47 ----
                    label47.setText("\u59d3\u540d\uff1a");
                    panel9.add(label47, "cell 0 2");

                    //---- 姓名Txt4 ----
                    姓名Txt4.setColumns(10);
                    panel9.add(姓名Txt4, "cell 1 2");

                    //---- label48 ----
                    label48.setText("\u5165\u515a\u65f6\u95f4\uff1a");
                    panel9.add(label48, "cell 5 2");

                    //---- 入党时间Txt4 ----
                    入党时间Txt4.setColumns(10);
                    panel9.add(入党时间Txt4, "cell 8 2");

                    //---- label49 ----
                    label49.setText("\u6027\u522b\uff1a");
                    panel9.add(label49, "cell 0 3");

                    //---- 性别Txt4 ----
                    性别Txt4.setColumns(10);
                    panel9.add(性别Txt4, "cell 1 3");

                    //---- label50 ----
                    label50.setText("\u515a\u5185\u804c\u52a1\uff1a");
                    panel9.add(label50, "cell 5 3");

                    //---- 党内职务Txt3 ----
                    党内职务Txt3.setColumns(10);
                    panel9.add(党内职务Txt3, "cell 8 3");

                    //---- label51 ----
                    label51.setText("\u51fa\u751f\u65e5\u671f\uff1a");
                    panel9.add(label51, "cell 0 4");

                    //---- 出生日期Txt3 ----
                    出生日期Txt3.setColumns(10);
                    panel9.add(出生日期Txt3, "cell 1 4");

                    //---- label52 ----
                    label52.setText("\u653f\u6cbb\u9762\u8c8c\uff1a");
                    panel9.add(label52, "cell 5 4");

                    //---- 政治面貌Txt4 ----
                    政治面貌Txt4.setColumns(10);
                    panel9.add(政治面貌Txt4, "cell 8 4");

                    //---- label53 ----
                    label53.setText("\u5b66\u5386\u5b66\u4f4d\uff1a");
                    panel9.add(label53, "cell 0 5");

                    //---- 学历学位Txt3 ----
                    学历学位Txt3.setColumns(10);
                    panel9.add(学历学位Txt3, "cell 1 5");

                    //---- label54 ----
                    label54.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");
                    panel9.add(label54, "cell 5 5");

                    //---- 身份证号Txt4 ----
                    身份证号Txt4.setColumns(10);
                    panel9.add(身份证号Txt4, "cell 8 5");

                    //---- label55 ----
                    label55.setText("\u7c4d\u8d2f\uff1a");
                    panel9.add(label55, "cell 0 6");

                    //---- 籍贯Txt3 ----
                    籍贯Txt3.setColumns(10);
                    panel9.add(籍贯Txt3, "cell 1 6");

                    //---- label56 ----
                    label56.setText("\u7ec4\u7ec7\u540d\u79f0\uff1a");
                    panel9.add(label56, "cell 5 6");

                    //---- 组织名称Txt3 ----
                    组织名称Txt3.setColumns(10);
                    panel9.add(组织名称Txt3, "cell 8 6");

                    //---- label1 ----
                    label1.setText("\u8d26\u6237\u4f59\u989d\uff1a");
                    panel9.add(label1, "cell 0 7");
                    panel9.add(balanceTxt, "cell 1 7");
                }
                tabbedPane12.addTab("\u4e2a\u4eba\u4fe1\u606f", panel9);
            }
            tabbedPane1.addTab("\u4e2a\u4eba\u4e2d\u5fc3", tabbedPane12);

            //======== tabbedPane7 ========
            {

                //======== tabbedPane9 ========
                {

                    //======== internalFrame1 ========
                    {
                        internalFrame1.setVisible(true);
                        internalFrame1.setTitle("\u515a\u8d39\u7f34\u7eb3");
                        Container internalFrame1ContentPane = internalFrame1.getContentPane();

                        //---- label19 ----
                        label19.setText("\u515a\u8d39\u7f34\u7eb3\u6807\u51c6\uff1a");

                        //======== scrollPane2 ========
                        {

                            //---- textArea1 ----
                            textArea1.setColumns(1000);
                            textArea1.setText("\u65b0\u6807\u51c6\u4e2d\u515a\u5458\u4ea4\u7eb3\u515a\u8d39\u7684 \u6bd4\u4f8b\u4e3a\u57283000\u5143\u4ee5\u4e0b\u542b3000\u5143\u8005\uff0c \u4ea4\u7eb3\u6708\u5de5\u8d44\u6536\u5165\u76840.5% 3\u5343\u5143\u4ee5\u4e0a\u81f35000\u5143\u542b5000\u5143\u8005\u7f34\u7eb31%  5000\u5143\u4ee5\u4e0a\u81f31\u4e07\u5143\u8005\u542b1\u4e07\u5143\u7f34\u7eb31.5% 1\u4e07\u5143\u4ee5\u4e0a\u8005\u7f34\u7eb32% \u9000\u4f11\u5e72\u90e8\u804c\u5de5\u4e2d\u7684\u515a\u5458 \u6bcf\u6708\u4ee5\u5b9e\u9645\u9886\u53d6\u7684\u79bb\u9000\u4f11\u8d39\u603b\u989d \u6216\u517b\u8001\u91d1\u603b\u989d\u4e3a\u8ba1\u7b97\u57fa\u6570 5000\u5143\u4ee5\u4e0b\u542b5000\u5143\u7684\u63090.5%\u7f34\u7eb3\u515a\u8d39\uff0c 5000\u5143\u4ee5\u4e0a\u7684\u63091%\u7f34\u7eb3\u515a\u8d39 ");
                            scrollPane2.setViewportView(textArea1);
                        }

                        //---- label20 ----
                        label20.setText("\u8bf7\u8f93\u5165\u7f34\u8d39\u91d1\u989d\uff1a");

                        //---- MoneyTxt ----
                        MoneyTxt.setColumns(6);

                        //---- button3 ----
                        button3.setText("OK");
                        button3.addActionListener(e -> button3ActionPerformed(e));

                        GroupLayout internalFrame1ContentPaneLayout = new GroupLayout(internalFrame1ContentPane);
                        internalFrame1ContentPane.setLayout(internalFrame1ContentPaneLayout);
                        internalFrame1ContentPaneLayout.setHorizontalGroup(
                            internalFrame1ContentPaneLayout.createParallelGroup()
                                .addGroup(internalFrame1ContentPaneLayout.createParallelGroup()
                                    .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(internalFrame1ContentPaneLayout.createParallelGroup()
                                            .addComponent(label19)
                                            .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(label20)
                                                .addGap(44, 44, 44)
                                                .addComponent(MoneyTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                                .addGap(212, 212, 212)
                                                .addComponent(button3)))
                                        .addGap(0, 197, Short.MAX_VALUE))
                                    .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(389, Short.MAX_VALUE)))
                                .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(81, Short.MAX_VALUE))
                        );
                        internalFrame1ContentPaneLayout.setVerticalGroup(
                            internalFrame1ContentPaneLayout.createParallelGroup()
                                .addGroup(internalFrame1ContentPaneLayout.createParallelGroup()
                                    .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(label19)
                                        .addGap(136, 136, 136)
                                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addGroup(internalFrame1ContentPaneLayout.createParallelGroup()
                                            .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(label20))
                                            .addComponent(MoneyTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(button3)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(internalFrame1ContentPaneLayout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(108, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane9.addTab("", internalFrame1);
                }
                tabbedPane7.addTab("\u515a\u8d39\u7f34\u7eb3", tabbedPane9);

                //======== tabbedPane10 ========
                {
                    tabbedPane10.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            tabbedPane10MouseClicked(e);
                        }
                    });

                    //======== panel6 ========
                    {

                        //---- label18 ----
                        label18.setText("\u8bf7\u8f93\u5165\u4f60\u7684\u95ee\u9898\uff1a");

                        //---- button2 ----
                        button2.setText("\u53d1\u9001");
                        button2.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                button2MouseClicked(e);
                            }
                        });
                        button2.addActionListener(e -> {
			button2ActionPerformed(e);
			button2ActionPerformed(e);
		});

                        GroupLayout panel6Layout = new GroupLayout(panel6);
                        panel6.setLayout(panel6Layout);
                        panel6Layout.setHorizontalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(panel6Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(panel6Layout.createParallelGroup()
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addGroup(panel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel6Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                                                .addGroup(panel6Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                                                    .addComponent(button2)))
                                            .addGap(112, 112, 112))
                                        .addGroup(panel6Layout.createSequentialGroup()
                                            .addComponent(label18)
                                            .addContainerGap(355, Short.MAX_VALUE))))
                        );
                        panel6Layout.setVerticalGroup(
                            panel6Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label18)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(button2)
                                    .addGap(44, 44, 44))
                        );
                    }
                    tabbedPane10.addTab("\u95ee\u9898\u53cd\u9988", panel6);
                }
                tabbedPane7.addTab("\u95ee\u9898\u54a8\u8be2", tabbedPane10);

                //======== tabbedPane11 ========
                {

                    //---- button1 ----
                    button1.setText("\u70b9\u51fb\u4efb\u610f\u4f4d\u7f6e\u9000\u51fa");
                    button1.addActionListener(e -> button1ActionPerformed(e));
                    tabbedPane11.addTab("\u9000\u51fa\u8d26\u53f7", button1);
                }
                tabbedPane7.addTab("\u9000\u51fa\u767b\u5f55", tabbedPane11);
            }
            tabbedPane1.addTab("\u5e2e\u52a9\u4e2d\u5fc3", tabbedPane7);

            //======== tabbedPane2 ========
            {

                //======== tabbedPane4 ========
                {

                    //======== panel2 ========
                    {

                        //---- label10 ----
                        label10.setText("\u65e0\u6570\u636e");

                        GroupLayout panel2Layout = new GroupLayout(panel2);
                        panel2.setLayout(panel2Layout);
                        panel2Layout.setHorizontalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(panel2Layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(251, Short.MAX_VALUE))
                        );
                        panel2Layout.setVerticalGroup(
                            panel2Layout.createParallelGroup()
                                .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(205, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane4.addTab("\u4f1a\u8bae\u8bb0\u5f55", panel2);

                    //---- label14 ----
                    label14.setText("\u4e00\u4e2a\u5b63\u5ea6\u81f3\u5c11\u4e00\u6b21");
                    tabbedPane4.addTab("\u5f00\u4f1a\u65e5\u5386", label14);
                }
                tabbedPane2.addTab("\u652f\u90e8\u515a\u5458\u5927\u4f1a", tabbedPane4);

                //======== tabbedPane3 ========
                {

                    //======== panel5 ========
                    {

                        //---- label17 ----
                        label17.setText("\u65e0\u6570\u636e");

                        GroupLayout panel5Layout = new GroupLayout(panel5);
                        panel5.setLayout(panel5Layout);
                        panel5Layout.setHorizontalGroup(
                            panel5Layout.createParallelGroup()
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(150, 150, 150)
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(155, Short.MAX_VALUE))
                        );
                        panel5Layout.setVerticalGroup(
                            panel5Layout.createParallelGroup()
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addComponent(label17, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(151, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane3.addTab("\u4f1a\u8bae\u8bb0\u5f55", panel5);

                    //---- label16 ----
                    label16.setText("                                                          \u4e00\u4e2a\u6708\u81f3\u5c11\u4e00\u6b21");
                    tabbedPane3.addTab("\u5f00\u4f1a\u65e5\u5386", label16);
                }
                tabbedPane2.addTab("\u652f\u90e8\u59d4\u5458\u4f1a", tabbedPane3);

                //======== tabbedPane5 ========
                {

                    //======== panel3 ========
                    {

                        //---- label11 ----
                        label11.setText("\u65e0\u6570\u636e");

                        GroupLayout panel3Layout = new GroupLayout(panel3);
                        panel3.setLayout(panel3Layout);
                        panel3Layout.setHorizontalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(122, 122, 122)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(185, Short.MAX_VALUE))
                        );
                        panel3Layout.setVerticalGroup(
                            panel3Layout.createParallelGroup()
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addGap(71, 71, 71)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(74, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane5.addTab("\u4f1a\u8bae\u8bb0\u5f55", panel3);

                    //---- label13 ----
                    label13.setText("                                                        \u4e00\u4e2a\u6708\u81f3\u5c11\u4e00\u6b21");
                    tabbedPane5.addTab("\u5f00\u4f1a\u65e5\u5386", label13);
                }
                tabbedPane2.addTab("\u515a\u5c0f\u7ec4\u4f1a", tabbedPane5);

                //======== tabbedPane6 ========
                {

                    //======== panel4 ========
                    {

                        //---- label12 ----
                        label12.setText("\u65e0\u6570\u636e");

                        GroupLayout panel4Layout = new GroupLayout(panel4);
                        panel4.setLayout(panel4Layout);
                        panel4Layout.setHorizontalGroup(
                            panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(134, 134, 134)
                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(146, Short.MAX_VALUE))
                        );
                        panel4Layout.setVerticalGroup(
                            panel4Layout.createParallelGroup()
                                .addGroup(panel4Layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(86, Short.MAX_VALUE))
                        );
                    }
                    tabbedPane6.addTab("\u4f1a\u8bae\u8bb0\u5f55", panel4);

                    //---- label15 ----
                    label15.setText("                                                       \u4e09\u4e2a\u6708\u81f3\u5c11\u4e00\u6b21");
                    tabbedPane6.addTab("\u5f00\u4f1a\u65e5\u5386", label15);
                }
                tabbedPane2.addTab("\u515a\u8bfe", tabbedPane6);
            }
            tabbedPane1.addTab("\u4e09\u4f1a\u4e00\u8bfe", tabbedPane2);
        }
        contentPane.add(tabbedPane1, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane12;
    private JPanel panel9;
    private JLabel label45;
    private JTextField idTxt3;
    private JLabel label46;
    private JTextField 职务职称Txt3;
    private JLabel label47;
    private JTextField 姓名Txt4;
    private JLabel label48;
    private JTextField 入党时间Txt4;
    private JLabel label49;
    private JTextField 性别Txt4;
    private JLabel label50;
    private JTextField 党内职务Txt3;
    private JLabel label51;
    private JTextField 出生日期Txt3;
    private JLabel label52;
    private JTextField 政治面貌Txt4;
    private JLabel label53;
    private JTextField 学历学位Txt3;
    private JLabel label54;
    private JTextField 身份证号Txt4;
    private JLabel label55;
    private JTextField 籍贯Txt3;
    private JLabel label56;
    private JTextField 组织名称Txt3;
    private JLabel label1;
    private JTextField balanceTxt;
    private JTabbedPane tabbedPane7;
    private JTabbedPane tabbedPane9;
    private JInternalFrame internalFrame1;
    private JLabel label19;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JLabel label20;
    private JTextField MoneyTxt;
    private JButton button3;
    private JScrollPane scrollPane3;
    private JTabbedPane tabbedPane10;
    private JPanel panel6;
    private JTextField textField1;
    private JLabel label18;
    private JButton button2;
    private JTabbedPane tabbedPane11;
    private JButton button1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane4;
    private JPanel panel2;
    private JLabel label10;
    private JLabel label14;
    private JTabbedPane tabbedPane3;
    private JPanel panel5;
    private JLabel label17;
    private JLabel label16;
    private JTabbedPane tabbedPane5;
    private JPanel panel3;
    private JLabel label11;
    private JLabel label13;
    private JTabbedPane tabbedPane6;
    private JPanel panel4;
    private JLabel label12;
    private JLabel label15;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
