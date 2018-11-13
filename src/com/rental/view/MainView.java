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
		setTitle("���ݹ���");
		setSize(930, 580);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab("��ҳ",createshouye());
        tabbedPane.addTab("���Ƿ���", createwoshifangzhu());
        tabbedPane.addTab("������Ϣ",createfangwu() );
        
       
     
        

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
             yonghu.setFont(new Font("����",Font.BOLD, 30));
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
 * ��ҳ���
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
        
        find=new JButton("����");
        find.setBounds(120, 100, 100, 25);
        SignIN=new JButton("��¼/ע��");
        SignIN.setBounds(710, 25, 200, 25);
     //   SignUP=new JButton("ע��");
     //   SignUP.setBounds(800, 25, 100, 25);
        textfind=new JTextField(100);
        textfind.setBounds(10,100 , 100, 25);
        mfangxing=new JLabel("���� :");
        mhuxing=new JLabel("���� :");
        mshengfeng=new JLabel("ʡ�� :");
        mshiqu=new JLabel("�� :");
        mxie=new JLabel("���� :");
        mjiage=new JLabel("�۸� :");
        mshengfeng.setBounds(50,150, 100, 25);
        mfangxing.setBounds(50,300, 100, 25);
        mhuxing.setBounds(50,350, 100, 25);
        mjiage.setBounds(50,400, 100, 25);
        mshiqu.setBounds(50,200, 100, 25);
        mxie.setBounds(50,250, 100, 25);
        listData1=new String[]{"-", "д��¥",  "����"};
        listData2=new String[]{"-","������", "�����","�Ϻ���","������","����ʡ","�ӱ�ʡ","ɽ��ʡ","����ʡ","����ʡ","������ʡ","����ʡ","�㽭ʡ","����ʡ","����ʡ","����ʡ","ɽ��ʡ","����ʡ","����ʡ","����ʡ","�㶫ʡ","����ʡ","����ʡ","�Ĵ�ʡ","����ʡ","����ʡ","����","����ʡ","�ຣʡ","����","�½�","����ر�������","�����ر�������","̨��"};
        listData3=new String[]{"-","300-", "300-500", "500-700", "700+"};
        listData4=new String[]{"-", "һ��һ��", "����һ��", "����һ��"};
        listshi=new String[]{"-","������","������", "������", "������", "ͭ����","μ����","������","������","������","�Ӱ���"};
        listxie=new String[]{"-", "������", "������", "�����","������","������","δ����","�³���","������","������"};
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
        sousuo=new JButton("ɸѡ");
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
 * ���Ƿ���ҳ��
 * */
private  JComponent createwoshifangzhu(){
	  tabbedPane1 = new JTabbedPane();

      tabbedPane1.addTab("�ҵķ���",createwodefangwu());
      tabbedPane1.addTab("�˵�",  createzhangdan());
      tabbedPane1.addTab("����", createdingdan());
      tabbedPane1.addTab("����", createshenqing());


      tabbedPane1.setSelectedIndex(0);

	return tabbedPane1;
}
/*
 * �ҵķ���ҳ��
 * */
private  JComponent createwodefangwu() {
    
    JPanel panel = new JPanel(null);
    back1=new JLabel(new ImageIcon("F:\\Workspace\\HouseRentalSystem\\image\\youname.jpg"));
    back1.setBounds(220,50,700,300);
    chengweifangzhu=new JButton("+");
    chengweifangzhu.setBounds(350,400,200,50);
    jiage1=new JTextField();
    dizhi=new JTextField();
    mdizhi=new JLabel("��ַ :");
    mfangxing2=new JLabel("���� :");
    mhuxing2=new JLabel("���� :");
    mshengfeng2=new JLabel("ʡ�� :");
    mshiqu2=new JLabel("���� :");
    mxie2=new JLabel("�� :");
    mjiage2=new JLabel("�۸� :");
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
 * �˵�ҳ��
 * */
private  JComponent createzhangdan() {
    
    panel1 = new JPanel(null);

 
    

    return panel1;
}
/*
 * �������
 * */
private  JComponent createdingdan() {
    
	paneluiyiuy = new JPanel(null);
    
 
    

    return paneluiyiuy;
}
/*
 * 
 * �������
 * 
 * */
private  JComponent createshenqing() { 
    
    panel3 = new JPanel(null);

 
    

    return panel3;
}
/*
 * ������Ϣ
 * */
private static JComponent createfangwu() {
	 //   scrollPane = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    midpanel2=new JPanel(null);
	   
	//    scrollPane.add(midpanel2);
	 
	    

	    return  midpanel2;
}
/*
 * �ҵĶ���
 * */
private static JComponent createwodedingdan() { 
    
	panel2 = new JPanel(null);
    
 
    

    return panel2;
}

/*
 * �˻�����
 * */
private static JComponent createzhanghuguanli() { 
    
    JPanel panel1 = new JPanel(null);
    
 
    

    return panel1;
}
/*
 * ��̬��jlbel�ӿڴ�����¼��������ʾ���ݵ���ϸ��Ϣ��
 * */
private static void newJLable(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("����",Font.BOLD, 30));
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
 * ��̬��jlbel�ӿڴ�����¼��������ʾ�˵��Ĵ���
 * */
private static void newJLablezhangdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("����",Font.BOLD, 30));
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
 * ��̬��jlbel�ӿڴ�����¼��������ʾ�����Ĵ���
 * */
