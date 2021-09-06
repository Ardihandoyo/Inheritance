public class Kucing extends Hewan {

    public void pet(String omah){
        System.out.println("Kucing Kampung e "+omah);
    }
   
    
    void display1() { 
        System.out.println("Daftar Makanan");
        String [] nama = {"1.Whiskas","2.Royal Canin","3.Maxi","4.Pindang"};
        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
            
        }

      
    }
    
}