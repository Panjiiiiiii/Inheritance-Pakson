public class Manager extends Employee {
    //Atribut yang digunakan
    int gaji;
    String nama, posisi, status;
    int jamKerja, NIP;
    int bonus, potongan;
    
    //Fungsi overide yang dapat memproses jenis atribut yang sama sekaligus
    @Override
    int totalGaji(){
        gaji = 15000000;
        
        //Percabangan penentu total akhir gaji (Ditambah bonus dan atau dikurangi dengan potongan)
        if(status.equalsIgnoreCase("Menikah") && jamKerja == 8){
            bonus = 1500000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Menikah") && jamKerja >= 8){
            bonus = 1000000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Menikah") && jamKerja <= 8){
            bonus = 1000000;
            potongan = 5000000;
        };
        
        if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja == 8){
            bonus = 2000000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja >= 8){
            bonus = 2500000;
            potongan =0;
        }else if(status.equalsIgnoreCase("Tidak Menikah") && jamKerja <= 8){
            bonus = 1000000;
            potongan = 5000000;
        };
        int totalGaji = gaji + bonus - potongan; //Proses hitungan
        System.out.println("Nama : "+nama);
        System.out.println("NIP : "+NIP);
        System.out.println("Posisi : Manager");
        System.out.println("Status : "+status);
        System.out.println("Jam kerja : "+jamKerja+" jam");
        System.out.println("Total gaji manajer adalah : "+totalGaji); //Output
        System.out.println("==============================");
        System.out.println();
        return totalGaji; //Mengembalikan nilai totalGaji
    }

}
