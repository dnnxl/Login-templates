package simple_login_1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login implements Initializable{

    @FXML private TextField password_textfield;
	@FXML private TextField user_textfield;
	@FXML private Button signIn_button;

    public void signIn()
	{
        String user = this.user_textfield.getText().toString();
        String password = this.password_textfield.getText().toString();
        System.out.println("User " + user);
        System.out.println("Password " + password);
    }
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
