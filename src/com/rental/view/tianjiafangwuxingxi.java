package com.rental.view;

import com.rental.controller.HouseController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tianjiafangwuxingxi extends JFrame {
	static String[] listData1 ,listData2,listData3,listData4,listshi,listxie;
	private JPanel panel;
	static JButton  chengweifangzhu;
	static JTextField jiage1,dizhi,textfield3,textfield4,rongnarenshu;
	static String a,b,c,d,f,g,h,q;	
	static boolean i;
	static JComboBox<String> fangxing,shengfeng,shiqu,xie,jiage,huxing,fangxing1,shengfeng1,shiqu1,xie1,huxing1;	
	public tianjiafangwuxingxi(){
		listData1=new String[]{"-", "д��¥",  "����"};
	    listData2=new String[]{"-","������", "�����","�Ϻ���","������","����ʡ","�ӱ�ʡ","ɽ��ʡ","����ʡ","����ʡ","������ʡ","����ʡ","�㽭ʡ","����ʡ","����ʡ","����ʡ","ɽ��ʡ","����ʡ","����ʡ","����ʡ","�㶫ʡ","����ʡ","����ʡ","�Ĵ�ʡ","����ʡ","����ʡ","����","����ʡ","�ຣʡ","����","�½�","����ر�������","�����ر�������","̨��"};
	    listData3=new String[]{"-","700-", "700-2000", "2000-5000", "5000+"};
	    listData4=new String[]{"-", "һ��һ��", "����һ��", "����һ��"};
	    listshi=new String[]{"-","������","������", "������", "������", "ͭ����","μ����","������","������","������","�Ӱ���"};
	    listxie=new String[]{"-", "������", "������", "�����","������","������","δ����","�³���","������","������"};
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("����\\..\\image\\zhu.jpg"));
		setBackground(Color.BLACK);
		setTitle("��ӷ�����Ϣ");
		setSize(300, 500);
		panel = new JPanel(null);
	    
	    chengweifangzhu = new JButton("���");
	    chengweifangzhu.setBounds(50,400,200,50);
	    jiage1 = new JTextField();
	    dizhi = new JTextField();
	    rongnarenshu = new JTextField();
	    JLabel renshu=new JLabel("����  :");
	    JLabel mdizhi = new JLabel("��ַ :");
	    JLabel mfangxing2 = new JLabel("���� :");
	    JLabel mhuxing2 = new JLabel("���� :");
	    JLabel mshengfeng2 = new JLabel("ʡ�� :");
	    JLabel mshiqu2 = new JLabel("���� :");
	    JLabel mxie2 = new JLabel("�� :");
	    JLabel mjiage2 = new JLabel("�۸� :");
	    renshu.setBounds(50,0,100,25);
	    mdizhi.setBounds(50,350, 100, 25);
	    mshengfeng2.setBounds(50,50, 100, 25);
	    mfangxing2.setBounds(50,200, 100, 25);
	    mhuxing2.setBounds(50,250, 100, 25);
	    mjiage2.setBounds(50,300, 100, 25);
	    mshiqu2.setBounds(50,100, 100, 25);
	    mxie2.setBounds(50,150, 100, 25);
	    fangxing1 = new JComboBox<String>(listData1);
	    fangxing1.setBounds(110,200 , 100, 25);
	    shengfeng1 = new JComboBox<String>(listData2);
	    shengfeng1.setBounds(110,50 , 100, 25);
	    dizhi.setBounds(110,350, 100, 25);
	    jiage1.setBounds(110,300, 100, 25);
	    rongnarenshu.setBounds(110,0,100,25);
	    huxing1 = new JComboBox<String>(listData4);
	    huxing1.setBounds(110,250 , 100, 25);
	    shiqu1 = new JComboBox<String>(listshi);
	    shiqu1.setBounds(110,100, 100, 25);
	    xie1 = new JComboBox<String>(listxie);
	    xie1.setBounds(110,150 , 100, 25);
	    
	    action(this);
	    panel.add(renshu);
	    panel.add(rongnarenshu);
	    panel.add(dizhi);
	    panel.add(mdizhi);
	    panel.add(fangxing1);
	    panel.add(shengfeng1);
	    panel.add(shiqu1);
	    panel.add(xie1);
	    panel.add(jiage1);
	    panel.add(huxing1);
	    panel.add(chengweifangzhu);
	    panel.add(mfangxing2);
	    panel.add(mshengfeng2);
	    panel.add(mshiqu2);
	    panel.add(mxie2);
	    panel.add(mjiage2);
	    panel.add(mhuxing2);
	    panel.add(chengweifangzhu);
		setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
        
	}
	
public static void action(JFrame jf) {
		
		
		ActionListener listener = new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        	int result=JOptionPane.showConfirmDialog(
		    	            jf,
		    	            "ȷ����ӣ�",
		    	            "��ʾ",
		    	            JOptionPane.YES_NO_CANCEL_OPTION
		    	    );
		        	 if (result==0) {//ȷ�����
			    		   
			    		   querentianjia();
			    		   jf.dispose();
			    	   }else if(result==1) {//û��ȷ��
			    	   }else{
		                
			    	   }
		        }			
		};
		chengweifangzhu.addActionListener(listener);	
	}
public static void querentianjia() {
	q=(String)rongnarenshu.getText();
    a=(String)fangxing1.getSelectedItem();
    b=(String)shengfeng1.getSelectedItem();
    c=dizhi.getText();
    d=jiage1.getText();
    f=(String)huxing1.getSelectedItem(); 
    g=(String)shiqu1.getSelectedItem(); 
    h=(String)xie1.getSelectedItem(); 
   if(new HouseController().add(b, g, h, a,f, c, q, d)) {
			   JOptionPane.showMessageDialog(
			            null,
			            "��ӳɹ���",
			            " ",
			            JOptionPane.WARNING_MESSAGE
			    );   
			   MainView.huodefangzhufangwuxinxi();
   }
   else {
	   JOptionPane.showMessageDialog(
	            null,
	            "���ʧ�ܣ�",
	            " ",
	            JOptionPane.WARNING_MESSAGE
	    );
   }

    
}

}
