
package br.com.ofmaria.controller;

import br.com.ofmaria.model.Usuario;
import br.com.ofmaria.model.persistencia.UsuarioDAOImplements;
import br.com.ofmaria.model.persistencia.dao.UsuarioDAO;


public class UsuarioController {
    public int salvar(Usuario u){
        UsuarioDAO dao = new UsuarioDAOImplements();
        return dao.salve(u);
    }
    
}
