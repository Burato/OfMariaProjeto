
package br.com.ofmaria.model.persistencia.dao;

import br.com.ofmaria.model.Usuario;
import java.util.List;


public interface UsuarioDAO {
    int inserir(Usuario u); //importa o usuário do pacote model
    int salve(Usuario u);
    boolean remove (int codigo);
    List<Usuario> listAll();
    Usuario listById(int codigo);
    
    
    
}
