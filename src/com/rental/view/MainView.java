package com.rental.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.*;
public class MainView extends JFrame {

	
	/**
	 * @wbp.nonvisual location=30,27
	 * 
	 */	
	 static  int isdenglu=0;
	 static  int i,j,x,y1;
	 static String w,e2,r,t,q1,w1,e1,r1,t1,a;
	 static JTabbedPane tabbedPane,tabbedPane1;
	 static String yu_e,deng_lu="denglu", zhu_ce="zhuce",shou_ye="shouye",woshi_fangzhu="woshifangzhu",shai_xuan="shaixuan",_find="find",nicheng;
	 Box top,vbox,mid;
	 public static JPanel Topanel;
	 public static JPanel midpanel1;
	 public static JPanel midpanel2,panel1,paneluiyiuy,panel2,panel3;
	 static JScrollPane scrollPane;
	 static JLabel in,bac,loge,Loge,back,mfangxing,mhuxing,mshengfeng,mjiage,mshiqu,mxie,mfangxing2,mhuxing2,mshengfeng2,mjiage2,mdizhi,mshiqu2,mxie2,back1,yonghu;
	 static JButton Shouye,Fangzhu,find,SignIN,SignUP,sousuo,chengweifangzhu;
	 JTextField textfind,jiage1,dizhi;
	 static String[] listData1 ,listData2,listData3,listData4,listshi,listxie;
	 static JComboBox<String> fangxing,shengfeng,shiqu,xie,jiage,huxing,fangxing1,shengfeng1,shiqu1,xie1,huxing1;	 
	/**
	 * Create the frame.
	 */
public MainView() {
		
		String[] backimage= {"F:\\Workspace\\HouseRentalSystem\\image\\loge.jpeg","F:\\Workspace\\HouseRentalSystem\\image\\youname3.jpg","F:\\Workspace\\HouseRentalSystem\\image\\youname1.jpg"};
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Workspace\\HouseRentalSystem\\image\\zhu.jpg"));
		setTitle("房屋管理");
		setSize(930, 580);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("首页",createshouye());
        tabbedPane.addTab("我是房主", createwoshifangzhu());
        tabbedPane.addTab("房屋信息",createfangwu() );
        
       
     
        

        tabbedPane.setSelectedIndex(0);
        
       
        setContentPane(tabbedPane);
        
        
        setLocationRelativeTo(null);
        setVisible(true);
        for(j=0;j<=1000000000/1.5;j++);
       
        	
        
        while(1==1) {
        
         for(i=0;i<=2;i++) {
        	 if(isdenglu==1) {isdenglu=0;
        	 huodefangzhuzhangdan();
        	 huodefangzhudingdan();
        	 huodefangzhushenqing();
        	
             Topanel.remove(SignIN);
             yonghu=new JLabel(nicheng);
             yonghu.setBounds(750, 0, 100, 100);
             yonghu.setFont(new Font("宋体",Font.BOLD, 30));
             yonghu.addMouseListener(new MouseListener() {
         	    public void mouseClicked(MouseEvent e) {
         	    	 if (e.isMetaDown()) {
                          showPopupMenu(e.getComponent(), e.getX(), e.getY());
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
             Topanel.add(yonghu);
            }
        	Topanel.remove(back);
        	Topanel.remove(Loge);
         	bac=new JLabel();
         	loge=new JLabel();
         	loge.setBounds(0, 0, 700, 95);
     	    bac.setIcon(new ImageIcon(backimage[i]));
     	    loge.setIcon(new ImageIcon(backimage[i]));
     	    bac.setBounds(220, 100, 900, 400);
     	    Topanel.add(loge);
     	    Topanel.add(bac);
         	Topanel.repaint() ;
         	for(j=0;j<=1000000000/1.8;j++);
         	Topanel.remove(loge);
         	Topanel.remove(bac);
         	
         }} 
       
	}
/*
 * 首页面板
 * */
private  JComponent createshouye() {
        
        Topanel = new JPanel(null);
        Loge=new JLabel(new ImageIcon("F:\\Workspace\\HouseRentalSystem\\image\\youname1.jpg"));
        Loge.setBounds(0, 0, 700, 95);
        back=new JLabel();
	    back.setIcon(new ImageIcon("F:\\Workspace\\HouseRentalSystem\\image\\youname1.jpg"));
	    back.setBounds(220, 100, 900, 400);
	    in=new  JLabel();
	    in.setIcon(new ImageIcon("F:\\Workspace\\HouseRentalSystem\\image\\timg.jpg"));
	    in.setBounds(0, 100, 210, 400);
        
        find=new JButton("搜索");
        find.setBounds(120, 100, 100, 25);
        SignIN=new JButton("登录/注册");
        SignIN.setBounds(710, 25, 200, 25);
     //   SignUP=new JButton("注册");
     //   SignUP.setBounds(800, 25, 100, 25);
        textfind=new JTextField(100);
        textfind.setBounds(10,100 , 100, 25);
        mfangxing=new JLabel("房型 :");
        mhuxing=new JLabel("户型 :");
        mshengfeng=new JLabel("省份 :");
        mshiqu=new JLabel("市 :");
        mxie=new JLabel("县区 :");
        mjiage=new JLabel("价格 :");
        mshengfeng.setBounds(50,150, 100, 25);
        mfangxing.setBounds(50,300, 100, 25);
        mhuxing.setBounds(50,350, 100, 25);
        mjiage.setBounds(50,400, 100, 25);
        mshiqu.setBounds(50,200, 100, 25);
        mxie.setBounds(50,250, 100, 25);
        listData1=new String[]{"-", "写字楼",  "其他"};
        listData2=new String[]{"-","北京市", "天津市","上海市","重庆市","陕西省","河北省","山西省","辽宁省","吉林省","黑龙江省","江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","广西省","海南省","四川省","贵州省","云南省","西藏","甘肃省","青海省","宁夏","新疆","香港特别行政区","澳门特别行政区","台湾"};
        listData3=new String[]{"-","300-", "300-500", "500-700", "700+"};
        listData4=new String[]{"-", "一室一厅", "俩室一厅", "三室一厅"};
        listshi=new String[]{"-","西安市","咸阳市", "榆林市", "宝鸡市", "铜川市","渭南市","汉中市","安康市","商洛市","延安市"};
        listxie=new String[]{"-", "碑林区", "莲湖区", "灞桥区","雁塔区","阎良区","未央区","新城区","长安区","临潼区"};
        fangxing=new JComboBox<String>(listData1);
        fangxing.setBounds(110,300 , 100, 25);
        shengfeng=new JComboBox<String>(listData2);
        shengfeng.setBounds(110,150 , 100, 25);
        jiage=new JComboBox<String>(listData3);
        jiage.setBounds(110,400, 100, 25);
        huxing=new JComboBox<String>(listData4);
        huxing.setBounds(110,350 , 100, 25);
        shiqu=new JComboBox<String>(listshi);
        shiqu.setBounds(110,200, 100, 25);
        xie=new JComboBox<String>(listxie);
        xie.setBounds(110,250 , 100, 25);
        sousuo=new JButton("筛选");
        sousuo.setBounds(60,455,100,25);
       
        action(this);
      
        
        Topanel.add(Loge);
        Topanel.add(SignIN);
     //   Topanel.add(SignUP);
        Topanel.add(textfind);
        Topanel.add(find);
        Topanel.add(fangxing);
        Topanel.add(shengfeng);
        Topanel.add(mshengfeng);
        Topanel.add(mfangxing);
        Topanel.add(huxing);
        Topanel.add(jiage);
        Topanel.add(mhuxing);
        Topanel.add(mjiage);
        Topanel.add(sousuo);
        Topanel.add(back);
        Topanel.add(mshiqu);
        Topanel.add(mxie);
        Topanel.add(shiqu);
        Topanel.add(xie);
        Topanel.add(in);
       
        
        return Topanel;
    }
/*
 * 我是房主页面
 * */
private  JComponent createwoshifangzhu(){
	  tabbedPane1 = new JTabbedPane();

      tabbedPane1.addTab("我的房屋",createwodefangwu());
      tabbedPane1.addTab("账单",  createzhangdan());
      tabbedPane1.addTab("订单", createdingdan());
      tabbedPane1.addTab("申请", createshenqing());


      tabbedPane1.setSelectedIndex(0);

	return tabbedPane1;
}
/*
 * 我的房屋页面
 * */
private  JComponent createwodefangwu() {
    
    JPanel panel = new JPanel(null);
    back1=new JLabel(new ImageIcon("F:\\Workspace\\HouseRentalSystem\\image\\youname.jpg"));
    back1.setBounds(220,50,700,300);
    chengweifangzhu=new JButton("+");
    chengweifangzhu.setBounds(350,400,200,50);
    jiage1=new JTextField();
    dizhi=new JTextField();
    mdizhi=new JLabel("地址 :");
    mfangxing2=new JLabel("房型 :");
    mhuxing2=new JLabel("户型 :");
    mshengfeng2=new JLabel("省份 :");
    mshiqu2=new JLabel("市区 :");
    mxie2=new JLabel("县 :");
    mjiage2=new JLabel("价格 :");
    mdizhi.setBounds(50,350, 100, 25);
    mshengfeng2.setBounds(50,50, 100, 25);
    mfangxing2.setBounds(50,200, 100, 25);
    mhuxing2.setBounds(50,250, 100, 25);
    mjiage2.setBounds(50,300, 100, 25);
    mshiqu2.setBounds(50,100, 100, 25);
    mxie2.setBounds(50,150, 100, 25);
    fangxing1=new JComboBox<String>(listData1);
    fangxing1.setBounds(110,200 , 100, 25);
    shengfeng1=new JComboBox<String>(listData2);
    shengfeng1.setBounds(110,50 , 100, 25);
    dizhi.setBounds(110,350, 500, 25);
    jiage1.setBounds(110,300, 100, 25);
    huxing1=new JComboBox<String>(listData4);
    huxing1.setBounds(110,250 , 100, 25);
    shiqu1=new JComboBox<String>(listshi);
    shiqu1.setBounds(110,100, 100, 25);
    xie1=new JComboBox<String>(listxie);
    xie1.setBounds(110,150 , 100, 25);
    action1(this);
    panel.add(back1);
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
    return panel;
}
/*
 * 账单页面
 * */
private  JComponent createzhangdan() {
    
    panel1 = new JPanel(null);

 
    

    return panel1;
}
/*
 * 订单面板
 * */
private  JComponent createdingdan() {
    
	paneluiyiuy = new JPanel(null);
    
 
    

    return paneluiyiuy;
}
/*
 * 
 * 申请面板
 * 
 * */
private  JComponent createshenqing() { 
    
    panel3 = new JPanel(null);

 
    

    return panel3;
}
/*
 * 房屋信息
 * */
private static JComponent createfangwu() {
	 //   scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    midpanel2=new JPanel(null);
	   
	//    scrollPane.add(midpanel2);
	 
	    

	    return  midpanel2;
}
/*
 * 我的订单
 * */
private static JComponent createwodedingdan() { 
    
	panel2 = new JPanel(null);
    
 
    

    return panel2;
}

/*
 * 账户管理
 * */
private static JComponent createzhanghuguanli() { 
    
    JPanel panel1 = new JPanel(null);
    
 
    

    return panel1;
}
/*
 * 动态的jlbel接口带点击事件（点击显示房屋的详细信息）
 * */
private static void newJLable(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("宋体",Font.BOLD, 30));
	i.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	      new HouseOwnerView(str);
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
	midpanel2.add(i);
	midpanel2.repaint();
}
/*
 * 动态的jlbel接口带点击事件（点击显示账单的处理）
 * */
private static void newJLablezhangdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("宋体",Font.BOLD, 30));
	i.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	     
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
	panel1.add(i);
	panel1.repaint();
}
/*
 * 动态的jlbel接口带点击事件（点击显示订单的处理）
 * */
private static void newJLabledingdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("宋体",Font.BOLD, 30));
	i.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	     
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
	paneluiyiuy.add(i);
	paneluiyiuy.repaint();
}
/*
 * 动态的jlbel接口带点击事件（点击显示我的订单的处理）
 * */
