public class Security extends Employee {     
    //Atribut yang digunakan
    int gaji;
    String nama, posisi, status;
    int jamKerja, NIP;
    int bonus, potongan;
    
    //Fungsi overide yang dapat memproses jenis atribut yang sama sekaligus
    @Override
    int totalGaji(){
        gaji = 3000000;
        
        //Percabangan penentu total akhir gaji (Ditambah bonus dan atau dikurangi dengan potongan)
        if(status.equalsIgnoreCase("Menikah") && jamKerja == 8){
            bonus = 700000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Menikah") && jamKerja >= 8){
            bonus = 800000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Menikah") && jamKerja <= 8){
            bonus = 200000;
            potongan = 100000;
        };
        
        if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja == 8){
            bonus = 800000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja >= 8){
            bonus = 1000000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja <= 8){
            bonus = 250000;
            potongan = 150000;
        };
        int totalGaji = gaji + bonus - potongan; //Proses hitungan       
        System.out.println("Nama : "+nama);
        System.out.println("NIP : "+NIP);
        System.out.println("Posisi : Security");
        System.out.println("Status : "+status);
        System.out.println("Jam kerja : "+jamKerja+" jam");
        System.out.println("Total gaji cleaning service adalah : "+totalGaji); //Output
        System.out.println("==============================");
        System.out.println();
        return totalGaji; //Mengembalikan nilai totalGaji
    }
}
