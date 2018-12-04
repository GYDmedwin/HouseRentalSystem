package com.rental.view;

import java.awt.Image;

import javax.swing.ImageIcon;

public class image {
	
	public static ImageIcon gaibiandaxiao(String path,int width,int height) {
		ImageIcon image=new ImageIcon(path);
		image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
		return image;
	}
	public static ImageIcon gaibiandaxiao(String path) {
		ImageIcon image=new ImageIcon(path);
		return image;
	}
}
