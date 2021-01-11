package jogodecartas21;

import java.util.Scanner;

public class JogoDeCartas21 {

    public static void main(String[] args) {
        jogar();
    }
    
    public static void jogar(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        
        int i = 2;
        int somaDasCartas;
        Carta carta1 = new Carta();
        Carta carta2 = new Carta();
        Carta[] cartasExtras = new Carta[52];
        int valorCarta1, valorCarta2, valorCartaExtra;
        
        carta1.sortearCarta();
        valorCarta1 = carta1.obterValorDaCarta();
        carta2.sortearCarta();
        
        while(carta2.obterNaipeDaCarta().equals(carta1.obterNaipeDaCarta())){
            carta2.sortearCarta();
        }
        valorCarta2 = carta2.obterValorDaCarta();
        somaDasCartas = valorCarta1 + valorCarta2;
        
        cartasExtras[0] = carta1;
        cartasExtras[1] = carta2;
        
        System.out.println("As suas cartas são:\n");
        
        for(Carta carta: cartasExtras){
            if(carta != null)
            {
                System.out.println(carta.obterNaipeDaCarta() + " que vale " + carta.obterValorDaCarta());
            }
        }
        System.out.println("Soma das cartas = " + somaDasCartas);
        
        while(somaDasCartas < 21)
        {
            System.out.println("\nDigite 1 para sortear uma nova carta ou digite 0 para parar: ");
            opcao = entrada.nextInt();
            
            if(opcao == 1){
                System.out.println("\nSorteando mais uma carta...\n");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                Carta novaCarta = new Carta();
                novaCarta.sortearCarta();
            
                while((novaCarta.obterNaipeDaCarta().equals(carta1.obterNaipeDaCarta())) || (novaCarta.obterNaipeDaCarta().equals(carta2.obterNaipeDaCarta()))){
                novaCarta.sortearCarta();
                }
                System.out.println(novaCarta.obterNaipeDaCarta() + " que vale " + novaCarta.obterValorDaCarta());
                somaDasCartas = somaDasCartas + novaCarta.obterValorDaCarta();
                cartasExtras[i] = novaCarta;
                i++;
            }else
                break;
        }
        
        if(somaDasCartas == 21)
        {
            System.out.println("\nParabéns, você ganhou!\n");
        }
        
        System.out.println("\nExibindo suas cartas...\n");
        
        for(Carta carta: cartasExtras){
            if(carta != null)
            {
                System.out.println(carta.obterNaipeDaCarta() + " que vale " + carta.obterValorDaCarta());
            }
        }
        System.out.println("Soma das cartas = " + somaDasCartas);
        
        if(somaDasCartas > 21)
        {
            System.out.println("\nVocê perdeu, estorou a quantidade de pontos...");
            System.out.println("O vencedor foi o adversário!");
        }else{
            System.out.println("\nVez do adversário...\n");    
        
            Carta[] cartas_mesa = new Carta[52];
            int j=0;
            int soma_cartas_mesa = 0;
        
            while(soma_cartas_mesa < 21)
            {          
                System.out.println("\nSorteando carta...\n");
                try { Thread.sleep (2000); } catch (InterruptedException ex) {}
                Carta carta_sorteada = new Carta();
                carta_sorteada.sortearCarta();
            
                System.out.println(carta_sorteada.obterNaipeDaCarta() + " que vale " + carta_sorteada.obterValorDaCarta());
                soma_cartas_mesa = soma_cartas_mesa + carta_sorteada.obterValorDaCarta();
                cartas_mesa[j] = carta_sorteada;
                j++;
            }
        
            if(soma_cartas_mesa == 21)
            {
                System.out.println("O adversário é o vencedor!\n");
                for(Carta carta: cartas_mesa){
                    if(carta != null)
                    {
                        System.out.println(carta.obterNaipeDaCarta() + " que vale " + carta.obterValorDaCarta());
                    }
                }
                System.out.println("Soma das cartas = " + soma_cartas_mesa);
            }else{
                System.out.println("\nO adversário estourou a quantidade de pontos...");
                System.out.println("Você é o vencedor!");
            }
        }  
    }
}
