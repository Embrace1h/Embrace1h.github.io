/*
 * Created by JFormDesigner on Fri Jun 17 06:29:06 CST 2022
 */

package com.view;

import java.awt.event.*;
import com.dao.PeopleDao;
import com.model.People;
import com.util.JdbcUtil;
import com.util.StringUtil;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author 23
 */
public class PeopleManageInterFrm extends JInternalFrame {
    Connection con = null;
    private PeopleDao peopleDao = new PeopleDao();
    public PeopleManageInterFrm() {
        initComponents();
        this.setVisible(true);
        this.setSize(800,600);

    }

    private void button1ActionPerformed(ActionEvent e) {
        peopleSearchActionPerformed(e);
    }

    private void scrollPane1MousePressed(MouseEvent e) {
        peopleTableMousePressed(e);
    }

    private void button2ActionPerformed(ActionEvent e) {
        peopleUpdateActionEvent(e);
    }

    private void button3ActionPerformed(ActionEvent e) {
        peopleDeleteActionEvent(e);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        peopleTable = new JTable();
        label1 = new JLabel();
        s_peopleNameTxt = new JTextField();
        button1 = new JButton();
        表单操作 = new JPanel();
        label2 = new JLabel();
        idTxt = new JTextField();
        label3 = new JLabel();
        nameTxt = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        genderTxt = new JTextField();
        dateTxt = new JTextField();
        degreeTxt = new JTextField();
        label7 = new JLabel();
        homeTxt = new JTextField();
        button2 = new JButton();
        button3 = new JButton();
        label8 = new JLabel();
        职务职称文本 = new JTextField();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        入党时间文本 = new JTextField();
        党内职务文本 = new JTextField();
        身份证号文本 = new JTextField();
        政治面貌文本 = new JTextField();
        组织名称文本 = new JTextField();

        //======== this ========
        setVisible(true);
        setClosable(true);
        setTitle("\u4eba\u5458\u4fe1\u606f");
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
        label1.setText("\u515a\u5458\u59d3\u540d");

        //---- button1 ----
        button1.setText("\u67e5\u8be2");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //======== 表单操作 ========
        {

            //---- label2 ----
            label2.setText("\u7f16\u53f7\uff1a");

            //---- idTxt ----
            idTxt.setColumns(10);

            //---- label3 ----
            label3.setText("\u59d3\u540d\uff1a");

            //---- nameTxt ----
            nameTxt.setColumns(10);

            //---- label4 ----
            label4.setText("\u6027\u522b\uff1a");

            //---- label5 ----
            label5.setText("\u51fa\u751f\u65e5\u671f\uff1a");

            //---- label6 ----
            label6.setText("\u5b66\u5386\u5b66\u4f4d");

            //---- genderTxt ----
            genderTxt.setColumns(10);

            //---- dateTxt ----
            dateTxt.setColumns(10);

            //---- degreeTxt ----
            degreeTxt.setColumns(10);

            //---- label7 ----
            label7.setText("\u7c4d\u8d2f");

            //---- homeTxt ----
            homeTxt.setColumns(10);

            //---- button2 ----
            button2.setText("\u4fee\u6539");
            button2.addActionListener(e -> button2ActionPerformed(e));

            //---- button3 ----
            button3.setText("\u5220\u9664");
            button3.addActionListener(e -> button3ActionPerformed(e));

            //---- label8 ----
            label8.setText("\u804c\u52a1\u804c\u79f0");

            //---- 职务职称文本 ----
            职务职称文本.setColumns(10);

            //---- label9 ----
            label9.setText("\u5165\u515a\u65f6\u95f4");

            //---- label10 ----
            label10.setText("\u515a\u5185\u804c\u52a1");

            //---- label11 ----
            label11.setText("\u8eab\u4efd\u8bc1\u53f7");

            //---- label12 ----
            label12.setText("\u653f\u6cbb\u9762\u8c8c");

            //---- label13 ----
            label13.setText("\u7ec4\u7ec7\u540d\u79f0");

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

            GroupLayout 表单操作Layout = new GroupLayout(表单操作);
            表单操作.setLayout(表单操作Layout);
            表单操作Layout.setHorizontalGroup(
                表单操作Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, 表单操作Layout.createSequentialGroup()
                        .addGroup(表单操作Layout.createParallelGroup()
                            .addGroup(表单操作Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(button2))
                            .addGroup(表单操作Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(表单操作Layout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(label3)
                                    .addComponent(label4)
                                    .addComponent(label5)
                                    .addComponent(label6)
                                    .addComponent(label7))
                                .addGap(18, 18, 18)
                                .addGroup(表单操作Layout.createParallelGroup()
                                    .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(idTxt)
                                        .addComponent(nameTxt))
                                    .addComponent(genderTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(degreeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(homeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(表单操作Layout.createParallelGroup()
                                    .addComponent(label13)
                                    .addComponent(label12)
                                    .addComponent(label11)
                                    .addComponent(label10)
                                    .addComponent(label8)
                                    .addComponent(label9))))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(表单操作Layout.createParallelGroup()
                            .addComponent(职务职称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3)
                            .addComponent(入党时间文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(党内职务文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(身份证号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(政治面貌文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132))
            );
            表单操作Layout.setVerticalGroup(
                表单操作Layout.createParallelGroup()
                    .addGroup(表单操作Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(idTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8)
                            .addComponent(职务职称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9)
                            .addComponent(入党时间文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(genderTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10)
                            .addComponent(党内职务文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(dateTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11)
                            .addComponent(身份证号文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(degreeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)
                            .addComponent(label12)
                            .addComponent(政治面貌文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(homeTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7)
                            .addComponent(label13)
                            .addComponent(组织名称文本, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(表单操作Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2)
                            .addComponent(button3))
                        .addGap(14, 14, 14))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(表单操作, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(label1)
                            .addGap(81, 81, 81)
                            .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(button1)))
                    .addContainerGap(60, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(s_peopleNameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addGap(32, 32, 32)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(表单操作, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        this.fillTable(new People());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JTable peopleTable;
    private JLabel label1;
    private JTextField s_peopleNameTxt;
    private JButton button1;
    private JPanel 表单操作;
    private JLabel label2;
    private JTextField idTxt;
    private JLabel label3;
    private JTextField nameTxt;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField genderTxt;
    private JTextField dateTxt;
    private JTextField degreeTxt;
    private JLabel label7;
    private JTextField homeTxt;
    private JButton button2;
    private JButton button3;
    private JLabel label8;
    private JTextField 职务职称文本;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JTextField 入党时间文本;
    private JTextField 党内职务文本;
    private JTextField 身份证号文本;
    private JTextField 政治面貌文本;
    private JTextField 组织名称文本;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    /**
     * 填充表格
     * @param people
     */
    private void fillTable(People people){
       DefaultTableModel dtm = (DefaultTableModel) peopleTable.getModel();
       dtm.setRowCount(0);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            ResultSet rs = peopleDao.list(con,people);
            while(rs.next()){//职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称
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
//                if(rs.getString("政治面貌").equals("党员")){
//                    dtm.addRow(v);//只有党员才能显示
//                }
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(null,null,con);
        }
    }

    /**
     * 党员查询
     * @param evt
     */
    private void peopleSearchActionPerformed(ActionEvent evt){
        String s_peopleName = this.s_peopleNameTxt.getText();
        People people = new People();
        people.setName(s_peopleName);
        this.fillTable(people);
    }

    /**
     * 表格行点击事件处理
     * @param evt
     */
    private void peopleTableMousePressed(MouseEvent evt){
        int row = peopleTable.getSelectedRow();
        idTxt.setText((String) peopleTable.getValueAt(row, 0));
        nameTxt.setText((String)peopleTable.getValueAt(row,1));
        genderTxt.setText((String)peopleTable.getValueAt(row,2));
        dateTxt.setText((String)peopleTable.getValueAt(row,3));
        degreeTxt.setText((String)peopleTable.getValueAt(row,4));
        homeTxt.setText((String)peopleTable.getValueAt(row,5));
        职务职称文本.setText((String)peopleTable.getValueAt(row,6));
        入党时间文本.setText((String)peopleTable.getValueAt(row,7));
        党内职务文本.setText((String)peopleTable.getValueAt(row,8));
        身份证号文本.setText((String)peopleTable.getValueAt(row,9));
        政治面貌文本.setText((String)peopleTable.getValueAt(row,10));
        组织名称文本.setText((String)peopleTable.getValueAt(row,11));
    }

    /**
     * 更新党员信息
     * @param evt
     */
    private void peopleUpdateActionEvent(ActionEvent evt){
        String id = idTxt.getText();
        String name = nameTxt.getText();
        String gender = genderTxt.getText();
        String date = dateTxt.getText();
        String degree = degreeTxt.getText();
        String home = homeTxt.getText();
        String 职务职称 = this.职务职称文本.getText();
        String 入党时间 = this.入党时间文本.getText();
        String 党内职务 = this.党内职务文本.getText();
        String 身份证号 = this.身份证号文本.getText();
        String 政治面貌 = this.政治面貌文本.getText();
        String 组织名称 = this.组织名称文本.getText();

        if(StringUtil.isEmpty(id)){
            JOptionPane.showMessageDialog(null,"请选择要修改的行！");
            return;
        }
        if(StringUtil.isEmpty(name)){
            JOptionPane.showMessageDialog(null,"姓名不能为空！");
            return;
        }//职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称
        People people = new People(Integer.parseInt(id),name,gender,date,degree,home,职务职称,入党时间,党内职务,身份证号,政治面貌,组织名称);
        Connection con = null;
        try {
            con = JdbcUtil.getConnection();
            int modifyNo = peopleDao.update(con,people);
            if(modifyNo >= 1){
                JOptionPane.showMessageDialog(null,"修改成功！");
                this.resetValue();
                this.fillTable(new People());
            }else{
                JOptionPane.showMessageDialog(null,"修改失败！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                JdbcUtil.close(null,null,con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 删除党员信息
     * @param evt
     */
    private void peopleDeleteActionEvent(ActionEvent evt){

        String id = idTxt.getText();
        if(StringUtil.isEmpty(id)){
            JOptionPane.showMessageDialog(null,"请选择要删除的记录！");
            return;
        }
        int n = JOptionPane.showConfirmDialog(null,"确定删除选中内容吗？");
        if(n == 0){
            try {
                con = JdbcUtil.getConnection();
                int deleteNo = peopleDao.delete(con,id);
                if(deleteNo == 1){
                    JOptionPane.showMessageDialog(null,"删除成功！");
                    this.resetValue();
                    this.fillTable(new People());
                }else{
                    JOptionPane.showMessageDialog(null,"删除失败！");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 将文本框置空
     */
    private void resetValue(){
        this.idTxt.setText("");
        this.nameTxt.setText("");
        this.genderTxt.setText("");
        this.dateTxt.setText("");
        this.degreeTxt.setText("");
        this.homeTxt.setText("");
        this.职务职称文本.setText("");
        this.入党时间文本.setText("");
        this.党内职务文本.setText("");
        this.身份证号文本.setText("");
        this.政治面貌文本.setText("");
        this.组织名称文本.setText("");
    }
}
