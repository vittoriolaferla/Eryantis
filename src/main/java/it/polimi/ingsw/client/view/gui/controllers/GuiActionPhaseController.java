package it.polimi.ingsw.client.view.gui.controllers;

import it.polimi.ingsw.message.*;
import it.polimi.ingsw.model.Game;
import it.polimi.ingsw.model.enumerations.Color;
import it.polimi.ingsw.model.enumerations.PlayerPhase;
import it.polimi.ingsw.model.islands.IslandInterface;
import it.polimi.ingsw.model.pawns.MotherNature;
import it.polimi.ingsw.model.pawns.Student;
import it.polimi.ingsw.model.pawns.Tower;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.ResourceBundle;

public class GuiActionPhaseController implements Initializable {

    /**
     * Path to island A image file
     */
    private String islandAPath = "/Graphical_Assets/reameB_1.png";

    /**
     * Path to island B image file
     */
    private String islandBPath = "/Graphical_Assets/reameB_1.2.png";

    /**
     * Path to island C image file
     */
    private String islandCPath = "/Graphical_Assets/pawns/reameB_1.3.png";

    /**
     * Path to mother nature image file
     */
    private String motherNaturePath = "/Graphical_Assets/pawns/mothernature.png";

    /**
     * Path to yellow student image file
     */
    private String yellowStudentPath = "/Graphical_Assets/pawns/student_yellow.png";

    /**
     * Path to red student image file
     */
    private String redStudentPath = "/Graphical_Assets/pawns/student_red.png";

    /**
     * Path to blue student image file
     */
    private String blueStudentPath = "/Graphical_Assets/pawns/student_blue.png";

    /**
     * Path to green student image file
     */
    private String greenStudentPath = "/Graphical_Assets/pawns/student_green.png";

    /**
     * Path to pink student image file
     */
    private String pinkStudentPath = "/Graphical_Assets/pawns/student_pink.png";

    /**
     * Path to yellow professor image file
     */
    private String yellowProfessorPath = "/Graphical_Assets/pawns/professor_yellow.png";

    /**
     * Path to red professor image file
     */
    private String redProfessorPath = "/Graphical_Assets/pawns/professor_red.png";

    /**
     * Path to green professor image file
     */
    private String greenProfessorPath = "/Graphical_Assets/pawns/professor_green.png";

    /**
     * Path to pink professor image file
     */
    private String pinkProfessorPath = "/Graphical_Assets/pawns/professor_pink.png";

    /**
     * Path to blue professor image file
     */
    private String blueProfessorPath = "/Graphical_Assets/pawns/professor_blue.png";

    /**
     * Path to black tower image file
     */
    private String blackTowerPath = "/Graphical_Assets/pawns/tower_black.png";

    /**
     * Path to white tower image file
     */
    private String whiteTowerPath = "/Graphical_Assets/pawns/tower_white.png";

    /**
     * Path to grey tower image file
     */
    private String greyTowerPath = "/Graphical_Assets/pawns/tower_grey.png";

    /**
     * Path to deny token image file
     */
    private String denyPath = "/Graphical_Assets/deny_token.png";

    /**
     * Paths to assistantCards image files
     */
    private String card1Path = "/Graphical_Assets/Assistenti/2x/Assistente (1).png";
    private String card2Path = "/Graphical_Assets/Assistenti/2x/Assistente (2).png";
    private String card3Path = "/Graphical_Assets/Assistenti/2x/Assistente (3).png";
    private String card4Path = "/Graphical_Assets/Assistenti/2x/Assistente (4).png";
    private String card5Path = "/Graphical_Assets/Assistenti/2x/Assistente (5).png";
    private String card6Path = "/Graphical_Assets/Assistenti/2x/Assistente (6).png";
    private String card7Path = "/Graphical_Assets/Assistenti/2x/Assistente (7).png";
    private String card8Path = "/Graphical_Assets/Assistenti/2x/Assistente (8).png";
    private String card9Path = "/Graphical_Assets/Assistenti/2x/Assistente (9).png";
    private String card10Path = "/Graphical_Assets/Assistenti/2x/Assistente (10).png";

    /**
     * AnchorPane reference
     */
    @FXML
    private AnchorPane scenePane;

    /**
     * islands reference
     */
    @FXML
    private ImageView island1;
    @FXML
    private ImageView island2;
    @FXML
    private ImageView island3;
    @FXML
    private ImageView island4;
    @FXML
    private ImageView island5;
    @FXML
    private ImageView island6;
    @FXML
    private ImageView island7;
    @FXML
    private ImageView island8;
    @FXML
    private ImageView island9;
    @FXML
    private ImageView island10;
    @FXML
    private ImageView island11;
    @FXML
    private ImageView island12;

    /**
     * professor ImageView reference
     */
    @FXML
    private ImageView professorGreen;
    @FXML
    private ImageView professorRed;
    @FXML
    private ImageView professorYellow;
    @FXML
    private ImageView professorPink;
    @FXML
    private ImageView professorBlue;

    /**
     * deny tokens reference
     */
    @FXML
    private ImageView deny1Island1;
    @FXML
    private ImageView deny2Island1;
    @FXML
    private ImageView deny3Island1;
    @FXML
    private ImageView deny4Island1;
    @FXML
    private ImageView deny1Island2;
    @FXML
    private ImageView deny2Island2;
    @FXML
    private ImageView deny3Island2;
    @FXML
    private ImageView deny4Island2;
    @FXML
    private ImageView deny1Island3;
    @FXML
    private ImageView deny2Island3;
    @FXML
    private ImageView deny3Island3;
    @FXML
    private ImageView deny4Island3;
    @FXML
    private ImageView deny1Island4;
    @FXML
    private ImageView deny2Island4;
    @FXML
    private ImageView deny3Island4;
    @FXML
    private ImageView deny4Island4;
    @FXML
    private ImageView deny1Island5;
    @FXML
    private ImageView deny2Island5;
    @FXML
    private ImageView deny3Island5;
    @FXML
    private ImageView deny4Island5;
    @FXML
    private ImageView deny1Island6;
    @FXML
    private ImageView deny2Island6;
    @FXML
    private ImageView deny3Island6;
    @FXML
    private ImageView deny4Island6;
    @FXML
    private ImageView deny1Island7;
    @FXML
    private ImageView deny2Island7;
    @FXML
    private ImageView deny3Island7;
    @FXML
    private ImageView deny4Island7;
    @FXML
    private ImageView deny1Island8;
    @FXML
    private ImageView deny2Island8;
    @FXML
    private ImageView deny3Island8;
    @FXML
    private ImageView deny4Island8;
    @FXML
    private ImageView deny1Island9;
    @FXML
    private ImageView deny2Island9;
    @FXML
    private ImageView deny3Island9;
    @FXML
    private ImageView deny4Island9;
    @FXML
    private ImageView deny1Island10;
    @FXML
    private ImageView deny2Island10;
    @FXML
    private ImageView deny3Island10;
    @FXML
    private ImageView deny4Island10;
    @FXML
    private ImageView deny1Island11;
    @FXML
    private ImageView deny2Island11;
    @FXML
    private ImageView deny3Island11;
    @FXML
    private ImageView deny4Island11;
    @FXML
    private ImageView deny1Island12;
    @FXML
    private ImageView deny2Island12;
    @FXML
    private ImageView deny3Island12;
    @FXML
    private ImageView deny4Island12;

    /**
     * tower ImageView reference
     */
    @FXML
    private ImageView tower1;
    @FXML
    private ImageView tower2;
    @FXML
    private ImageView tower3;
    @FXML
    private ImageView tower4;
    @FXML
    private ImageView tower5;
    @FXML
    private ImageView tower6;
    @FXML
    private ImageView tower7;
    @FXML
    private ImageView tower8;

    /**
     * student on island 1 ImageView reference
     */
    @FXML
    private ImageView student1Island1;
    @FXML
    private ImageView student2Island1;
    @FXML
    private ImageView student3Island1;
    @FXML
    private ImageView student4Island1;
    @FXML
    private ImageView student5Island1;
    @FXML
    private ImageView student6Island1;
    @FXML
    private ImageView student7Island1;
    @FXML
    private ImageView student8Island1;
    @FXML
    private ImageView student9Island1;
    @FXML
    private ImageView student10Island1;
    @FXML
    private ImageView student11Island1;
    @FXML
    private ImageView student12Island1;
    @FXML
    private ImageView student13Island1;
    @FXML
    private ImageView student14Island1;
    @FXML
    private ImageView student15Island1;
    @FXML
    private ImageView student16Island1;
    @FXML
    private ImageView student17Island1;
    @FXML
    private ImageView student18Island1;
    @FXML
    private ImageView student19Island1;
    @FXML
    private ImageView student20Island1;

    /**
     * student on island 2 ImageView reference
     */
    @FXML
    private ImageView student1Island2;
    @FXML
    private ImageView student2Island2;
    @FXML
    private ImageView student3Island2;
    @FXML
    private ImageView student4Island2;
    @FXML
    private ImageView student5Island2;
    @FXML
    private ImageView student6Island2;
    @FXML
    private ImageView student7Island2;
    @FXML
    private ImageView student8Island2;
    @FXML
    private ImageView student9Island2;
    @FXML
    private ImageView student10Island2;
    @FXML
    private ImageView student11Island2;
    @FXML
    private ImageView student12Island2;
    @FXML
    private ImageView student13Island2;
    @FXML
    private ImageView student14Island2;
    @FXML
    private ImageView student15Island2;
    @FXML
    private ImageView student16Island2;
    @FXML
    private ImageView student17Island2;
    @FXML
    private ImageView student18Island2;
    @FXML
    private ImageView student19Island2;
    @FXML
    private ImageView student20Island2;

    /**
     * student on island 1 ImageView reference
     */
    @FXML
    private ImageView student1Island3;
    @FXML
    private ImageView student2Island3;
    @FXML
    private ImageView student3Island3;
    @FXML
    private ImageView student4Island3;
    @FXML
    private ImageView student5Island3;
    @FXML
    private ImageView student6Island3;
    @FXML
    private ImageView student7Island3;
    @FXML
    private ImageView student8Island3;
    @FXML
    private ImageView student9Island3;
    @FXML
    private ImageView student10Island3;
    @FXML
    private ImageView student11Island3;
    @FXML
    private ImageView student12Island3;
    @FXML
    private ImageView student13Island3;
    @FXML
    private ImageView student14Island3;
    @FXML
    private ImageView student15Island3;
    @FXML
    private ImageView student16Island3;
    @FXML
    private ImageView student17Island3;
    @FXML
    private ImageView student18Island3;
    @FXML
    private ImageView student19Island3;
    @FXML
    private ImageView student20Island3;

    /**
     * student on island 4 ImageView reference
     */
    @FXML
    private ImageView student1Island4;
    @FXML
    private ImageView student2Island4;
    @FXML
    private ImageView student3Island4;
    @FXML
    private ImageView student4Island4;
    @FXML
    private ImageView student5Island4;
    @FXML
    private ImageView student6Island4;
    @FXML
    private ImageView student7Island4;
    @FXML
    private ImageView student8Island4;
    @FXML
    private ImageView student9Island4;
    @FXML
    private ImageView student10Island4;
    @FXML
    private ImageView student11Island4;
    @FXML
    private ImageView student12Island4;
    @FXML
    private ImageView student13Island4;
    @FXML
    private ImageView student14Island4;
    @FXML
    private ImageView student15Island4;
    @FXML
    private ImageView student16Island4;
    @FXML
    private ImageView student17Island4;
    @FXML
    private ImageView student18Island4;
    @FXML
    private ImageView student19Island4;
    @FXML
    private ImageView student20Island4;

    /**
     * student on island 5 ImageView reference
     */
    @FXML
    private ImageView student1Island5;
    @FXML
    private ImageView student2Island5;
    @FXML
    private ImageView student3Island5;
    @FXML
    private ImageView student4Island5;
    @FXML
    private ImageView student5Island5;
    @FXML
    private ImageView student6Island5;
    @FXML
    private ImageView student7Island5;
    @FXML
    private ImageView student8Island5;
    @FXML
    private ImageView student9Island5;
    @FXML
    private ImageView student10Island5;
    @FXML
    private ImageView student11Island5;
    @FXML
    private ImageView student12Island5;
    @FXML
    private ImageView student13Island5;
    @FXML
    private ImageView student14Island5;
    @FXML
    private ImageView student15Island5;
    @FXML
    private ImageView student16Island5;
    @FXML
    private ImageView student17Island5;
    @FXML
    private ImageView student18Island5;
    @FXML
    private ImageView student19Island5;
    @FXML
    private ImageView student20Island5;

