
package com.mycompany.login.Logica;

import com.mycompany.login.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
    controlPersis = new ControladoraPersistencia();
    }

    
    
    public void crearUsuario(Usuario user){
        controlPersis.crearUsuario(user);
        
    }
    
    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje ="";
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuario(); 
        for(Usuario usu : listaUsuarios){    
            if (usu.getNombre().equals(usuario)){
                mensaje = "Usuario ingresado con exito!";
                

                if (usu.getContrasenia().equals(contrasenia)){
                    mensaje = "Usuario ingresado con exito!";
                    return mensaje;

                }
                else{
                mensaje = "Contraseña incorrecta";
                return mensaje;

                }
            
            }
            else{
            mensaje="Usuario incorrecto";
            
}
        }
        return mensaje;
        
        
    }
}
