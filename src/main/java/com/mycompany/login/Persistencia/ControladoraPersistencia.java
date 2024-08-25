
package com.mycompany.login.Persistencia;


import com.mycompany.login.Logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController jpacon = new UsuarioJpaController();

    public List<Usuario> traerUsuario() {
        
        return jpacon.findUsuarioEntities();
        }
    
    public void crearUsuario(Usuario user){
        jpacon.create(user);
        
    }
    
    
    
}
