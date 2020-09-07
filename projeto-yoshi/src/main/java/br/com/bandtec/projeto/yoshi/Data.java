package br.com.bandtec.projeto.yoshi;

/**
 *
 * @author Murilo-Note
 */
import java.util.concurrent.ThreadLocalRandom;

public class Data {
    Double media = 0.0;
    Double minimo = 0.100;
    Double maximo = 0.0;
    Double valor = 0.0;
    
    public void gerador(Integer m, Integer click){
        Double num = ThreadLocalRandom.current().nextDouble(0, m);
        this.media = num/click;
        
        if(num > this.maximo){
            this.maximo  = num;
        }else if(num < this.minimo){
            this.minimo = num;
        }
        
        this.valor = num * 10;
    }
   
}