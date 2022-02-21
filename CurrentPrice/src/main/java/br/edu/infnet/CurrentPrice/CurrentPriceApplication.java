package br.edu.infnet.CurrentPrice;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CurrentPriceApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(CurrentPriceApplication.class, args);
    }
    
    @Autowired
    private IClienteAPI clientAPI;
    
    @Override
    public void run(String... args) throws Exception {
        String msg;
        msg = "Escolha a moeda: "
                + "\n"
                + "[ b ] - Bitcoin"
                + "\n"
                + "[ e ] - Ethereum" 
                + "\n" 
                + "Opção: ";
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        String opcao = input.nextLine();
        if (opcao.equals("b")){
            opcao = "BTC";
        }
        else{
            opcao = "ETH";
        }
        System.out.println(clientAPI.buscaMoeda(opcao));
    }
}