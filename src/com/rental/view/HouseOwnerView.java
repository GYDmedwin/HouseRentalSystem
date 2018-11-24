package com.rental.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HouseOwnerView extends JFrame {

	

	/**
	 * Launch the application.
	 */
	JPanel tabbedPane;
	JLabel pingjia,loge;
	JButton shenqing;

	/**
	 * Create the frame.
	 */
	public HouseOwnerView(String str) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\..\\image\\zhu.jpg"));
		setBackground(Color.GRAY);
		setTitle("房屋信息");
		setSize(600, 400);
		tabbedPane=new JPanel(null);
        shenqing=new JButton("申请看房");
        shenqing.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	 // 按下申请看房
		       
		        	
		       
		        
		        }
		  
		    });
        shenqing.setBounds(25,300,100,25);
        pingjia=new JLabel("评价：");
        pingjia.setBounds(0,25,100,25);
        loge=new JLabel(new ImageIcon("..\\..\\image\\youname1.jpg"));
        loge.setBounds(200,0,400,400);
        tabbedPane.add(shenqing);
        tabbedPane.add(pingjia);
        tabbedPane.add(loge);
        setContentPane(tabbedPane);
        setLocationRelativeTo(null);
        setVisible(true);
    }
	/*
	 * 从数据库获得房屋信息
	 * */
	public static void fangwuxinxi(String str) {
   

		
}		
}

