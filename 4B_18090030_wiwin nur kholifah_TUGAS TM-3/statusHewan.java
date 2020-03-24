public class statusHewan{

    public static void main(String args[]){
        Anjing anjing = new Anjing();
        Ikan ikan = new Ikan();
        
        anjing.statusSuntikRabies = false;
        ikan.statusGantiAir = true;
        
        if (anjing.status() == false) {
            System.out.println("Anjing belum suntik Rabies");
        }else{
            System.out.println("Anjing sudah suntik Rabies");
        }
        
        if (ikan.status() == false) {
            System.out.println("Ikan belum ganti Air");
        }else{
            System.out.println("Ikan sudah ganti Air");
        }
    }
}