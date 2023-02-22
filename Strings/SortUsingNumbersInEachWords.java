package Strings;
public class SortUsingNumbersInEachWords {

public static void main(String[] args){
   String s = "is2 sentence4 This1 a3";
   // Scanner scan = new Scanner(System.in);
   // String s =scan.nextLine();
   String str[]= s.split(" ");
   int arr[]= new int[str.length];
   for(int i=0;i<str.length;i++){
      int length= str[i].length()-1;
      arr[i]=Character.getNumericValue(str[i].charAt(length));
   }

   for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
         if(arr[i]>arr[j]){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            int temp2 = arr[i];
            arr[i]=arr[j];
            arr[j]=temp2;
         }
      }
   }
   String e="";
   for(int i=0;i<str.length;i++){
      str[i]=str[i].substring(0,str[i].length()-1);
      e+=str[i]+" ";
   }
   s=e;
   System.out.println(s);
	}//end of main

}//end of class

