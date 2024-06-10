public class ControleTv
{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

// criando os métodos

    public void ligar()
    {
        this.ligada = true;    
    }
    public void desligar()
    {
        ligada = false;    
    }

    public void aumentarVolume() 
    {
        volume++;
    }

    public void diminuirVolume() 
    {
        volume--;
    }

    public void mudarCanal(int novoCanal)
    {
        canal = novoCanal;
    }

    
}
