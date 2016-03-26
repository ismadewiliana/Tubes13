/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowongankerja;

/**
 *
 * @author ISMA
 */
public class Pelamar extends Orang {
    private BerkasLamaran berkas;
    private String id;
    
    public void setId (String id) {
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void createBerkas (String idBerkas){
        berkas = new BerkasLamaran();
        berkas.setIdBerkas(idBerkas);
    }
}
