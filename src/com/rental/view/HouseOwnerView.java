package com.rental.view;

import com.rental.controller.EvaluateController;
import com.rental.controller.FilterController;
import com.rental.controller.HouseController;
import com.rental.controller.OrderController;
import com.rental.controller.SeeController;
import com.rental.controller.SignController;
import com.rental.domain.BillBean;
import com.rental.domain.EvaluateBean;
import com.rental.domain.HouseBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class HouseOwnerView extends JFrame {

	

	/**
	 * Launch the application.
	 */
	JPanel tabbedPane;
	static JPanel tabbedjingjia;
	JLabel pingjia,loge,jiage,kezhurenshu,xiangxidizhi;
	static JButton shenqing,dinggou;
	static JTabbedPane tabbedPane1;
	/**
	 * Create the frame.
	 */
	public HouseOwnerView(HouseBean hou) {
		
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setBackground(Color.GRAY);
		setTitle("房屋信息");
		setSize(600, 400);
		tabbedPane1 = new JTabbedPane();
		tabbedPane=new JPanel(null);
        shenqing=new JButton("申请看房");
        dinggou=new JButton("订购");
        dinggou.setBounds(25,260,100,25);
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
        tabbedPane.add(dinggou);
        tabbedPane.add(shenqing);
        tabbedPane.add(pingjia);
        tabbedPane.add(loge);
        tabbedPane.add(jiage);
        tabbedPane.add(kezhurenshu);
        tabbedPane.add(xiangxidizhi);
       
		tabbedPane1.addTab("基本信息",tabbedPane );
		tabbedPane1.addTab("评价",createpingjia() );
		huodepingjia(hou);
        setContentPane(tabbedPane1);
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
		dinggou.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	 // 按下订购
	        	 if(new OrderController().isMoneyEnough(hou.rent)){
					   if(new OrderController().add(hou.householder,hou.house_id, hou.rent))
					   JOptionPane.showMessageDialog(
							   null,
							   "订购成功！",
							   "",
							   JOptionPane.WARNING_MESSAGE
					   );
					   else
						   JOptionPane.showMessageDialog(
								   null,
								   "订购失败！",
								   "",
								   JOptionPane.WARNING_MESSAGE
						   );
	        }
	        	 else
					   JOptionPane.showMessageDialog(
							   null,
							   "余额不足请先充值！",
							   "",
							   JOptionPane.WARNING_MESSAGE
					   );
	       }
	    });
	}
public static JComponent createpingjia() {
	tabbedjingjia=new JPanel(new FlowLayout());
	JScrollPane scrollPane = new JScrollPane(tabbedjingjia, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	tabbedjingjia.setPreferredSize(new Dimension(70, 6000));
	scrollPane.getVerticalScrollBar().setUnitIncrement(30);
	return scrollPane;
}
public static void newJlabei(EvaluateBean str,HouseBean hou) {
	JPopupMenu popupMenu1 = new JPopupMenu();
	JMenuItem edit2 = new JMenuItem("删除评论！");
	popupMenu1.addSeparator();
	popupMenu1.add(edit2);
	
	edit2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {//删除评论被点击
			if(new EvaluateController().delete(str.eva_id)){
				huodepingjia(hou);
			}

		}
	});
	JLabel j=new JLabel(str.name+" :");
	j.setFont(new Font("宋体", Font.BOLD, 20));
	tabbedjingjia.add(j);
	xianshixingxing(str.star);
	
	
	JLabel h=new JLabel("                                                                                              ");
	tabbedjingjia.add(h);
	JTextArea i = new JTextArea(2, 50);
	i.setLineWrap(true);
	i.setEditable(false);
	i.setText("评论："+str.evaluate_s);
	i.setFont(new Font("宋体",Font.PLAIN, 20));
	
	if(SignController.user.tenant_id==str.tenant_dd)
		i.addMouseListener(new MouseListener() {
			
	    public void mouseClicked(MouseEvent e) {
	    	 popupMenu1.show(e.getComponent(), e.getX(), e.getY());
	    
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
	tabbedjingjia.add(i);
	tabbedjingjia.repaint();
	
}
public static void huodepingjia(HouseBean hou) {
	tabbedjingjia.removeAll();
	tabbedjingjia.repaint();
	EvaluateBean n;
	List<EvaluateBean> pingjialist=new EvaluateController().getEvaList(hou.house_id);
	
	Iterator<EvaluateBean> it1=pingjialist.iterator();
	while(it1.hasNext()) {
		n=it1.next();
		newJlabei(n,hou);	
	}
}
public static void xianshixingxing(int num) {
	
	 	if(num==0){
	 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		tabbedjingjia.add(a);
	 		tabbedjingjia.add(b);
	 		tabbedjingjia.add(c);
	 		tabbedjingjia.add(d);
	 		tabbedjingjia.add(e);
	 		
		}
	 	if(num==1){
	 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		tabbedjingjia.add(a);
	 		tabbedjingjia.add(b);
	 		tabbedjingjia.add(c);
	 		tabbedjingjia.add(d);
	 		tabbedjingjia.add(e);
	 		
	 	}
	 	if(num==2){
	 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		tabbedjingjia.add(a);
	 		tabbedjingjia.add(b);
	 		tabbedjingjia.add(c);
	 		tabbedjingjia.add(d);
	 		tabbedjingjia.add(e);
	 		
	 	}
		if(num==3){
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		tabbedjingjia.add(a);
 		tabbedjingjia.add(b);
 		tabbedjingjia.add(c);
 		tabbedjingjia.add(d);
 		tabbedjingjia.add(e);
 		
 	   	}
		if(num==4){
	 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
	 		tabbedjingjia.add(a);
	 		tabbedjingjia.add(b);
	 		tabbedjingjia.add(c);
	 		tabbedjingjia.add(d);
	 		tabbedjingjia.add(e);
	 		
	 	   	}
		if(num==5){
	 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		JLabel e=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
	 		tabbedjingjia.add(a);
	 		tabbedjingjia.add(b);
	 		tabbedjingjia.add(c);
	 		tabbedjingjia.add(d);
	 		tabbedjingjia.add(e);
	 		
	 	   	}
}
	

}