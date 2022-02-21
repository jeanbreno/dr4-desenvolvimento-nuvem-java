package br.edu.infnet.ClienteViaCep;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author jeanbreno
 */
public class Endereco {
    @JsonProperty
    private String cep;
    @JsonProperty
    private String logradouro;
    @JsonProperty
    private String complemento;
    @JsonProperty
    private String bairro;
    @JsonProperty
    private String localidade;
    @JsonProperty
    private String uf;
    @JsonProperty
    private String ibge;
    @JsonProperty
    private String gia;
    @JsonProperty
    private String ddd;
    @JsonProperty
    private String siafi;
    
   @Override
   public String toString(){
       String msg;
    
       if (cep != null) {
           msg =   "CEP: "         + cep         + "\n" + 
                   "Logradouto: "  + logradouro  + "\n" + 
                   "Complemento: " + complemento + "\n" +
                   "Bairro: "      + bairro      + "\n" + 
                   "Localidade: "  + localidade  + "\n" + 
                   "UF: "          + uf          + "\n" + 
                   "IBGE: "        + ibge        + "\n" + 
                   "GIA: "         + gia         + "\n" + 
                   "DDD: "         + ddd         + "\n" + 
                   "SIAFI: "       + siafi;
       }
       else {
           msg = "ERRO: Informe um CEP válido!";
       }
        return msg;
    }
}
