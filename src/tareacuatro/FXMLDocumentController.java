
package tareacuatro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

/**
 * @version 1.0
 * @author Nicole Fonseca
 */
public class FXMLDocumentController implements Initializable {
 
    @FXML private AnchorPane anchorPane;
    @FXML private ImageView fishImageViewOne;
    @FXML private ImageView fishImageViewTwo;
    @FXML private ImageView algaImageViewOne;
    @FXML private ImageView algaImageViewTwo;
    @FXML private ImageView algaImageViewThree;
    @FXML private ImageView algaImageViewFour;
    @FXML private ImageView algaImageViewFive;
    
    //Acción del pez 1
    @FXML private void fishAction(MouseEvent event) {
        
        //Patrón que van a seguir las burbujas
        Line line = new Line(event.getSceneX(),event.getSceneY(), event.getSceneX(), -30); 
        
        //Burbuja 1
        Circle bubbleOne = new Circle(5);
        bubbleOne.setStroke(Color.DARKTURQUOISE);
        bubbleOne.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleOne); 
        //Transición de la burbuja
        PathTransition pathTransitionBubbleOne = new PathTransition();
        pathTransitionBubbleOne.setNode(bubbleOne);
        pathTransitionBubbleOne.setDuration(Duration.seconds(2));
        pathTransitionBubbleOne.setPath(line);
        pathTransitionBubbleOne.setRate(0.5);       
        pathTransitionBubbleOne.play(); 
       