    /**
     * student on island 6 ImageView reference
     */
    @FXML
    private ImageView student1Island6;
    @FXML
    private ImageView student2Island6;
    @FXML
    private ImageView student3Island6;
    @FXML
    private ImageView student4Island6;
    @FXML
    private ImageView student5Island6;
    @FXML
    private ImageView student6Island6;
    @FXML
    private ImageView student7Island6;
    @FXML
    private ImageView student8Island6;
    @FXML
    private ImageView student9Island6;
    @FXML
    private ImageView student10Island6;
    @FXML
    private ImageView student11Island6;
    @FXML
    private ImageView student12Island6;
    @FXML
    private ImageView student13Island6;
    @FXML
    private ImageView student14Island6;
    @FXML
    private ImageView student15Island6;
    @FXML
    private ImageView student16Island6;
    @FXML
    private ImageView student17Island6;
    @FXML
    private ImageView student18Island6;
    @FXML
    private ImageView student19Island6;
    @FXML
    private ImageView student20Island6;

    /**
     * student on island 7 ImageView reference
     */
    @FXML
    private ImageView student1Island7;
    @FXML
    private ImageView student2Island7;
    @FXML
    private ImageView student3Island7;
    @FXML
    private ImageView student4Island7;
    @FXML
    private ImageView student5Island7;
    @FXML
    private ImageView student6Island7;
    @FXML
    private ImageView student7Island7;
    @FXML
    private ImageView student8Island7;
    @FXML
    private ImageView student9Island7;
    @FXML
    private ImageView student10Island7;
    @FXML
    private ImageView student11Island7;
    @FXML
    private ImageView student12Island7;
    @FXML
    private ImageView student13Island7;
    @FXML
    private ImageView student14Island7;
    @FXML
    private ImageView student15Island7;
    @FXML
    private ImageView student16Island7;
    @FXML
    private ImageView student17Island7;
    @FXML
    private ImageView student18Island7;
    @FXML
    private ImageView student19Island7;
    @FXML
    private ImageView student20Island7;

    /**
     * student on island 8 ImageView reference
     */
    @FXML
    private ImageView student1Island8;
    @FXML
    private ImageView student2Island8;
    @FXML
    private ImageView student3Island8;
    @FXML
    private ImageView student4Island8;
    @FXML
    private ImageView student5Island8;
    @FXML
    private ImageView student6Island8;
    @FXML
    private ImageView student7Island8;
    @FXML
    private ImageView student8Island8;
    @FXML
    private ImageView student9Island8;
    @FXML
    private ImageView student10Island8;
    @FXML
    private ImageView student11Island8;
    @FXML
    private ImageView student12Island8;
    @FXML
    private ImageView student13Island8;
    @FXML
    private ImageView student14Island8;
    @FXML
    private ImageView student15Island8;
    @FXML
    private ImageView student16Island8;
    @FXML
    private ImageView student17Island8;
    @FXML
    private ImageView student18Island8;
    @FXML
    private ImageView student19Island8;
    @FXML
    private ImageView student20Island8;

    /**
     * student on island 9 ImageView reference
     */
    @FXML
    private ImageView student1Island9;
    @FXML
    private ImageView student2Island9;
    @FXML
    private ImageView student3Island9;
    @FXML
    private ImageView student4Island9;
    @FXML
    private ImageView student5Island9;
    @FXML
    private ImageView student6Island9;
    @FXML
    private ImageView student7Island9;
    @FXML
    private ImageView student8Island9;
    @FXML
    private ImageView student9Island9;
    @FXML
    private ImageView student10Island9;
    @FXML
    private ImageView student11Island9;
    @FXML
    private ImageView student12Island9;
    @FXML
    private ImageView student13Island9;
    @FXML
    private ImageView student14Island9;
    @FXML
    private ImageView student15Island9;
    @FXML
    private ImageView student16Island9;
    @FXML
    private ImageView student17Island9;
    @FXML
    private ImageView student18Island9;
    @FXML
    private ImageView student19Island9;
    @FXML
    private ImageView student20Island9;

    /**
     * student on island 10 ImageView reference
     */
    @FXML
    private ImageView student1Island10;
    @FXML
    private ImageView student2Island10;
    @FXML
    private ImageView student3Island10;
    @FXML
    private ImageView student4Island10;
    @FXML
    private ImageView student5Island10;
    @FXML
    private ImageView student6Island10;
    @FXML
    private ImageView student7Island10;
    @FXML
    private ImageView student8Island10;
    @FXML
    private ImageView student9Island10;
    @FXML
    private ImageView student10Island10;
    @FXML
    private ImageView student11Island10;
    @FXML
    private ImageView student12Island10;
    @FXML
    private ImageView student13Island10;
    @FXML
    private ImageView student14Island10;
    @FXML
    private ImageView student15Island10;
    @FXML
    private ImageView student16Island10;
    @FXML
    private ImageView student17Island10;
    @FXML
    private ImageView student18Island10;
    @FXML
    private ImageView student19Island10;
    @FXML
    private ImageView student20Island10;

    /**
     * student on island 11 ImageView reference
     */
    @FXML
    private ImageView student1Island11;
    @FXML
    private ImageView student2Island11;
    @FXML
    private ImageView student3Island11;
    @FXML
    private ImageView student4Island11;
    @FXML
    private ImageView student5Island11;
    @FXML
    private ImageView student6Island11;
    @FXML
    private ImageView student7Island11;
    @FXML
    private ImageView student8Island11;
    @FXML
    private ImageView student9Island11;
    @FXML
    private ImageView student10Island11;
    @FXML
    private ImageView student11Island11;
    @FXML
    private ImageView student12Island11;
    @FXML
    private ImageView student13Island11;
    @FXML
    private ImageView student14Island11;
    @FXML
    private ImageView student15Island11;
    @FXML
    private ImageView student16Island11;
    @FXML
    private ImageView student17Island11;
    @FXML
    private ImageView student18Island11;
    @FXML
    private ImageView student19Island11;
    @FXML
    private ImageView student20Island11;

    /**
     * student on island 12 ImageView reference
     */
    @FXML
    private ImageView student1Island12;
    @FXML
    private ImageView student2Island12;
    @FXML
    private ImageView student3Island12;
    @FXML
    private ImageView student4Island12;
    @FXML
    private ImageView student5Island12;
    @FXML
    private ImageView student6Island12;
    @FXML
    private ImageView student7Island12;
    @FXML
    private ImageView student8Island12;
    @FXML
    private ImageView student9Island12;
    @FXML
    private ImageView student10Island12;
    @FXML
    private ImageView student11Island12;
    @FXML
    private ImageView student12Island12;
    @FXML
    private ImageView student13Island12;
    @FXML
    private ImageView student14Island12;
    @FXML
    private ImageView student15Island12;
    @FXML
    private ImageView student16Island12;
    @FXML
    private ImageView student17Island12;
    @FXML
    private ImageView student18Island12;
    @FXML
    private ImageView student19Island12;
    @FXML
    private ImageView student20Island12;

    /**
     * student ingress ImageView reference
     */
    @FXML
    private ImageView studentIngress1;
    @FXML
    private ImageView studentIngress2;
    @FXML
    private ImageView studentIngress3;
    @FXML
    private ImageView studentIngress4;
    @FXML
    private ImageView studentIngress5;
    @FXML
    private ImageView studentIngress6;
    @FXML
    private ImageView studentIngress7;
    @FXML
    private ImageView studentIngress8;
    @FXML
    private ImageView studentIngress9;

    /**
     * student hall green ImageView reference
     */
    @FXML
    private ImageView studentHallGreen1;
    @FXML
    private ImageView studentHallGreen2;
    @FXML
    private ImageView studentHallGreen3;
    @FXML
    private ImageView studentHallGreen4;
    @FXML
    private ImageView studentHallGreen5;
    @FXML
    private ImageView studentHallGreen6;
    @FXML
    private ImageView studentHallGreen7;
    @FXML
    private ImageView studentHallGreen8;
    @FXML
    private ImageView studentHallGreen9;
    @FXML
    private ImageView studentHallGreen10;

    /**
     * student hall red ImageView reference
     */
    @FXML
    private ImageView studentHallRed1;
    @FXML
    private ImageView studentHallRed2;
    @FXML
    private ImageView studentHallRed3;
    @FXML
    private ImageView studentHallRed4;
    @FXML
    private ImageView studentHallRed5;
    @FXML
    private ImageView studentHallRed6;
    @FXML
    private ImageView studentHallRed7;
    @FXML
    private ImageView studentHallRed8;
    @FXML
    private ImageView studentHallRed9;
    @FXML
    private ImageView studentHallRed10;

    /**
     * student hall blue ImageView reference
     */
    @FXML
    private ImageView studentHallBlue1;
    @FXML
    private ImageView studentHallBlue2;
    @FXML
    private ImageView studentHallBlue3;
    @FXML
    private ImageView studentHallBlue4;
    @FXML
    private ImageView studentHallBlue5;
    @FXML
    private ImageView studentHallBlue6;
    @FXML
    private ImageView studentHallBlue7;
    @FXML
    private ImageView studentHallBlue8;
    @FXML
    private ImageView studentHallBlue9;
    @FXML
    private ImageView studentHallBlue10;

    /**
     * student hall yellow ImageView reference
     */
    @FXML
    private ImageView studentHallYellow1;
    @FXML
    private ImageView studentHallYellow2;
    @FXML
    private ImageView studentHallYellow3;
    @FXML
    private ImageView studentHallYellow4;
    @FXML
    private ImageView studentHallYellow5;
    @FXML
    private ImageView studentHallYellow6;
    @FXML
    private ImageView studentHallYellow7;
    @FXML
    private ImageView studentHallYellow8;
    @FXML
    private ImageView studentHallYellow9;
    @FXML
    private ImageView studentHallYellow10;

    /**
     * student hall pink ImageView reference
     */
    @FXML
    private ImageView studentHallPink1;
    @FXML
    private ImageView studentHallPink2;
    @FXML
    private ImageView studentHallPink3;
    @FXML
    private ImageView studentHallPink4;
    @FXML
    private ImageView studentHallPink5;
    @FXML
    private ImageView studentHallPink6;
    @FXML
    private ImageView studentHallPink7;
    @FXML
    private ImageView studentHallPink8;
    @FXML
    private ImageView studentHallPink9;
    @FXML
    private ImageView studentHallPink10;

    /**
     * Tower on island 1 ImageView reference
     */
    @FXML
    private ImageView tower1Island1;
    @FXML
    private ImageView tower2Island1;
    @FXML
    private ImageView tower3Island1;
    @FXML
    private ImageView tower4Island1;
    @FXML
    private ImageView tower5Island1;
    @FXML
    private ImageView tower6Island1;
    @FXML
    private ImageView tower7Island1;

    /**
     * Tower on island 2 ImageView reference
     */
    @FXML
    private ImageView tower1Island2;
    @FXML
    private ImageView tower2Island2;
    @FXML
    private ImageView tower3Island2;
    @FXML
    private ImageView tower4Island2;
    @FXML
    private ImageView tower5Island2;
    @FXML
    private ImageView tower6Island2;
    @FXML
    private ImageView tower7Island2;

    /**
     * Tower on island 3 ImageView reference
     */
    @FXML
    private ImageView tower1Island3;
    @FXML
    private ImageView tower2Island3;
    @FXML
    private ImageView tower3Island3;
    @FXML
    private ImageView tower4Island3;
    @FXML
    private ImageView tower5Island3;
    @FXML
    private ImageView tower6Island3;
    @FXML
    private ImageView tower7Island3;

    /**
     * Tower on island 4 ImageView reference
     */
    @FXML
    private ImageView tower1Island4;
    @FXML
    private ImageView tower2Island4;
    @FXML
    private ImageView tower3Island4;
    @FXML
    private ImageView tower4Island4;
    @FXML
    private ImageView tower5Island4;
    @FXML
    private ImageView tower6Island4;
    @FXML
    private ImageView tower7Island4;

