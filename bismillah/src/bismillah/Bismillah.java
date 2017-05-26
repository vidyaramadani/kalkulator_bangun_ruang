/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

/**
 *
 * @author Vidya
 */
import javax.swing.JOptionPane;
public class Bismillah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menuutama;
      do {
         menuutama=Integer.parseInt(JOptionPane.showInputDialog(
           "Menghitung Luas dan \n" +
           "Volume Bangun Ruang : \n" +
               "-----------------------\n" +
               "1. Kubus \n" +
               "2. Balok \n" +
               "3. Prisma Segitiga \n" +
               "4. Limas Segitiga \n" +
               "5. Bola \n" +
               "6. Keluar \n" +
               "-----------------------\n" +
               "Masukkan Nomer Menu :"));
         switch (menuutama) {
        case 1 :
          int submenu1;
          submenu1 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Kubus \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Kubus \n" +
          "2. Hitung Volume Kubus \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu1) {
              case 1 :
              double sisi, luaspermukaankubus;
              sisi=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Kubus : "));
              luaspermukaankubus=6*(Math.pow(sisi,2));
              JOptionPane.showMessageDialog(null, "Luas Permukaan Kubus adalah : " + luaspermukaankubus);
              break;
            case 2 :
              double sisi1, volumekubus;
              sisi1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Kubus : "));
              volumekubus=Math.pow(sisi1,3);
              JOptionPane.showMessageDialog(null, "Volume Kubus adalah : " + volumekubus);
              break;
          }
                  break;
                  
          case 2 :
          int submenu2;
          submenu2 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Balok \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Balok \n" +
          "2. Hitung Volume Balok \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu2) {
            case 1 :
              double panjang, lebar, tinggi, luaspermukaanbalok;
              panjang=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Panjang Balok : "));
              lebar=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Lebar Balok : "));
              tinggi=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Balok : "));
              luaspermukaanbalok=2 * (panjang * lebar) + 2 * (panjang * tinggi) + 2 * (lebar + tinggi);
              JOptionPane.showMessageDialog(null, "Luas Permukaan Balok adalah : " + luaspermukaanbalok);
              break;
            case 2 :
              double panjang1, lebar1, tinggi1, volumebalok;
              panjang1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Panjang Balok : "));
              lebar1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Lebar Balok : "));
              tinggi1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Balok : "));
              volumebalok=panjang1 * lebar1 * tinggi1;
              JOptionPane.showMessageDialog(null, "Volume Balok adalah : " + volumebalok);
              break;
          }
                  break;
           case 3 :
                  int submenu3;
          submenu3 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Prisma Segitiga \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Prisma Segitiga  \n" +
          "2. Hitung Volume Prisma Segitiga \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu3) {
            case 1 :
              double alasprisma, tinggialas, sisialas, tinggiprisma, luasalas, kelilingalasprisma, luaspermukaanprisma;
              alasprisma=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas Prisma Segitiga : "));
              tinggialas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas Prisma Segitiga : "));
              sisialas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Prisma Segitiga : "));
              tinggiprisma=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Prisma Segitiga : "));
              luasalas=(alasprisma * tinggialas) / 2;
              kelilingalasprisma = 3 * sisialas;
              luaspermukaanprisma = 2 * luasalas + (kelilingalasprisma * tinggiprisma);
              JOptionPane.showMessageDialog(null, "Luas Permukaan Prisma Segitiga adalah : " + luaspermukaanprisma);
              break;
            case 2 :
              double alasprisma1, tinggialas1, luasalas1, tinggiprisma1, volumeprisma;
              alasprisma1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas Prisma Segitiga : "));
              tinggialas1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas Prisma Segitiga : "));
              tinggiprisma1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Prisma Segitiga : "));
              luasalas1 = (alasprisma1 * tinggialas1) / 2;
              volumeprisma = luasalas1 * tinggiprisma1;
              JOptionPane.showMessageDialog(null, "Luas Permukaan Prisma Segitiga adalah : " + volumeprisma);
              break;
          }
                  break;
                  
                  case 4 :
                  int submenu4;
          submenu4 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Limas Segitiga \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan Limas  \n" +
          "2. Hitung Volume Limas \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu4) {
            case 1 :
              double alaslimas, tinggialaslimas, sisialaslimas, tinggilimas, luasalaslimas, luasselimutlimas, luaspermukaanlimas;
              alaslimas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas Limas Segitiga : "));
              tinggialaslimas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas Limas Segitiga : "));
              sisialaslimas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Sisi Limas Segitiga : "));
              tinggilimas=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Limas Segitiga : "));
              luasalaslimas=2 * ((alaslimas * tinggialaslimas) / 2);
              luasselimutlimas = 3 * (alaslimas * tinggilimas);
              luaspermukaanlimas = luasalaslimas + luasselimutlimas;
              JOptionPane.showMessageDialog(null, "Luas Permukaan Limas Segitiga adalah : " + luaspermukaanlimas);
              break;
            case 2 :
              double alaslimas1, tinggialaslimas1, luasalaslimas1, tinggilimas1, volumelimas;
              alaslimas1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Alas Limas Segitiga : "));
              tinggialaslimas1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Alas Limas Segitiga : "));
              tinggilimas1=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Tinggi Limas Segitiga : "));
              luasalaslimas1 = 2 * ((alaslimas1 * tinggialaslimas1) / 2);
              volumelimas = 0.3 * luasalaslimas1 + tinggilimas1;
              JOptionPane.showMessageDialog(null, "Luas Permukaan Limas Segitiga adalah : " + volumelimas);
              break;
          } break;
                  
                  case 5 :
                  int submenu5;
          submenu5 = Integer.parseInt(JOptionPane.showInputDialog(
          "Anda Memilih Menu Bola \n" +
          "------------------------------- \n" +
          "1. Hitung Luas Permukaan (Kulit) Bola  \n" +
          "2. Hitung Volume Bola \n" +
          "------------------------------- \n" +
          "Masukkan Pilihan Anda : "));
          switch(submenu5) {
            case 1 :
              double phi = 3.14;
              double jarijari, luaspermukaankulitbola;
              jarijari=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Jari-jari Bola : "));
              luaspermukaankulitbola = 4 * phi * (Math.pow(jarijari,2));
              JOptionPane.showMessageDialog(null, "Luas Permukaan Kulit Bola adalah : " + luaspermukaankulitbola);
              break;
            case 2 :
              double phie = 3.14;
              double jarijarijari, volumebola;
              jarijarijari=Double.valueOf(JOptionPane.showInputDialog("Masukkan Nilai Jari-jari Bola : "));
              volumebola = (4 / 3) * phie * (Math.pow(jarijarijari,2));
              JOptionPane.showMessageDialog(null, "Volume Bola adalah : " + volumebola);
              break;
          }
                  break;
        case 6 :
                  System.exit(0);
                  break;
        default :
                  JOptionPane.showMessageDialog(null, "Maaf nomer yang anda masukkan tidak tersedia. Silahkan Coba Lagi");
               }
      }
               while (menuutama!=1-6);
    }
    
}
