package academy.devdojo.BassoicaoObjetos.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario [] seminarios;
    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }


    public Professor(Seminario[] seminarios, String especialidade, String nome) {
        this.seminarios = seminarios;
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Professor: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        if(this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("## Seminarios Cadastrados ##");
            System.out.println(seminario.getTitulo());
            //poderiamos fazer uma tratativa para saber se o local existe
            System.out.println(seminario.getLocal().getEndereco());
          //se for igual a Nulo retorna para a linha 28 até ter um valor
            if(seminario.getAlunos() == null) continue;
            System.out.println("** Alunos **");
            //fazendo uma tratativa se for igual ou diferente de null
            //alunos é um array então teremos um array dentro de um array
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno: "+aluno.getNome() + "Idade: "+aluno.getIdade());

            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
