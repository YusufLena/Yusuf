package datalaundry;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerLaundry {
 ArrayList<datalaundrybaru> ArrayData;
 DefaultTableModel tablelist;
 
 public ControllerLaundry(){
     ArrayData = new ArrayList<>();
}
 public void InsertData (String nama, String namabarang, String jenislayanan, String jumlahbarang, int harga){
     datalaundrybaru mhs = new datalaundrybaru(nama,namabarang,jenislayanan,jumlahbarang,harga);
     ArrayData.add(mhs);    
 }
public DefaultTableModel showData(){
    String[] kolom = {"Nama", "Nama Barang", "Jenis Layanan" ,"Jumlah barang", "Harga"};
    Object[][] objData = new Object [ArrayData.size()][3];
    int i = 0;
    
    for (datalaundrybaru n : ArrayData){
        String[] arrData = {n.getNama(),n.getNamaBarang(), n.getJenisLayanan(), n.getJumlahBarang(), String.valueOf(n.harga)};
        objData[i] = arrData;
        i++;
    }
    tablelist = new DefaultTableModel (objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
        return false;   
    }       
};
    return tablelist;
}
}
