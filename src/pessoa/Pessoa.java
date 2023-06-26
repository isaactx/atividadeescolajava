package pessoa;

public class Pessoa {
    public int CPF;
    public String nome;
    public int idade;
    
    public Pessoa(int cPF, String nome, int idade) {
        CPF = cPF;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    } 


}
