import java.util.ArrayList;

import pessoa.Aluno;
import pessoa.Professor;
import pessoa.ProfessorC;

public class App {
    public static void main(String[] args){

    ProfessorC coordenador = new ProfessorC(987654321,
        "Ediney Ciasi",
        42,
        1);

    Professor professords = new Professor(
    123456789,
    "Wagner Franca",
    32,
    7
    );

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    alunos.add(new Aluno(2142135, "Antonio", 18, 76457, "DSI", "A"));
    alunos.add(new Aluno(1234552, "Amanda", 17, 12345, "DSI", "A"));
    alunos.add(new Aluno(6745843, "Beatriz", 21, 54321, "DSI", "A"));
    alunos.add(new Aluno(9438575, "Davi", 18, 75893, "DSI", "A"));
    alunos.add(new Aluno(8721364, "Matheus", 19, 23489, "DSI", "B"));
    alunos.add(new Aluno(2378448, "José", 17, 43321, "DSI", "B"));
    alunos.add(new Aluno(1234516, "Pedro", 18, 12456, "DSI", "B"));

    Disciplina DSI = new Disciplina();
    DSI.countalunos = alunos.size();
    DSI.nome = "Desenvolvimento de Sistemas I";
    DSI.professor = professords.nome;
    
    System.out.format("\n\nMatéria: %S\n\n",DSI.nome);

    System.out.format("Professor Coordenador:\nNome = %S, Idade = %d, CPF = %d, Número de Cadastro = %d\n\n",
                        coordenador.nome,
                        coordenador.idade,
                        coordenador.CPF,
                        coordenador.ncadastro
                     );

    System.out.format("Professor:\nNome = %S, Idade = %d, CPF = %d, Número de Cadastro = %d\n\n",
                        professords.nome,
                        professords.idade,
                        professords.CPF,
                        professords.ncadastro
                     );

    System.out.println("Alunos : " + DSI.countalunos + "\n" + alunos);
    }


}
