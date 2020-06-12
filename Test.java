import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num ;
       num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       
       if (num>=0) {
    	   System.out.print("Positive Integer");
       }else {
    	   System.out.print("Negative Integer");
       }
	}

}
