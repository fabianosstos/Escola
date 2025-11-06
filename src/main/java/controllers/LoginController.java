package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import utils.AlertUtils;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private void autenticar() {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        if (usuario.equals("admin") && senha.equals("123")) {
            AlertUtils.showInfo("Login", "Bem-vindo, " + usuario + "!");
            ((Stage) btnEntrar.getScene().getWindow()).close();
        } else {
            AlertUtils.showInfo("Erro", "Usuário ou senha inválidos.");
        }
    }
}
