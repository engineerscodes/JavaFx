package FAT;

import java.util.*;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import  javafx.scene.control.*;
import javafx.scene.image.*;

import javax.swing.*;

public class login extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane ap=new AnchorPane();
       // ap.setMaxSize(500,500);
        ap.setMinSize(700,700);
        Image img=new Image("nav.jpg");
        ImageView i=new ImageView(img);
        i.setFitHeight(25);
        i.setFitWidth(25);
        Button b=new Button("Click me",i);
       // b.setGraphic(i);
        b.setMinSize(50,50);
        b.setLayoutX(10);
        b.setLayoutY(50);
        b.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                 System.out.println("Naveen");
            }
        });

        RadioButton r1=new RadioButton("Java");
        r1.setLayoutX(10);
        r1.setLayoutY(110);
        RadioButton r2=new RadioButton("Phython");
        ap.getChildren().addAll(b,r1,r2);
         r2.setLayoutX(70);
         r2.setLayoutY(110);
        ToggleGroup gt=new ToggleGroup();
        r1.setToggleGroup(gt);
        r2.setToggleGroup(gt);
        CheckBox cb=new CheckBox("ACCEPT T & C ");
        cb.setLayoutX(150);
        cb.setLayoutY(135);
        ap.getChildren().add(cb);
        Label l1=new Label("USER NAME :");
        l1.setLayoutX(10);
        l1.setLayoutY(180);
        l1.setWrapText(true);
        TextField tf=new TextField();

        tf.setLayoutX(120);
        tf.setLayoutY(180);
        Label l2=new Label("Password :");
        l2.setLayoutX(10);
        l2.setLayoutY(230);
        PasswordField pd=new PasswordField();
        pd.setLayoutX(120);
        pd.setLayoutY(230);
        Slider sl=new Slider(10,50,25);
        sl.setMajorTickUnit(5);
        sl.setShowTickMarks(true);
        sl.setShowTickLabels(true);
       // sl.showTickLabelsProperty();
       // sl.showTickMarksProperty();
        sl.setLayoutX(25);
        sl.setLayoutY(280);

        ComboBox<String> cbb=new ComboBox<>();
        ObservableList <String> list=cbb.getItems();
        list.add("Java");
        list.add("C++");
        list.add("Pyhton");
        cbb.setLayoutX(50);
        cbb.setLayoutY(350);
         ap.getChildren().addAll(tf,l1,l2,pd,sl,cbb);
        Scene sc=new Scene(ap);
        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
