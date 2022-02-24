package br.edu.infnet.tp1;

/**
 * @since 2021/10/25
 * @author Jean Breno
 */
public class TP1 {
    public static void main(String[] args) {
        
        Livro livro = new Livro("Java 8", (float) 300.00, "Joinville B.");
        System.out.println(livro);
        
        Game game = new Game("FIFA 22", (float) 269.99, "Sony PS5");
        System.out.println(game);
        
        Game game1 = new Game("Call Of Duty 2", (float) 200.00, "Xbox ONE");
        System.out.println(game1);
        
        System.out.println(game1.desconto(50));
        
        System.out.println(game1.desconto(0));
        
        System.out.println(livro.desconto(10));
        
    }
    
}
