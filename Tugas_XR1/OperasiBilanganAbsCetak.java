package Tugas_XR1;

/**
 *
 * @author genta
 */
final class OperasiBilanganAbsCetak {
    private void cetakSemua(OperasiBilanganAbs[] OB,double a, double b){
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
        }
        
    }
    public static void main(String[] args) {
      OperasiBilanganAbs penjumlahan =new OperasiPenjumlahan();
      OperasiBilanganAbs pengurangan =new OperasiPengurangan();
      OperasiBilanganAbs perkalian =new OperasiPerkalian();
      OperasiBilanganAbs pembagian =new OperasiPembagian();
      
      OperasiBilanganAbs[] OB ={
          penjumlahan,
          pengurangan,
          perkalian,
          pembagian
      };
      OperasiBilanganAbsCetak abc = new OperasiBilanganAbsCetak();
      abc.cetakSemua(OB,10.5,4.5);
    }
}