private static void newJLablewodedingdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("宋体",Font.BOLD, 30));
	i.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	     
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
	panel2.add(i);
	panel2.repaint();
}
/*
 * 动态的jlbel接口带点击事件（点击显示我的申请的处理）
 * */
private static void newJLableshengqing(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("宋体",Font.BOLD, 30));
	i.addMouseListener(new MouseListener() {
	    public void mouseClicked(MouseEvent e) {
	     
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
	panel3.add(i);
	panel3.repaint();
}
/*
 * 获得用户昵称
 * */
public static void hudenicheng(String str) {
	nicheng=str;
}

/*
 *  首页的事件
 * */
public static void action(JFrame jf) {
	 	x=0;
	    
		SignIN.setActionCommand(deng_lu);
	//	SignUP.setActionCommand(deng_lu);		
		find.setActionCommand(_find);
		sousuo.setActionCommand(shai_xuan);
		ActionListener listener = new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		       
		        String command = e.getActionCommand();

		        // 根据动作命令区分被点击的按钮
		        if (deng_lu.equals(command)) {
		        	anxiadenglu_zhuce(jf);
		           
		        } else if(_find.equals(command)) {
		        	//按下搜索
		        	
		        }else if(shou_ye.equals(command)) {
		        	System.out.println("sss");
	                
	
		        }else if(shai_xuan.equals(command)) {
		        	//按下筛选
		        	tabbedPane.setSelectedIndex(2);
		        	midpanel2.repaint();
		        	anxiashaxuan();
		        	
		        	
		        }
		    }

				
		};
	
		SignIN.addActionListener(listener);
	//	SignUP.addActionListener(listener);
		find.addActionListener(listener);
		
		sousuo.addActionListener(listener);
	}
