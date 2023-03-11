package Oops;

class Heart{
    void hearBeat(){
        System.out.println("Heart Beat is important");
    }
}

class Student1{
    private Heart h;
    public Student1(Heart h){
        this.h = h;
    }
    public void call(){
        h.hearBeat();
    }
}
public class HasA_DependencyInjec{
    public static void main(String[] args) {
        Heart h = new Heart();
        Student1 s = new Student1(h);
        s.call();
    }
}