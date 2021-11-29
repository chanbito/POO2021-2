import java.util.Date;

public class dualidade {
    public static void main(String[] args) {
        var areaa = new area("Desing", "responsavel por desing");
        dormir();
        areaa.setDescription("qwehrhqwiuehriqwehrih");
        printar(areaa);
        var prof1 = new profile("desiners", null, "51 994564832", "nada mda", "https://github.com/chanbito");
        dormir();
        prof1.setBiografy("nada devemos aqueles que deviamos, pagamos hoje");;
        printar(prof1);
        var us = new user("gabriel", "email@demo", "459484");
        dormir();
        us.set_Area(areaa);
        us.set_Profile(prof1);
        printar(us);
        team team = new team("team liquid", "tl@demo", us);
        dormir();
        team.addUsers(new user("luiz", "email@demo", "qerqw"));
        printar(team);
        demand d = new demand("dualidade", "projeto dualidade", "parceria", "iniciando", "https://github.com/chanbito",new Date(), null, new user("cliente", "email@demo", "345y238"), team);
        printar(d);
    }

    public static void printar(Object dw)
    {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(dw.toString());
        System.out.println("******************//**********************");
    }
    public static void dormir()
    {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }
}
