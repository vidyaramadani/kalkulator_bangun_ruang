import java.*;
import javax.swing.*;

public class Pencarian_Sederhana_naik{
    public static void main (String[] args){
        try{
            int[] DataArray={0,1,2,3,4,5,6,7,8,9,10};
            int i, NilaiX;
            boolean ketemu;
            
            System.out.println("");
            System.out.println("Program Pencarian Data Sederhana");
            System.out.println("================================");
            System.out.println("");
            
            //menampilkan array
            for(i=0;i<11;i++)
                System.out.print(DataArray[i]+" "); 
                System.out.print("");   
                System.out.println(""); 
            //memasukkan data yang dicari
            String bilangan = JOptionPane.showInputDialog("Masukkan nilai yang kamu cari!");
            NilaiX=Integer.parseInt(bilangan);
            System.out.println("");
            System.out.println("data yang dicari adalah="+NilaiX);
            ketemu=false;
            for(i=0;i<11;i++)
            {
                if(DataArray[i]==NilaiX)
                {
                    ketemu=true;
                    break;
                }
            }
            
            System.out.println("===============================");
            System.out.println("");
            if(ketemu==true)
                System.out.println("Data ditemukan pada elemen ke "+(i+1));
            else
                System.out.println("Data tidak ditemukan");
                System.out.println("~~~~~~~");    
                System.out.println("");    
                System.out.println("");    
                System.out.println("");    
                System.out.println("");    
                System.exit(0);
        }catch(NullPointerException e){
            System.out.println("NPE");
        }
    }
}