

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        
        
        JFrame ar = new JFrame();
        ar.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ar.setLayout(null);
        
        ar.setTitle("Sirinler Oyunu");
        ar.setSize(1280,1000);
        ar.setVisible(true); 
        
        int [][] map = 
        { {0,0,0,1,0,0,0,0,0,0,1,0,0},
          {0,1,1,1,1,0,1,1,1,1,1,1,0},
          {0,1,0,1,1,1,1,1,1,0,0,1,0},
          {0,1,1,1,1,0,1,0,1,1,0,1,0},
          {0,1,0,1,0,0,1,0,1,0,0,1,0},
          {1,1,0,1,1,1,1,0,1,0,1,1,0},
          {0,1,0,0,1,1,1,0,1,1,1,1,0},
          {0,1,0,1,1,1,1,1,1,1,1,1,1},
          {0,1,0,1,0,0,0,0,0,1,1,1,0},
          {0,1,1,1,1,1,1,1,1,1,1,1,0},
          {0,0,0,1,0,0,0,0,0,0,0,0,0}
        };
        
        int PanelSayisi = map.length*map[0].length;
        
        ArrayList<JPanel> paneller = new ArrayList<JPanel>(); 
        int karesirasi = 0;
        for (int j = 0; j < map.length; j++) {
            for (int i = 0; i < map[0].length; i++) {
                
                if(map[j][i] == 1){ 
                    paneller.add(new JPanel() ); 
                    paneller.get(karesirasi).setBounds( (i+1)*60, (j+1)*60, 60, 60);
                    paneller.get(karesirasi).setBackground(Color.WHITE);
                    ar.add(paneller.get(karesirasi));
                }
                else if(map[j][i] == 0){ 
                    paneller.add(new JPanel() ); 
                    paneller.get(karesirasi).setBounds( (i+1)*60, (j+1)*60, 60, 60);
                    paneller.get(karesirasi).setBackground(Color.darkGray);
                    ar.add(paneller.get(karesirasi));
                }
                karesirasi++;
            }
            
        }
        
        
        System.out.println("araylist uzluk: "+map[0].length);
//        paneller.add(new JPanel() );
//        paneller.get(0).setBounds(200, 200, 60, 60);
//        paneller.get(0).setBackground(Color.blue);
//        ar.add(paneller.get(0));
        
        System.out.println("sira: "+map.length);
        System.out.println("panelsayisi: "+PanelSayisi);
    
    }
    
      
    
}