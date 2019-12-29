package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	private double xOffset;
	private double yOffset;

	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			Parent root = FXMLLoader.load(getClass().getResource("../simple_login_1/login.fxml"));
		    Scene scene = new Scene(root);
		    primaryStage.setResizable(false);

		    root.setOnMousePressed(new EventHandler<MouseEvent>() 
		    {
	            @Override
	            public void handle(MouseEvent event) 
	            {
	                xOffset = event.getSceneX();
	                yOffset = event.getSceneY();
	            }
	        });
		    primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.setScene(scene);
			primaryStage.show();
			root.setOnMouseDragged(new EventHandler<MouseEvent>() 
			{
	            @Override
	            public void handle(MouseEvent event) 
	            {
	            	primaryStage.setX(event.getScreenX() - xOffset);
	            	primaryStage.setY(event.getScreenY() - yOffset);
	            }
	        });
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
