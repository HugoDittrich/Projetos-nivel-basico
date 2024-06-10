public class Usuario
{
    public static void main(String[] args) throws Exception
    {
        ControleTv controleRemoto = new ControleTv();

        System.out.println("Situação da TV → " + controleRemoto.ligada);
        controleRemoto.ligar();
        System.out.println("Situação da TV → " + controleRemoto.ligada);

        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        controleRemoto.aumentarVolume();
        System.out.println("volume atual → " + controleRemoto.volume);
        
        controleRemoto.mudarCanal(13);
        System.out.println("Canal atual é " + controleRemoto.canal);




    }
}