private static void newJLabledingdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("����",Font.BOLD, 30));
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
 * ��̬��jlbel�ӿڴ�����¼��������ʾ�ҵĶ����Ĵ���
 * */
private static void newJLablewodedingdan(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("����",Font.BOLD, 30));
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
 * ��̬��jlbel�ӿڴ�����¼��������ʾ�ҵ�����Ĵ���
 * */
private static void newJLableshengqing(String str,int s,int y,int m,int n) {
	JLabel i=new JLabel(str);
	i.setBounds(s,y,m,n);
	i.setFont(new Font("����",Font.BOLD, 30));
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
 * ����û��ǳ�
 * */
public static void hudenicheng(String str) {
	nicheng=str;
}

/*
 *  ��ҳ���¼�
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

		        // ���ݶ����������ֱ�����İ�ť
		        if (deng_lu.equals(command)) {
		        	anxiadenglu_zhuce(jf);
		           
		        } else if(_find.equals(command)) {
		        	//��������
		        	
		        }else if(shou_ye.equals(command)) {
		        	System.out.println("sss");
	                
	
		        }else if(shai_xuan.equals(command)) {
		        	//����ɸѡ
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
 *     ���Ƿ���ҳ����¼�
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
	    	            "ȷ����ӣ�",
	    	            "��ʾ",
	    	            JOptionPane.YES_NO_CANCEL_OPTION
	    	    );
	    	   
	    	   if (result==0) {//ȷ�����
	    		   System.out.println("yes");
	    	   }else if(result==1) {//û��ȷ��
	    		   System.out.println("no");
	    	   }else{
                
	    	   }
	       }
	        }
		
		};
		
		chengweifangzhu.addActionListener(listener);
	}
/*
 * �˵�������Ӧ���¼�
 * */
public static void showPopupMenu(Component invoker, int x, int y) {
	JPopupMenu popupMenu = new JPopupMenu();
	
	JMenuItem copyMenuItem = new JMenuItem("�ҵĶ���");
    JMenu pasteMenuItem = new JMenu("���");
    JMenuItem editMenu = new JMenuItem("�˻�����");   
    JMenuItem fileMenu = new JMenuItem("�˳�");
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
        public void actionPerformed(ActionEvent e) {//���������
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
        	tabbedPane.addTab("�ҵĶ���",createwodedingdan() );
        	tabbedPane.setSelectedIndex(3);
        	wodedingdan();
        	
        }
    });
   
    editMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {//�˻��������
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
        	tabbedPane.addTab("�˻�����",createzhanghuguanli()  );
        	tabbedPane.setSelectedIndex(3);
        	
        }
    });
    fileMenu.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {//�˳������
        	if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
            Topanel.remove(yonghu);
            Topanel.add(SignIN);
      //      Topanel.add(SignUP);
        
        }
    });
    // ......

    // ��ָ��λ����ʾ�����˵�
    
    popupMenu.show(invoker, x, y);
}
/*
 * �����ݿ��÷��������ķ�����Ϣ�������jlabel
 * */
public static void huodefangwuxinxi() {
	newJLable("������Ϣ",10,10,700,25);
}

/*
 * �����ݿ��÷������˵�
 * */
public static void huodefangzhuzhangdan() {
	newJLablezhangdan("�˵�",10,10,700,25);
}
/*
 * �����ݿ��÷����Ķ���
 * */
public static void huodefangzhudingdan() {
	newJLabledingdan("����",10,10,700,25);
}
/*
 * �����ݿ��÷���������
 * */
public static void huodefangzhushenqing() {
	newJLableshengqing("����",10,10,700,25);
}
/*
 * �����ݿ����ҵĶ�����Ϣ
 * */
public static void wodedingdan() {
	newJLablewodedingdan("�ҵĶ���",10,10,700,25);
}

/*
 * ��������
 * */
public static void anxiasousuo() {
	
}
/*
 * ����ɸѡ
 * */
public static void anxiashaxuan() {
	q1=(String)huxing.getSelectedItem();
	System.out.println(q1);
	huodefangwuxinxi();
}
/*
 * ���µ�¼����ע��
 * */
public static void anxiadenglu_zhuce(JFrame jf) {
	 new SignInView(jf);
}
/*
 * ������
 * */
public static String huodeyu_e() {
	return "1000";
}
}

