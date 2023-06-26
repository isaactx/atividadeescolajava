package pessoa;

public class Aluno extends Pessoa{
    
    public int RM;
    public String curso;
    public String grupo;
    

    public Aluno(int cPF, String nome, int idade, int rM, String curso, String grupo) {
        super(cPF, nome, idade);
        RM = rM;
        this.curso = curso;
        this.grupo = grupo;
    }


    public int getRM() {
        return RM;
    }
    public void setRM(int rM) {
        RM = rM;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String toString(){
        return "\nNome: " + this.getNome() + "    Idade: " + this.getIdade() + "    CPF: " + this.getCPF() + 
        "    RM: " + this.getRM() + "    Curso: " + this.getCurso() + "    Grupo: " + this.getGrupo();
    }
}
