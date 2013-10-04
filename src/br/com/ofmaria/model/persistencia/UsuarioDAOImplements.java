
package br.com.ofmaria.model.persistencia;

import br.com.ofmaria.model.Usuario;
import br.com.ofmaria.model.persistencia.dao.UsuarioDAO;
import java.util.List;

public class UsuarioDAOImplements implements UsuarioDAO {
    
    private static final String INSERT = "insert into usuario(nome, login, senha, cpf, telefone, data_nascimento, sexo) values (?, ?, ?, ?, ?, ?, ? )";

    @Override
    public int inserir(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int salve(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario listById(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
