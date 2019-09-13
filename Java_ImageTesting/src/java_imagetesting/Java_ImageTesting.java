//best program yet. :) YEET
//get aprox color by making range of what is what nshit
package java_imagetesting;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Java_ImageTesting {

    public static void main(String[] args) throws IOException {

        BufferedImage img = null;
        File f = null;

        //read image
        try {
            f = new File("C:\\Users\\admin\\Desktop\\beachPic.jpeg");
            img = ImageIO.read(f);

        } catch (IOException e) {
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int pxl = img.getRGB(x, y);
                

                
                
                    int a = (pxl >> 24) & 0xff;
                    int r = (pxl >> 16) & 0xff;
                    int g = (pxl >> 8) & 0xff;
                    int b = pxl & 0xff;
                    
                    if (r <= 20 && g <= 20 && b <=20) {
                    int random = (r + b - g)* 3;                   
                    pxl = (255 - r << 24) | (255 - g << 16) | (255 - b << 8) | a;
                    }
//                } else  {
//                        int random = 50; 
//                        pxl = (random + 20 << 24) | (random + 100 << 16) | (random - 10 << 8) | random;
//                    }
                        
                    

                    img.setRGB(x, y, pxl);
                
            }
        }

        ImageIO.write(img, "jpg", new File("C:\\Users\\admin\\Desktop\\bass.jpg"));

        System.out.println(width);
        System.out.println(height);
    }

}
