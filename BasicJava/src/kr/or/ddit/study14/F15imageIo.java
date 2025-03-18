package kr.or.ddit.study14;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

public class F15imageIo {
	public static void main(String[] args) throws IOException {
		
//		BufferedImage bufferImg = new BufferedImage(0, 0, 0);
		BufferedImage image = ImageIO.read(new File("file/물음표.jpg"));
		
		int width = image.getWidth();
		int height = image.getHeight();
		
		System.out.println("사진 넓이 : "+ width+" , 높이 : " + height);
		
//		BufferedImage copyImage = new BufferedImage(450, 450, image.getType());
//		
//		for(int i=0; i<width; i+=2) {
//			for(int j=0; j< height;j+=2) {
//				copyImage.setRGB(i/2, j/2, image.getRGB(i, j));
//			}
//		}
//		ImageIO.write(copyImage, "jpg", new File("copy2.jpg"));

		BufferedImage copyImage = new BufferedImage(100, 100, image.getType());
		
		for(int i=0; i<100; i++) {
			for(int j=0; j< 100;j++) {
				Color color = new Color(i,0,0);
				
				copyImage.setRGB(i, j, color.getRGB());
			}
		}
		ImageIO.write(copyImage, "jpg", new File("copy4.jpg"));

//		BufferedImage copyImage = new BufferedImage(900, 900, image.getType());
//		
//		for(int i=0; i<width; i++) {
//			for(int j=0; j< height;j++) {
//				int rgb = image.getRGB(i, j);
//				Color color = new Color(rgb);
//				
//				Color c2 = new Color(color.getRed(),0,color.getBlue());
//				
//				copyImage.setRGB(i, j, c2.getRGB());
//			}
//		}
//		ImageIO.write(copyImage, "jpg", new File("copy3.jpg"));

		//		for(int i=0; i<width; i++) {
//			for(int j=0; j< height;j++) {
//				copyImage.setRGB(height-1-j, i, image.getRGB(i, j));
//			}
//		}
//		ImageIO.write(copyImage, "jpg", new File("copy.jpg"));
//		StringBuffer sb = new StringBuffer();
//		for(int i=0; i<width;i++) {
//			for(int j=0; j<height;j++) {
//				int rgb = image.getRGB(i, j);
////				System.out.print(rgb+"\t");
//				Color color = new Color(rgb);
//				int red = color.getRed();
//				int green = color.getGreen();
//				int blue = color.getBlue();
//				System.out.print("("+red+", "+ green+", "+blue+")\t");
//				sb.append(rgb+"\t");
//			}
//			sb.append("\n");
//		}
//		System.out.println();
//		Files.write(Paths.get("q.tex"), sb.toString().getBytes());
	}
}
