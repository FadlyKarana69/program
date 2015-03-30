
package id.co.blits.procedurefunction;

/**
 *
 * @author Fadly Karana
 */
public class fadly {

    public static void main(String[] args) {
         //Deskripsi
            int Hasil,Nilai;
            int data;

            data = Nilai(4,6,8);
            Hasil = data * 8;
            System.out.println("Hasil = "+Hasil);
            }
    
        //FUNCTION
            public static int Nilai (int Nilai1, int Nilai2,int Nilai3){
            int n;

            Nilai1 = Nilai1 * 2;
            n = Nilai1 * Nilai2 * Nilai3;
            return n;
            
    }
    
}
