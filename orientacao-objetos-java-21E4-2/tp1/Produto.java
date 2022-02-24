package br.edu.infnet.tp1;

/**
 * @since 2021/10/25
 * @author Jean Breno
 */
public class Produto {
    
    private String nome;
    private float preco;
    //private int estoque;     
    
    public Produto(){ }
    
    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    
    public float getPreco(){
        return preco;
    }
    
    public String desconto(float porcentagem){
        float valor = porcentagem / 100 * preco;
        if (valor > preco || valor <= 0 ){
            return "Erro ao gerar o desconto. Entre um valor entre 1 e 100.";
        }
        return "Desconto aplicado no " + nome +". " + "Novo valor: R$ " + (preco -= valor);
    }
            
    @Override
    public String toString() {
        return nome + " " + " R$ " + preco ;
    }
}
