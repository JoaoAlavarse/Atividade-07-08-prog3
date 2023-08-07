public class Aluno {
    
    private String registroAcademico;
    private String nome;
    private int notaProvaUm;
    private int notaProvaDois;
    private int trabalho;


    public Aluno(String registroAcademico, String nome, int notaProvaUm, int notaProvaDois, int trabalho) {
        setRegistroAcademico(registroAcademico);
        setNome(nome);
        setNotaProvaUm(notaProvaUm);
        setNotaProvaDois(notaProvaDois);
        setTrabalho(trabalho);
    }


    public Aluno() {
    }


    public String getRegistroAcademico() {
        return registroAcademico;
    }


    public String getNome() {
        return nome;
    }


    public int getNotaProvaUm() {
        return notaProvaUm;
    }


    public int getNotaProvaDois() {
        return notaProvaDois;
    }


    public int getTrabalho() {
        return trabalho;
    }


    public void setRegistroAcademico(String registroAcademico) {
            if (registroAcademico.matches("[0-9]+")){
                this.registroAcademico = registroAcademico;
            } else if (registroAcademico.equals("")){
                System.out.println("O Registro academico nao deve ser nulo");
                this.registroAcademico = registroAcademico;
            } else{
                this.registroAcademico = registroAcademico;
                System.out.println("O registro academico deve ser apenas numeros positivos");
            }
    }


    public void setNome(String nome) {
        if (nome.matches("[0-9]+") || nome.equals("")){
            this.nome = nome;
           System.out.println("O nome do aluno nao deve ser numerico nem nulo");
        } else { 
            this.nome = nome;
        }
    }


    public void setNotaProvaUm(int notaProvaUm) {
        if (notaProvaUm <= 10 && notaProvaUm >= 0){
            this.notaProvaUm = notaProvaUm;
        } else {
             this.notaProvaUm = notaProvaUm;
            System.out.println("O valor deve ser de 0 a 10");
        }
    }


    public void setNotaProvaDois(int notaProvaDois) {
        if (notaProvaDois <= 10 && notaProvaDois >= 0){
            this.notaProvaDois = notaProvaDois;
        } else {
            this.notaProvaDois = notaProvaDois;
            System.out.println("O valor deve ser de 0 a 10");
        }
    }


    public void setTrabalho(int trabalho) {
        if (trabalho <= 10 && trabalho >= 0){
            this.trabalho = trabalho;
        } else {
            this.trabalho = trabalho;
            System.out.println("O valor deve ser de 0 a 10");
        }
    }

    public double calcularMedia(){
        double media = notaProvaUm * 0.35 + notaProvaDois * 0.35 + trabalho * 0.3;
        return media;
    }

    public String calcularSituacao(double media){
        if (media < 6.9){
            String exame = "EXAME";
            return exame;
        } else {
            String aprovado = "APROVADO";
            return aprovado;
        }
    }

    @Override
    public String toString(){
        String sentenca = "RA: " + registroAcademico + " | Nome: " + nome;
        return sentenca;
    }
    


}
