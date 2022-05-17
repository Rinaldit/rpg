import java.util.Random;

public class Principal {
    public static void main(String[] args) {

        guerreiro g = new guerreiro();
        mago m = new mago();
        arqueiro a = new arqueiro();

        g.nome = "Valquíria";
        g.forca = 80;
        g.agilidade = 40;
        g.carisma = 0;
        g.destreza = 50;
        g.inteligencia = 15;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vitalidade = 100;
        g.mana = 40;

        m.nome = "Mathew";
        m.forca = 20;
        m.agilidade = 55;
        m.carisma = 20;
        m.destreza = 90;
        m.inteligencia = 85;
        m.estamina = 45;
        m.resistencia = 25;
        m.sorte = 80;
        m.vitalidade = 40;
        m.mana = 95;


        a.nome = "Carl";
        a.forca = 40;
        a.agilidade = 55;
        a.carisma = 50;
        a.destreza = 90;
        a.inteligencia = 85;
        a.estamina = 55;
        a.resistencia = 65;
        a.sorte = 80;
        a.vitalidade = 70;
        a.mana = 65;

        // int valorAtaque = g.atacar(6);

        Random dado = new Random();

        int round = 1;
        while(g.vitalidade > 0 && m.vitalidade > 0){
            System.out.println("Round: " + round);
            System.out.println("oponente 1: " + g.nome);
            System.out.println("oponente 2: " + m.nome);
            
            // turno do mago
            int valorDado = dado.nextInt(6);
            System.out.println("valor do dado: " + valorDado);
            int valorAtaque = m.atacar(valorDado);
            g.defender(valorAtaque);

            // turno do guerreiro
            valorDado = dado.nextInt(6);
            System.out.println("valor do dado: " + valorDado);
            valorAtaque = g.atacar(valorDado);
            m.defender(valorAtaque);
            // round = round +1
            round++;


        }


        
    }
    
}