    /**
     * Tower on island 5 ImageView reference
     */
    @FXML
    private ImageView tower1Island5;
    @FXML
    private ImageView tower2Island5;
    @FXML
    private ImageView tower3Island5;
    @FXML
    private ImageView tower4Island5;
    @FXML
    private ImageView tower5Island5;
    @FXML
    private ImageView tower6Island5;
    @FXML
    private ImageView tower7Island5;

    /**
     * Tower on island 6 ImageView reference
     */
    @FXML
    private ImageView tower1Island6;
    @FXML
    private ImageView tower2Island6;
    @FXML
    private ImageView tower3Island6;
    @FXML
    private ImageView tower4Island6;
    @FXML
    private ImageView tower5Island6;
    @FXML
    private ImageView tower6Island6;
    @FXML
    private ImageView tower7Island6;

    /**
     * Tower on island 7 ImageView reference
     */
    @FXML
    private ImageView tower1Island7;
    @FXML
    private ImageView tower2Island7;
    @FXML
    private ImageView tower3Island7;
    @FXML
    private ImageView tower4Island7;
    @FXML
    private ImageView tower5Island7;
    @FXML
    private ImageView tower6Island7;
    @FXML
    private ImageView tower7Island7;

    /**
     * Tower on island 8 ImageView reference
     */
    @FXML
    private ImageView tower1Island8;
    @FXML
    private ImageView tower2Island8;
    @FXML
    private ImageView tower3Island8;
    @FXML
    private ImageView tower4Island8;
    @FXML
    private ImageView tower5Island8;
    @FXML
    private ImageView tower6Island8;
    @FXML
    private ImageView tower7Island8;

    /**
     * Tower on island 9 ImageView reference
     */
    @FXML
    private ImageView tower1Island9;
    @FXML
    private ImageView tower2Island9;
    @FXML
    private ImageView tower3Island9;
    @FXML
    private ImageView tower4Island9;
    @FXML
    private ImageView tower5Island9;
    @FXML
    private ImageView tower6Island9;
    @FXML
    private ImageView tower7Island9;

    /**
     * Tower on island 10 ImageView reference
     */
    @FXML
    private ImageView tower1Island10;
    @FXML
    private ImageView tower2Island10;
    @FXML
    private ImageView tower3Island10;
    @FXML
    private ImageView tower4Island10;
    @FXML
    private ImageView tower5Island10;
    @FXML
    private ImageView tower6Island10;
    @FXML
    private ImageView tower7Island10;

    /**
     * Tower on island 11 ImageView reference
     */
    @FXML
    private ImageView tower1Island11;
    @FXML
    private ImageView tower2Island11;
    @FXML
    private ImageView tower3Island11;
    @FXML
    private ImageView tower4Island11;
    @FXML
    private ImageView tower5Island11;
    @FXML
    private ImageView tower6Island11;
    @FXML
    private ImageView tower7Island11;

    /**
     *  Tower on island 12 ImageView reference
     */
    @FXML
    private ImageView tower1Island12;
    @FXML
    private ImageView tower2Island12;
    @FXML
    private ImageView tower3Island12;
    @FXML
    private ImageView tower4Island12;
    @FXML
    private ImageView tower5Island12;
    @FXML
    private ImageView tower6Island12;
    @FXML
    private ImageView tower7Island12;

    /**
     * Clouds ImageView references
     */
    @FXML
    private ImageView cloud1;
    @FXML
    private ImageView cloud2;
    @FXML
    private ImageView cloud3;

    /**
     * Student on cloud1 ImageView reference
     */
    @FXML
    private ImageView student1Cloud1;
    @FXML
    private ImageView student2Cloud1;
    @FXML
    private ImageView student3Cloud1;
    @FXML
    private ImageView student4Cloud1;

    /**
     * Student on cloud2 ImageView reference
     */
    @FXML
    private ImageView student1Cloud2;
    @FXML
    private ImageView student2Cloud2;
    @FXML
    private ImageView student3Cloud2;
    @FXML
    private ImageView student4Cloud2;

    /**
     * Student on cloud3 ImageView reference
     */
    @FXML
    private ImageView student1Cloud3;
    @FXML
    private ImageView student2Cloud3;
    @FXML
    private ImageView student3Cloud3;
    @FXML
    private ImageView student4Cloud3;

    /**
     * expert card Button reference
     */
    @FXML
    private Button expertCardButton;

    /**
     * communication Text reference
     */
    @FXML
    private Text communication;
    @FXML
    private Text communicationPlayerPhase;
    @FXML
    private Text coinsText;

    /**
     * finish expert move Button reference
     */
    @FXML
    private Button finishExpertMove;

    /**
     * mother nature ImageView reference
     */
    @FXML
    private ImageView motherNature1;
    @FXML
    private ImageView motherNature2;
    @FXML
    private ImageView motherNature3;
    @FXML
    private ImageView motherNature4;
    @FXML
    private ImageView motherNature5;
    @FXML
    private ImageView motherNature6;
    @FXML
    private ImageView motherNature7;
    @FXML
    private ImageView motherNature8;
    @FXML
    private ImageView motherNature9;
    @FXML
    private ImageView motherNature10;
    @FXML
    private ImageView motherNature11;
    @FXML
    private ImageView motherNature12;

    /**
     * lines image view reference
     */
    @FXML
    private ImageView greenLine;
    @FXML
    private ImageView blueLine;
    @FXML
    private ImageView redLine;
    @FXML
    private ImageView pinkLine;
    @FXML
    private ImageView yellowLine;

    /**
     * assitant card played image view reference
     */
    @FXML
    private ImageView playedAssistantCard;

    /**
     * Shadows
     */
    private ImageView lastLight = null;

    /**
     * Reference to the student swapped
     */
    private Student studentIngressHallSwap;

    /**
     * contains the island numbers of the disabled islands
     */
    private LinkedList<Integer> isDisabled = new LinkedList<>();

    /**
     * contains the colors of the hall lines that are full
     */
    private LinkedList<Color> isFull = new LinkedList<>();

    /**
     * Contains the position of the island on which mother nature is located at the moment
     * If mother nature is on an island group, it contains the id of the first island of the group
     */
    private Integer idIsland;

    /**
     * Reference to the color of the student moved
     */
    private Color studentMoving;

    /**
     * Keep the reference to the Game
     */
    private Game game;

    /**
     * Reference to StudentOnHall message
     */
    private MessageMethod studentOnHall = new MovingStudentsFromIngressToHall();

    /**
     * Stores the ImageView the professor of each color
     */
    private Map<Color, ImageView> professors = new HashMap<>();

    /**
     * Stores the list of ImageView for the towers (reused for school and islands)
     */
    private LinkedList<ImageView> towers = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the islands
     */
    private LinkedList<ImageView> islands = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the denyTokens
     */
    private LinkedList<ImageView> denyTokens = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the students on islands (reused for every island)
     */
    private LinkedList<ImageView> studentsIsland = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the students on the ingress
     */
    private LinkedList<ImageView> studentsIngress = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the green students on the hall
     */
    private LinkedList<ImageView> studentsHallGreen = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the red students on the hall
     */
    private LinkedList<ImageView> studentsHallRed = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the blue students on the hall
     */
    private LinkedList<ImageView> studentsHallBlue = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the yellow students on the hall
     */
    private LinkedList<ImageView> studentsHallYellow = new LinkedList<ImageView>();

    /**
     * Stores the list of ImageView for the pink students on the hall
     */
    private LinkedList<ImageView> studentsHallPink = new LinkedList<ImageView>();

    /**
     * Stores the list of students in the hall for every color
     */
    private Map<Color, LinkedList<ImageView>> hallLists = new HashMap<>();

    /**
     * Reference of the stage
     */
    private Stage stage;

    /**
     * Reference of the scene
     */
    private Scene scene;

    /**
     * Reference of the StudentOnIsland message
     */
    private MessageMethod studentOnIsland = new MovingStudentFromIngressToIsland();

    /**
     * go to pianificationPhase scene
     * @throws IOException
     */
    public void changeScene() throws IOException {
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/pianificationPhase-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiPianificationPhaseController pianificationController = fxmlLoader.getController();
        pianificationController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * @param color of student whose image is returned
     * @return a new Image object of student
     */
    public Image getImageStudent(Color color) {
        switch (color) {
            case RED -> {
                return new Image(getClass().getResourceAsStream(redStudentPath));
            }
            case GREEN -> {
               return new Image(getClass().getResourceAsStream(greenStudentPath));
            }
            case BLUE -> {
               return new Image(getClass().getResourceAsStream(blueStudentPath));
            }
            case PINK -> {
               return new Image(getClass().getResourceAsStream(pinkStudentPath));
            }
            case YELLOW -> {
               return new Image(getClass().getResourceAsStream(yellowStudentPath));
            }
        }
        return null;
    }

    /**
     * @param color of professor whose image is returned
     * @return a new Image object of professor
     */
    public Image getImageProfessor(Color color) {
        switch (color) {
            case RED -> {
                return new Image(getClass().getResourceAsStream(redProfessorPath));
            }
            case GREEN -> {
                return new Image(getClass().getResourceAsStream(greenProfessorPath));
            }
            case BLUE -> {
                return new Image(getClass().getResourceAsStream(blueProfessorPath));
            }
            case PINK -> {
                return new Image(getClass().getResourceAsStream(pinkProfessorPath));
            }
            case YELLOW -> {
                return new Image(getClass().getResourceAsStream(yellowProfessorPath));
            }
        }
        return null;
    }

    /**
     * Initialize the scene
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        game = GUIController.getInstance().getClient().getGame();
        GUIController.getInstance().setCardPlayed(false);

        if (game.getGameMode()==false || game.getCardManager().getCurrentCard()!=null && GUIController.getInstance().getFinishTurn()) {
            expertCardButton.setVisible(false);
        }

        if (game.getCurrentRound().getId()==null) {
          finishExpertMove.setVisible(false);
          finishExpertMove.setDisable(false);
        }

        // show elements on the screen
        showMotherNature();;
        showStudentsHall();
        showStudentsIngress();
        showClouds();
        showText();
        showTextPhase();
        showProfessors();
        showTowerTable();
        if(game.getGameMode()){showCoins();}

        // show of islands and relative students and towers
        LinkedList<IslandInterface> islandList = game.getIslandManager().getIslands();
        int islandIndex = 0;
        int size = islandList.size();
        int islandNum = 1;
        while(islandNum<13) { // for every ImageView of island
            if ((Integer.parseInt(islandList.get(islandIndex).getId())-25)==islandNum) { // if there is an island or island group that has to be shown
                // show towers and students on the island with that index on the ImageView of the relative island
                showAllIsland(islandNum,islandIndex,0,0);
                if (islandIndex<size-1) {
                    islandIndex++;
                }
            } else {
                // do not show island with that index and make it not clickable
                disableIsland(islandNum);
            }
            islandNum++;
        }

        //show played assistant card
        int num = Integer.parseInt(game.getCurrentPlayer().getCardPlayed().getId())-15;
        showAssistantCard(num);

    }

    /**
     * shows the deny tokens on island 1 on the screen
     */
    private void showDenyIsland1(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island1);
        denyTokens.add(deny2Island1);
        denyTokens.add(deny3Island1);
        denyTokens.add(deny4Island1);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 2 on the screen
     */
    private void showDenyIsland2(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island2);
        denyTokens.add(deny2Island2);
        denyTokens.add(deny3Island2);
        denyTokens.add(deny4Island2);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 3 on the screen
     */
    private void showDenyIsland3(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island3);
        denyTokens.add(deny2Island3);
        denyTokens.add(deny3Island3);
        denyTokens.add(deny4Island3);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 4 on the screen
     */
    private void showDenyIsland4(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island4);
        denyTokens.add(deny2Island4);
        denyTokens.add(deny3Island4);
        denyTokens.add(deny4Island4);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(denyPath));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 5 on the screen
     */
    private void showDenyIsland5(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island5);
        denyTokens.add(deny2Island5);
        denyTokens.add(deny3Island5);
        denyTokens.add(deny4Island5);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 6 on the screen
     */
    private void showDenyIsland6(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island6);
        denyTokens.add(deny2Island6);
        denyTokens.add(deny3Island6);
        denyTokens.add(deny4Island6);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 7 on the screen
     */
    private void showDenyIsland7(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island7);
        denyTokens.add(deny2Island7);
        denyTokens.add(deny3Island7);
        denyTokens.add(deny4Island7);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 8 on the screen
     */
    private void showDenyIsland8(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island8);
        denyTokens.add(deny2Island8);
        denyTokens.add(deny3Island8);
        denyTokens.add(deny4Island8);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 9 on the screen
     */
    private void showDenyIsland9(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island9);
        denyTokens.add(deny2Island9);
        denyTokens.add(deny3Island9);
        denyTokens.add(deny4Island9);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 10 on the screen
     */
    private void showDenyIsland10(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island10);
        denyTokens.add(deny2Island10);
        denyTokens.add(deny3Island10);
        denyTokens.add(deny4Island10);

