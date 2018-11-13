package com.rental.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class SignInView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static int denglu=0;
	static JButton SignIN,SignUP;
	static String deng_lu="denglu", zhu_ce="zhuce";
	/**
	 * Create the frame.
	 */
	public SignInView(JFrame jf) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Workspace\\HouseRentalSystem\\image\\zhu.jpg"));
		
	//	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		setLocationRelativeTo(relativeWindow);
       
        JPanel panel01 = new JPanel();
        panel01.add(new JLabel("用户名"));
        panel01.add(new JTextField(10));

        
        JPanel panel02 = new JPanel();
        panel02.add(new JLabel("密   码"));
        panel02.add(new JPasswordField(10));

        
        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        SignIN=new JButton("登录");
        SignUP=new JButton("注册");
        
        action(this);
        
        
        panel03.add(SignIN);
        panel03.add(SignUP);

 
        Box vBox = Box.createVerticalBox();
        vBox.add(panel01);
        vBox.add(panel02);
        vBox.add(panel03);

        setContentPane(vBox);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
	public static void action(JFrame jf) {
		SignIN.setActionCommand(deng_lu);
		SignUP.setActionCommand(zhu_ce);
		
		ActionListener listener = new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		       
		        String command = e.getActionCommand();

		        // 根据动作命令区分被点击的按钮
		        if (deng_lu.equals(command)) {
		            //按下登录
		        	//System.out.println("登录");
		        	
		        	
		        	MainView.isdenglu=1;
		        	MainView.hudenicheng("张鉴");
		        	
		        	
		        	
		        	
		        } else if(zhu_ce.equals(command)) {
		        	//按下注册
		        	//System.out.println("注册");
		        	
		        	
		        	
		        	
		        }
		        
		        jf.dispose();
		    }

				

				
		};
		SignIN.addActionListener(listener);
		SignUP.addActionListener(listener);
		
	}


}

