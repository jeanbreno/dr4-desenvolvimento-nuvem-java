package br.edu.infnet.tp1;

/**
 * @since 2021/10/25
 * @author Jean Breno
 */
public class Game extends Produto {
    
    private String plataforma;
    
    public Game() {}

    public Game(String nome, float preco, String plataforma) {
        super(nome, preco);
        this.plataforma = plataforma;  
    }

    public String getPlataforma(){
        return plataforma;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + plataforma ;
    }
    
}