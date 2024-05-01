public class SmartTv {

    boolean ligada = false;
    int canal = 01;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal trocado para: " + canal);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentado volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuido volume para: " + volume);
    }


    
}
