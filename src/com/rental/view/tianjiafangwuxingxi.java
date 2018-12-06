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
		listData1=new String[]{"-", "写字楼",  "其他"};
	    listData2=new String[]{"-","北京市", "天津市","上海市","重庆市","陕西省","河北省","山西省","辽宁省","吉林省","黑龙江省","江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","广西省","海南省","四川省","贵州省","云南省","西藏","甘肃省","青海省","宁夏","新疆","香港特别行政区","澳门特别行政区","台湾"};
	    listData3=new String[]{"-","700-", "700-2000", "2000-5000", "5000+"};
	    listData4=new String[]{"-", "一室一厅", "俩室一厅", "三室一厅"};
	    listshi=new String[]{"-","西安市","咸阳市", "榆林市", "宝鸡市", "铜川市","渭南市","汉中市","安康市","商洛市","延安市"};
	    listxie=new String[]{"-", "碑林区", "莲湖区", "灞桥区","雁塔区","阎良区","未央区","新城区","长安区","临潼区"};
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setBackground(Color.BLACK);
		setTitle("添加房屋信息");
		setSize(300, 500);
		panel = new JPanel(null);
	    
	    chengweifangzhu = new JButton("添加");
	    chengweifangzhu.setBounds(50,400,200,50);
	    jiage1 = new JTextField();
	    dizhi = new JTextField();
	    rongnarenshu = new JTextField();
	    JLabel renshu=new JLabel("人数  :");
	    JLabel mdizhi = new JLabel("地址 :");
	    JLabel mfangxing2 = new JLabel("房型 :");
	    JLabel mhuxing2 = new JLabel("户型 :");
	    JLabel mshengfeng2 = new JLabel("省份 :");
	    JLabel mshiqu2 = new JLabel("市区 :");
	    JLabel mxie2 = new JLabel("县 :");
	    JLabel mjiage2 = new JLabel("价格 :");
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
		    	            "确认添加？",
		    	            "提示",
		    	            JOptionPane.YES_NO_CANCEL_OPTION
		    	    );
		        	 if (result==0) {//确认添加
			    		   
			    		   querentianjia();
			    		   jf.dispose();
			    	   }else if(result==1) {//没有确认
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
			            "添加成功！",
			            " ",
			            JOptionPane.WARNING_MESSAGE
			    );   
			   MainView.huodefangzhufangwuxinxi();
   }
   else {
	   JOptionPane.showMessageDialog(
	            null,
	            "添加失败！",
	            " ",
	            JOptionPane.WARNING_MESSAGE
	    );
   }

    
}

}
