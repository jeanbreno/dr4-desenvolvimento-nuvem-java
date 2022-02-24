package br.edu.infnet.tp1;

/**
 * @since 2021/10/25
 * @author Jean Breno
 */
public class Livro extends Produto {
    
    private String autor;

    public Livro() { }
    
    public Livro(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;  
    }

    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + autor ;
    }
}
