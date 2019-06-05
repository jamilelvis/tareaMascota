/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;


import dao.MascotaDao;
import entidades.Mascota;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MascotaBean {

    private Mascota mascota;

    //agregamos constructor
    public MascotaBean() {
        mascota= new Mascota();
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
    public void guardar() {
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
    }
    //------
}
