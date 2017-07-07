package demo2;

import javax.swing.JOptionPane;

public class Demo2 {
/**     * @param args the command line arguments*/
    public static void main(String[] args) {
        try{
        //new start st=new start();
      // this.setVisible(false);
        new start().setVisible(true);
    }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        // TODO code application logic here
    }
}