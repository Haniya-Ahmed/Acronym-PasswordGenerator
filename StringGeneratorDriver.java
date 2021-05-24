/**
	This program generates acronyms and passwords.
	@author Haniya Ahmed #3675130
*/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.text.NumberFormat; 

public class StringGeneratorDriver extends Application
{
	private TextField inputfield;
	private Button reset;
	private Button password;
	private Button acroynm;
	private Label result;


	public static void main(String[] args)
	{
	  launch(args);
	}


	public void start(Stage primaryStage)
   	{	
		FlowPane pane = new FlowPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(50);
		pane.setVgap(60);

		Label infolabel = new Label("Enter a Title or Phrase:");
		pane.getChildren().add(infolabel);

		inputfield = new TextField();
	        inputfield.setPrefWidth(450);
		pane.getChildren().add(inputfield);

		acroynm = new Button("Generate Acroynm");
		acroynm.setOnAction(this::processButton);
		pane.getChildren().add(acroynm);


		password = new Button("Generate Password");
		password.setOnAction(this::processButton);
		pane.getChildren().add(password);


		reset = new Button("Reset");
		reset.setOnAction(this::processResetButton);
		pane.getChildren().add(reset);

		result = new Label("Let's create an acroynm or password!");
		pane.getChildren().add(result);

		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("String Generator");
        	primaryStage.setScene(scene);
        	primaryStage.show();


	}	


	public void processResetButton(ActionEvent event)
	{
		inputfield.setText("");
		result.setText("Let's create an acroynm or password!");
		
	}

	public void processButton(ActionEvent event)
	{
	  if(event.getSource() == acroynm)
	  {
	    result.setText(StringGenerator.generateAcronym(inputfield.getText()));
	  }

	 else if(event.getSource() == password)
	 {
	    result.setText(StringGenerator.generatePassword(inputfield.getText()));
	 }
	
	}
}
