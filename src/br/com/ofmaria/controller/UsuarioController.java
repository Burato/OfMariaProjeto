
package br.com.ofmaria.controller;

import br.com.ofmaria.model.Usuario;
import br.com.ofmaria.model.persistencia.UsuarioDAOImplements;
import br.com.ofmaria.model.persistencia.dao.UsuarioDAO;
import java.util.List;


public class UsuarioController {
    public int salvar(Usuario u){
        UsuarioDAO dao = new UsuarioDAOImplements();
        return dao.salve(u);
    }
    public List<Usuario> listarTodos(){
        UsuarioDAO dao = new UsuarioDAOImplements();
        return dao.listAll();
    }  
}
