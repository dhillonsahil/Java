package FundamentalsOfJava;
import javax.swing.JOptionPane;

public class HelloWorld{
    public static void main(String[] args) {
        Greeter greet = new Greeter();
        greet.sayHello();
    }
}


 class Greeter
{
 public void sayHello()
 {
 JOptionPane.showMessageDialog(null,
 "Hello, World!", "Greeter",
 JOptionPane.INFORMATION_MESSAGE);
 }
}