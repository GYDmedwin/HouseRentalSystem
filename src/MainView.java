package com.rental.view;

import com.rental.controller.*;
import com.rental.domain.BillBean;
import com.rental.domain.HouseBean;
import com.rental.domain.OrderBean;
import com.rental.domain.SeeBean;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class MainView extends JFrame {
	static List<HouseBean> houselist;
	static Iterator<HouseBean> it;
	static int isdenglu = 0;
	static int i, j, x, y1, dengluandzhuce = 0, i1 = 1000000000;
	static String w, e2, r, t, q1, w1, e1, r1, t1, a, b, c, d, f, g, h;
	static JTabbedPane tabbedPane, tabbedPane1;
	static String yu_e, deng_lu = "denglu", zhu_ce = "zhuce", shou_ye = "shouye", woshi_fangzhu = "woshifangzhu",
			shai_xuan = "shaixuan", _find = "find", nicheng, zhanghao;
	Box top, vbox, mid;
	public static JPanel Topanel, panel, panelshenqing;
	public static JPanel midpanel1;
	public static JPanel midpanel2, panel1, paneluiyiuy, panel2, panel3;
	static JScrollPane scrollPane;
	static JLabel in, bac, loge, Loge, back, back11, back12, mfangxing, mhuxing, mshengfeng, mjiage, mshiqu, mxie,
			mfangxing2, mhuxing2, mshengfeng2, mjiage2, mdizhi, mshiqu2, mxie2, back1, yonghu;
	static JButton Shouye, Fangzhu, find, SignIN, SignUP, sousuo, chengweifangzhu;
	JTextField textfind;
	static JTextField jiage1;
	static JTextField dizhi;
	static String[] listData1, listData2, listData3, listData4, listshi, listxie;
	static JComboBox<String> fangxing, shengfeng, shiqu, xie, jiage, huxing, fangxing1, shengfeng1, shiqu1, xie1,
			huxing1;
     static String[] bieshu= { "。。\\..\\image\\别墅10.png", "。。\\..\\image\\别墅5.png", "。。\\..\\image\\别墅6.png", "。。\\..\\image\\别墅7.png",
    		 "。。\\..\\image\\别墅8.png", "。。\\..\\image\\别墅9.png"};
     static String[] gongyu= { "。。\\..\\image\\公寓1.png", "。。\\..\\image\\公寓10.png", "。。\\..\\image\\公寓5.png", "。。\\..\\image\\公寓6.png",
    		 "。。\\..\\image\\公寓7.png", "。。\\..\\image\\公寓8.png"};
     static String[] xiezilou= { "。。\\..\\image\\写字楼1.png", "。。\\..\\image\\写字楼10.png", "。。\\..\\image\\写字楼2.png", "。。\\..\\image\\写字楼3.png",
    		 "。。\\..\\image\\写字楼4.png", "。。\\..\\image\\写字楼5.png"};
     static  int bieshunum=0,gongyunum=0,xiezilounum=0;
	/**
	 * Create the frame.
	 */

	public MainView() {

		String[] backimage = { "。。\\..\\image\\gongyu4.png", "。。\\..\\image\\bieshu1.png",
				"。。\\..\\image\\xiezilou7.png", "。。\\..\\image\\公寓1.png" };
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setTitle("房屋管理");
		setSize(930, 580);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("首页", createshouye());
		tabbedPane.addTab("房屋信息", createfangwu());

		tabbedPane.setSelectedIndex(0);

		setContentPane(tabbedPane);

		setLocationRelativeTo(null);
		setVisible(true);
		for (j = 0; j <= 1000000000 / 1.5; j++)
			;

		while (1 == 1) {

			for (i = 0; i <= 3; i++) {
				if (isdenglu == 1) {
					isdenglu = 0;
					if(SignController.user.isHouseHolder) {
						tabbedPane.addTab("我是房主", createwoshifangzhu());
						huodefangzhuzhangdan();
						huodefangzhudingdan();
						huodefangzhushenqing();
						huodefangzhufangwuxinxi();
					}
					Topanel.remove(SignIN);
					yonghu = new JLabel();
					yonghu.setText(nicheng);
					yonghu.setIcon(image.gaibiandaxiao("。。\\..\\image\\touxiang.jpg", 60, 60));
					// yonghu.setHorizontalTextPosition(SwingConstants.CENTER);
					// yonghu.setVerticalTextPosition(SwingConstants.BOTTOM);

					yonghu.setBounds(730, 0, 200, 100);
					yonghu.setFont(new Font("宋体", Font.BOLD, 30));
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
					});
					Topanel.add(yonghu);

				}
				Topanel.remove(back);
				Topanel.remove(Loge);
				bac = new JLabel();
				loge = new JLabel();
				loge.setBounds(0, 0, 700, 95);
				bac.setIcon(new ImageIcon(backimage[i]));
				loge.setIcon(new ImageIcon(backimage[i]));
				bac.setBounds(220, 100, 900, 400);
				Topanel.add(loge);
				Topanel.add(bac);
				Topanel.repaint();
				for (j = 0; j <= 1000000000 / 1.8; j++)
					;
				Topanel.remove(loge);
				Topanel.remove(bac);

			}
		}

	}

	/*
	 * 首页面板
	 */
	private JComponent createshouye() {

		Topanel = new JPanel(null);
		Loge = new JLabel(new ImageIcon("。。\\..\\image\\bieshu1.png"));
		Loge.setBounds(0, 0, 700, 95);
		back = new JLabel();
		back.setIcon(new ImageIcon("。。\\..\\image\\bieshu1.png"));
		back.setBounds(220, 100, 900, 400);
		

		find = new JButton("搜索");
		find.setBounds(120, 100, 100, 25);
		SignIN = new JButton("登录/注册");
		SignIN.setBounds(710, 25, 200, 25);
		textfind = new JTextField(100);
		textfind.setBounds(10, 100, 100, 25);
		mfangxing = new JLabel("房型 :");
		mhuxing = new JLabel("户型 :");
		mshengfeng = new JLabel("省份 :");
		mshiqu = new JLabel("市 :");
		mxie = new JLabel("县区 :");
		mjiage = new JLabel("价格 :");
		mshengfeng.setBounds(50, 150, 100, 25);
		mfangxing.setBounds(50, 300, 100, 25);
		mhuxing.setBounds(50, 350, 100, 25);
		mjiage.setBounds(50, 400, 100, 25);
		mshiqu.setBounds(50, 200, 100, 25);
		mxie.setBounds(50, 250, 100, 25);
		listData1 = new String[] { "-", "写字楼", "其他" };
		listData2 = new String[] { "-", "北京市", "天津市", "上海市", "重庆市", "陕西省", "河北省", "山西省", "辽宁省", "吉林省", "黑龙江省", "江苏省",
				"浙江省", "安徽省", "福建省", "江西省", "山东省", "河南省", "湖北省", "湖南省", "广东省", "广西省", "海南省", "四川省", "贵州省", "云南省", "西藏",
				"甘肃省", "青海省", "宁夏", "新疆", "香港特别行政区", "澳门特别行政区", "台湾" };
		listData3 = new String[] { "-", "700-", "700-2000", "2000-5000", "5000+" };
		listData4 = new String[] { "-", "一室一厅", "俩室一厅", "三室一厅" };
		listshi = new String[] { "-", "西安市", "咸阳市", "榆林市", "宝鸡市", "铜川市", "渭南市", "汉中市", "安康市", "商洛市", "延安市" };
		listxie = new String[] { "-", "碑林区", "莲湖区", "灞桥区", "雁塔区", "阎良区", "未央区", "新城区", "长安区", "临潼区" };
		fangxing = new JComboBox<String>(listData1);
		fangxing.setBounds(110, 300, 100, 25);
		shengfeng = new JComboBox<String>(listData2);
		shengfeng.setBounds(110, 150, 100, 25);
		jiage = new JComboBox<String>(listData3);
		jiage.setBounds(110, 400, 100, 25);
		huxing = new JComboBox<String>(listData4);
		huxing.setBounds(110, 350, 100, 25);
		shiqu = new JComboBox<String>(listshi);
		shiqu.setBounds(110, 200, 100, 25);
		xie = new JComboBox<String>(listxie);
		xie.setBounds(110, 250, 100, 25);
		sousuo = new JButton("筛选");
		sousuo.setBounds(60, 455, 100, 25);

		action(this);

		Topanel.add(Loge);
		Topanel.add(SignIN);
		
	
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
		

		return Topanel;
	}

	/*
	 * 我是房主页面
	 */
	private static JComponent createwoshifangzhu() {
		tabbedPane1 = new JTabbedPane();

		tabbedPane1.addTab("我的房屋", createwodefangwu());
		tabbedPane1.addTab("账单", createzhangdan());
		tabbedPane1.addTab("订单", createdingdan());
		tabbedPane1.addTab("申请", createshenqing());

		tabbedPane1.setSelectedIndex(0);

		return tabbedPane1;
	}

	/*
	 * 我的房屋页面
	 */
	private static JComponent createwodefangwu() {

		panel = new JPanel(null);
		panel = new JPanel(null);
		JScrollPane scrollPane1 = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;

	}

	/*
	 * 账单页面
	 */
	private static JComponent createzhangdan() {

		panel1 = new JPanel(null);
		JScrollPane scrollPane1 = new JScrollPane(panel1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel1.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;
	}

	/*
	 * 订单面板
	 */
	private static JComponent createdingdan() {

		paneluiyiuy = new JPanel(null);
		
		JScrollPane scrollPane1 = new JScrollPane(paneluiyiuy, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		paneluiyiuy.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;
		
	}

	/*
	 * 
	 * 申请面板
	 * 
	 */
	private static JComponent createshenqing() {

		panel3 = new JPanel(null);
		
		JScrollPane scrollPane1 = new JScrollPane(panel3, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel3.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;
		
	}

	/*
	 * 房屋信息
	 */
	private static JComponent createfangwu() {

		midpanel2 = new JPanel(null);
		scrollPane = new JScrollPane(midpanel2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// scrollPane.add(midpanel2);
		midpanel2.setPreferredSize(new Dimension(70, 6000));
		scrollPane.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane;
	}

	/*
	 * 我的订单
	 */
	private static JComponent createwodedingdan() {

		panel2 = new JPanel(null);
		
		JScrollPane scrollPane1 = new JScrollPane(panel2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel2.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;
		
	}
	
	/*
	 * 我的申请、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、、
	 * */
	private static JComponent createzhanghuguanli() { 
	    
	    panelshenqing = new JPanel(null);
	   
		JScrollPane scrollPane1 = new JScrollPane(panelshenqing, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panelshenqing.setPreferredSize(new Dimension(70, 6000));
		scrollPane1.getVerticalScrollBar().setUnitIncrement(30);
		return scrollPane1;
	 
	    

	   
	}
	/*
	 * 我的房屋信息的JLable（用来显示房屋信息）
	 * */
	private static void newJLablewodefangwu(HouseBean hou,int s,int y,int m,int n,int xy) {
		JLabel i=new JLabel();
		JPopupMenu popupMenu1 = new JPopupMenu();
		JMenuItem edit = new JMenuItem("修改价格");
		JMenuItem edit2 = new JMenuItem("删除！");
		popupMenu1.add(edit);
		popupMenu1.addSeparator();
		popupMenu1.add(edit2);
		edit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//修改价格被点击
				String inputContent = JOptionPane.showInputDialog(
						null,
						"新的价格:",
						"修改价格 ||"
				);
				if(inputContent!=null||inputContent!="") {new HouseController().update(inputContent, hou.house_id);
					huodefangzhufangwuxinxi();}
			}
		});
		edit2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//删除被点击
				new HouseController().delete(hou.house_id);
				huodefangzhufangwuxinxi();
			}
		});
		if(xy==0) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || 未交费");
			if(hou.type.equals("别墅")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("写字楼")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("公寓")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("其他")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
		if(xy==1) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || 待租赁");
			if(hou.type.equals("别墅")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("写字楼")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("公寓")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("其他")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
			
		if(xy==2) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || 已租赁");
			if(hou.type.equals("别墅")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("写字楼")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("公寓")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("其他")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		
		}
			
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 15));
		i.addMouseListener(new MouseListener() {

							   public void mouseClicked(MouseEvent e) {
								   //	public boolean
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
		panel.add(i);
		panel.repaint();

	}


	/*
	 * 动态的jlbel接口带点击事件（点击显示房屋的详细信息）
	 * */
	private static void newJLable(HouseBean hou,int s,int y,int m,int n,int xy,JFrame jf) {
		JLabel i=new JLabel(hou.province+" | "+hou.city+" | "+hou.county+" | "+hou.type+" | "+hou.h_type);
		if(xy==1) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || 待租赁");
			if(hou.type.equals("别墅")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("写字楼")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("公寓")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("其他")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
			
		if(xy==2) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || 已租赁");
			if(hou.type.equals("别墅")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("写字楼")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("公寓")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("其他")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		
		}
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 15));
		i.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	if(SignController.user==null) 
		    		new SignInView(jf);
		    	else
		            new HouseOwnerView(hou);
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
	private static void newJLablezhangdan(BillBean str,int s,int y,int m,int n) {
		JLabel i;
		if(str.pay==1) i=new JLabel(str.type+str.charge+"   ||已支付");
		else {
			i=new JLabel(str.type+str.charge+"   ||未支付");

			i.addMouseListener(new MouseListener() {
								   public void mouseClicked(MouseEvent e) {
									   int result=JOptionPane.showConfirmDialog(
											   null,
											   "确认缴费？",
											   "提示",
											   JOptionPane.YES_NO_CANCEL_OPTION
									   );
									   if (result==0) {//确认添加

										   
										  
										   if(new BillController().isMoneyEnough(str.charge)) {
											   if(new BillController().payBill(str.bill_id,str.charge)) {
												   JOptionPane.showMessageDialog(
														   null,
														   "缴费成功！",
														   "",
														   JOptionPane.WARNING_MESSAGE
												   );
												   huodefangzhuzhangdan();
											   }
											   else
												   JOptionPane.showMessageDialog(
														   null,
														   "缴费失败！",
														   "",
														   JOptionPane.WARNING_MESSAGE
												   );
										   }
										   else {
											   JOptionPane.showMessageDialog(
													   null,
													   "缴费金额不足！请重充值！！",
													   "",
													   JOptionPane.WARNING_MESSAGE
											   );
										   }

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
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 20));
		panel1.add(i);
		panel1.repaint();
	}





	/*
	 * 动态的jlbel接口带点击事件（点击显示订单的处理）
	 * */
	private static void newJLabledingdan(OrderBean str,int s,int y,int m,int n) {
		JLabel i=new JLabel("姓名："+str.name+"|地址："+str.address+"|租金￥："+str.charge+"|税率 :"+str.tax.multiply(new BigDecimal(100))+"%");
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 20));
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
	private static void newJLablewodedingdan(OrderBean str,int s,int y,int m,int n) {
		JLabel i=new JLabel(str.name+"|"+str.address+"|"+str.charge);
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 20));
		i.addMouseListener(new MouseListener() {
							   public void mouseClicked(MouseEvent e) {
								   new pingjia(str);
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
	private static void newJLableshengqing(SeeBean seebean,int s,int y,int m,int n) {
		JLabel i;
		if(seebean.agree!=0) {
			if(seebean.agree==1)
				i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id+"     ||已同意");
			else
				i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id+"     ||未同意");
		 }
		else {  i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id);
		
		i.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	 int result=JOptionPane.showConfirmDialog(
		    	            null,
		    	            "是否同意该申请？",
		    	            seebean.name+" | "+seebean.ph_id,
		    	            JOptionPane.YES_NO_CANCEL_OPTION
		    	    );
		    	 if (result==0) {//同意
		    		 if(new SeeController().isAgree(1,seebean.see_id)) {
		    			 	huodefangzhushenqing();
		    			 }
		    		 
		    	   }else if(result==1) {//不同意
		    		   if(new SeeController().isAgree(2,seebean.see_id)) {
		    			   	huodefangzhushenqing();
			    		}
		    		  
		    	   }else{
	              
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
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 20));
		panel3.add(i);
		panel3.repaint();
	}

	/*
	 * 动态的jlbel接口带点击事件（点击显示 用户的申请 的处理）
	 * 
	 * */
	private static void newJLablewodeshengqing(SeeBean seebean,int s,int y,int m,int n) {
		JLabel i=new JLabel();
		final HouseBean[] hou = new HouseBean[1];
		if(seebean.agree==0) i=new JLabel(seebean.address+seebean.date+"     ||待处理");
		else if(seebean.agree==2) i=new JLabel(seebean.address+seebean.date+"     ||申请失败");
		else { i=new JLabel(seebean.address+seebean.date+"     ||申请成功");
			i.addMouseListener(new MouseListener() {
								   public void mouseClicked(MouseEvent e) {
									   hou[0] =new OrderController().getHouse(seebean.house_num);
									   int result=JOptionPane.showConfirmDialog(
											   null,
											   "价格 ： $ "+ hou[0].rent+" 是否订购？",
											   " 缴费   |",
											   JOptionPane.YES_NO_CANCEL_OPTION
									   );
									   if (result==0) {//同意
										   if(new OrderController().isMoneyEnough(hou[0].rent)){
											   new OrderController().add(hou[0].householder,seebean.house_num, hou[0].rent);
											   JOptionPane.showMessageDialog(
													   null,
													   "订购成功！",
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
									   }else if(result==1) {//不同意


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
			);}
		i.setBounds(s,y,m,n);
		i.setFont(new Font("宋体",Font.BOLD, 20));
		panelshenqing.add(i);
		panelshenqing.repaint();
	}


	/*
	 * 获得用户昵称
	 * */
	public static void hudenicheng(String str) {
		nicheng=str;
	}
	/*
	 * 获得用户账号
	 * */
	public static void hudezhanghao(String str) {
		zhanghao=str;
	}
	/*
	 *  首页的事件
	 * */
	public static void action(JFrame jf) {
		 	x=0;
		    
			SignIN.setActionCommand(deng_lu);
				
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
			        	tabbedPane.setSelectedIndex(1);
			        	midpanel2.repaint();
			        	anxiashaxuan(jf);
			        	
			        	
			        }
			    }

					
			};
			
			SignIN.addActionListener(listener);
			//	SignUP.addActionListener(listener);
				find.addActionListener(listener);
				
				sousuo.addActionListener(listener);
			}

		/*
		 * 菜单栏及对应的事件
		 * */
		public static void showPopupMenu(Component invoker, int x, int y) {
			JPopupMenu popupMenu = new JPopupMenu();

			JMenuItem copyMenuItem = new JMenuItem("我的订单");
			JMenu pasteMenuItem = new JMenu("余额");
			JMenu editMenu = new JMenu("账户管理");
			JMenuItem edit = new JMenuItem("成为房主");
			JMenuItem edit2 = new JMenuItem("修改信息");
			JMenuItem fileMenu = new JMenuItem("退出");
			JMenuItem wodeshengqing=new JMenuItem("我的申请");
			JMenuItem findMenuItem = new JMenuItem(huodeyu_e());
			editMenu.add(edit2);
			if(!SignController.user.isHouseHolder) {editMenu.addSeparator(); editMenu.add(edit);}
			pasteMenuItem.add(findMenuItem);
			popupMenu.add(copyMenuItem);
			popupMenu.addSeparator();
			popupMenu.add(wodeshengqing);
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
					if(SignController.user.isHouseHolder) tabbedPane.setSelectedIndex(3);
					else tabbedPane.setSelectedIndex(2);
					wodedingdan();

				}
			});
			wodeshengqing.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//我的申请被点击
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					tabbedPane.addTab("我的申请",createzhanghuguanli() );
					if(SignController.user.isHouseHolder) tabbedPane.setSelectedIndex(3);
					else tabbedPane.setSelectedIndex(2);
					wodesheqing();

				}
			});
			edit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//成为房主被点击
					new SignController().becomeHouseHolder();
					new chengweihangzhu();
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					if(tabbedPane.getTabCount()==3) tabbedPane.remove(2);
					tabbedPane1.addTab("我的房屋", createwodefangwu());
				}
			});
			edit2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//修改信息被点击
					new xiugaixingxi();
				}
			});
			fileMenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//退出被点击
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					if(tabbedPane.getTabCount()==3) tabbedPane.remove(2);
					Topanel.remove(yonghu);
					Topanel.add(SignIN);


				}
			});
			findMenuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//余额被点击
					String inputContent = JOptionPane.showInputDialog(
							null,
							"￥：:",
							"输入充值金额"

					);
					if(inputContent==null||inputContent.equals("")||inputContent.equals("输入充值金额"));
					else {
						if(new SignController().topUpMoney(inputContent))
							JOptionPane.showMessageDialog(
									null,
									"充值成功",
									"",
									JOptionPane.WARNING_MESSAGE
							);
						else
							JOptionPane.showMessageDialog(
									null,
									"充值失败",
									"",
									JOptionPane.WARNING_MESSAGE
							);
					}
				}
			});
			// ......

			// 在指定位置显示弹出菜单*

			popupMenu.show(invoker, x, y);
		}


	/*
	 * 从数据库获得符合条件的房屋信息并创造出JLabel
	 * */
	public static void huodefangzhufangwuxinxi() {
		panel.removeAll();
		panel.repaint();
		List<HouseBean> houselist1;
		int i=50;
		HouseBean house;
		houselist1=new HouseController().query(SignController.user.householder_id);
		Iterator<HouseBean> it1;
		it1=houselist1.iterator();
		while(it1.hasNext()) {
			house=it1.next();
			if(house.state==0) {
				newJLablewodefangwu(house,10,i,900,130,0);
				i=i+130;
			}
			if(house.state==1) {
				newJLablewodefangwu(house,10,i,900,130,1);
				i=i+130;
			}
			if(house.state==2) {
				newJLablewodefangwu(house,10,i,900,130,2);
				i=i+130;
			}
		}
		JButton find=new JButton("添加房屋信息");
		find.setBounds(50,i,700,25);
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new tianjiafangwuxingxi();
			}
		});
		panel.add(find);
		panel.repaint();
	}

	/*
	 * 从数据库获得符号条件的房屋信息并创造出jlabel
	 * */
	public static void huodefangwuxinxi(JFrame jf) {
		int i=50;
		HouseBean house=new HouseBean(e2,t,t1);
		house.h_type=q1;
		house.type=w;
		if(r=="-") houselist=new FilterController().filterHouse(house);
		else houselist=new FilterController().filterHouse(house,r);
		it=houselist.iterator();
		while(it.hasNext()) {
			house=it.next();
			if(house.state==1) {
				newJLable(house,10,i,900,130,1,jf);
				i=i+130;
			}
			if(house.state==2) {
				newJLable(house,10,i,900,130,2,jf);
				i=i+130;
			}
		}
	}


	/*
	 * 从数据库获得房主的账单
	 * */
	public static void huodefangzhuzhangdan() {
		panel1.removeAll();
		panel1.repaint();
		int i=20;
		BillBean n = new BillBean();
		List<BillBean>see= new BillController().getBillList();
		Iterator<BillBean> it1=see.iterator();
		while(it1.hasNext()) {
			n=it1.next();
			newJLablezhangdan(n,10,i,900,25);
			i=i+30;
		}

	}

	/*
	 * 从数据库获得房主的订单
	 * */
	public static void huodefangzhudingdan() {
		paneluiyiuy.removeAll();
		paneluiyiuy.repaint();
		int i=20;
		OrderBean n = new OrderBean();
		List<OrderBean>see= new OrderController().getOrderList_H();
		Iterator<OrderBean> it1=see.iterator();
		while(it1.hasNext()) {
			n=it1.next();
			newJLabledingdan(n,10,i,900,25);
			i=i+30;
		}

	}

	/*
	 * 从数据库获得房主的申请
	 * */
	public static void huodefangzhushenqing() {
		panel3.removeAll();
		panel3.repaint();
		int i=20;
		SeeBean n = new SeeBean();
		List<SeeBean>see= new SeeController().getSeeList_H();
		Iterator<SeeBean> it1=see.iterator();
		while(it1.hasNext()) {
			n=it1.next();
			newJLableshengqing(n,10,i,900,25);
			i=i+30;
		}

	}
	/*
	 * 从数据库获得我的订单信息
	 * */
	public static void wodedingdan() {
		panel2.removeAll();
		panel2.repaint();
		int i=20;
		OrderBean n = new OrderBean();
		List<OrderBean>see= new OrderController().getOrderList_T();
		Iterator<OrderBean> it1=see.iterator();
		while(it1.hasNext()) {
			n=it1.next();
			newJLablewodedingdan(n,10,i,900,25);
			i=i+30;
		}

	}

	/*
	 * 我的申请
	 *
	 * */
	public static void wodesheqing() {
		panelshenqing.removeAll();
		panelshenqing.repaint();
		int i=20;
		SeeBean n = new SeeBean();

		List<SeeBean>see= new SeeController().getSeeList_T();
		Iterator<SeeBean> it1=see.iterator();
		while(it1.hasNext()) {
			n=it1.next();
			newJLablewodeshengqing(n,10,i,900,25);
			i=i+30;
		}

	}

	/*
	 * 按下搜索
	 * */
	public static void anxiasousuo() {

	}
	/*
	 * 按下筛选
	 * */
	public static void anxiashaxuan(JFrame jf) {
		midpanel2.removeAll();
		midpanel2.repaint();
		q1=(String)huxing.getSelectedItem();
		w=(String)fangxing.getSelectedItem();
		e2=(String)shengfeng.getSelectedItem();
		r=(String)jiage	.getSelectedItem();
		t=(String)shiqu.getSelectedItem();
		t1=(String)xie.getSelectedItem();
		huodefangwuxinxi(jf);
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
		return SignController.user.money.toString();
	}


}


