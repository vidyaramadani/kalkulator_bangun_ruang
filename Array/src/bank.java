
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class bank {
    public static void main (String args []){
        String str, strl;
        int choice, z, pin=1234, counter=0, a=3;
        int t,s,tab=50000;
        
        JOptionPane.showMessageDialog(null,"Selamat Datang\n ANJUNGAN TUNAI "
                + "MANDIRI \n BNI SYARIAH-BOJONEGORO \n\nMasukkan 4 Digit PIN "
                + "Anda!","WELCOME",1);
        try{
            boolean l = false;
            do{
                str=JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:",
                        "ATM BNI SYARIAH-BOJONEGORO",0);
                pin= Integer.parseInt(str);
                counter+=1; //menghitung kesempatan login
                
                
                if(pin==1234)//cek pin
                    do{
                        str= JOptionPane.showInputDialog(null,"[1]Informasi "
                                + "Saldo \n[2]Penyetoran \n[3]Penarikan "
                                + "\n[4]Petunjuk \n[5]Keluar \n\nMasukkan "
                                + "Pilihan Menu:","Pilihan Transaksi",3);
                        choice =Integer.parseInt(str);
                        switch (choice){
                            case 1: 
                                JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar:"
                                        +tab); //info saldo
                                z=JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",
                                        JOptionPane.YES_NO_OPTION,3); //konfirmasi transaksi lain
                                if(z==0)
                                    break;
                                else
                                    
                                    JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAN-BOJONEGORO, ambil kartu ATM Anda.");
                                System.exit(0);
                                
                            case 2:
                                strl=JOptionPane.showInputDialog(null, "Masukan jumlah penyetoran: "); //menabung
                                s= Integer.parseInt(strl);
                                setor hasil = new setor();
                                hasil.menabung(tab, s);
                                tab= hasil.getsaldo();
                                
                                z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",
                                        JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                        if (z==0)
                                            break;
                                        else
                                            JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAN-BOJONEGORO, ambil kartu ATM Anda.");
                                System.exit(0);
                                
                            case 3:
                                strl=JOptionPane.showInputDialog(null, "Masukan jumlah penarikan: "); //pengambilan
                                t= Integer.parseInt(strl);
                                tarik mengambil = new tarik();
                                mengambil.ambil(tab, t);
                                tab= mengambil.getsaldo();
                                
                              z=JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",
                                        JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
                                        if (z==0)
                                            break;
                                        else
                                             JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM BNI SYARIAN-BOJONEGORO, ambil kartu ATM Anda.");
                                System.exit(0);
                                            
                           
                            case 4:
                                JOptionPane.showMessageDialog(null,"Cara Penggunaan Aplikasi\n"
                                        + "[1] Masukkan PIN dengan benar\n"
                                        + "[2] Bertransaksilah dengan benar sesuai pilihan\n"
                                        + "[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n","INFO",1);
                                break;
                                
                            case 5:
                                z=JOptionPane.showConfirmDialog(null,"Anda ingin keluar?","Keluar",
                                        JOptionPane.YES_NO_OPTION, 0);
                                if (z==0){
                                    JOptionPane.showMessageDialog(null, "Terimakasih telah menggunakan ATM BRI, ambil kartu ATM anda");
                                    System.exit(0);
                                }
                                else
                                    break;
                            default: JOptionPane.showMessageDialog(null, "Pilihan menu tidak tersedia\nSilahkan ulangi lagi","ERROR",0);
                        }
                    }  
                    while (l==l);
                else if (counter<3){
                    //jika pin salah
                    a--;
                    //menghitung kesalahan login dan memberikan kesempatan login
                    JOptionPane.showMessageDialog(null, "pin salah!\nPastikan PIN yang anda masukkan benar","ERROR",0);
                    JOptionPane.showMessageDialog(null, "\nKesempatan login "+a+"kali lagi"+"\n");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Untuk bantuan Nasabah, \nsilahkan menghubungi call center 555123(Gratis)","Kartu ATM anda diblokir!",0);
                    System.exit(0);
                }
            }
            while (l==l);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Kesalahan !\nPastikan kode yang anda masukkan berformat benar! \nProgram Keluar!\nTerimakasih","ERROR",0);
        }
        
    }
    
}
