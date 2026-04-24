package fr.univ_amu.iut.bonus8;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Exercice 8 (bonus) - Mini-jeu Pacman.
 *
 * <p>Objectif : synthèse avancée. Un Pacman et un Fantôme se déplacent sur un plateau de jeu. Le
 * Pacman est contrôlé par les flèches directionnelles, le Fantôme par les touches Z/Q/S/D. Une
 * collision entre les deux déclenche un message.
 *
 * <p>Concepts : héritage, {@link javafx.scene.Group}, {@link javafx.scene.shape.Circle}, {@link
 * javafx.scene.input.KeyEvent}, collision, composition graphique.
 */
public class JeuPacman extends Application {

  @Override
  public void start(Stage primaryStage) {
    // TODO exercice 8 : assembler le jeu.
    //
    // Le code ci-dessous est fourni. Il reste à compléter les classes
    // Personnage (directionBas, directionHaut), Pacman (bouche haut/bas)
    // et Fantome (4 directions avec orientation des yeux).
  }

  public static void main(String[] args) {
    launch(args);
  }
}
