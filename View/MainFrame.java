package View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    
    public MainFrame(){
        int FRAME_WIDTH = 1200;
        int FRAME_HEIGHT = 700;

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