/*
 * 
 * 
 *     我是房主页面的事件
 * 
 * */
public static void action1(JFrame jf) {
		chengweifangzhu.setActionCommand(shou_ye);
		ActionListener listener = new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	       
	        String command = e.getActionCommand();
	       if(shou_ye.equals(command)) {
	    	   int result=JOptionPane.showConfirmDialog(
	    	            jf,
	    	            "确认添加？",
	    	            "提示",
	    	            JOptionPane.YES_NO_CANCEL_OPTION
	    	    );
	    	   
	    	   if (result==0) {//确认添加
	    		   System.out.println("yes");
	    	   }else if(result==1) {//没有确认
	    		   System.out.println("no");
	    	   }else{
                
	    	   }
	       }
	        }
		
		};
		
		chengweifangzhu.addActionListener(listener);
	}
/*
 * 菜单栏及对应的事件
 * */
public static void showPopupMenu(Component invoker, int x, int y) {
	JPopupMenu popupMenu = new JPopupMenu();
	
	JMenuItem copyMenuItem = new JMenuItem("我的订单");
    JMenu pasteMenuItem = new JMenu("余额");
    JMenuItem editMenu = new JMenuItem("账户管理");   
    JMenuItem fileMenu = new JMenuItem("退出");
    JMenuItem findMenuItem = new JMenuItem(huodeyu_e());
    pasteMenuItem.add(findMenuItem);
    popupMenu.add(copyMenuItem);
    popupMenu.addSeparator(); 
    popupMenu.add(editMenu);
    popupMenu.addSeparator();      
    popupMenu.add(pasteMenuItem);
    popupMenu.addSeparator(); 
    popupMenu.add(fileMenu);

    copyMenuItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {//订单被点击
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
        	tabbedPane.addTab("我的订单",createwodedingdan() );
        	tabbedPane.setSelectedIndex(3);
        	wodedingdan();
        	
        }
    });
   
    editMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {//账户管理被点击
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
        	tabbedPane.addTab("账户管理",createzhanghuguanli()  );
        	tabbedPane.setSelectedIndex(3);
        	
        }
    });
    fileMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {//退出被点击
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
            Topanel.remove(yonghu);
            Topanel.add(SignIN);
      //      Topanel.add(SignUP);
        
        }
    });
    // ......

    // 在指定位置显示弹出菜单
    
    popupMenu.show(invoker, x, y);
}
/*
 * 从数据库获得符号条件的房屋信息并创造出jlabel
 * */
public static void huodefangwuxinxi() {
	newJLable("房屋信息",10,10,700,25);
}

/*
 * 从数据库获得房主的账单
 * */
public static void huodefangzhuzhangdan() {
	newJLablezhangdan("账单",10,10,700,25);
}
/*
 * 从数据库获得房主的订单
 * */
public static void huodefangzhudingdan() {
	newJLabledingdan("订单",10,10,700,25);
}
/*
 * 从数据库获得房主的申请
 * */
public static void huodefangzhushenqing() {
	newJLableshengqing("申请",10,10,700,25);
}
/*
 * 从数据库获得我的订单信息
 * */
public static void wodedingdan() {
	newJLablewodedingdan("我的订单",10,10,700,25);
}

/*
 * 按下搜索
 * */
public static void anxiasousuo() {
	
}
/*
 * 按下筛选
 * */
public static void anxiashaxuan() {
	q1=(String)huxing.getSelectedItem();
	System.out.println(q1);
	huodefangwuxinxi();
}
/*
 * 按下登录或者注册
 * */
public static void anxiadenglu_zhuce(JFrame jf) {
	 new SignInView(jf);
}
/*
 * 获得余额
 * */
public static String huodeyu_e() {
	return "1000";
}
}

