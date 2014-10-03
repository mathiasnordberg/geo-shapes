import javax.swing.*;

public class DrawgGUI {



    public DrawGUI(){
        
        initGUI();
    }


    private void initGUI(){
        
        /*
        *   Inställningar för JFrame objektet
        *
        */
        this.frameDim = new Dimension(300,200);
        
        this.setTitle("DrawingGUI");
        this.setSize( (int) frameDim.getWidth(), (int) frameDim.getHeight() );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args ) {
        
        //Följande rader säkrar att GUI:et startar i EDT
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawGUI().setVisible(true);
            }
        });
    }

}
