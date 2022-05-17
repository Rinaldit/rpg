public class mago {
    
    String nome;
    int forca;
    int destreza;
    int agilidade;
    int inteligencia;
    int vitalidade;
    int estamina;
    int sorte;
    int resistencia;
    int carisma;
    int mana;


    int atacar(int valorDado){
        int valorAtaque = 0;
        
        if(valorDado < 2){
            System.out.println("O ataque falhou!!!");

        
        }else{
            valorAtaque = this.inteligencia+valorDado;

        }
        return valorAtaque;

    }

    void defender(int valorAtaque){
        if(valorAtaque <= this.resistencia){
            System.out.println("O ataque foi defendido!!!");
        }else{
            int danoCausado = valorAtaque - this.resistencia;
            System.out.println("o dano causado foi de: " + danoCausado);
            this.vitalidade -= danoCausado;
    }
  }
}

