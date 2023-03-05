package InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car wagnorR= new Car() 
            {
               public void CarDisplay(){
                    System.out.println("Hello");
                }
            };
        
    }
}
interface Car{
    void CarDisplay();
}