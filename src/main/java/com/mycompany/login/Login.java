/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

import com.mycompany.login.IGU.Principal;
import com.mycompany.login.Logica.Controladora;
import com.mycompany.login.Logica.Usuario;

/**
 *
 * @author luka
 */
public class Login {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Principal prince = new Principal();
        prince.setVisible(true);
        prince.setLocationRelativeTo(null);
        
        
        
        //Usuario user1 = new Usuario(1L,"luca","luca");
        //Usuario user2 = new Usuario(2L,"root","");
        
        //control.crearUsuario(user1);
        //control.crearUsuario(user2);
        
        
        
    }
}
