import java.util.Scanner;

class Umur {

    // private field
    private int age;
  
    // getter method
    public int getAge() {
      return age;
    }
  
    // setter method
    public void setAge(int age) {
      this.age = age;
    }
  }
public class main {
    public static void main(String[] args) {
        Hewan hewan =new Hewan();
        Kucing kucing =new Kucing();
        Umur umur =new Umur();

        // Hewan ke 1
        hewan.makan();
        System.out.println("======================");
        kucing.pet("Cak Dul"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Namane : ");
        String name = input.next();
        // System.out.print(name);
        kucing.display1();
        umur.setAge(2);
        System.out.println("Umur e = "+umur.getAge()+"th");
        System.out.println("======================");


        // Hewan ke 2
        Ayam ayam = new Ayam();
        hewan.makan();
        System.out.println("======================");
        ayam.omnivora("Mas Ganteng"); 
        Scanner input2 = new Scanner(System.in);
        System.out.print("Namane : ");
        String name2 = input2.next();
        // System.out.pri
        ayam.display1();
        umur.setAge(9);
        System.out.println("Umur e = "+umur.getAge()+"bln");
        System.out.println("======================");



        
    }
    
}
