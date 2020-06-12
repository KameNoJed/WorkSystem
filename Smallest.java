import javax.swing.JOptionPane;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num,num2,num3,small;
      
       num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       small = num;
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       if (num2<small) {
    	   small = num2;
    	 }
       num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       if(num3 < small) {
    	  small = num3;
       }
       
       System.out.print("The Smallest number = " + Integer.toString(small));
	}

}
