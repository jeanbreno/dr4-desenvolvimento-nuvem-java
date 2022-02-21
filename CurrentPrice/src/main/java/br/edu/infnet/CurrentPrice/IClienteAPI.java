package br.edu.infnet.CurrentPrice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author jeanbreno
 */

@FeignClient(url="https://brasilbitcoin.com.br/API/prices/", name="CotacaoMoeda")
public interface IClienteAPI {
    @GetMapping("{opcao}")
    Currency buscaMoeda(@PathVariable("opcao") String opcao);
}
