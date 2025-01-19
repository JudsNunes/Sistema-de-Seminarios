package academy.devdojo.BassoicaoObjetos.teste;

import academy.devdojo.BassoicaoObjetos.dominio.Aluno;
import academy.devdojo.BassoicaoObjetos.dominio.Local;
import academy.devdojo.BassoicaoObjetos.dominio.Professor;
import academy.devdojo.BassoicaoObjetos.dominio.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {

        Local local = new Local("Centro De conveções De Pernambuco");
        Aluno aluno = new Aluno("Lucas Nascimento Nunes Da Silva");

        Professor professor = new Professor("Desenvolvedor Senior", "William Suane");

        //aray instanciado fazendo referência ao objeto Seminario
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Java Viriado no Jiraya", local, alunosParaSeminario);

        //array instanciado fazendo referência ao objeto Professores
        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();


    }
}
