package Oops;

class Heart{
    void hearBeat(){
        System.out.println("Heart Beat is important");
    }
}

class Student{
    private Heart h;
    public Student(Heart h){
        this.h = h;
    }
    public void call(){
        h.hearBeat();
    }
}
public class HasA_DependencyInjec{
    public static void main(String[] args) {
        Heart h = new Heart();
        Student s = new Student(h);
        s.call();
    }
}