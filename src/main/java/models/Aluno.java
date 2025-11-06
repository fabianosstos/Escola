package models;

public class Aluno {
    private int id;
    private String nome;
    private String dataNascimento;
    private String serie;
    private String turma;
    private String endereco;
    private String contato;

    public Aluno() {}

    public Aluno(String nome, String dataNascimento, String serie, String turma) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.serie = serie;
        this.turma = turma;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
    public String getSerie() { return serie; }
    public void setSerie(String serie) { this.serie = serie; }
    public String getTurma() { return turma; }
    public void setTurma(String turma) { this.turma = turma; }
}
