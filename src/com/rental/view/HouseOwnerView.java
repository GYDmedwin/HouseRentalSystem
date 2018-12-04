package com.rental.view;

import com.rental.controller.SeeController;
import com.rental.controller.SignController;
import com.rental.domain.HouseBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class HouseOwnerView extends JFrame {

	

	/**
	 * Launch the application.
	 */
	JPanel tabbedPane;
	JLabel pingjia,loge,jiage,kezhurenshu,xiangxidizhi;
	static JButton shenqing;

	/**
	 * Create the frame.
	 */
	public HouseOwnerView(HouseBean hou) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setBackground(Color.GRAY);
		setTitle("房屋信息");
		setSize(600, 400);
		tabbedPane=new JPanel(null);
        shenqing=new JButton("申请看房");
        action(hou,this);
        shenqing.setBounds(25,300,100,25);
        pingjia=new JLabel(hou.getAddress());
        pingjia.setBounds(0,160,200,140);
        jiage=new JLabel("价格："+hou.getRent());
        jiage.setBounds(0,70,100,25);
        kezhurenshu=new JLabel("可住人数："+hou.getAccommodate());
        kezhurenshu.setBounds(0,25,100,25);
        xiangxidizhi=new JLabel("详细地址：");
        xiangxidizhi.setBounds(0,115,100,25);
        loge=new JLabel(new ImageIcon("。。\\..\\image\\bieshu1.png"));
        
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
public static void action( HouseBean hou, JFrame jf) {
		shenqing.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	 // 按下申请看房
	        	//public boolean seeHouse(long house_id, long tenant_id, String date);
	        	 String inputContent = JOptionPane.showInputDialog(
	                      	jf,
	                        "输入看房日期:",
	                        "年-月-日"
	                );
	        	 if(inputContent==null||inputContent.equals(""));
	        	 else {
	        	
	        	if(new SeeController().seeHouse(hou.house_id,SignController.user.tenant_id,inputContent)) {
	        		JOptionPane.showMessageDialog(
	                        jf,
	                        "申请成功",
	                        " ",
	                        JOptionPane.WARNING_MESSAGE
	                );
	
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(
	                        jf,
	                        "申请失败",
	                        " ",
	                        JOptionPane.WARNING_MESSAGE
	                );
	        	}
	        }
	        }
	    });
		
	}

	
}