package Tarefas;

public class Tarefa {

    private int id;
    private String titulo;
    private String descricao;
    private String Status;

    public Tarefa ( int id, String titulo, String descricao, String status )
    {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        Status = status;

    }

    public Tarefa ( String titulo, String descricao, String status ) {
        this(0, titulo, descricao, status);
    }

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo ( String titulo ) {
        this.titulo = titulo;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public String getStatus () {
        return Status;
    }

    public void setStatus ( String status ) {
        Status = status;
    }
}
