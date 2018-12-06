package com.rental.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.rental.controller.EvaluateController;
import com.rental.controller.SeeController;
import com.rental.domain.OrderBean;

public class pingjia extends JFrame{
	static JPanel tabbedPane1;
	static int pinhjianum;
	public pingjia(OrderBean str) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("。。\\..\\image\\zhu.jpg"));
		setBackground(Color.GRAY);
		setTitle("得勺匡汽");
		setSize(300, 250);
		 tabbedPane1=new JPanel(null);
		JTextArea textArea = new JTextArea(10, 23);
        // 譜崔徭強算佩
        textArea.setLineWrap(true);
        textArea.setBounds(10, 30, 260, 150);
        // 耶紗欺坪否中医
        JButton btn = new JButton("得勺");
        btn.setBounds(100,190, 100, 25);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(new EvaluateController().add(str.house_num, str.tenant_num,textArea.getText() , pinhjianum)) {
            		JOptionPane.showMessageDialog(
	                        null,
	                        "得胎撹孔��",
	                        " ",
	                        JOptionPane.WARNING_MESSAGE
	                );
            		dispose();
            	}
            	else {
            		JOptionPane.showMessageDialog(
	                        null,
	                        "得胎払移��",
	                        " ",
	                        JOptionPane.WARNING_MESSAGE
	                );
            	}
            	
           
            }
        });
        
        pingjiaxingxing(0);
        tabbedPane1.add(textArea);
        tabbedPane1.add(btn);
		setContentPane(tabbedPane1);
        setLocationRelativeTo(null);
        setVisible(true);
	}
public static void pingjiaxingxing(int num) {
	pinhjianum=num;
	if(num==0){
		
		tabbedPane1.repaint();
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		
 		a.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(1);
		    	 
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
 		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
 	
 		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 	
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
	}
 	if(num==1){
 		
 		tabbedPane1.repaint();
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		a.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(0);
		    	 
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
 		b.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(2);
		    	 
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
 		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
 		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
 	}
 	if(num==2){
 		tabbedPane1.repaint();
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		b.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(1);
		    	 
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
 		c.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(3);
		    	 
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
 		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
 		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
 	}
	if(num==3){
		tabbedPane1.repaint();
		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
		c.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(2);
		    	 
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
		d.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(4);
		    	 
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
		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
	   	}
	if(num==4){
		tabbedPane1.repaint();
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing0.png", 20, 20));
 		d.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(3);
		    	 
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
 		f.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(5);
		    	 
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
 		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
 		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
 	   	}
	if(num==5){
		tabbedPane1.repaint();
 		JLabel a=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel b=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel c=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel d=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		JLabel f=new JLabel(image.gaibiandaxiao("。。\\..\\image\\xingxing1.png", 20, 20));
 		f.addMouseListener(new MouseListener() {
		    public void mouseClicked(MouseEvent e) {
		    	tabbedPane1.remove(a);
		    	tabbedPane1.remove(b);
		    	tabbedPane1.remove(c);
		    	tabbedPane1.remove(d);
		    	tabbedPane1.remove(f);
		    	pingjiaxingxing(4);
		    	 
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
 		a.setBounds(10,5,20,20);
 		b.setBounds(30,5,20,20);
 		c.setBounds(50,5,20,20);
 		d.setBounds(70,5,20,20);
 		f.setBounds(90,5,20,20);
 		tabbedPane1.add(a);
 		tabbedPane1.add(b);
 		tabbedPane1.add(c);
 		tabbedPane1.add(d);
 		tabbedPane1.add(f);
 		tabbedPane1.repaint();
 	   	}
}
}
