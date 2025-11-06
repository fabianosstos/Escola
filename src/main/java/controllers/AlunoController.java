package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import models.Aluno;

public class AlunoController {

    @FXML
    private TextField txtNome, txtDataNascimento, txtSerie, txtTurma;

    @FXML
    private Button btnSalvar;

    @FXML
    private void salvarAluno() {
        Aluno aluno = new Aluno(
            txtNome.getText(),
            txtDataNascimento.getText(),
            txtSerie.getText(),
            txtTurma.getText()
        );
        System.out.println("Aluno cadastrado: " + aluno.getNome());
        limparCampos();
    }

    private void limparCampos() {
        txtNome.clear();
        txtDataNascimento.clear();
        txtSerie.clear();
        txtTurma.clear();
    }
}
