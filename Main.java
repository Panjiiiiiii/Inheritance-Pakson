import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //Menggunakan scanner
        Employee Gaji = new Employee(); //Memanggil class Emloyee dengan objek
        
        System.out.println("Masukkan:\n1. Boss\n2. Manajer\n3. Cleaning Service\n4. Security\n5. All"); //Inputan (Menggunakan salah satu atau menampilkan semua)
        int position = scan.nextInt(); 
        System.out.println("==============================");
        
        switch(position){
            case 1 :
                Boss gajiboss = new Boss (); //Memanggil class Boss menggunakan objek baru
                System.out.println("Masukkan nama :");
                gajiboss.nama = scan.next();
                System.out.println("Masukkan NIP :");
                gajiboss.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja :");
                gajiboss.jamKerja = scan.nextInt();
                System.out.println("Masukkan status (Menikah/ Belum menikah) : ");
                gajiboss.status = scan.next();
                //Output dengan mengambil fungsi2 tiap-tiap kelas menggunakan objek
                Gaji.totalGaji();
                gajiboss.totalGaji();
                break;
            case 2 :
                Manager gajiManager = new Manager(); //Memanggil class Manager menggunakan objek baru
                System.out.println("Masukkan nama :");
                gajiManager.nama = scan.next();
                System.out.println("Masukkan NIP :");
                gajiManager.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja :");
                gajiManager.jamKerja = scan.nextInt();
                System.out.println("Masukkan status (Menikah/ Belum menikah) :");
                gajiManager.status = scan.next();
                //Output dengan mengambil fungsi2 tiap-tiap kelas menggunakan objek
                Gaji.totalGaji();
                gajiManager.totalGaji();
                break;
            case 3 :
                CleaningService gajiCS = new CleaningService(); //Memanggil class CleaningService menggunakan objek baru
                System.out.println("Masukkan nama :");
                gajiCS.nama = scan.next();
                System.out.println("Masukkan NIP :");
                gajiCS.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja :");
                gajiCS.jamKerja = scan.nextInt();
                System.out.println("Masukkan status (Menikah/ Belum menikah) :");
                gajiCS.status = scan.next();
                //Output dengan mengambil fungsi2 tiap-tiap kelas menggunakan objek
                Gaji.totalGaji();
                gajiCS.totalGaji();
                break;
            case 4 :
                Security gajiSecurity = new Security(); //Memanggil class Security menggunakan objek baru
                System.out.println("Masukkan nama :");
                gajiSecurity.nama = scan.next();
                System.out.println("Masukkan NIP :");
                gajiSecurity.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja :");
                gajiSecurity.jamKerja = scan.nextInt();
                System.out.println("Masukkan status (Menikah/ Belum menikah) :");
                gajiSecurity.status = scan.next();
                //Output dengan mengambil fungsi2 tiap-tiap kelas menggunakan objek
                Gaji.totalGaji();
                gajiSecurity.totalGaji();
                break;
            case 5 :
                Boss allboss = new Boss (); //Karena objek "gajiboss" telah digunakan, maka dapat mengganti nama objek yang baru
                System.out.println("Masukkan nama boss :");
                allboss.nama = scan.next();
                System.out.println("Masukkan NIP boss :");
                allboss.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja boss :");
                allboss.jamKerja = scan.nextInt();
                System.out.println("Masukkan status boss (Menikah/ Belum menikah) :");
                allboss.status = scan.next();
                
                Manager allmanager = new Manager (); //Karena objek "gajiManager" telah digunakan, maka dapat mengganti nama objek yang baru
                System.out.println("Masukkan nama manager :");
                allmanager.nama = scan.next();
                System.out.println("Masukkan NIP manager :");
                allmanager.NIP= scan.nextInt();
                System.out.println("Masukkan jam kerja manager :");
                allmanager.jamKerja = scan.nextInt();
                System.out.println("Masukkan status manager (Menikah/ Belum menikah) :");
                allmanager.status = scan.next();
                
                CleaningService allCS = new CleaningService(); //Karena objek "gajiCS" telah digunakan, maka dapat mengganti nama objek yang baru
                System.out.println("Masukkan nama cleaning service :");
                allCS.nama = scan.next();
                System.out.println("Masukkan NIP cleaning service :");
                allCS.NIP= scan.nextInt();
                System.out.println("Masukkan jam kerja cleaning service :");
                allCS.jamKerja = scan.nextInt();
                System.out.println("Masukkan status cleaning service (Menikah/ Belum menikah) :");
                allCS.status = scan.next();
                
                Security allSecurity = new Security(); //Karena objek "gajiSecurity" telah digunakan, maka dapat mengganti nama objek yang baru
                System.out.println("Masukkan nama security :");
                allSecurity.nama = scan.next();
                System.out.println("Masukkan NIP security :");
                allSecurity.NIP = scan.nextInt();
                System.out.println("Masukkan jam kerja security :");
                allSecurity.jamKerja = scan.nextInt();
                System.out.println("Masukkan status security (Menikah/ Belum menikah)  :");
                allSecurity.status = scan.next();
                
                //Output dengan mengambil fungsi2 tiap-tiap kelas menggunakan objek
                Gaji.totalGaji();
                allboss.totalGaji();
                allmanager.totalGaji();
                allCS.totalGaji();
                allSecurity.totalGaji();
            }           
    }
}