        //Burbuja 2 
        Circle bubbleTwo = new Circle(3);
        bubbleTwo.setStroke(Color.DARKTURQUOISE);
        bubbleTwo.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleTwo);   
        //Transición de la burbuja
        PathTransition pathTransitionBubbleTwo = new PathTransition();
        pathTransitionBubbleTwo.setNode(bubbleTwo);
        pathTransitionBubbleTwo.setDuration(Duration.seconds(2));
        pathTransitionBubbleTwo.setPath(line);
        pathTransitionBubbleTwo.setRate(0.3);       
        pathTransitionBubbleTwo.play();
        
        //Burbuja 3 
        Circle bubbleThree = new Circle(1);
        bubbleThree.setStroke(Color.DARKTURQUOISE);
        bubbleThree.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleThree); 
        //Transición de la burbuja
        PathTransition pathTransitionBubbleThree = new PathTransition();
        pathTransitionBubbleThree.setNode(bubbleThree);
        pathTransitionBubbleThree.setDuration(Duration.seconds(2));
        pathTransitionBubbleThree.setPath(line);
        pathTransitionBubbleThree.setRate(0.2);       
        pathTransitionBubbleThree.play();
        
        //Para que las burbujas cambien de tamaño cuando suben
        ScaleTransition scaleTransitionOne= new ScaleTransition(Duration.seconds(3), bubbleOne);
        scaleTransitionOne.setToX(3);
        scaleTransitionOne.setToY(3);
        scaleTransitionOne.play();
        
        ScaleTransition scaleTransitionTwo= new ScaleTransition(Duration.seconds(3), bubbleTwo);
        scaleTransitionTwo.setToX(3.3);
        scaleTransitionTwo.setToY(3.3);
        scaleTransitionTwo.play();
        
        ScaleTransition scaleTransitionThree= new ScaleTransition(Duration.seconds(3), bubbleThree);
        scaleTransitionThree.setToX(3.7);
        scaleTransitionThree.setToY(3.7);
        scaleTransitionThree.play();
    }
    
    //Acción del pez 2
    @FXML private void fishActionTwo(MouseEvent event) {
        
        //Patrón que van a seguir las burbujas
        Line line = new Line(event.getSceneX(),event.getSceneY(),event.getSceneX(), -30); 
        
        //Burbuja 1
        Circle bubbleOne = new Circle(5);
        bubbleOne.setStroke(Color.DARKTURQUOISE);
        bubbleOne.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleOne); 
        //Transición de la burbuja
        PathTransition pathTransitionBubbleOne = new PathTransition();
        pathTransitionBubbleOne.setNode(bubbleOne);
        pathTransitionBubbleOne.setDuration(Duration.seconds(2));
        pathTransitionBubbleOne.setPath(line);
        pathTransitionBubbleOne.setRate(0.5);       
        pathTransitionBubbleOne.play(); 
       
        //Burbuja 2 
        Circle bubbleTwo = new Circle(3);
        bubbleTwo.setStroke(Color.DARKTURQUOISE);
        bubbleTwo.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleTwo);   
        //Transición de la burbuja
        PathTransition pathTransitionBubbleTwo = new PathTransition();
        pathTransitionBubbleTwo.setNode(bubbleTwo);
        pathTransitionBubbleTwo.setDuration(Duration.seconds(2));
        pathTransitionBubbleTwo.setPath(line);
        pathTransitionBubbleTwo.setRate(0.3);       
        pathTransitionBubbleTwo.play();
        
        //Burbuja 3 
        Circle bubbleThree = new Circle(1);
        bubbleThree.setStroke(Color.DARKTURQUOISE);
        bubbleThree.setFill(Color.WHITE);
        anchorPane.getChildren().add(bubbleThree); 
        //Transición de la burbuja
        PathTransition pathTransitionBubbleThree = new PathTransition();
        pathTransitionBubbleThree.setNode(bubbleThree);
        pathTransitionBubbleThree.setDuration(Duration.seconds(2));
        pathTransitionBubbleThree.setPath(line);
        pathTransitionBubbleThree.setRate(0.2);       
        pathTransitionBubbleThree.play();
        
        //Para que las burbujas cambien de tamaño cuando suben
        ScaleTransition scaleTransitionOne= new ScaleTransition(Duration.seconds(3), bubbleOne);
        scaleTransitionOne.setToX(3);
        scaleTransitionOne.setToY(3);
        scaleTransitionOne.play();
        
        ScaleTransition scaleTransitionTwo= new ScaleTransition(Duration.seconds(3), bubbleTwo);
        scaleTransitionTwo.setToX(3.3);
        scaleTransitionTwo.setToY(3.3);
        scaleTransitionTwo.play();
        
        ScaleTransition scaleTransitionThree= new ScaleTransition(Duration.seconds(3), bubbleThree);
        scaleTransitionThree.setToX(3.7);
        scaleTransitionThree.setToY(3.7);
        scaleTransitionThree.play();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Fondo de la ventana
        String backgroundImage = "/imagenes/fondo.gif";
        anchorPane.setStyle("-fx-background-image: url('" + backgroundImage + "'); "
                            +"-fx-background-position: left top, center;"
                            +"-fx-background-repeat: no-repeat;"
                            +"-fx-background-size: cover, auto;");
        
        //Imagen pez 1
        Image fishImageOne = new Image("/imagenes/pez.png");
        fishImageViewOne.setImage(fishImageOne);
        //Cambia el cursor
        fishImageViewOne.setCursor(Cursor.HAND);
        //Animación de la imagen del pez 1
        Line lineFishOne = new Line(200, 0,-400, 0);
        PathTransition pathTransitionFishOne = new PathTransition();
        pathTransitionFishOne.setNode(fishImageViewOne);
        pathTransitionFishOne.setDuration(Duration.seconds(4));
        pathTransitionFishOne.setPath(lineFishOne);
        pathTransitionFishOne.setRate(0.3);
        pathTransitionFishOne.setCycleCount(PathTransition.INDEFINITE);       
        pathTransitionFishOne.play(); 
        
        //Imagen pez 2
        Image fishImageTwo = new Image("/imagenes/pez2.png");
        fishImageViewTwo.setImage(fishImageTwo);
        //Cambia el cursor
        fishImageViewTwo.setCursor(Cursor.HAND);
        //Animación de la imagen del pez 2
        Line lineFishTwo = new Line(-90, 0, 475, 0);
        PathTransition pathTransitionFishTwo = new PathTransition();
        pathTransitionFishTwo.setNode(fishImageViewTwo);
        pathTransitionFishTwo.setDuration(Duration.seconds(4));
        pathTransitionFishTwo.setPath(lineFishTwo);
        pathTransitionFishTwo.setRate(0.3);
        pathTransitionFishTwo.setCycleCount(PathTransition.INDEFINITE);       
        pathTransitionFishTwo.play(); 
        
        //Añadir imágenes de algas
        Image algaImage = new Image("/imagenes/algas.png");
        Image algaImage2 = new Image("/imagenes/planta.png");
        algaImageViewOne.setImage(algaImage);
        algaImageViewTwo.setImage(algaImage);
        algaImageViewThree.setImage(algaImage2);
        algaImageViewFour.setImage(algaImage);
        algaImageViewFive.setImage(algaImage);
    
    }    
    
}
