package com.rental.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.rental.domain.HouseBean;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HouseOwnerView extends JFrame {

	

	/**
	 * Launch the application.
	 */
	JPanel tabbedPane;
	JLabel pingjia,loge,jiage,kezhurenshu,xiangxidizhi;
	JButton shenqing;

	/**
	 * Create the frame.
	 */
	public HouseOwnerView(HouseBean hou) {
		
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
        pingjia=new JLabel(hou.getAddress());
        pingjia.setBounds(0,160,200,140);
        jiage=new JLabel("价格："+hou.getRent());
        jiage.setBounds(0,70,100,25);
        kezhurenshu=new JLabel("可住人数："+hou.getAccommodate());
        kezhurenshu.setBounds(0,25,100,25);
        xiangxidizhi=new JLabel("详细地址：");
        xiangxidizhi.setBounds(0,115,100,25);
        loge=new JLabel(new ImageIcon("。。\\..\\image\\youname1.jpg"));
        
        loge.setBounds(200,0,400,400);
        tabbedPane.add(shenqing);
        tabbedPane.add(pingjia);
        tabbedPane.add(loge);
        tabbedPane.add(jiage);
        tabbedPane.add(kezhurenshu);
        tabbedPane.add(xiangxidizhi);
        setContentPane(tabbedPane);
        setLocationRelativeTo(null);
        setVisible(true);
    }
	
}