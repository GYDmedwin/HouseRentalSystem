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
     static String[] bieshu= { "����\\..\\image\\����10.png", "����\\..\\image\\����5.png", "����\\..\\image\\����6.png", "����\\..\\image\\����7.png",
    		 "����\\..\\image\\����8.png", "����\\..\\image\\����9.png"};
     static String[] gongyu= { "����\\..\\image\\��Ԣ1.png", "����\\..\\image\\��Ԣ10.png", "����\\..\\image\\��Ԣ5.png", "����\\..\\image\\��Ԣ6.png",
    		 "����\\..\\image\\��Ԣ7.png", "����\\..\\image\\��Ԣ8.png"};
     static String[] xiezilou= { "����\\..\\image\\д��¥1.png", "����\\..\\image\\д��¥10.png", "����\\..\\image\\д��¥2.png", "����\\..\\image\\д��¥3.png",
    		 "����\\..\\image\\д��¥4.png", "����\\..\\image\\д��¥5.png"};
     static  int bieshunum=0,gongyunum=0,xiezilounum=0;
	/**
	 * Create the frame.
	 */

	public MainView() {

		String[] backimage = { "����\\..\\image\\gongyu4.png", "����\\..\\image\\bieshu1.png",
				"����\\..\\image\\xiezilou7.png", "����\\..\\image\\��Ԣ1.png" };
		setIconImage(Toolkit.getDefaultToolkit().getImage("����\\..\\image\\zhu.jpg"));
		setTitle("���ݹ���");
		setSize(930, 580);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab("��ҳ", createshouye());
		tabbedPane.addTab("������Ϣ", createfangwu());

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
						tabbedPane.addTab("���Ƿ���", createwoshifangzhu());
						huodefangzhuzhangdan();
						huodefangzhudingdan();
						huodefangzhushenqing();
						huodefangzhufangwuxinxi();
					}
					Topanel.remove(SignIN);
					yonghu = new JLabel();
					yonghu.setText(nicheng);
					yonghu.setIcon(image.gaibiandaxiao("����\\..\\image\\touxiang.jpg", 60, 60));
					// yonghu.setHorizontalTextPosition(SwingConstants.CENTER);
					// yonghu.setVerticalTextPosition(SwingConstants.BOTTOM);

					yonghu.setBounds(730, 0, 200, 100);
					yonghu.setFont(new Font("����", Font.BOLD, 30));
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
	 * ��ҳ���
	 */
	private JComponent createshouye() {

		Topanel = new JPanel(null);
		Loge = new JLabel(new ImageIcon("����\\..\\image\\bieshu1.png"));
		Loge.setBounds(0, 0, 700, 95);
		back = new JLabel();
		back.setIcon(new ImageIcon("����\\..\\image\\bieshu1.png"));
		back.setBounds(220, 100, 900, 400);
		

		find = new JButton("����");
		find.setBounds(120, 100, 100, 25);
		SignIN = new JButton("��¼/ע��");
		SignIN.setBounds(710, 25, 200, 25);
		textfind = new JTextField(100);
		textfind.setBounds(10, 100, 100, 25);
		mfangxing = new JLabel("���� :");
		mhuxing = new JLabel("���� :");
		mshengfeng = new JLabel("ʡ�� :");
		mshiqu = new JLabel("�� :");
		mxie = new JLabel("���� :");
		mjiage = new JLabel("�۸� :");
		mshengfeng.setBounds(50, 150, 100, 25);
		mfangxing.setBounds(50, 300, 100, 25);
		mhuxing.setBounds(50, 350, 100, 25);
		mjiage.setBounds(50, 400, 100, 25);
		mshiqu.setBounds(50, 200, 100, 25);
		mxie.setBounds(50, 250, 100, 25);
		listData1 = new String[] { "-", "д��¥", "����" };
		listData2 = new String[] { "-", "������", "�����", "�Ϻ���", "������", "����ʡ", "�ӱ�ʡ", "ɽ��ʡ", "����ʡ", "����ʡ", "������ʡ", "����ʡ",
				"�㽭ʡ", "����ʡ", "����ʡ", "����ʡ", "ɽ��ʡ", "����ʡ", "����ʡ", "����ʡ", "�㶫ʡ", "����ʡ", "����ʡ", "�Ĵ�ʡ", "����ʡ", "����ʡ", "����",
				"����ʡ", "�ຣʡ", "����", "�½�", "����ر�������", "�����ر�������", "̨��" };
		listData3 = new String[] { "-", "700-", "700-2000", "2000-5000", "5000+" };
		listData4 = new String[] { "-", "һ��һ��", "����һ��", "����һ��" };
		listshi = new String[] { "-", "������", "������", "������", "������", "ͭ����", "μ����", "������", "������", "������", "�Ӱ���" };
		listxie = new String[] { "-", "������", "������", "�����", "������", "������", "δ����", "�³���", "������", "������" };
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
		sousuo = new JButton("ɸѡ");
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
	 * ���Ƿ���ҳ��
	 */
	private static JComponent createwoshifangzhu() {
		tabbedPane1 = new JTabbedPane();

		tabbedPane1.addTab("�ҵķ���", createwodefangwu());
		tabbedPane1.addTab("�˵�", createzhangdan());
		tabbedPane1.addTab("����", createdingdan());
		tabbedPane1.addTab("����", createshenqing());

		tabbedPane1.setSelectedIndex(0);

		return tabbedPane1;
	}

	/*
	 * �ҵķ���ҳ��
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
	 * �˵�ҳ��
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
	 * �������
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
	 * �������
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
	 * ������Ϣ
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
	 * �ҵĶ���
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
	 * �ҵ����롢������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������
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
	 * �ҵķ�����Ϣ��JLable��������ʾ������Ϣ��
	 * */
	private static void newJLablewodefangwu(HouseBean hou,int s,int y,int m,int n,int xy) {
		JLabel i=new JLabel();
		JPopupMenu popupMenu1 = new JPopupMenu();
		JMenuItem edit = new JMenuItem("�޸ļ۸�");
		JMenuItem edit2 = new JMenuItem("ɾ����");
		popupMenu1.add(edit);
		popupMenu1.addSeparator();
		popupMenu1.add(edit2);
		edit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//�޸ļ۸񱻵��
				String inputContent = JOptionPane.showInputDialog(
						null,
						"�µļ۸�:",
						"�޸ļ۸� ||"
				);
				if(inputContent!=null||inputContent!="") {new HouseController().update(inputContent, hou.house_id);
					huodefangzhufangwuxinxi();}
			}
		});
		edit2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ɾ�������
				new HouseController().delete(hou.house_id);
				huodefangzhufangwuxinxi();
			}
		});
		if(xy==0) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || δ����");
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("д��¥")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("��Ԣ")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
		if(xy==1) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || ������");
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("д��¥")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("��Ԣ")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
			
		if(xy==2) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || ������");
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("д��¥")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("��Ԣ")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		
		}
			
		i.setBounds(s,y,m,n);
		i.setFont(new Font("����",Font.BOLD, 15));
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
	 * ��̬��jlbel�ӿڴ�����¼��������ʾ���ݵ���ϸ��Ϣ��
	 * */
	private static void newJLable(HouseBean hou,int s,int y,int m,int n,int xy,JFrame jf) {
		JLabel i=new JLabel(hou.province+" | "+hou.city+" | "+hou.county+" | "+hou.type+" | "+hou.h_type);
		if(xy==1) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || ������");
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("д��¥")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("��Ԣ")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		}
			
		if(xy==2) {
			i=new JLabel(hou.province+"|"+hou.city+"|"+hou.county+"|"+hou.type+"|"+hou.h_type+"|"+hou.rent+"  || ������");
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(bieshu[bieshunum], 192, 120));bieshunum=(bieshunum+1)%6;}
			if(hou.type.equals("д��¥")){i.setIcon(image.gaibiandaxiao(xiezilou[xiezilounum], 192, 120));xiezilounum=(xiezilounum+1)%6;}
			if(hou.type.equals("��Ԣ")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
			if(hou.type.equals("����")) {i.setIcon(image.gaibiandaxiao(gongyu[gongyunum], 192, 120));gongyunum=(gongyunum+1)%6;}
		
		}
		i.setBounds(s,y,m,n);
		i.setFont(new Font("����",Font.BOLD, 15));
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
	 * ��̬��jlbel�ӿڴ�����¼��������ʾ�˵��Ĵ���
	 * */
	private static void newJLablezhangdan(BillBean str,int s,int y,int m,int n) {
		JLabel i;
		if(str.pay==1) i=new JLabel(str.type+str.charge+"   ||��֧��");
		else {
			i=new JLabel(str.type+str.charge+"   ||δ֧��");

			i.addMouseListener(new MouseListener() {
								   public void mouseClicked(MouseEvent e) {
									   int result=JOptionPane.showConfirmDialog(
											   null,
											   "ȷ�Ͻɷѣ�",
											   "��ʾ",
											   JOptionPane.YES_NO_CANCEL_OPTION
									   );
									   if (result==0) {//ȷ�����

										   
										  
										   if(new BillController().isMoneyEnough(str.charge)) {
											   if(new BillController().payBill(str.bill_id,str.charge)) {
												   JOptionPane.showMessageDialog(
														   null,
														   "�ɷѳɹ���",
														   "",
														   JOptionPane.WARNING_MESSAGE
												   );
												   huodefangzhuzhangdan();
											   }
											   else
												   JOptionPane.showMessageDialog(
														   null,
														   "�ɷ�ʧ�ܣ�",
														   "",
														   JOptionPane.WARNING_MESSAGE
												   );
										   }
										   else {
											   JOptionPane.showMessageDialog(
													   null,
													   "�ɷѽ��㣡���س�ֵ����",
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
		i.setFont(new Font("����",Font.BOLD, 20));
		panel1.add(i);
		panel1.repaint();
	}





	/*
	 * ��̬��jlbel�ӿڴ�����¼��������ʾ�����Ĵ���
	 * */
	private static void newJLabledingdan(OrderBean str,int s,int y,int m,int n) {
		JLabel i=new JLabel("������"+str.name+"|��ַ��"+str.address+"|��𣤣�"+str.charge+"|˰�� :"+str.tax.multiply(new BigDecimal(100))+"%");
		i.setBounds(s,y,m,n);
		i.setFont(new Font("����",Font.BOLD, 20));
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
	private static void newJLablewodedingdan(OrderBean str,int s,int y,int m,int n) {
		JLabel i=new JLabel(str.name+"|"+str.address+"|"+str.charge);
		i.setBounds(s,y,m,n);
		i.setFont(new Font("����",Font.BOLD, 20));
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
	 * ��̬��jlbel�ӿڴ�����¼��������ʾ�ҵ�����Ĵ���
	 * */
	private static void newJLableshengqing(SeeBean seebean,int s,int y,int m,int n) {
		JLabel i;
		if(seebean.agree!=0) {
			if(seebean.agree==1)
				i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id+"     ||��ͬ��");
			else
				i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id+"     ||δͬ��");
		 }
		else {  i=new JLabel(seebean.address+seebean.date+seebean.name+seebean.ph_id);
		
		i.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	 int result=JOptionPane.showConfirmDialog(
		    	            null,
		    	            "�Ƿ�ͬ������룿",
		    	            seebean.name+" | "+seebean.ph_id,
		    	            JOptionPane.YES_NO_CANCEL_OPTION
		    	    );
		    	 if (result==0) {//ͬ��
		    		 if(new SeeController().isAgree(1,seebean.see_id)) {
		    			 	huodefangzhushenqing();
		    			 }
		    		 
		    	   }else if(result==1) {//��ͬ��
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
		i.setFont(new Font("����",Font.BOLD, 20));
		panel3.add(i);
		panel3.repaint();
	}

	/*
	 * ��̬��jlbel�ӿڴ�����¼��������ʾ �û������� �Ĵ���
	 * 
	 * */
	private static void newJLablewodeshengqing(SeeBean seebean,int s,int y,int m,int n) {
		JLabel i=new JLabel();
		final HouseBean[] hou = new HouseBean[1];
		if(seebean.agree==0) i=new JLabel(seebean.address+seebean.date+"     ||������");
		else if(seebean.agree==2) i=new JLabel(seebean.address+seebean.date+"     ||����ʧ��");
		else { i=new JLabel(seebean.address+seebean.date+"     ||����ɹ�");
			i.addMouseListener(new MouseListener() {
								   public void mouseClicked(MouseEvent e) {
									   hou[0] =new OrderController().getHouse(seebean.house_num);
									   int result=JOptionPane.showConfirmDialog(
											   null,
											   "�۸� �� $ "+ hou[0].rent+" �Ƿ񶩹���",
											   " �ɷ�   |",
											   JOptionPane.YES_NO_CANCEL_OPTION
									   );
									   if (result==0) {//ͬ��
										   if(new OrderController().isMoneyEnough(hou[0].rent)){
											   new OrderController().add(hou[0].householder,seebean.house_num, hou[0].rent);
											   JOptionPane.showMessageDialog(
													   null,
													   "�����ɹ���",
													   "",
													   JOptionPane.WARNING_MESSAGE
											   );
										   }
										   else
											   JOptionPane.showMessageDialog(
													   null,
													   "�������ȳ�ֵ��",
													   "",
													   JOptionPane.WARNING_MESSAGE
											   );
									   }else if(result==1) {//��ͬ��


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
		i.setFont(new Font("����",Font.BOLD, 20));
		panelshenqing.add(i);
		panelshenqing.repaint();
	}


	/*
	 * ����û��ǳ�
	 * */
	public static void hudenicheng(String str) {
		nicheng=str;
	}
	/*
	 * ����û��˺�
	 * */
	public static void hudezhanghao(String str) {
		zhanghao=str;
	}
	/*
	 *  ��ҳ���¼�
	 * */
	public static void action(JFrame jf) {
		 	x=0;
		    
			SignIN.setActionCommand(deng_lu);
				
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
		 * �˵�������Ӧ���¼�
		 * */
		public static void showPopupMenu(Component invoker, int x, int y) {
			JPopupMenu popupMenu = new JPopupMenu();

			JMenuItem copyMenuItem = new JMenuItem("�ҵĶ���");
			JMenu pasteMenuItem = new JMenu("���");
			JMenu editMenu = new JMenu("�˻�����");
			JMenuItem edit = new JMenuItem("��Ϊ����");
			JMenuItem edit2 = new JMenuItem("�޸���Ϣ");
			JMenuItem fileMenu = new JMenuItem("�˳�");
			JMenuItem wodeshengqing=new JMenuItem("�ҵ�����");
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
				public void actionPerformed(ActionEvent e) {//���������
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					tabbedPane.addTab("�ҵĶ���",createwodedingdan() );
					if(SignController.user.isHouseHolder) tabbedPane.setSelectedIndex(3);
					else tabbedPane.setSelectedIndex(2);
					wodedingdan();

				}
			});
			wodeshengqing.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//�ҵ����뱻���
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					tabbedPane.addTab("�ҵ�����",createzhanghuguanli() );
					if(SignController.user.isHouseHolder) tabbedPane.setSelectedIndex(3);
					else tabbedPane.setSelectedIndex(2);
					wodesheqing();

				}
			});
			edit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//��Ϊ���������
					new SignController().becomeHouseHolder();
					new chengweihangzhu();
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					if(tabbedPane.getTabCount()==3) tabbedPane.remove(2);
					tabbedPane1.addTab("�ҵķ���", createwodefangwu());
				}
			});
			edit2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//�޸���Ϣ�����
					new xiugaixingxi();
				}
			});
			fileMenu.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//�˳������
					if(tabbedPane.getTabCount()==4) tabbedPane.remove(3);
					if(tabbedPane.getTabCount()==3) tabbedPane.remove(2);
					Topanel.remove(yonghu);
					Topanel.add(SignIN);


				}
			});
			findMenuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {//�����
					String inputContent = JOptionPane.showInputDialog(
							null,
							"����:",
							"�����ֵ���"

					);
					if(inputContent==null||inputContent.equals("")||inputContent.equals("�����ֵ���"));
					else {
						if(new SignController().topUpMoney(inputContent))
							JOptionPane.showMessageDialog(
									null,
									"��ֵ�ɹ�",
									"",
									JOptionPane.WARNING_MESSAGE
							);
						else
							JOptionPane.showMessageDialog(
									null,
									"��ֵʧ��",
									"",
									JOptionPane.WARNING_MESSAGE
							);
					}
				}
			});
			// ......

			// ��ָ��λ����ʾ�����˵�*

			popupMenu.show(invoker, x, y);
		}


	/*
	 * �����ݿ��÷��������ķ�����Ϣ�������JLabel
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
		JButton find=new JButton("��ӷ�����Ϣ");
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
	 * �����ݿ��÷��������ķ�����Ϣ�������jlabel
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
	 * �����ݿ��÷������˵�
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
	 * �����ݿ��÷����Ķ���
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
	 * �����ݿ��÷���������
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
	 * �����ݿ����ҵĶ�����Ϣ
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
	 * �ҵ�����
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
	 * ��������
	 * */
	public static void anxiasousuo() {

	}
	/*
	 * ����ɸѡ
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
	 * ���µ�¼����ע��
	 * */
	public static void anxiadenglu_zhuce(JFrame jf) {
		new SignInView(jf);

	}
	/*
	 * ������
	 * */
	public static String huodeyu_e() {
		return SignController.user.money.toString();
	}


}


