package Persistencia;

import Universidade.Aluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ControlaUsuario {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public boolean salvar(Aluno aluno) {
        if (aluno != null && !existeEmail(aluno.getEmail())) {
            alunos.add(aluno);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Aluno> returnTodos() {
        return alunos;
    }

    private boolean existeEmail(String email) {
        for (Aluno a : alunos) {
            if (a.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "E-mail já cadastrado. Escolha outro.");
                return true;
            }
        }
        return false;
    }
  public boolean verificarCredenciais(String email, String senha) {
    for (Aluno aluno : alunos) {
        if (aluno.getEmail().equals(email) && aluno.getSenha().equals(senha)) {
            return true; // Credenciais válidas
        }
    }
    return false; // Credenciais inválidas
}
}