package PRAK_202_2110817310008_MuhammadKhaliqTeukuAnsari;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Mobil {
        DecimalFormat koma = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        String merek;
        private String pemilik;
        String tahun_keluaran;
        int harga;
        int kapasitas;
        private int pajak;


        public void info(){
            formatRp.setCurrencySymbol("");
            formatRp.setMonetaryDecimalSeparator(',');
            koma.setDecimalFormatSymbols(formatRp);
            System.out.println("Merek Mobil: " + merek);
            System.out.println("Harga: Rp. " + koma.format(harga));
            System.out.println("Tahun Keluaran: " + tahun_keluaran);
            System.out.printf("Kapasitas: %dcc \n", kapasitas);
        }
        public void setPemilik(String pemilik){
            this.pemilik = pemilik;
        }
        
        public String getPemilik(){
            return pemilik;
        }
        
        public String getPajak(){
            pajak = harga*2/100;
            return koma.format(pajak);
        }

}
