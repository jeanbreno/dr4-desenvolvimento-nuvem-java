package br.edu.infnet.ClienteViaCep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author jeanbreno
 */

@FeignClient(url="https://viacep.com.br/ws/", name="ViaCepWs")
public interface IClienteAPI {
    @GetMapping("{cep}/json")
    Endereco buscaEndereco(@PathVariable("cep") String cep);
}
