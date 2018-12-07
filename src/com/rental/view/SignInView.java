package com.rental.view;

import com.rental.controller.SignController;
import com.rental.domain.UserBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignInView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static int denglu=0,a=0;
	static JButton SignIN,SignUP;
	static String deng_lu="denglu", zhu_ce="zhuce";
	static JTextField textfield;
	static JPasswordField password;
	static UserBean user;
	static boolean i;
	/**
	 * Create the frame.
	 */
	public SignInView(JFrame jf) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setResizable(false);
	//	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//		setLocationRelativeTo(relativeWindow);
		//setSize(300,200);
		textfield=new JTextField(13);
        JPanel panel01 = new JPanel();
        panel01.add(new JLabel("手机号"));
        panel01.add(textfield);

        password=new JPasswordField(13);
        JPanel panel02 = new JPanel();
        panel02.add(new JLabel("密   码"));
        panel02.add(password);

        
        JPanel panel03 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        SignIN=new JButton("登录");
        SignUP=new JButton("注册");
        JLabel l=new JLabel("   ");
        action(this);
        
        
        panel03.add(SignIN);
		panel03.add(l);
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
		       
		        if(geshizhengque()){
		        		user= new SignController().signIn(textfield.getText(), password.getText());
		        		if(user==null) {
		        			messageSignINDialog1(jf);
		        		}
		        		else if(user.complete==0) {
		        			jf.dispose();
		        			messageSignINDialog2(jf);
		        			new  wanshanxingxi();
		        		}
		        		else {      	
		        	        jf.dispose();
		        			MainView.isdenglu=1;
		        			MainView.hudenicheng(user.name);
		        			
	         		}
		        }
		        else{

		        	messageSignINDialog3(jf);
		        	password.setText(null);
		        }
		 
		        } else if(zhu_ce.equals(command)) {
		        	
		        	if(geshizhengque()){
		          		i= new SignController().signUp(textfield.getText(), password.getText());
		        		if(!i) messageSignUPDialog(jf);
		        		else {
							new SignController().signIn(textfield.getText(), password.getText());
							new wanshanxingxi();
						}  jf.dispose();
		        	}
		        	else{
		        		messageSignINDialog3(jf);
		        		password.setText(null);
		        	}
		       	
		        }
		        
		       
		        
		    }
				
		};
		SignIN.addActionListener(listener);
		SignUP.addActionListener(listener);
		textfield.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	if(a==0) {
		    		textfield.setText(null);
		    		a=1;
		    	}
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
	}
public static void messageSignUPDialog(JFrame jf) {
	JOptionPane.showMessageDialog(
            jf,
            "该账户已经注册",
            "注意！",
            JOptionPane.WARNING_MESSAGE
    );

}
public static void messageSignINDialog1(JFrame jf) {
	JOptionPane.showMessageDialog(
            jf,
            "用户名或密码错误",
            "错误！",
            JOptionPane.WARNING_MESSAGE
    );
}
public static void messageSignINDialog2(JFrame jf) {
	JOptionPane.showMessageDialog(
            jf,
            "请完善信息再登录",
            "错误！",
            JOptionPane.WARNING_MESSAGE
    );
}
public static void messageSignUPDialog2(JFrame jf) {
	JOptionPane.showMessageDialog(
            jf,
            "注册成功",
            " ",
            JOptionPane.WARNING_MESSAGE
    );
}
public static boolean geshizhengque() {
	if(!isMobileNO(textfield.getText())) {
		textfield.setText(null);
		return false;
		}
	if(password.getText().length()<6||password.getText().length()>16) {	
		return false;
		}
	return true;
}

public static boolean isMobileNO(String mobiles) {
	Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
	Matcher m = p.matcher(mobiles);
	return m.matches();
	}

public static void messageSignINDialog3(JFrame jf) {
	JOptionPane.showMessageDialog(
            jf,
            "手机号（11位） 密码（6-16位）",
            " ",
            JOptionPane.WARNING_MESSAGE
    );
}

}

