# Question 1 : What is Input Stream and Output Stream in Java
**Answer** :- Input Stream is used so that we can work and read the Data mostly in Binary form(in bytes). It has many subclasses Like FileInputStream , ObjectInputStream to work.

**Output Stream** :- It is used so that we can store the data in any format like we can save objects in any external file. It is a abstract representation of output stream of data.
It also has many Subclasses to work like ObjectOutputStream etc.

# Question 2 :  What are the methods of Output Stream ?
Answer :- The Methods of output Stream are the following :- 
1. write(byte[] b)
1. write(int b)
1. write(byte []b , int off , int len)
1. flush()
1. close()

# Question 3 : What is Serialization in java?
Answer : Serialization in java is used to store a object in a form human can't read. It is used when we want to store the data in a file so that it can be protected from the unauthorized access. we use the FileOutputStream and Provide it's object to ObjectOutputStream and then use writeObject().

# Question 4 :- What is Serializable Interface in Java ?
Answer :-   the class object of which is being serialized must Implement the Serializable interface. This interface is marker interface and functionality is provided by jvm. It is compulsorily used by the class in order to achieve the Serialization


# Question 5 : what is Deserialization in java ?
Answer : In  serialization we stored the object in any file so we can reuse it again when required with all its information. The process of chaning the serialized object in to normal object so that we can use the object is deserialization. We convert it from non Byte data to object. When are trying to achieve the Deserialization we must give the same class (whose object it is) as given while serialization.

# Question 6 : How is serialization achieved in Java ?
**Answer** :- 
```java
import java.io.*;

public class bank {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("isahildhillon",400000 );
        System.out.println("Bank balance is " + ba.getBankBalance());
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("account.txt")));
            oos.writeObject(ba);
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}

class BankAccount implements Serializable{
    private int BankBalance;
    String username;
    public BankAccount(String username , int BankBalance){
        this.BankBalance=BankBalance;
        this.username=username;
    }
    public int getBankBalance(){
        return BankBalance;
    }
    public void setBankBalance(int BankBalance){
        this.BankBalance=BankBalance;
    }
}
```

# Question 7 : How is deserialzation achieved in Java ?
Answer :
```java
import java.io.*;

public class bank {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("account.txt")));
            BankAccount ba =(BankAccount)ois.readObject();
            System.out.println("Bank balance of "+ ba.username + " is " + ba.getBankBalance());
            ois.close();

        }catch(IOException e){
            System.out.println("Error");
        }catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}

class BankAccount implements Serializable{
    private int BankBalance;
    String username;
    public BankAccount(String username , int BankBalance){
        this.BankBalance=BankBalance;
        this.username=username;
    }
    public int getBankBalance(){
        return BankBalance;
    }
    public void setBankBalance(int BankBalance){
        this.BankBalance=BankBalance;
    }
}
```

# Question 8 :- How can you avoid certain member variables from getting serialized  ?
Answer :- we can write transient keyword with them
syntax :- 
```java
transient private int BankBalance; 
```

# Question 9 : What are classes available in the Java Io File classes API ?
Answer :- 
1. File
1. FileReader
1. FileWriter
1. FileInputStream
1. FileOutputStream
1. RandomFile
1. RandomAccessFile
1. BufferedReader
1. BufferedWriter

# Question 10 : What is Difference between Externalization and Serialization ?
Answer :- 
| Externalization | Serialization |
|-----------------|---------------|
| we have to over ride the write method | no methods because it is marker interface |
| can serialize parts of object also | can serialize complete object | 
| implement Externalizable Interface  | implement Serializable interface | 
|high Performance |Low Performance |
| no use of transient keyword | transient keyword | 
