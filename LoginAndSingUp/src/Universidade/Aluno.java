package Universidade;

public class Aluno {

    private String Nome;
    private String Sobrenome;
    private String Email;
    private String Sexo;
    private String Telefone;
    private String CPF;
    private String Senha;
    private static int proximoID = 1;
private int ID;
    public Aluno(String Nome, String Sobrenome, String Email, String Sexo, String Telefone, String CPF, String Senha, int ID) {
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Telefone = Telefone;
        this.CPF = CPF;
        this.Senha = Senha;
        this.ID = proximoID++;
    }
    
    public Aluno(){
        
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String Nome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
