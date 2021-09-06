public class Ayam extends Hewan{
    public void omnivora(String rumah){
        System.out.println("Ayam e "+rumah);
    }
   
    
    void display1() { 
        System.out.println("Daftar Makanan");
        String [] nama = {"1.Menir","2.Jagung","3.SisaMakanan","4.Trembel"};
        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i]);
            
        }

      
    }
    
}
