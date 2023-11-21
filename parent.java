package com.example.ics108project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class parent extends Application {
    //borders
    BorderPane borderPane= new BorderPane();
    GridPane center = new GridPane();
    //buttons and textfield for the top horizontal
    Label nameLabel = new Label("Name:");
    TextField topText = new TextField();
    Button addButton = new Button("Add");
    Button deleteButton = new Button("Delete");
    Button lookupButton = new Button("Lookup");
    // buttons and textfields for the vertical side
    Button changeStatus = new Button("Change Status");
    Button changePicture = new Button("Change Picture");

    Button addFriend = new Button("Add Friend");
    TextField changePicText = new TextField();
    TextField changeStatusText = new TextField();
    TextField addFriendText= new TextField();

    @Override
    public void start(Stage stage) throws IOException {
        //borders
        center.setStyle("-fx-background-color: #f6e5e5;");
        //center.setPrefSize(10, 50);
        //center.setMinWidth(0);
        //center.setMinHeight(0);

        center.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);

        nameLabel.setMinWidth(100);
        nameLabel.setMinHeight(100);


        addFriendText.setMinWidth(100);
        changePicText.setMinWidth(100);
        changeStatusText.setMinWidth(100);
        changePicture.setMinWidth(300);
        changeStatus.setMinWidth(300);
        addFriend.setMinWidth(300);

        // setonAction statements
        addButton.setOnAction(new ButtonHandler());
        deleteButton.setOnAction(new ButtonHandler());
        lookupButton.setOnAction(new ButtonHandler());
        changeStatus.setOnAction(new ButtonHandler());
        changePicture.setOnAction(new ButtonHandler());
        addFriend.setOnAction(new ButtonHandler());

        //setting up
        VBox vertical = new VBox(30, new VBox(addFriendText, addFriend), new VBox(changePicText, changePicture), new VBox(changeStatusText, changeStatus));
        vertical.setStyle("-fx-background-color: #dad7d7;");
        vertical.setPrefSize(300, 100);
        vertical.setAlignment(Pos.CENTER);
        vertical.setPadding(new Insets(0, 10, 0, 10));
        HBox horizontal = new HBox(10, nameLabel,topText, addButton, deleteButton, lookupButton);
        horizontal.setAlignment(Pos.CENTER);
        horizontal.setStyle("-fx-background-color: #dad7d7;");
        horizontal.setPrefSize(100, 50);

        borderPane.setLeft(vertical);
        borderPane.setTop(horizontal);
        //borderPane.setBottom(center);
        //borderPane.setBottom(anchorPane);
        //BorderPane.setAlignment(anchorPane, Pos.BOTTOM_RIGHT);
        Label labelName = new Label("Profile Name: ");
        ImageView profileDefault = new ImageView(new Image("C:\\Users\\denaa\\JavaProjects231\\ICS108-project\\src\\main\\java\\com\\example\\ics108project\\defaultPIC.png"));
        Label statusDefault = new Label("No current status");


        profileDefault.setFitWidth(300);
        profileDefault.setPreserveRatio(true);
        labelName.setPadding(new Insets(10));
        //profileDefault.setPadding(new Insets(10));
        statusDefault.setPadding(new Insets(10));
        StackPane imagePane = new StackPane();
        imagePane.setPadding(new Insets(10));
        imagePane.getChildren().add(profileDefault);
        GridPane.setConstraints(labelName, 0, 0);
        GridPane.setConstraints(imagePane, 0, 2);
        GridPane.setConstraints(statusDefault, 0, 4);



        center.getChildren().addAll(labelName, profileDefault, statusDefault);
        borderPane.setCenter(center);





        Scene scene = new Scene(borderPane,1100, 800);
        stage.setTitle("FaceLite");
        stage.setScene(scene);
        stage.show();
    }
    public class ButtonHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
            if (e.getSource() == addButton){
                System.out.print("The add button was clicked");
            }
            else if (e.getSource() == deleteButton){
                System.out.print("The delete button was clicked");
            }
            else if (e.getSource()==lookupButton) {
                System.out.println("the lookup button was clicked");
            }
            else if (e.getSource()==changeStatus) {
                System.out.println("the status button was clicked");
            }
            else if(e.getSource()==changePicture ){
                System.out.println("the pic button was clicked");
            }
            else if (e.getSource()==addFriend) {
                System.out.println("the add button was clicked");
            }
        }
    }




    public static void main(String[] args) {
        launch(args);
    }
}