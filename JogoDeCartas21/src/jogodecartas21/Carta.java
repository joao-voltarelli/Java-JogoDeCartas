package jogodecartas21;

import java.util.Random;

public class Carta {
    private int valorDaCarta;
    private String naipeDaCarta;
    
    public int obterValorDaCarta(){
        return valorDaCarta;
    }
    
    public String obterNaipeDaCarta(){
        return naipeDaCarta;
    }

    public void setValorDaCarta(int valorDaCarta) {
        this.valorDaCarta = valorDaCarta;
    }

    public void setNaipeDaCarta(String naipeDaCarta) {
        this.naipeDaCarta = naipeDaCarta;
    }
    
    public void sortearCarta(){
        Random aleatorio = new Random();
        int cartaSorteada = (aleatorio.nextInt(52) + 1);
        
        if(cartaSorteada >= 1 && cartaSorteada <= 4){
            setValorDaCarta(1);
            
            switch(cartaSorteada){
                case 1:
                    setNaipeDaCarta("Ás de Paus");
                break;
                
                case 2:
                    setNaipeDaCarta("Ás de Ouros");
                break;
                
                case 3:
                    setNaipeDaCarta("Ás de Copas");
                break;
                
                case 4:
                    setNaipeDaCarta("Ás de Espadas");
                break;
            }
            
        }
        if(cartaSorteada >=5 && cartaSorteada <= 8){
            setValorDaCarta(2);
            
            switch(cartaSorteada){
                case 5:
                    setNaipeDaCarta("Dois de Paus");
                break;
                
                case 6:
                    setNaipeDaCarta("Dois de Ouros");
                break;
                
                case 7:
                    setNaipeDaCarta("Dois de Copas");
                break;
                
                case 8:
                    setNaipeDaCarta("Dois de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=9 && cartaSorteada <= 12){
            setValorDaCarta(3);
            
            switch(cartaSorteada){
                case 9:
                    setNaipeDaCarta("Três de Paus");
                break;
                
                case 10:
                    setNaipeDaCarta("Três de Ouros");
                break;
                
                case 11:
                    setNaipeDaCarta("Três de Copas");
                break;
                
                case 12:
                    setNaipeDaCarta("Três de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=13 && cartaSorteada <= 16){
            setValorDaCarta(4);
            
            switch(cartaSorteada){
                case 13:
                    setNaipeDaCarta("Quatro de Paus");
                break;
                
                case 14:
                    setNaipeDaCarta("Quatro de Ouros");
                break;
                
                case 15:
                    setNaipeDaCarta("Quatro de Copas");
                break;
                
                case 16:
                    setNaipeDaCarta("Quatro de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=17 && cartaSorteada <= 20){
            setValorDaCarta(5);
            
            switch(cartaSorteada){
                case 17:
                    setNaipeDaCarta("Cinco de Paus");
                break;
                
                case 18:
                    setNaipeDaCarta("Cinco de Ouros");
                break;
                
                case 19:
                    setNaipeDaCarta("Cinco de Copas");
                break;
                
                case 20:
                    setNaipeDaCarta("Cinco de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=21 && cartaSorteada <= 24){
            setValorDaCarta(6);
            
            switch(cartaSorteada){
                case 21:
                    setNaipeDaCarta("Seis de Paus");
                break;
                
                case 22:
                    setNaipeDaCarta("Seis de Ouros");
                break;
                
                case 23:
                    setNaipeDaCarta("Seis de Copas");
                break;
                
                case 24:
                    setNaipeDaCarta("Seis de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=25 && cartaSorteada <= 28){
            setValorDaCarta(7);
            
            switch(cartaSorteada){
                case 25:
                    setNaipeDaCarta("Sete de Paus");
                break;
                
                case 26:
                    setNaipeDaCarta("Sete de Ouros");
                break;
                
                case 27:
                    setNaipeDaCarta("Sete de Copas");
                break;
                
                case 28:
                    setNaipeDaCarta("Sete de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=29 && cartaSorteada <= 32){
            setValorDaCarta(8);
            
            switch(cartaSorteada){
                case 29:
                    setNaipeDaCarta("Oito de Paus");
                break;
                
                case 30:
                    setNaipeDaCarta("Oito de Ouros");
                break;
                
                case 31:
                    setNaipeDaCarta("Oito de Copas");
                break;
                
                case 32:
                    setNaipeDaCarta("Oito de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=33 && cartaSorteada <= 36){
            setValorDaCarta(9);
            
            switch(cartaSorteada){
                case 33:
                    setNaipeDaCarta("Nove de Paus");
                break;
                
                case 34:
                    setNaipeDaCarta("Nove de Ouros");
                break;
                
                case 35:
                    setNaipeDaCarta("Nove de Copas");
                break;
                
                case 36:
                    setNaipeDaCarta("Nove de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=37 && cartaSorteada <= 40){
            setValorDaCarta(10);
            
            switch(cartaSorteada){
                case 37:
                    setNaipeDaCarta("Dez de Paus");
                break;
                
                case 38:
                    setNaipeDaCarta("Dez de Ouros");
                break;
                
                case 39:
                    setNaipeDaCarta("Dez de Copas");
                break;
                
                case 40:
                    setNaipeDaCarta("Dez de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=41 && cartaSorteada <= 44){
            setValorDaCarta(10);
            
            switch(cartaSorteada){
                case 41:
                    setNaipeDaCarta("Valete(J) de Paus");
                break;
                
                case 42:
                    setNaipeDaCarta("Valete(J) de Ouros");
                break;
                
                case 43:
                    setNaipeDaCarta("Valete(J) de Copas");
                break;
                
                case 44:
                    setNaipeDaCarta("Valete(J) de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=45 && cartaSorteada <= 48){
            setValorDaCarta(10);
            
            switch(cartaSorteada){
                case 45:
                    setNaipeDaCarta("Dama(Q) de Paus");
                break;
                
                case 46:
                    setNaipeDaCarta("Dama(Q) de Ouros");
                break;
                
                case 47:
                    setNaipeDaCarta("Dama(Q) de Copas");
                break;
                
                case 48:
                    setNaipeDaCarta("Dama(Q) de Espadas");
                break;
            }
        }
        
        if(cartaSorteada >=49 && cartaSorteada <= 52){
            setValorDaCarta(10);
            
            switch(cartaSorteada){
                case 49:
                    setNaipeDaCarta("Rei(K) de Paus");
                break;
                
                case 50:
                    setNaipeDaCarta("Rei(K) de Ouros");
                break;
                
                case 51:
                    setNaipeDaCarta("Rei(K) de Copas");
                break;
                
                case 52:
                    setNaipeDaCarta("Rei(K) de Espadas");
                break;
            }
        }
    }
}
