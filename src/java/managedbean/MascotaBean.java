/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MascotaBean {

    //atributo deun objeto
    private Mascota mascota;

    //agregamos constructor
    public MascotaBean() {
        mascota = new Mascota();
    }
//--------

    //agregamos getter and setter
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
//------------

    //metodo guardar
    public String guardar() {
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);

        return "/RegistroMascota";
    }
    //------

    //metodo listar mascota
    public ArrayList<Mascota> listar() {
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascotas();
        return milista;
    }

    //metodo actulizar mascota
    public String actulizarMascota() {
        //instanciamos
        MascotaDao dao = new MascotaDao();
        dao.actualizarMascota(mascota);       //atributo mascota
        return "/RegistroMascota";
    }

    //metodo eliminar mascota
    public String eliminarMascota() {
        //instanciamos
        MascotaDao dao = new MascotaDao();
        boolean resp = dao.eliminarMascota(mascota);
               
        return "/RegistroMascota";
        
    }

    //
    public String limpiar() {
        mascota = new Mascota();

        return "/RegistroMascota";
    }
}
