import java.util.List;
import java.util.Random;

public class miniMaxIA extends JoueurIA {

    public miniMaxIA(int id, String nom) {
        super(id, nom);
    }
    @Override
    public Action choisirAction(Etat etat) throws Exception {
        Random aleatoire = new Random();
        List<Action> actionsPossibles = etat.actionsPossibles();
        int indiceAction = aleatoire.nextInt(actionsPossibles.size());
        System.out.println(actionsPossibles.get(indiceAction));
        return  actionsPossibles.get(indiceAction);
    }

    @Override
    public void proposerAction(Action action) {

    }
}
