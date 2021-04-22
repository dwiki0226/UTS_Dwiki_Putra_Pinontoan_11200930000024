//Nama : Dwiki Putra Pinontoan
//nim   : 11200930000024
//INI Class MatematikaCanggihBanget
package UTS_Pemrograman;
public class UTS_No3 {
    public static void main(String[] args){
        UTS_Nomer3 getHasil = new UTS_Nomer3();
        
        getHasil.pertambahan(26, 32, 51, 43);
        System.out.println("Pertambahan: 26+32+51+43 = " );
        
        getHasil.perkalian(3, 11, 4, 20);
        System.out.println("Perkalian: 3*11*4*20 = " );
        
        getHasil.modulus(13, 53, 14, 30);
        System.out.println("modulus: 13%53%14%30 = " );
        
        getHasil.pertambahanempat(2, 4, 6, 8);
        System.out.println("Pertambahanemapat: 2+4+6+8 = " );
}
}