        for(int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 11 on the screen
     */
    private void showDenyIsland11(int islandIndex, double x, double y){

        denyTokens.clear();
        denyTokens.add(deny1Island11);
        denyTokens.add(deny2Island11);
        denyTokens.add(deny3Island11);
        denyTokens.add(deny4Island11);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * shows the deny tokens on island 12 on the screen
     */
    private void showDenyIsland12(int islandIndex, double x, double y){
        denyTokens.clear();
        denyTokens.add(deny1Island12);
        denyTokens.add(deny2Island12);
        denyTokens.add(deny3Island12);
        denyTokens.add(deny4Island12);

        for (int denyNum = 0; denyNum < game.getIslandManager().getIslands().get(islandIndex).getDeny(); denyNum++) {
            denyTokens.get(denyNum).setImage(new Image(getClass().getResourceAsStream(denyPath)));
            denyTokens.get(denyNum).setX(denyTokens.get(denyNum).getX() + x);
            denyTokens.get(denyNum).setY(denyTokens.get(denyNum).getY() + y);
        }
    }

    /**
     * makes an island not visible and not clickable
     * @param islandNum is the number of the island to disable
     */
    private void disableIsland (int islandNum) {
        switch (islandNum) {
            case 1 -> {
                island1.setImage(null);
                isDisabled.add(1);
            }
            case 2 -> {
                island2.setImage(null);
                isDisabled.add(2);
            }
            case 3 -> {
                island3.setImage(null);
                isDisabled.add(3);
            }
            case 4 -> {
                island4.setImage(null);
                isDisabled.add(4);
            }
            case 5 -> {
                island5.setImage(null);
                isDisabled.add(5);
            }
            case 6 -> {
                island6.setImage(null);
                isDisabled.add(6);
            }
            case 7 -> {
                island7.setImage(null);
                isDisabled.add(7);
            }
            case 8 -> {
                island8.setImage(null);
                isDisabled.add(8);
            }
            case 9 -> {
                island9.setImage(null);
                isDisabled.add(9);
            }
            case 10 -> {
                island10.setImage(null);
                isDisabled.add(10);
            }
            case 11 -> {
                island11.setImage(null);
                isDisabled.add(11);
            }
            case 12 -> {
                island12.setImage(null);
                isDisabled.add(12);
            }
        }
    }

    /**
     * shows students and tower on a specific island on the screen
     * @param islandNum is the island number relative to the fxml page
     * @param islandIndex is the index of the island in the IslandManager list
     * @param x is the horizontal shift applied on towers and students
     * @param y is the vertical shift applied on towers and students
     */
    private void showAllIsland(int islandNum, int islandIndex, double x, double y) {
        switch (islandNum) {
            case 1 -> {
                showStudentIsland1(islandIndex,x,y);
                showTowersIsland1(islandIndex,x,y);
                showDenyIsland1(islandIndex,x,y);
            }
            case 2 -> {
                showStudentIsland2(islandIndex,x,y);
                showTowersIsland2(islandIndex,x,y);
                showDenyIsland2(islandIndex,x,y);
            }
            case 3 -> {
                showStudentIsland3(islandIndex,x,y);
                showTowersIsland3(islandIndex,x,y);
                showDenyIsland3(islandIndex,x,y);
            }
            case 4 -> {
                showStudentIsland4(islandIndex,x,y);
                showTowersIsland4(islandIndex,x,y);
                showDenyIsland4(islandIndex,x,y);
            }
            case 5 -> {
                showStudentIsland5(islandIndex,x,y);
                showTowersIsland5(islandIndex,x,y);
                showDenyIsland5(islandIndex,x,y);
            }
            case 6 -> {
                showStudentIsland6(islandIndex,x,y);
                showTowersIsland6(islandIndex,x,y);
                showDenyIsland6(islandIndex,x,y);
            }
            case 7 -> {
                showStudentIsland7(islandIndex,x,y);
                showTowersIsland7(islandIndex,x,y);
                showDenyIsland7(islandIndex,x,y);
            }
            case 8 -> {
                showStudentIsland8(islandIndex,x,y);
                showTowersIsland8(islandIndex,x,y);
                showDenyIsland8(islandIndex,x,y);
            }
            case 9 -> {
                showStudentIsland9(islandIndex,x,y);
                showTowersIsland9(islandIndex,x,y);
                showDenyIsland9(islandIndex,x,y);
            }
            case 10 -> {
                showStudentIsland10(islandIndex,x,y);
                showTowersIsland10(islandIndex,x,y);
                showDenyIsland10(islandIndex,x,y);
            }
            case 11 -> {
                showStudentIsland11(islandIndex,x,y);
                showTowersIsland11(islandIndex,x,y);
                showDenyIsland11(islandIndex,x,y);
            }
            case 12 -> {
                showStudentIsland12(islandIndex,x,y);
                showTowersIsland12(islandIndex,x,y);
                showDenyIsland12(islandIndex,x,y);
            }
        }
    }

    /**
     * shows the assistant card played in the previous pianification phase
     * @param num
     */
    private void showAssistantCard(int num) {
        switch (num) {
            case 1 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card1Path)));
            }
            case 2 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card2Path)));
            }
            case 3 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card3Path)));
            }
            case 4 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card4Path)));
            }
            case 5 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card5Path)));
            }
            case 6 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card6Path)));
            }
            case 7 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card7Path)));
            }
            case 8 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card8Path)));
            }
            case 9 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card9Path)));
            }
            case 10 -> {
                playedAssistantCard.setImage(new Image(getClass().getResourceAsStream(card10Path)));
            }
        }
    }

    /**
     * shows the towers on island 1 on the screen
     */
    private void showTowersIsland1(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island1);
        towers.add(tower2Island1);
        towers.add(tower3Island1);
        towers.add(tower4Island1);
        towers.add(tower5Island1);
        towers.add(tower6Island1);
        towers.add(tower7Island1);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 2 on the screen
     */
    private void showTowersIsland2(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island2);
        towers.add(tower2Island2);
        towers.add(tower3Island2);
        towers.add(tower4Island2);
        towers.add(tower5Island2);
        towers.add(tower6Island2);
        towers.add(tower7Island2);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 3 on the screen
     */
    private void showTowersIsland3(int index, double x, double y){

        towers.clear();
        towers.add(tower1Island3);
        towers.add(tower2Island3);
        towers.add(tower3Island3);
        towers.add(tower4Island3);
        towers.add(tower5Island3);
        towers.add(tower6Island3);
        towers.add(tower7Island3);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch(tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 4 on the screen
     */
    private void showTowersIsland4(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island4);
        towers.add(tower2Island4);
        towers.add(tower3Island4);
        towers.add(tower4Island4);
        towers.add(tower5Island4);
        towers.add(tower6Island4);
        towers.add(tower7Island4);

        int count = 0;

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 5 on the screen
     */
    private void showTowersIsland5(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island5);
        towers.add(tower2Island5);
        towers.add(tower3Island5);
        towers.add(tower4Island5);
        towers.add(tower5Island5);
        towers.add(tower6Island5);
        towers.add(tower7Island5);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 6 on the screen
     */
    private void showTowersIsland6(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island6);
        towers.add(tower2Island6);
        towers.add(tower3Island6);
        towers.add(tower4Island6);
        towers.add(tower5Island6);
        towers.add(tower6Island6);
        towers.add(tower7Island6);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 7 on the screen
     */
    private void showTowersIsland7(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island7);
        towers.add(tower2Island7);
        towers.add(tower3Island7);
        towers.add(tower4Island7);
        towers.add(tower5Island7);
        towers.add(tower6Island7);
        towers.add(tower7Island7);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 8 on the screen
     */
    private void showTowersIsland8(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island8);
        towers.add(tower2Island8);
        towers.add(tower3Island8);
        towers.add(tower4Island8);
        towers.add(tower5Island8);
        towers.add(tower6Island8);
        towers.add(tower7Island8);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 9 on the screen
     */
    private void showTowersIsland9(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island9);
        towers.add(tower2Island9);
        towers.add(tower3Island9);
        towers.add(tower4Island9);
        towers.add(tower5Island9);
        towers.add(tower6Island9);
        towers.add(tower7Island9);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for(Tower tower : game.getIslandManager().getIslands().get(index).getTowers()){
            switch(tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 10 on the screen
     */
    private void showTowersIsland10(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island10);
        towers.add(tower2Island10);
        towers.add(tower3Island10);
        towers.add(tower4Island10);
        towers.add(tower5Island10);
        towers.add(tower6Island10);
        towers.add(tower7Island10);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 11 on the screen
     */
    private void showTowersIsland11(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island11);
        towers.add(tower2Island11);
        towers.add(tower3Island11);
        towers.add(tower4Island11);
        towers.add(tower5Island11);
        towers.add(tower6Island11);
        towers.add(tower7Island11);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the towers on island 12 on the screen
     */
    private void showTowersIsland12(int index, double x, double y) {

        towers.clear();
        towers.add(tower1Island12);
        towers.add(tower2Island12);
        towers.add(tower3Island12);
        towers.add(tower4Island12);
        towers.add(tower5Island12);
        towers.add(tower6Island12);
        towers.add(tower7Island12);

        if (game.getIslandManager().getIslands().get(index).getTowers()==null) {
            return;
        }

        int count = 0;
        for (Tower tower : game.getIslandManager().getIslands().get(index).getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            towers.get(count).setX(towers.get(count).getX() + x);
            towers.get(count).setY(towers.get(count).getY() + y);
            count++;
        }
    }

    /**
     * shows the students on island 1 on the screen
     */
    private void showStudentIsland1(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island1);
        studentsIsland.add(student2Island1);
        studentsIsland.add(student3Island1);
        studentsIsland.add(student4Island1);
        studentsIsland.add(student5Island1);
        studentsIsland.add(student6Island1);
        studentsIsland.add(student7Island1);
        studentsIsland.add(student8Island1);
        studentsIsland.add(student9Island1);
        studentsIsland.add(student10Island1);
        studentsIsland.add(student11Island1);
        studentsIsland.add(student12Island1);
        studentsIsland.add(student13Island1);
        studentsIsland.add(student14Island1);
        studentsIsland.add(student15Island1);
        studentsIsland.add(student16Island1);
        studentsIsland.add(student17Island1);
        studentsIsland.add(student18Island1);
        studentsIsland.add(student19Island1);
        studentsIsland.add(student20Island1);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 2 on the screen
     */
    private void showStudentIsland2(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island2);
        studentsIsland.add(student2Island2);
        studentsIsland.add(student3Island2);
        studentsIsland.add(student4Island2);
        studentsIsland.add(student5Island2);
        studentsIsland.add(student6Island2);
        studentsIsland.add(student7Island2);
        studentsIsland.add(student8Island2);
        studentsIsland.add(student9Island2);
        studentsIsland.add(student10Island2);
        studentsIsland.add(student11Island2);
        studentsIsland.add(student12Island2);
        studentsIsland.add(student13Island2);
        studentsIsland.add(student14Island2);
        studentsIsland.add(student15Island2);
        studentsIsland.add(student16Island2);
        studentsIsland.add(student17Island2);
        studentsIsland.add(student18Island2);
        studentsIsland.add(student19Island2);
        studentsIsland.add(student20Island2);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 3 on the screen
     */
    private void showStudentIsland3(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island3);
        studentsIsland.add(student2Island3);
        studentsIsland.add(student3Island3);
        studentsIsland.add(student4Island3);
        studentsIsland.add(student5Island3);
        studentsIsland.add(student6Island3);
        studentsIsland.add(student7Island3);
        studentsIsland.add(student8Island3);
        studentsIsland.add(student9Island3);
        studentsIsland.add(student10Island3);
        studentsIsland.add(student11Island3);
        studentsIsland.add(student12Island3);
        studentsIsland.add(student13Island3);
        studentsIsland.add(student14Island3);
        studentsIsland.add(student15Island3);
        studentsIsland.add(student16Island3);
        studentsIsland.add(student17Island3);
        studentsIsland.add(student18Island3);
        studentsIsland.add(student19Island3);
        studentsIsland.add(student20Island3);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 4 on the screen
     */
    private void showStudentIsland4(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island4);
        studentsIsland.add(student2Island4);
        studentsIsland.add(student3Island4);
        studentsIsland.add(student4Island4);
        studentsIsland.add(student5Island4);
        studentsIsland.add(student6Island4);
        studentsIsland.add(student7Island4);
        studentsIsland.add(student8Island4);
        studentsIsland.add(student9Island4);
        studentsIsland.add(student10Island4);
        studentsIsland.add(student11Island4);
        studentsIsland.add(student12Island4);
        studentsIsland.add(student13Island4);
        studentsIsland.add(student14Island4);
        studentsIsland.add(student15Island4);
        studentsIsland.add(student16Island4);
        studentsIsland.add(student17Island4);
        studentsIsland.add(student18Island4);
        studentsIsland.add(student19Island4);
        studentsIsland.add(student20Island4);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 5 on the screen
     */
    private void showStudentIsland5(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island5);
        studentsIsland.add(student2Island5);
        studentsIsland.add(student3Island5);
        studentsIsland.add(student4Island5);
        studentsIsland.add(student5Island5);
        studentsIsland.add(student6Island5);
        studentsIsland.add(student7Island5);
        studentsIsland.add(student8Island5);
        studentsIsland.add(student9Island5);
        studentsIsland.add(student10Island5);
        studentsIsland.add(student11Island5);
        studentsIsland.add(student12Island5);
        studentsIsland.add(student13Island5);
        studentsIsland.add(student14Island5);
        studentsIsland.add(student15Island5);
        studentsIsland.add(student16Island5);
        studentsIsland.add(student17Island5);
        studentsIsland.add(student18Island5);
        studentsIsland.add(student19Island5);
        studentsIsland.add(student20Island5);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 6 on the screen
     */
    private void showStudentIsland6(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island6);
        studentsIsland.add(student2Island6);
        studentsIsland.add(student3Island6);
        studentsIsland.add(student4Island6);
        studentsIsland.add(student5Island6);
        studentsIsland.add(student6Island6);
        studentsIsland.add(student7Island6);
        studentsIsland.add(student8Island6);
        studentsIsland.add(student9Island6);
        studentsIsland.add(student10Island6);
        studentsIsland.add(student11Island6);
        studentsIsland.add(student12Island6);
        studentsIsland.add(student13Island6);
        studentsIsland.add(student14Island6);
        studentsIsland.add(student15Island6);
        studentsIsland.add(student16Island6);
        studentsIsland.add(student17Island6);
        studentsIsland.add(student18Island6);
        studentsIsland.add(student19Island6);
        studentsIsland.add(student20Island6);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 7 on the screen
     */
    private void showStudentIsland7(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island7);
        studentsIsland.add(student2Island7);
        studentsIsland.add(student3Island7);
        studentsIsland.add(student4Island7);
        studentsIsland.add(student5Island7);
        studentsIsland.add(student6Island7);
        studentsIsland.add(student7Island7);
        studentsIsland.add(student8Island7);
        studentsIsland.add(student9Island7);
        studentsIsland.add(student10Island7);
        studentsIsland.add(student11Island7);
        studentsIsland.add(student12Island7);
        studentsIsland.add(student13Island7);
        studentsIsland.add(student14Island7);
        studentsIsland.add(student15Island7);
        studentsIsland.add(student16Island7);
        studentsIsland.add(student17Island7);
        studentsIsland.add(student18Island7);
        studentsIsland.add(student19Island7);
        studentsIsland.add(student20Island7);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 8 on the screen
     */
    private void showStudentIsland8(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island8);
        studentsIsland.add(student2Island8);
        studentsIsland.add(student3Island8);
        studentsIsland.add(student4Island8);
        studentsIsland.add(student5Island8);
        studentsIsland.add(student6Island8);
        studentsIsland.add(student7Island8);
        studentsIsland.add(student8Island8);
        studentsIsland.add(student9Island8);
        studentsIsland.add(student10Island8);
        studentsIsland.add(student11Island8);
        studentsIsland.add(student12Island8);
        studentsIsland.add(student13Island8);
        studentsIsland.add(student14Island8);
        studentsIsland.add(student15Island8);
        studentsIsland.add(student16Island8);
        studentsIsland.add(student17Island8);
        studentsIsland.add(student18Island8);
        studentsIsland.add(student19Island8);
        studentsIsland.add(student20Island8);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 9 on the screen
     */
    private void showStudentIsland9(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island9);
        studentsIsland.add(student2Island9);
        studentsIsland.add(student3Island9);
        studentsIsland.add(student4Island9);
        studentsIsland.add(student5Island9);
        studentsIsland.add(student6Island9);
        studentsIsland.add(student7Island9);
        studentsIsland.add(student8Island9);
        studentsIsland.add(student9Island9);
        studentsIsland.add(student10Island9);
        studentsIsland.add(student11Island9);
        studentsIsland.add(student12Island9);
        studentsIsland.add(student13Island9);
        studentsIsland.add(student14Island9);
        studentsIsland.add(student15Island9);
        studentsIsland.add(student16Island9);
        studentsIsland.add(student17Island9);
        studentsIsland.add(student18Island9);
        studentsIsland.add(student19Island9);
        studentsIsland.add(student20Island9);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 10 on the screen
     */
    private void showStudentIsland10(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island10);
        studentsIsland.add(student2Island10);
        studentsIsland.add(student3Island10);
        studentsIsland.add(student4Island10);
        studentsIsland.add(student5Island10);
        studentsIsland.add(student6Island10);
        studentsIsland.add(student7Island10);
        studentsIsland.add(student8Island10);
        studentsIsland.add(student9Island10);
        studentsIsland.add(student10Island10);
        studentsIsland.add(student11Island10);
        studentsIsland.add(student12Island10);
        studentsIsland.add(student13Island10);
        studentsIsland.add(student14Island10);
        studentsIsland.add(student15Island10);
        studentsIsland.add(student16Island10);
        studentsIsland.add(student17Island10);
        studentsIsland.add(student18Island10);
        studentsIsland.add(student19Island10);
        studentsIsland.add(student20Island10);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 11 on the screen
     */
    private void showStudentIsland11(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island11);
        studentsIsland.add(student2Island11);
        studentsIsland.add(student3Island11);
        studentsIsland.add(student4Island11);
        studentsIsland.add(student5Island11);
        studentsIsland.add(student6Island11);
        studentsIsland.add(student7Island11);
        studentsIsland.add(student8Island11);
        studentsIsland.add(student9Island11);
        studentsIsland.add(student10Island11);
        studentsIsland.add(student11Island11);
        studentsIsland.add(student12Island11);
        studentsIsland.add(student13Island11);
        studentsIsland.add(student14Island11);
        studentsIsland.add(student15Island11);
        studentsIsland.add(student16Island11);
        studentsIsland.add(student17Island11);
        studentsIsland.add(student18Island11);
        studentsIsland.add(student19Island11);
        studentsIsland.add(student20Island11);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the students on island 12 on the screen
     */
    private void showStudentIsland12(int index, double x, double y) {

        studentsIsland.clear();
        studentsIsland.add(student1Island12);
        studentsIsland.add(student2Island12);
        studentsIsland.add(student3Island12);
        studentsIsland.add(student4Island12);
        studentsIsland.add(student5Island12);
        studentsIsland.add(student6Island12);
        studentsIsland.add(student7Island12);
        studentsIsland.add(student8Island12);
        studentsIsland.add(student9Island12);
        studentsIsland.add(student10Island12);
        studentsIsland.add(student11Island12);
        studentsIsland.add(student12Island12);
        studentsIsland.add(student13Island12);
        studentsIsland.add(student14Island12);
        studentsIsland.add(student15Island12);
        studentsIsland.add(student16Island12);
        studentsIsland.add(student17Island12);
        studentsIsland.add(student18Island12);
        studentsIsland.add(student19Island12);
        studentsIsland.add(student20Island12);

        int count = 0;
        for (Student student : game.getIslandManager().getIslands().get(index).getStudents()) {
            studentsIsland.get(count).setImage(getImageStudent(student.getColor()));
            studentsIsland.get(count).setX(studentsIsland.get(count).getX() + x);
            studentsIsland.get(count).setY(studentsIsland.get(count).getY() + y);
            if(studentsIsland.size()==count+1){return;}
            count++;
        }
    }

    /**
     * shows the towers in the school on the screen
     */
    public void showTowerTable(){

        towers.clear();
        towers.add(tower1);
        towers.add(tower2);
        towers.add(tower3);
        towers.add(tower4);
        towers.add(tower5);
        towers.add(tower6);
        towers.add(tower7);
        towers.add(tower8);

        int count = 0;
        for (Tower tower : game.getCurrentPlayer().getSchool().getTowerTable().getTowers()) {
            switch (tower.getColor()) {
                case WHITE -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(whiteTowerPath)));
                    break;
                }
                case BLACK -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(blackTowerPath)));
                    break;
                }
                case GREY -> {
                    towers.get(count).setImage(new Image(getClass().getResourceAsStream(greyTowerPath)));
                    break;
                }
            }
            count++;
        }
    }

    /**
     * shows the professors on the screen
     */
    public void showProfessors() {

        professors.put(Color.GREEN,professorGreen);
        professors.put(Color.RED,professorRed);
        professors.put(Color.YELLOW,professorYellow);
        professors.put(Color.PINK,professorPink);
        professors.put(Color.BLUE,professorBlue);

        for (Color color : Color.values()) {
            if (game.getCurrentPlayer().getSchool().getHall().getLine(color).isProfessor()) {
                professors.get(color).setImage(getImageProfessor(color));
            }
        }
    }

    /**
     * show moves tips based on player phase
     */
    private void showTextPhase(){
        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getIdExpertCardPlayed()!=null) {
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case "39" -> {
                        communicationPlayerPhase.setText("Now you control the professor even if you have the same number of students of your opponents");
                    }
                    case "40" -> {
                        communicationPlayerPhase.setText("Choose an island on which calculate influence just like Mother Nature is on it");
                    }
                    case "41" -> {
                        communicationPlayerPhase.setText("You have up to 2 more jumps available for Mother Nature");
                    }
                    case "42" -> {
                        communicationPlayerPhase.setText("Choose an island on which put a deny that will stop a calculate of the influence on it");
                    }
                    case "43" -> {
                        communicationPlayerPhase.setText("Towers will not be considered in the influence calculation");
                    }
                    case "45" -> {
                        communicationPlayerPhase.setText("You have 2 additional point in the influence calculation");
                    }
                    case "46" -> {
                        communicationPlayerPhase.setText("Students of the chosen color will not be considered in the influence calculation");
                    }
                    case "49" -> {
                        communicationPlayerPhase.setText("At every player will be removed from their hall up to 3 students (if available) of the chosen color");
                    }
                }
            } else {
                switch (game.getCurrentPlayer().getPlayerPhase()) {
                    case MOVING_STUDENTS -> {
                        communicationPlayerPhase.setText("Move a student to your hall or to an island");
                    }
                    case MOVING_MOTHERNATURE -> {
                        communicationPlayerPhase.setText("Choose the island on which you want to move Mother Nature to");
                    }
                    case CHOOSING_CLOUD -> {
                        communicationPlayerPhase.setText("Choose the cloud with the students you want in your ingress");
                    }
                }
            }
        } else {
            switch (game.getCurrentRound().getId()) {
                case 0:
                    communicationPlayerPhase.setText("Choose up to 3 students (one by one) from your ingress to swap with the one selected from the expert card, or click on FINISH EXPERT MOVE to go back at the action phase");
                    break;
                case 1:
                    communicationPlayerPhase.setText("Choose up to 2 students (one by one) from your ingress to swap with the ones from your hall (even if it has a different color), or click on FINISH EXPERT MOVE to go back at the action phase");
                    break;
                case 2:
                    communicationPlayerPhase.setText("Add the chosen student from the expert card to your hall, or click on FINISH EXPERT MOVE to go back at the action phase");
                    break;
                case 3:
                    communicationPlayerPhase.setText("Add the chosen student from the expert card to an island, or click on FINISH EXPERT MOVE to go back at the action phase");
                    break;
            }
        }
    }

    /**
     * shows the communication text on the screen
     */
    private void showText(){
        if (game.getCurrentRound().getId()==null) {
            if (game.getCardManager().getCurrentCard()!=null) {
                communication.setText("ACTION ROUND WITH AN EXPERT CARD ACTIVE");
            } else {
                communication.setText("ACTION ROUND");
            }
        } else {
            switch (game.getCurrentRound().getId()) {
                case 0:
                    communication.setText("INGRESS/CARD SWAP ROUND");
                    break;
                case 1:
                    communication.setText("INGRESS/HALL SWAP ROUND");
                    break;
                case 2:
                    communication.setText("STUDENT TO HALL ROUND");
                    break;
                case 3:
                    communication.setText("STUDENT TO ISLAND ROUND");
                    break;
            }
        }
    }

    /**
     * shows the cloud on the screen
     */
    private void showClouds(){
        if (!game.getClouds().get(0).getStudents().isEmpty()) { // if the cloud contains students
            student1Cloud1.setImage(getImageStudent(game.getClouds().get(0).getStudents().get(0).getColor()));
            student2Cloud1.setImage(getImageStudent(game.getClouds().get(0).getStudents().get(1).getColor()));
            student3Cloud1.setImage(getImageStudent(game.getClouds().get(0).getStudents().get(2).getColor()));
            if (game.getIsThree()) {
                student4Cloud1.setImage(getImageStudent(game.getClouds().get(0).getStudents().get(3).getColor()));
            }
            if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD) {
                cloud1.setEffect(new DropShadow(30, javafx.scene.paint.Color.BLUE));
            }
        }else{ // else make the cloud not clickable
            cloud1.setMouseTransparent(true);
        }
        if (!game.getClouds().get(1).getStudents().isEmpty()) { // if the cloud contains students
            student1Cloud2.setImage(getImageStudent(game.getClouds().get(1).getStudents().get(0).getColor()));
            student2Cloud2.setImage(getImageStudent(game.getClouds().get(1).getStudents().get(1).getColor()));
            student3Cloud2.setImage(getImageStudent(game.getClouds().get(1).getStudents().get(2).getColor()));
            if (game.getIsThree()) {
                student4Cloud2.setImage(getImageStudent(game.getClouds().get(1).getStudents().get(3).getColor()));
            }
            if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD) {
                cloud2.setEffect(new DropShadow(30, javafx.scene.paint.Color.BLUE));
            }
        }else{ // else make the cloud not clickable
            cloud2.setMouseTransparent(true);
        }
        if (game.getIsThree()) { // if the mode is for 3 players
            if (!game.getClouds().get(2).getStudents().isEmpty()) { // if the cloud contains students
                student1Cloud3.setImage(getImageStudent(game.getClouds().get(2).getStudents().get(0).getColor()));
                student2Cloud3.setImage(getImageStudent(game.getClouds().get(2).getStudents().get(1).getColor()));
                student3Cloud3.setImage(getImageStudent(game.getClouds().get(2).getStudents().get(2).getColor()));
                student4Cloud3.setImage(getImageStudent(game.getClouds().get(2).getStudents().get(3).getColor()));
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD) {
                    cloud3.setEffect(new DropShadow(30, javafx.scene.paint.Color.BLUE));
                }
            }else{ // else make the cloud not clickable
                cloud3.setMouseTransparent(true);}
        } else { // else do not show the third cloud
            cloud3.setImage(null);
            cloud3.setMouseTransparent(true);
        }

    }

    /**
     * shows the number of coins on the screen
     */
    private void showCoins(){
        if (game.getCurrentPlayer().getCoins()!=null) {
            coinsText.setText("COINS: " + game.getCurrentPlayer().getCoins());
        }
    }

    /**
     * shows mother nature on the screen
     */
    private void showMotherNature() {
        MotherNature motherNature = game.getMotherNature();
        switch (motherNature.getIsland().getId()) {
            case "26":
                motherNature1.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 26;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature1);
                }
                break;
            case "27":
                motherNature2.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 27;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature2);
                }
                break;
            case "28":
                motherNature3.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 28;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature3);
                }
                break;
            case "29":
                motherNature4.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 29;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature4);
                }
                break;
            case "30":
                motherNature5.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 30;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature5);
                }
                break;
            case "31":
                motherNature6.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 31;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature6);
                }
                break;
            case "32":
                motherNature7.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 32;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature7);
                }
                break;
            case "33":
                motherNature8.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 33;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature8);
                }
                break;
            case "34":
                motherNature9.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 34;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature9);
                }
                break;
            case "35":
                motherNature10.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 35;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature10);
                }
                break;
            case "36":
                motherNature11.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 36;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature11);
                }
                break;
            case "37":
                motherNature12.setImage(new Image(getClass().getResourceAsStream(motherNaturePath)));
                idIsland = 37;
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE) {
                    setShadow(motherNature12);
                }
                break;
        }
    }

    /**
     * shows the students in the ingress
     */
    private void showStudentsIngress() {

        studentsIngress.add(studentIngress1);
        studentsIngress.add(studentIngress2);
        studentsIngress.add(studentIngress3);
        studentsIngress.add(studentIngress4);
        studentsIngress.add(studentIngress5);
        studentsIngress.add(studentIngress6);
        studentsIngress.add(studentIngress7);
        studentsIngress.add(studentIngress8);
        studentsIngress.add(studentIngress9);

        for (int i = 0; i < game.getCurrentPlayer().getSchool().getIngress().getStudents().size(); i++) {
            switch (game.getCurrentPlayer().getSchool().getIngress().getStudents().get(i).getColor()) {
                case RED -> {
                    studentsIngress.get(i).setImage(new Image(getClass().getResourceAsStream(redStudentPath)));
                }
                case GREEN -> {
                    studentsIngress.get(i).setImage(new Image(getClass().getResourceAsStream(greenStudentPath)));
                }
                case BLUE -> {
                    studentsIngress.get(i).setImage(new Image(getClass().getResourceAsStream(blueStudentPath)));
                }
                case PINK -> {
                    studentsIngress.get(i).setImage(new Image(getClass().getResourceAsStream(pinkStudentPath)));
                }
                case YELLOW -> {
                    studentsIngress.get(i).setImage(new Image(getClass().getResourceAsStream(yellowStudentPath)));
                }
            }
        }
    }

    /**
     * shows the students in the hall
     */
    private void showStudentsHall() {

        // populating the hallLists
        hallLists.put(Color.YELLOW, studentsHallYellow);
        hallLists.put(Color.BLUE, studentsHallBlue);
        hallLists.put(Color.GREEN, studentsHallGreen);
        hallLists.put(Color.RED, studentsHallRed);
        hallLists.put(Color.PINK, studentsHallPink);

        // populating the ImageView lists
        studentsHallBlue.add(studentHallBlue1);
        studentsHallBlue.add(studentHallBlue2);
        studentsHallBlue.add(studentHallBlue3);
        studentsHallBlue.add(studentHallBlue4);
        studentsHallBlue.add(studentHallBlue5);
        studentsHallBlue.add(studentHallBlue6);
        studentsHallBlue.add(studentHallBlue7);
        studentsHallBlue.add(studentHallBlue8);
        studentsHallBlue.add(studentHallBlue9);
        studentsHallBlue.add(studentHallBlue10);

        studentsHallGreen.add(studentHallGreen1);
        studentsHallGreen.add(studentHallGreen2);
        studentsHallGreen.add(studentHallGreen3);
        studentsHallGreen.add(studentHallGreen4);
        studentsHallGreen.add(studentHallGreen5);
        studentsHallGreen.add(studentHallGreen6);
        studentsHallGreen.add(studentHallGreen7);
        studentsHallGreen.add(studentHallGreen8);
        studentsHallGreen.add(studentHallGreen9);
        studentsHallGreen.add(studentHallGreen10);

        studentsHallRed.add(studentHallRed1);
        studentsHallRed.add(studentHallRed2);
        studentsHallRed.add(studentHallRed3);
        studentsHallRed.add(studentHallRed4);
        studentsHallRed.add(studentHallRed5);
        studentsHallRed.add(studentHallRed6);
        studentsHallRed.add(studentHallRed7);
        studentsHallRed.add(studentHallRed8);
        studentsHallRed.add(studentHallRed9);
        studentsHallRed.add(studentHallRed10);

        studentsHallYellow.add(studentHallYellow1);
        studentsHallYellow.add(studentHallYellow2);
        studentsHallYellow.add(studentHallYellow3);
        studentsHallYellow.add(studentHallYellow4);
        studentsHallYellow.add(studentHallYellow5);
        studentsHallYellow.add(studentHallYellow6);
        studentsHallYellow.add(studentHallYellow7);
        studentsHallYellow.add(studentHallYellow8);
        studentsHallYellow.add(studentHallYellow9);
        studentsHallYellow.add(studentHallYellow10);

        studentsHallPink.add(studentHallPink1);
        studentsHallPink.add(studentHallPink2);
        studentsHallPink.add(studentHallPink3);
        studentsHallPink.add(studentHallPink4);
        studentsHallPink.add(studentHallPink5);
        studentsHallPink.add(studentHallPink6);
        studentsHallPink.add(studentHallPink7);
        studentsHallPink.add(studentHallPink8);
        studentsHallPink.add(studentHallPink9);
        studentsHallPink.add(studentHallPink10);

        // show students in hall
        for (Color color : Color.values()) {
            for (int i = 0; i < game.getCurrentPlayer().getSchool().getHall().getLine(color).getStudents().size(); i++) {
                hallLists.get(color).get(i).setImage(getImageStudent(color));
                if (i==10) {
                    isFull.add(color);
                }
            }
        }
    }

    /**
     * @param idIslandMotherNature is the id of the island on which mother nature is located
     * @param idIslandTarget
     * @return the number of jumps that motherNature should do
     */
    public Integer calculateJumps(Integer idIslandTarget,Integer idIslandMotherNature ) {
        Integer jumps = 0;
        LinkedList<IslandInterface> islandList = game.getIslandManager().getIslands();
        int index = islandList.indexOf(game.getMotherNature().getIsland());
        int size = islandList.size();
        while (idIslandTarget!=idIslandMotherNature) {
            index++;
            if (index>size-1) {
                index=0;
            }
            idIslandMotherNature = Integer.parseInt(islandList.get(index).getId());
            jumps++;
        }
        return jumps;
    }

    /**
     * Click on island 1
     * @param mouseEvent
     */
    public void clickIsland1(MouseEvent mouseEvent) {

        if (isDisabled.contains(1)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("26");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("26");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(26,idIsland) && calculateJumps(26,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(26, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else  if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null){
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("26");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
           StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
           (messageMethod).setIsland("26");
           GUIController.getInstance().write(messageMethod);
           GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 2
     * @param mouseEvent
     */
    public void clickIsland2(MouseEvent mouseEvent) {

        if (isDisabled.contains(2)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("27");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("27");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(27,idIsland) && calculateJumps(27,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature)movingMotherNature).setJumps(calculateJumps(27, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("27");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
             StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
             (messageMethod).setIsland("27");
             GUIController.getInstance().write(messageMethod);
             GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 3
     * @param mouseEvent
     */
    public void clickIsland3(MouseEvent mouseEvent) {

        if(isDisabled.contains(3)){
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("28");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("28");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue() >= calculateJumps(28, idIsland) && calculateJumps(28,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(28, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("28");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("28");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 4
     * @param mouseEvent
     */
    public void clickIsland4(MouseEvent mouseEvent) {

        if (isDisabled.contains(4)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()){
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("29");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("29");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(29,idIsland) && calculateJumps(29,idIsland)!=0) {
               MessageMethod movingMotherNature = new MovingMotherNature();
               ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(29, idIsland));
               GUIController.getInstance().write(movingMotherNature);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("29");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("29");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 5
     * @param mouseEvent
     */
    public void clickIsland5(MouseEvent mouseEvent) {

        if (isDisabled.contains(5)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()){
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("30");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("30");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue() >= calculateJumps(30, idIsland) && calculateJumps(30,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(30, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("30");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("30");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 6
     * @param mouseEvent
     */
    public void clickIsland6(MouseEvent mouseEvent) {

        if (isDisabled.contains(6)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("31");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("31");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(31,idIsland) && calculateJumps(31,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(31, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("31");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("31");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 7
     * @param mouseEvent
     */
    public void clickIsland7(MouseEvent mouseEvent) {

        if (isDisabled.contains(7)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("32");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("32");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);

            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(32,idIsland) && calculateJumps(32,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(32, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland) studentOnIsland).setIsland("32");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3 ) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("32");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 8
     * @param mouseEvent
     */
    public void clickIsland8(MouseEvent mouseEvent) {

        if (isDisabled.contains(8)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("33");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("33");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(33,idIsland) && calculateJumps(33,idIsland)!=0) {
                MessageMethod movingMotherNature= new MovingMotherNature();
                ((MovingMotherNature)movingMotherNature).setJumps(calculateJumps(33,idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("33");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("33");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 9
     * @param mouseEvent
     */
    public void clickIsland9(MouseEvent mouseEvent) {

        if (isDisabled.contains(9)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
             if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()){
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("34");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("34");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
             } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(34,idIsland) && calculateJumps(34,idIsland)!=0){
                 MessageMethod movingMotherNature = new MovingMotherNature();
                 ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(34, idIsland));
                 GUIController.getInstance().write(movingMotherNature);
             } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("34");
                 GUIController.getInstance().write(studentOnIsland);
             }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("34");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 10
     * @param mouseEvent
     */
    public void clickIsland10(MouseEvent mouseEvent) {

        if (isDisabled.contains(10)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod = new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("35");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("35");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(35,idIsland) && calculateJumps(35,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(35, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null){
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("35");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("35");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 11
     * @param mouseEvent
     */
    public void clickIsland11(MouseEvent mouseEvent) {

        if (isDisabled.contains(11)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod=new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()){
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("36");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("36");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(36, idIsland) && calculateJumps(36,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(36, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null) {
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("36");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("36");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on island 12
     * @param mouseEvent
     */
    public void clickIsland12(MouseEvent mouseEvent) {

        if (isDisabled.contains(12)) {
            return;
        }

        if (game.getCurrentRound().getId()==null) {
            if (GUIController.getInstance().getCardNeedIsland()) {
                MessageMethod messageMethod=new PlayExpertCard();
                switch (GUIController.getInstance().getIdExpertCardPlayed()) {
                    case"40":
                        ((PlayExpertCard)messageMethod).setExpertCard("40");
                        ((PlayExpertCard)messageMethod).setParameter("37");
                        break;
                    case"42":
                        ((PlayExpertCard)messageMethod).setExpertCard("42");
                        ((PlayExpertCard)messageMethod).setParameter("37");
                        break;
                }
                GUIController.getInstance().setCardNeedIsland(false);
                GUIController.getInstance().setIdExpertCardPlayed();
                GUIController.getInstance().write(messageMethod);
            } else if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_MOTHERNATURE && game.getCurrentPlayer().getCardPlayedValue()>=calculateJumps(37,idIsland) && calculateJumps(37,idIsland)!=0) {
                MessageMethod movingMotherNature = new MovingMotherNature();
                ((MovingMotherNature) movingMotherNature).setJumps(calculateJumps(37, idIsland));
                GUIController.getInstance().write(movingMotherNature);
            } else if(game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && studentMoving!=null){
                ((MovingStudentFromIngressToIsland)studentOnIsland).setIsland("37");
                GUIController.getInstance().write(studentOnIsland);
            }
        } else if (game.getCurrentRound().getId()==3) {
            StudentToIsland messageMethod = GUIController.getInstance().getStudentToIsland();
            (messageMethod).setIsland("37");
            GUIController.getInstance().write(messageMethod);
            GUIController.getInstance().setStudentToIsland(new StudentToIsland());
        }
    }

    /**
     * Click on green line
     * @param mouseEvent
     */
    public void clickOnGreenLine(MouseEvent mouseEvent) {

        if (isFull.contains(Color.GREEN)) {
            return;
        }

        if (game.getCurrentRound().getId()!=null) {
            if (game.getCurrentRound().getId()==0) {
                IngressCardSwap ingressCardSwap = GUIController.getInstance().getMessageMethod();
                ingressCardSwap.setStudentIngress(game.getCurrentPlayer().getSchool().getHall().getLine(Color.GREEN).getStudents().getLast().getId());
                GUIController.getInstance().write(ingressCardSwap);
                GUIController.getInstance().setMessageMethodIngressCard(new IngressCardSwap());
            }
            if (game.getCurrentRound().getId()==1 && !game.getCurrentPlayer().getSchool().getHall().getLine(Color.GREEN).getStudents().isEmpty() && studentIngressHallSwap !=null) {
                MessageMethod messageMethod = new IngressHallSwap();
                ((IngressHallSwap) messageMethod).setStudentIngress(studentIngressHallSwap.getId());
                ((IngressHallSwap) messageMethod).setStudentHall(game.getCurrentPlayer().getSchool().getHall().getLine(Color.GREEN).getStudents().getLast().getId());
                GUIController.getInstance().write(messageMethod);
            }
        } else {
            if (studentMoving != null && !GUIController.getInstance().getCardNeedIsland()) {
                switch (studentMoving) {
                    case GREEN -> {
                        GUIController.getInstance().write(studentOnHall);
                        studentOnHall = new MovingStudentsFromIngressToHall();
                    }
                }
            }
        }
    }

    /**
     * Click on red line
     * @param mouseEvent
     */
    public void clickOnRedLine(MouseEvent mouseEvent) {

        if (isFull.contains(Color.RED)) {
            return;
        }

        if (game.getCurrentRound().getId()!=null) {
            if (game.getCurrentRound().getId()==0) {
                IngressCardSwap ingressCardSwap = GUIController.getInstance().getMessageMethod();
                ingressCardSwap.setStudentIngress(game.getCurrentPlayer().getSchool().getHall().getLine(Color.RED).getStudents().getLast().getId());
                GUIController.getInstance().write(ingressCardSwap);
                GUIController.getInstance().setMessageMethodIngressCard(new IngressCardSwap());
            }
            if (game.getCurrentRound().getId()==1 && !game.getCurrentPlayer().getSchool().getHall().getLine(Color.RED).getStudents().isEmpty() && studentIngressHallSwap != null) {
                MessageMethod messageMethod = new IngressHallSwap();
                ((IngressHallSwap) messageMethod).setStudentIngress(studentIngressHallSwap.getId());
                ((IngressHallSwap) messageMethod).setStudentHall(game.getCurrentPlayer().getSchool().getHall().getLine(Color.RED).getStudents().getLast().getId());
                GUIController.getInstance().write(messageMethod);
            }
        } else {
            if (studentMoving != null && !GUIController.getInstance().getCardNeedIsland()) {
                switch (studentMoving) {
                    case RED -> {
                        GUIController.getInstance().write(studentOnHall);
                        studentOnHall = new MovingStudentsFromIngressToHall();
                    }
                }
            }
        }
    }

    /**
     * Click on yellow line
     * @param mouseEvent
     */
    public void clickOnYellowLine(MouseEvent mouseEvent) {

        if (isFull.contains(Color.YELLOW)) {
            return;
        }

        if (game.getCurrentRound().getId()!=null) {
            if (game.getCurrentRound().getId()==0) {
                IngressCardSwap ingressCardSwap = GUIController.getInstance().getMessageMethod();
                ingressCardSwap.setStudentIngress(game.getCurrentPlayer().getSchool().getHall().getLine(Color.YELLOW).getStudents().getLast().getId());
                GUIController.getInstance().write(ingressCardSwap);
                GUIController.getInstance().setMessageMethodIngressCard(new IngressCardSwap());
            }
            if (game.getCurrentRound().getId()==1 && !game.getCurrentPlayer().getSchool().getHall().getLine(Color.YELLOW).getStudents().isEmpty() && studentIngressHallSwap !=null) {
                MessageMethod messageMethod = new IngressHallSwap();
                ((IngressHallSwap) messageMethod).setStudentIngress(studentIngressHallSwap.getId());
                ((IngressHallSwap) messageMethod).setStudentHall(game.getCurrentPlayer().getSchool().getHall().getLine(Color.YELLOW).getStudents().getLast().getId());
                GUIController.getInstance().write(messageMethod);
            }
        } else {
            if (studentMoving != null && !GUIController.getInstance().getCardNeedIsland()) {
                switch (studentMoving) {
                    case YELLOW -> {
                        GUIController.getInstance().write(studentOnHall);
                        studentOnHall = new MovingStudentsFromIngressToHall();
                    }
                }
            }
        }
    }

    /**
     * Click on pink line
     * @param mouseEvent
     */
    public void clickOnPinkLine(MouseEvent mouseEvent) {

        if (isFull.contains(Color.PINK)) {
            return;
        }

        if (game.getCurrentRound().getId()!=null) {
            if (game.getCurrentRound().getId()==0) {
                IngressCardSwap ingressCardSwap = GUIController.getInstance().getMessageMethod();
                ingressCardSwap.setStudentIngress(game.getCurrentPlayer().getSchool().getHall().getLine(Color.PINK).getStudents().getLast().getId());
                GUIController.getInstance().write(ingressCardSwap);
                GUIController.getInstance().setMessageMethodIngressCard(new IngressCardSwap());
             }
            if (game.getCurrentRound().getId()==1 && !game.getCurrentPlayer().getSchool().getHall().getLine(Color.PINK).getStudents().isEmpty() && studentIngressHallSwap !=null) {
                MessageMethod messageMethod = new IngressHallSwap();
                ((IngressHallSwap) messageMethod).setStudentIngress(studentIngressHallSwap.getId());
                ((IngressHallSwap)messageMethod).setStudentHall(game.getCurrentPlayer().getSchool().getHall().getLine(Color.PINK).getStudents().getLast().getId());
                GUIController.getInstance().write(messageMethod);
            }
        } else {
            if (studentMoving!=null && !GUIController.getInstance().getCardNeedIsland()) {
                switch (studentMoving) {
                    case PINK -> {
                        GUIController.getInstance().write(studentOnHall);
                        studentOnHall = new MovingStudentsFromIngressToHall();
                    }
                }
            }
        }
    }

    /**
     * Click on blue line
     * @param mouseEvent
     */
    public void clickOnBlueLine(MouseEvent mouseEvent) {

        if (isFull.contains(Color.BLUE)) {
            return;
        }

        if (game.getCurrentRound().getId()!=null) {
            if (game.getCurrentRound().getId()==0) {
                IngressCardSwap ingressCardSwap = GUIController.getInstance().getMessageMethod();
                ingressCardSwap.setStudentIngress(game.getCurrentPlayer().getSchool().getHall().getLine(Color.BLUE).getStudents().getLast().getId());
                GUIController.getInstance().write(ingressCardSwap);
                GUIController.getInstance().setMessageMethodIngressCard(new IngressCardSwap());
            }
            if (game.getCurrentRound().getId()==1 && !game.getCurrentPlayer().getSchool().getHall().getLine(Color.BLUE).getStudents().isEmpty() && studentIngressHallSwap !=null) {
                MessageMethod messageMethod = new IngressHallSwap();
                ((IngressHallSwap) messageMethod).setStudentIngress(studentIngressHallSwap.getId());
                ((IngressHallSwap)messageMethod).setStudentHall(game.getCurrentPlayer().getSchool().getHall().getLine(Color.BLUE).getStudents().getLast().getId());
                GUIController.getInstance().write(messageMethod);
            }
        } else {
            if (studentMoving != null && !GUIController.getInstance().getCardNeedIsland()) {
                switch (studentMoving) {
                    case BLUE -> {
                        GUIController.getInstance().write(studentOnHall);
                        studentOnHall = new MovingStudentsFromIngressToHall();
                    }
                }
            }
        }
    }

    /**
     * Refresh the page after a move has been made
     * @throws IOException
     */
    public void refresh() throws IOException {
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/actionPhase-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiActionPhaseController actionController = fxmlLoader.getController();
        actionController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * Click on ingress 1
     * @param mouseEvent
     */
    public void clickOnIngress1(MouseEvent mouseEvent) {
        if (game.getCurrentRound().getId()==null) {
            if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(0).getId());
                studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(0).getColor();
                ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(0).getId());
                setShadow(studentIngress1);
            }
        } else if (game.getCurrentRound().getId()==1) {
            studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(0);
            setShadow(studentIngress1);
        } else if (game.getCurrentRound().getId()==2) {
            MessageMethod messageMethod = new StudentToHall();
            ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(0).getId());
            setShadow(studentIngress1);
            GUIController.getInstance().write(messageMethod);
        }
    }

    /**
     * Click on ingress 2
     * @param mouseEvent
     */
    public void clickOnIngress2(MouseEvent mouseEvent) {
        if (game.getCurrentRound().getId()==null) {
            if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(1).getId());
                studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(1).getColor();
                ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(1).getId());
                setShadow(studentIngress2);
            }
        } else if (game.getCurrentRound().getId()==1) {
           studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(1);
            setShadow(studentIngress2);
        } else if (game.getCurrentRound().getId()==2) {
            MessageMethod messageMethod = new StudentToHall();
            ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(1).getId());
            setShadow(studentIngress2);
            GUIController.getInstance().write(messageMethod);
        }
    }

    /**
     * click on ingress 3
     * @param mouseEvent
     */
    public void clickOnIngress3(MouseEvent mouseEvent) {
        if (game.getCurrentRound().getId()==null) {
            if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(2).getId());
                studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(2).getColor();
                ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(2).getId());
                setShadow(studentIngress3);
            }
        } else if (game.getCurrentRound().getId()==1) {
            studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(2);
            setShadow(studentIngress3);
        } else if (game.getCurrentRound().getId()==2) {
            MessageMethod messageMethod = new StudentToHall();
            ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(2).getId());
            setShadow(studentIngress3);
            GUIController.getInstance().write(messageMethod);
        }
    }

    /**
     * click on ingress 4
     * @param mouseEvent
     */
    public void clickOnIngress4(MouseEvent mouseEvent) {
        if (game.getCurrentRound().getId()==null) {
            if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(3).getId());
                studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(3).getColor();
                ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(3).getId());
                setShadow(studentIngress4);
            }
        } else if (game.getCurrentRound().getId()==1) {
            studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(3);
            setShadow(studentIngress4);
        } else if (game.getCurrentRound().getId()==2) {
            MessageMethod messageMethod = new StudentToHall();
            ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(3).getId());
            setShadow(studentIngress4);
            GUIController.getInstance().write(messageMethod);
        }
    }

    /**
     * click on ingress 5
     * @param mouseEvent
     */
    public void clickOnIngress5(MouseEvent mouseEvent) {
        if (game.getCurrentPlayer().getSchool().getIngress().getStudents().size()>4) {
            if (game.getCurrentRound().getId()==null) {
                if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                    ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(4).getId());
                    studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(4).getColor();
                    ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(4).getId());
                    setShadow(studentIngress5);
                }
            } else if (game.getCurrentRound().getId()==1) {
                studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(4);
                setShadow(studentIngress5);
            } else if (game.getCurrentRound().getId()==2) {
                MessageMethod messageMethod = new StudentToHall();
                ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(4).getId());
                setShadow(studentIngress5);
                GUIController.getInstance().write(messageMethod);
            }
        }
    }

    /**
     * click on ingress 6
     * @param mouseEvent
     */
    public void clickOnIngress6(MouseEvent mouseEvent) {
        if (game.getCurrentPlayer().getSchool().getIngress().getStudents().size()>5) {
            if (game.getCurrentRound().getId()==null) {
                if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                    ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(5).getId());
                    studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(5).getColor();
                    ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(5).getId());
                    setShadow(studentIngress6);
                }
            } else if (game.getCurrentRound().getId()==1) {
                studentIngressHallSwap =(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(5));
                setShadow(studentIngress6);
            } else if (game.getCurrentRound().getId()==2) {
                MessageMethod messageMethod = new StudentToHall();
                ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(5).getId());
                setShadow(studentIngress6);
                GUIController.getInstance().write(messageMethod);
            }
        }
    }

    /**
     * click on ingress 7
     * @param mouseEvent
     */
    public void clickOnIngress7(MouseEvent mouseEvent) {
        if (game.getCurrentPlayer().getSchool().getIngress().getStudents().size()>6) {
            if (game.getCurrentRound().getId()==null) {
                if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                    ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(6).getId());
                    studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(6).getColor();
                    ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(6).getId());
                    setShadow(studentIngress7);
                }
            } else if (game.getCurrentRound().getId()==1) {
                studentIngressHallSwap =game.getCurrentPlayer().getSchool().getIngress().getStudents().get(6);
                setShadow(studentIngress7);
            } else if (game.getCurrentRound().getId()==2) {
                MessageMethod messageMethod = new StudentToHall();
                ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(6).getId());
                setShadow(studentIngress7);
                GUIController.getInstance().write(messageMethod);
            }
        }
    }

    /**
     * click on ingress 8
     * @param mouseEvent
     */
    public void clickOnIngress8(MouseEvent mouseEvent) {
        if (game.getCurrentPlayer().getSchool().getIngress().getStudents().size()>7) {
            if (game.getCurrentRound().getId()==null) {
                if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                    ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(7).getId());
                    studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(7).getColor();
                    ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(7).getId());
                    setShadow(studentIngress8);
                }
            } else if (game.getCurrentRound().getId() == 1) {
                studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(7);
                setShadow(studentIngress8);
            } else if (game.getCurrentRound().getId()==2) {
                MessageMethod messageMethod = new StudentToHall();
                ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(7).getId());
                setShadow(studentIngress8);
                GUIController.getInstance().write(messageMethod);
            }
        }
    }

    /**
     * click on ingress 9
     * @param mouseEvent
     */
    public void clickOnIngress9(MouseEvent mouseEvent) {
        if (game.getCurrentPlayer().getSchool().getIngress().getStudents().size()>8) {
            if (game.getCurrentRound().getId()==null) {
                if (game.getCurrentPlayer().getPlayerPhase() == PlayerPhase.MOVING_STUDENTS && !GUIController.getInstance().getCardNeedIsland()) {
                    ((MovingStudentsFromIngressToHall) studentOnHall).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(8).getId());
                    studentMoving = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(8).getColor();
                    ((MovingStudentFromIngressToIsland) studentOnIsland).setStudent(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(8).getId());
                    setShadow(studentIngress9);
                }
            } else if (game.getCurrentRound().getId() == 1) {
                studentIngressHallSwap = game.getCurrentPlayer().getSchool().getIngress().getStudents().get(8);
                setShadow(studentIngress9);
            } else if (game.getCurrentRound().getId()==2) {
                MessageMethod messageMethod = new StudentToHall();
                ((StudentToHall)messageMethod).setStudentToHall(game.getCurrentPlayer().getSchool().getIngress().getStudents().get(8).getId());
                setShadow(studentIngress9);
                GUIController.getInstance().write(messageMethod);
            }
        }
    }

    /**
     * Click on cloud 1
     * @param mouseEvent
     * @throws IOException
     */
    public void clickOnCloud1(MouseEvent mouseEvent) throws IOException {
        if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD && !GUIController.getInstance().getCardNeedIsland() && game.getClouds().get(0).getStudents().size()!=0) {
            MessageMethod messageMethod = new ChooseStudentsFromCloud();
            ((ChooseStudentsFromCloud)messageMethod).setCloud(game.getClouds().get(0).getId());
            GUIController.getInstance().write(messageMethod);
            showLoading();
        }
    }

    /**
     * Click on cloud 2
     * @param mouseEvent
     * @throws IOException
     */
    public void clickOnCloud2(MouseEvent mouseEvent) throws IOException {
        if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD && !GUIController.getInstance().getCardNeedIsland() && game.getClouds().get(1).getStudents().size()!=0) {
            MessageMethod messageMethod = new ChooseStudentsFromCloud();
            ((ChooseStudentsFromCloud)messageMethod).setCloud(game.getClouds().get(1).getId());
            GUIController.getInstance().write(messageMethod);
            showLoading();
        }
    }

    /**
     * Click on cloud 3
     * @param mouseEvent
     * @throws IOException
     */
    public void clickOnCloud3(MouseEvent mouseEvent) throws IOException {
        if (game.getCurrentPlayer().getPlayerPhase()==PlayerPhase.CHOOSING_CLOUD && game.getPlayerList().size()==3 && !GUIController.getInstance().getCardNeedIsland() && game.getClouds().get(2).getStudents().size()!=0) {
            MessageMethod messageMethod = new ChooseStudentsFromCloud();
            ((ChooseStudentsFromCloud)messageMethod).setCloud(game.getClouds().get(2).getId());
            GUIController.getInstance().write(messageMethod);
            showLoading();
        }
    }

    /**
     * go to loading scene
     * @throws IOException exception
     */
    public void showLoading() throws IOException{
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/loading-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiLoadingController loadingController = fxmlLoader.getController();
        loadingController.resize(stage);
        loadingController.setWaitText();
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * go to expertCard scene
     * @param mouseEvent
     * @throws IOException
     */
    public void clickPlayExpertCard(MouseEvent mouseEvent) throws IOException {
        if (game.getGameMode()==true && game.getCardManager().getCurrentCard()==null && !GUIController.getInstance().getCardNeedIsland()) {
            stage = GUIController.getInstance().getStage();
            double x = stage.getX();
            double y = stage.getY();
            double width = stage.getWidth();
            double height = stage.getHeight();
            stage = new Stage();
            GUIController.getInstance().getStage().close();
            GUIController.setStage(stage);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/expertCard-view.fxml"));
            scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.setTitle("Eriantys");
            stage.show();
            GuiChooseExpertCardController expertController = fxmlLoader.getController();
            expertController.resize(stage);
            stage.setWidth(width);
            stage.setHeight(height);
            stage.setX(x);
            stage.setY(y);
        }
    }

    /**
     * Finish expertCard effect
     * @param mouseEvent
     */
    public void clickFinishExpertMove(MouseEvent mouseEvent) {
        if (game.getCardManager().getCurrentCard()!=null && !GUIController.getInstance().getCardNeedIsland()) {
            GUIController.getInstance().write(new RoundEnd());
        }
    }

    /**
     * Window resize
     * @param stage Stage
     */
    public void resize(Stage stage) {

        double height = stage.getScene().getHeight();
        double width = stage.getScene().getWidth();

        //stage min sizes
        stage.setMinHeight(450);
        stage.setMinWidth(800);

        //horizontal listener
        stage.getScene().widthProperty().addListener((obs, oldVal, newVal) -> {
            double scaleX = (newVal.doubleValue()/width);
            scenePane.setScaleX(scaleX);
            scenePane.setTranslateX(scenePane.getTranslateX() + (newVal.doubleValue()-oldVal.doubleValue())/2);
        });

        //vertical listener
        stage.getScene().heightProperty().addListener((obs, oldVal, newVal) -> {
            double scaleY = (newVal.doubleValue()/height);
            scenePane.setScaleY(scaleY);
            scenePane.setTranslateY(scenePane.getTranslateY() + (newVal.doubleValue()-oldVal.doubleValue())/2);
        });
    }

    /**
     * Sets shadows on images
     * @param setImage
     */
    private void setShadow(ImageView setImage) {
        setImage.setEffect(new DropShadow(30, javafx.scene.paint.Color.BLUE));
        if (lastLight!=null && !lastLight.equals(setImage)) {
            lastLight.setEffect(null);
        }
        lastLight = setImage;
    }

}
