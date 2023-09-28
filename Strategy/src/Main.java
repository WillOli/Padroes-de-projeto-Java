public class Main {
    public static void main(String[] args) {
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();


        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();
    }
}