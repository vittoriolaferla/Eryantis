package it.polimi.ingsw.client.view.gui.controllers;

import it.polimi.ingsw.message.MessageMethod;
import it.polimi.ingsw.message.PlayExpertCard;
import it.polimi.ingsw.model.Game;
import it.polimi.ingsw.model.expertCards.deck.IngressCardSwapCard;
import it.polimi.ingsw.model.expertCards.deck.StudentToHallCard;
import it.polimi.ingsw.model.expertCards.deck.StudentToIslandCard;
import it.polimi.ingsw.model.pawns.Student;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class GuiChooseExpertCardController implements Initializable {

    /**
     * Reference to the anchor pane to resize
     */
    @FXML
    private AnchorPane scenePane;

    /**
     * Keep the reference to the last image light up
     */
    private ImageView  lastLight;

    /**
     * Used to have the id of the selected expert card
     */
    private String idExpert;

    /**
     * Reference to game
     */
    private Game game;

    /**
     * Reference to the stage
     */
    private Stage stage;

    /**
     * Reference to the scene
     */
    private Scene scene;

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
     * Path to card 1 image file
     */
    private String cardOnePath = "/Graphical_Assets/Personaggi/CarteTOT_front1.jpg";

    /**
     * Path to card 2 image file
     */
    private String cardTwoPath = "/Graphical_Assets/Personaggi/CarteTOT_front12.jpg";

    /**
     * Path to card 3 image file
     */
    private String cardThreePath = "/Graphical_Assets/Personaggi/CarteTOT_front2.jpg";

    /**
     * Path to card 4 image file
     */
    private String cardFourPath = "/Graphical_Assets/Personaggi/CarteTOT_front3.jpg";

    /**
     * Path to card 5 image file
     */
    private String cardFivePath = "/Graphical_Assets/Personaggi/CarteTOT_front4.jpg";

    /**
     * Path to card 6 image file
     */
    private String cardSixPath = "/Graphical_Assets/Personaggi/CarteTOT_front5.jpg";

    /**
     * Path to card 7 image file
     */
    private String cardSevenPath = "/Graphical_Assets/Personaggi/CarteTOT_front6.jpg";

    /**
     * Path to card 8 image file
     */
    private String cardEightPath = "/Graphical_Assets/Personaggi/CarteTOT_front7.jpg";

    /**
     * Path to card 9 image file
     */
    private String cardNinePath = "/Graphical_Assets/Personaggi/CarteTOT_front8.jpg";

    /**
     * Path to card 10 image file
     */
    private String cardTenPath = "/Graphical_Assets/Personaggi/CarteTOT_front9.jpg";

    /**
     * Path to card 11 image file
     */
    private String cardElevenPath = "/Graphical_Assets/Personaggi/CarteTOT_front10.jpg";

    /**
     * Path to card 12 image file
     */
    private String cardTwelvePath = "/Graphical_Assets/Personaggi/CarteTOT_front11.jpg";

    /**
     * Reference to the three expert card showed
     */
    @FXML
    private ImageView expertCard1;
    @FXML
    private ImageView expertCard2;
    @FXML
    private ImageView expertCard3;

    /**
     * Reference to the texts
     */
    @FXML
    private Text coins;
    @FXML
    private Text communication;
    @FXML
    private Text costCard1;
    @FXML
    private Text costCard2;
    @FXML
    private Text costCard3;

    /**
     * Reference to the students on the cards
     */
    @FXML
    private ImageView card1student1;
    @FXML
    private ImageView card1student2;
    @FXML
    private ImageView card1student3;
    @FXML
    private ImageView card1student4;
    @FXML
    private ImageView card1student5;
    @FXML
    private ImageView card1student6;
    @FXML
    private ImageView card2student1;
    @FXML
    private ImageView card2student2;
    @FXML
    private ImageView card2student3;
    @FXML
    private ImageView card2student4;
    @FXML
    private ImageView card2student5;
    @FXML
    private ImageView card2student6;
    @FXML
    private ImageView card3student1;
    @FXML
    private ImageView card3student2;
    @FXML
    private ImageView card3student3;
    @FXML
    private ImageView card3student4;
    @FXML
    private ImageView card3student5;
    @FXML
    private ImageView card3student6;

    /**
     * go back to action phase
     * @param mouseEvent
     * @throws IOException
     */
    public void onBackClick(MouseEvent mouseEvent) throws IOException {
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
     * choose the selected card
     * @param mouseEvent
     * @throws IOException
     */
    public void onNextClick(MouseEvent mouseEvent) throws IOException {
        if (idExpert!=null) {
            switch (idExpert) {
                case "38":
                    MessageMethod messageMethod38 = new PlayExpertCard();
                    GUIController.getInstance().setIdExpertCardPlayed();
                    ((PlayExpertCard) messageMethod38).setExpertCard("38");
                    GUIController.getInstance().write(messageMethod38);
                    break;
                case "39":
                    MessageMethod messageMethod39 = new PlayExpertCard();
                    ((PlayExpertCard) messageMethod39).setExpertCard("39");
                    GUIController.getInstance().write(messageMethod39);
                    break;
                case "40":
                    GUIController.getInstance().setIdExpertCardPlayed("40");
                    GUIController.getInstance().setCardNeedIsland(true);
                    sceneAction();
                    break;
                case "41":
                    MessageMethod messageMethod41 = new PlayExpertCard();
                    ((PlayExpertCard) messageMethod41).setExpertCard("41");
                    GUIController.getInstance().write(messageMethod41);
                    break;
                case "42":
                    GUIController.getInstance().setIdExpertCardPlayed("42");
                    GUIController.getInstance().setCardNeedIsland(true);
                    sceneAction();
                    break;
                case "43":
                    MessageMethod messageMethod43 = new PlayExpertCard();
                    ((PlayExpertCard) messageMethod43).setExpertCard("43");
                    GUIController.getInstance().write(messageMethod43);
                    break;
                case "44":
                    MessageMethod messageMethod44 = new PlayExpertCard();
                    GUIController.getInstance().setIdExpertCardPlayed();
                    ((PlayExpertCard) messageMethod44).setExpertCard("44");
                    GUIController.getInstance().write(messageMethod44);
                    break;
                case "45":
                    scenePlayer();
                    break;
                case "46":
                    GUIController.getInstance().setIdExpertCardPlayed();
                    sceneColor();
                    break;
                case "47":
                    MessageMethod messageMethod47 = new PlayExpertCard();
                    ((PlayExpertCard) messageMethod47).setExpertCard("47");
                    GUIController.getInstance().write(messageMethod47);
                    break;
                case "48":
                    MessageMethod messageMethod48 = new PlayExpertCard();
                    GUIController.getInstance().setIdExpertCardPlayed();
                    ((PlayExpertCard) messageMethod48).setExpertCard("48");
                    GUIController.getInstance().write(messageMethod48);
                    break;
                case "49":
                    GUIController.getInstance().setIdExpertCardPlayed();
                    sceneColor();
                    break;
            }
        }
    }

    /**
     * Click on the first expert card randomly choose for the game
     * @param mouseEvent
     */
    public void clickOnExpert1(MouseEvent mouseEvent) throws IOException {
       if (game.getCardManager().getDeck().get(0).getCost()>game.getCurrentPlayer().getCoins()) {
           communication.setText("You can not afford this card");
       } else {
           idExpert = game.getCardManager().getDeck().get(0).getId();
           setShadow(expertCard1);
       }
    }

    /**
     * Click on the second expert card randomly choose for the game
     * @param mouseEvent
     */
    public void clickOnExpert2(MouseEvent mouseEvent) {
        if (game.getCardManager().getDeck().get(1).getCost()>game.getCurrentPlayer().getCoins()) {
            communication.setText("You can not afford this card");
        } else {
            idExpert = game.getCardManager().getDeck().get(1).getId();
            setShadow(expertCard2);
        }
    }

    /**
     * Click on the third expert card randomly choose for the game
     * @param mouseEvent
     * @throws IOException
     */
    public void clickOnExpert3(MouseEvent mouseEvent) throws IOException {
        if (game.getCardManager().getDeck().get(2).getCost()>game.getCurrentPlayer().getCoins()) {
            communication.setText("You can not afford this card");
        } else {
            idExpert = game.getCardManager().getDeck().get(2).getId();
            setShadow(expertCard3);
        }
    }

    /**
     * Sets expert card images
     * @param id
     * @param expertCard
     */
    public void setImageExpertCard(String id, ImageView expertCard, int position){
        switch (id) {
            case"38":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardOnePath)));
                showStudents(position,((StudentToIslandCard) game.getCardManager().getDeck().get(position-1)).getStudents());
                break;
            case"39":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardTwoPath)));
                break;
            case"40":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardThreePath)));
                break;
            case"41":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardFourPath)));
                break;
            case"42":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardFivePath)));
                break;
            case"43":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardSixPath)));
                break;
            case"44":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardSevenPath)));
                showStudents(position,((IngressCardSwapCard) game.getCardManager().getDeck().get(position-1)).getStudents());
                break;
            case"45":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardEightPath)));
                break;
            case"46":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardNinePath)));
                break;
            case"47":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardTenPath)));
                break;
            case"48":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardElevenPath)));
                showStudents(position,((StudentToHallCard) game.getCardManager().getDeck().get(position-1)).getStudents());
                break;
            case"49":
                expertCard.setImage(new Image(getClass().getResourceAsStream(cardTwelvePath)));
                break;
        }
    }

    /**
     * Shows students on the cards
     * @param position
     * @param students
     */
    private void showStudents(int position, LinkedList<Student> students){
        LinkedList<ImageView> images = new LinkedList<>();
        switch (position){
            case 1:
                images.add(card1student1);
                images.add(card1student2);
                images.add(card1student3);
                images.add(card1student4);
                images.add(card1student5);
                images.add(card1student6);
                break;
            case 2:
                images.add(card2student1);
                images.add(card2student2);
                images.add(card2student3);
                images.add(card2student4);
                images.add(card2student5);
                images.add(card2student6);
                break;
            case 3:
                images.add(card3student1);
                images.add(card3student2);
                images.add(card3student3);
                images.add(card3student4);
                images.add(card3student5);
                images.add(card3student6);
                break;
        }
        for(int i = 0; i<students.size(); i++){
            images.get(i).setImage(getImageStudent(students.get(i)));
        }
    }

    /**
     * Sets students images
     * @param student whose image is returned
     * @return a new Image object of student
     */
    private Image getImageStudent(Student student) {
        switch (student.getColor()) {
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
     * Initialize the scene
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        game = GUIController.getInstance().getClient().getGame();
        setImageExpertCard(game.getCardManager().getDeck().get(0).getId(),expertCard1, 1);
        setImageExpertCard(game.getCardManager().getDeck().get(1).getId(),expertCard2,2);
        setImageExpertCard(game.getCardManager().getDeck().get(2).getId(),expertCard3,3);
        coins.setText("You have " + game.getCurrentPlayer().getCoins() + " coins");
        costCard1.setText("Cost: " + game.getCardManager().getDeck().get(0).getCost());
        costCard2.setText("Cost: " + game.getCardManager().getDeck().get(1).getCost());
        costCard3.setText("Cost: " + game.getCardManager().getDeck().get(2).getCost());
    }

    /**
     * go to studentOnCard scene
     * @throws IOException
     */
    public void sceneStudentOnCard() throws IOException {
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/studentsOnCard-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiChooseStudentsOnCardController studentsController = fxmlLoader.getController();
        studentsController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * go to selectColor scene
     * @throws IOException
     */
    public void sceneColor() throws IOException {
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/selectColorCard-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiChooseColorCardController studentsController = fxmlLoader.getController();
        studentsController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * go to actionPhase scene
     * @throws IOException
     */
    public void sceneAction() throws IOException {
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
        GuiActionPhaseController studentsController = fxmlLoader.getController();
        studentsController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * go to selectPlayerCard scene
     * @throws IOException
     */
    public void scenePlayer() throws IOException {
        stage = GUIController.getInstance().getStage();
        double x = stage.getX();
        double y = stage.getY();
        double width = stage.getWidth();
        double height = stage.getHeight();
        stage = new Stage();
        GUIController.getInstance().getStage().close();
        GUIController.setStage(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/selectPlayerCard-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Eriantys");
        stage.show();
        GuiSelectPlayerCardController studentsController = fxmlLoader.getController();
        studentsController.resize(stage);
        stage.setWidth(width);
        stage.setHeight(height);
        stage.setX(x);
        stage.setY(y);
    }

    /**
     * Window resize
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
        setImage.setEffect(new DropShadow(30, Color.DARKBLUE));
        if (lastLight!=null && lastLight!=setImage) {
            lastLight.setEffect(null);
        }
        lastLight = setImage;
    }

}
