package com.rental.view;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.rental.controller.SignController;

public class xiugaixingxi extends JFrame {
	
	private JPanel contentPane;
	static JButton wanshan;
	static JTextField textfield1,textfield2,textfield3,textfield4;
	static int a=0,b=0,c=0,d=0,f=0;	
	static boolean i;
	public xiugaixingxi() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setBackground(Color.BLACK);
		setTitle("修改信息");
		setSize(300, 300);
		contentPane=new JPanel(null);
		textfield1=new JTextField("请输入姓名");
		textfield1.setBounds(50,30,200,30);
		textfield2=new JTextField("请输入地址");
		textfield2.setBounds(50,70,200,25);
		textfield3=new JTextField("请输入生日xxxx-xx-xx");
		textfield3.setBounds(50,110,200,25);
		textfield4=new JTextField("请输入性别");
		textfield4.setBounds(50,150,200,25);
		wanshan=new JButton("修改信息");
		wanshan.setBounds(50,200,200,25);
		action(this);
		
		contentPane.add(wanshan);
		contentPane.add(textfield1);
		contentPane.add(textfield2);
		contentPane.add(textfield3);
		contentPane.add(textfield4);
		setContentPane(contentPane);
        setLocationRelativeTo(null);
        setVisible(true);
        	qingkong();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void action(JFrame jf) {
		
		
		ActionListener listener = new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        if(new SignController().fixInfo(textfield1.getText(),textfield2.getText(),textfield3.getText(),textfield4.getText()) ) {
		        	JOptionPane.showMessageDialog(
        		            null,
        		            "修改成功！",
        		            "",
        		            JOptionPane.WARNING_MESSAGE
        		    );
			        MainView.yonghu.setText(textfield1.getText());
		        jf.dispose();
		        }
		        else 
		        	JOptionPane.showMessageDialog(
        		            null,
        		            "修改失败！",
        		            "",
        		            JOptionPane.WARNING_MESSAGE
        		    );
		        }			
		};
		wanshan.addActionListener(listener);	
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void qingkong() {
	textfield1.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	    	textfield1.setText(null);
	    }

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	);
	textfield2.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	if(b==0) {
	    	textfield2.setText(null);
	    	a=1;
	    	}
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        
	    }
	});
	textfield3.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	if(c==0) {
	    	textfield3.setText(null);
	    	a=1;
	    	}
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        
	    }
	});
	textfield4.addFocusListener(new FocusListener() {
	    @Override
	    public void focusGained(FocusEvent e) {
	    	if(d==0) {
	    	textfield4.setText(null);
	    	a=1;
	    	}
	    }
	    @Override
	    public void focusLost(FocusEvent e) {
	        
	    }
	});
} 
  
}
