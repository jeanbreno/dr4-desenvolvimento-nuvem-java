
package br.edu.infnet.CurrentPrice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author jeanbreno
 */
public class Currency {
    @JsonProperty
    private String last;
    @JsonProperty
    private String max;
    @JsonProperty
    private String min;
    @JsonProperty
    private String buy;
    @JsonProperty
    private String sell;
    @JsonProperty
    private String open6;
    @JsonProperty
    private String open12;
    @JsonProperty
    private String open18;
    @JsonProperty
    private String open;
    @JsonProperty
    private String vol;
    @JsonProperty
    private String trade;
    @JsonProperty
    private String trades;
    @JsonProperty
    private String vwap;
    @JsonProperty
    private String money;
    
   @Override
   public String toString(){
       String msg;
    
        msg =   "------- INFO: "                  + "\n" +
                "Último preço: "         + last   + "\n" + 
                "Preço máximo: "         + max    + "\n" + 
                "Preço mínimo: "         + min    + "\n" +
                "Compra: "               + buy    + "\n" + 
                "Venda: "                + sell   + "\n" + 
                "Open6: "                + open6  + "\n" + 
                "Open12: "               + open12 + "\n" + 
                "Open18: "               + open18 + "\n" + 
                "Open: "                 + open   + "\n" + 
                "Volume de negociação: " + vol    + "\n" +
                "Trade: "                + trade  + "\n" +
                "Quantidade de trades: " + trades + "\n" +
                "Vwap: "                 + vwap   + "\n" +
                "Money USD: "            + money 
                ;
        
        return msg;
    }
}
