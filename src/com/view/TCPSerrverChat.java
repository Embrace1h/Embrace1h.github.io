/*
 * Created by JFormDesigner on Thu Jun 23 15:40:54 CST 2022
 */

package com.view;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 23
 */
public class TCPSerrverChat extends JFrame {
    private BufferedWriter bw = null;

    public TCPSerrverChat() {
        initComponents();
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        server();
    }

    public static void main(String[] args) {
        new TCPSerrverChat();
    }
    private void jbActionPerformed(ActionEvent e) {
        //1.获取文本框中发送的内容
        String text = jtf.getText();
        //2.拼接需要发送的数据内容
        text = "管理员对用户说：" + text ;
        //3.自己也需要显示
        jta.append(text + System.lineSeparator());
        try {
            //4.发送
            bw.write(text);
            bw.newLine();//不加服务器端的newLine会导致客户端收不到服务器端的消息
            bw.flush();
            bw.flush();
            //5.文本框置空
            jtf.setText("");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        jp = new JPanel();
        jtf = new JTextField();
        jb = new JButton();
        jsp = new JScrollPane();
        jta = new JTextArea();

        //======== this ========
        setTitle("\u7ba1\u7406\u5458");
        Container contentPane = getContentPane();

        //======== jp ========
        {

            //---- jb ----
            jb.setText("\u53d1\u9001");
            jb.addActionListener(e -> {
			jbActionPerformed(e);
			jbActionPerformed(e);
		});

            //======== jsp ========
            {
                jsp.setViewportView(jta);
            }

            GroupLayout jpLayout = new GroupLayout(jp);
            jp.setLayout(jpLayout);
            jpLayout.setHorizontalGroup(
                jpLayout.createParallelGroup()
                    .addGroup(jpLayout.createParallelGroup()
                        .addGroup(jpLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jpLayout.createParallelGroup()
                                .addComponent(jsp, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpLayout.createSequentialGroup()
                                    .addComponent(jtf, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jb)))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 400, Short.MAX_VALUE)
            );
            jpLayout.setVerticalGroup(
                jpLayout.createParallelGroup()
                    .addGroup(jpLayout.createParallelGroup()
                        .addGroup(jpLayout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jsp, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addGroup(jpLayout.createParallelGroup()
                                .addComponent(jtf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jb))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(0, 280, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 398, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 280, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel jp;
    private JTextField jtf;
    private JButton jb;
    private JScrollPane jsp;
    private JTextArea jta;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void server() {
        try {
            //1.创建服务端套接字
            ServerSocket serverSocket = new ServerSocket(8888);
            //2.等待客户端的连接
            Socket socket = serverSocket.accept();

            //3.获取socket通道的输入流(输入流是读取数据的，如何实现一行一行的读取呢)  BufferedReader -> readLine();
            InputStream in = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            //4.获取socket的输出流(输出流实现写出数据，也是写一行，换一行，刷新) BufferedWriter  -> newLine();
            //问题：什么时候需要输出数据？   当用户点击发送按钮时，需要写出数据
            OutputStream out = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(out));

            //循环读取数据，并拼接到文本域中
            String line = br.readLine();
//            while (line != null){
                //将读取的数据拼接到文本域中显示
                jta.append(line + System.lineSeparator());
//            }

            //5.关闭socket通道
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
