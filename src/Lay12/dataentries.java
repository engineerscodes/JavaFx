package Lay12;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.*;

import java.util.ArrayList;

public class dataentries  extends Application
{   String sem2[]={"Eng","Maths","Oops"};
    String sem1[]={"chem","Maths","Cse"};
    String cgpay;
    String getsem;
    String mark;
    ArrayList s1=new ArrayList();
    ArrayList s2=new ArrayList();
   public static void main(String ...args)
   {launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        HBox s=new HBox();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);
        grid.setVgap(5);
        grid.setHgap(5);

        Text username = new Text("Name:");
        grid.add(username, 0, 0);

        TextField text = new TextField();
        text.setPrefColumnCount(10);
        grid.add(text, 1, 0);

        Text password = new Text("Course:");
        grid.add(password, 0, 1);
         /*
        TextField text2 = new TextField();
        text2.setPrefColumnCount(10);
        grid.add(text2, 1, 1); */
        String couse[]={"Btech","Mtech","VSB"};
        ComboBox combo_box =
                new ComboBox(FXCollections.observableArrayList(couse));
        grid.add(combo_box,1,1);


        Text reg=new Text("Reg :");
        grid.add(reg,0,2);
        TextField textreg=new TextField();
        textreg.setPrefColumnCount(10);
        grid.add(textreg,1,2);
       // Sem
        Text sem=new Text("SEM :");
        grid.add(sem,0,3);
        TextField textsem=new TextField();
        textsem.setPrefColumnCount(10);
        grid.add(textsem,1,3);

        //
        Button b=new Button("Click to Save");

       // b.setPrefWidth(200);
       // b.setPrefHeight(100);
        grid.add(b,1,4,3,4);
        grid.setStyle("-fx-background-color: #D8BFD8;");

        //event on button



        //
        s.getChildren().add(grid);

        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid2.setMinSize(300, 300);
        grid2.setVgap(5);
        grid2.setHgap(5);
        grid2.setStyle("-fx-background-color: #87CEFA;");
        grid2.setVisible(false);

        Button b2=new Button("Caluate CGPA");
        grid2.add(b2,1,4,3,4);
         s.getChildren().add(grid2);
         //thrid panel

        StackPane grid3 = new StackPane();
        grid3.setStyle("-fx-background-color: #CD5C5C;");
        grid3.setMinSize(300, 300);
         s.getChildren().add(grid3);
         grid3.setVisible(false);

         Text res=new Text("Your CGPAY IS :"+cgpay);
          grid3.getChildren().add(res);

        //

        b.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("click");
                getsem=textsem.getText();

                if(getsem.equals("1"))
                {
                    for(int i=0;i<3;i++)
                    {
                        Text sub=new Text(sem1[i]);
                        grid2.add(sub,0,i);
                        TextField field=new TextField();
                        field.setPrefColumnCount(10);
                        s1.add(field);
                        grid2.add(field,1,i);
                    }
                }
                else
                {
                    for(int i=0;i<3;i++)
                    {
                        Text sub=new Text(sem2[i]);
                        grid2.add(sub,0,i);
                        TextField field=new TextField();
                        field.setPrefColumnCount(10);
                        s2.add(field);
                        grid2.add(field,1,i);
                    }
                }
                 grid2.setVisible(true);

            }
        });
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("CGPA");
                grid3.setVisible(true);
                 int sum=0;
                if(textsem.getText().equals("1"))
                {

                       TextField temp;
                       for(int i=0;i<3;i++)
                       {
                           temp=(TextField)s1.get(i);
                           String d=temp.getText();
                           sum=sum+Integer.parseInt(d);
                       }
                    double sumd=(double)sum/150;
                    cgpay=sumd*100+"";
                       res.setText("Your CGPAY IS :"+cgpay);
                       System.out.println(sum);
                }else{
                    TextField temp;
                    for(int i=0;i<3;i++)
                    {
                        temp=(TextField)s2.get(i);
                        String d=temp.getText();
                        sum=sum+Integer.parseInt(d);
                    }
                      double sumd=(double)sum/150;
                  //  sum=sum*100;
                    cgpay=sumd*100+"";
                    res.setText("Your CGPAY IS :"+cgpay);
                    System.out.println(sum);
                }

            }
        });


        Scene sp=new Scene(s);
        primaryStage.setScene(sp);
        primaryStage.show();

    }
}
