package pkg3b2;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
       int d;
       String K;
       K=JOptionPane.showInputDialog(null,"Ingresa un numero decimal entero"+"\n"+"Entre las selecciones estan 1,5,10,50,100,500 y 1000" + "\n"+"¿Cual es tu opcion? ");
       d = Integer.parseInt(K);
       switch(d)
       {
           case 1:
               JOptionPane.showMessageDialog(null, "El numero en romano es I");
               break;
           case 5:
               JOptionPane.showMessageDialog(null, "El numero en romano es V");
               break;
           case 10:
               JOptionPane.showMessageDialog(null, "El numero en romano es X");
               break;
           case 50:
               JOptionPane.showMessageDialog(null, "El numero en romano es L");
               break;
           case 100:
               JOptionPane.showMessageDialog(null, "El numero en romano es C");
               break;
           case 500:
               JOptionPane.showMessageDialog(null, "El numero en romano es D");
               break;
           case 1000:
               JOptionPane.showMessageDialog(null, "El numero en romano es M");
               break;
           default:
               JOptionPane.showMessageDialog(null,"El numero ingresado es incorrecto :(","ERROR",
               JOptionPane.ERROR_MESSAGE);
       }
    }
    
}
