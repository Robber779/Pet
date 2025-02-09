import java.util.Scanner;
public class PetTester{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      Pet myPet1 = new Pet();
      Pet myPet2 = new Pet("Stewart", 7, "Cat");
      Pet myPet3 = new Pet();
      
      System.out.println(myPet1);
      System.out.println();
      System.out.println(myPet2);
      System.out.println();
      
      System.out.println("Enter Animal Type: ");
      String petType = scan.next();
      myPet3.setType(petType);
      
      System.out.println("Enter Animal Age: ");
      int petAge = scan.nextInt();
      myPet3.setAge(petAge);
      
      System.out.println("Enter Animal Name: ");
      String petName = scan.next();
      myPet3.setName(petName);
      
      System.out.println(myPet3);
      
      
      /*myPet1.setName("Pet Name");
      myPet2.setName("Buster Brown");
      System.out.println(myPet1.getName()); //>Returns only the name and does not go to "toString"
      System.out.println(myPet1+"\n\n"+myPet2);//>Goes directly to "toString"*/

   }
}