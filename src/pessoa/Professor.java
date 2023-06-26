package pessoa;

public class Professor extends Pessoa{
    public int ncadastro;

    
    public Professor(int cPF, String nome, int idade, int ncadastro) {
        super(cPF, nome, idade);
        this.ncadastro = ncadastro;
    }


    public int getNcadastro() {
        return ncadastro;
    }

    public void setNcadastro(int ncadastro) {
        this.ncadastro = ncadastro;
    }
}
