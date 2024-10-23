package Modelo;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean status; // true = disponível, false = reservado

    public Livro(int id, String titulo, String autor, int ano,Boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "Estudante{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano='" + ano + '\'' +
                ", disponivel='" + status + '\'' +
                '}';
    }
}
