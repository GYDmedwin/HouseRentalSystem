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
        panel01.add(new JLabel("�û���"));
        panel01.add(new JTextField(10));

        
        JPanel panel02 = new JPanel();
        panel02.add(new JLabel("��   ��"));
        panel02.add(new JPasswordField(10));

        
        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        SignIN=new JButton("��¼");
        SignUP=new JButton("ע��");
        
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

		        // ���ݶ����������ֱ�����İ�ť
		        if (deng_lu.equals(command)) {
		            //���µ�¼
		        	//System.out.println("��¼");
		        	
		        	
		        	MainView.isdenglu=1;
		        	MainView.hudenicheng("�ż�");
		        	
		        	
		        	
		        	
		        } else if(zhu_ce.equals(command)) {
		        	//����ע��
		        	//System.out.println("ע��");
		        	
		        	
		        	
		        	
		        }
		        
		        jf.dispose();
		    }

				

				
		};
		SignIN.addActionListener(listener);
		SignUP.addActionListener(listener);
		
	}


}

