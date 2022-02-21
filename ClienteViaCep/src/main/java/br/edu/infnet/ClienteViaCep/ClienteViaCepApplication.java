package br.edu.infnet.ClienteViaCep;

import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClienteViaCepApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ClienteViaCepApplication.class, args);
    }
    
    @Autowired
    private IClienteAPI clientAPI;
    
    @Override
    public void run(String... args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o seu CEP: ");
        String cep = input.nextLine();
        System.out.println(clientAPI.buscaEndereco(cep));
    }
}
