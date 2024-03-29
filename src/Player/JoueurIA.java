package Player;

import Game.Action;
/**
 * Classe représentant un joueur artificiel
 */
public abstract class JoueurIA extends Joueur {

	/**
	 * Temps de réflexion en millisecondes pour choisir un coup
	 */
	public static int TEMPS_DE_REFLEXION = 1000;

	/** Action mémorisée lors de la recherche d'un coup à jouer */
	protected Action actionMemorisee;


	/**
	 * Constructeur
	 *
	 * @param nom nom du joueur
	 */
	public JoueurIA(String nom) {
		super(nom);
	}

	/**
	 * Mémorise une action
	 *
	 * @param action action à mémoriser
	 */
	protected void setActionMemorisee(Action action) {
		this.actionMemorisee = action;
	}

	/**
	 * Retourne l'action actuellement mémorisée
	 *
	 * @return une action
	 */
	public Action getActionMemorisee() {
		return actionMemorisee;

	}


	/**
	 * Mémorise une proposition d'action faite par le joueur (remplace l'éventuelle action précédemment mémorisée).
	 *
	 * @param action action proposée
	 */
	public final void proposerAction(Action action) {

		actionMemorisee = action;
		System.out.println("##############################");
		System.out.println("Action memorisee :" + actionMemorisee.toString());
		System.out.println("##############################");

	}

}