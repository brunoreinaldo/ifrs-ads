package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrincipalController {

    @FXML
    private TableView<?> tabela;

    @FXML
    private TableColumn<?, ?> colunaNome;

    @FXML
    private TableColumn<?, ?> colunaSobrenome;

    @FXML
    private Label labelNome;

    @FXML
    private Label labelSobrenome;

    @FXML
    private Label labelEmail;

    @FXML
    private Label labelCurso;

    @FXML
    private Button btnAdicionar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnDeletar;

    @FXML
    void handleBtnAdicionar(ActionEvent event) {

    }

    @FXML
    void handleBtnEditarAluno(ActionEvent event) {

    }

    @FXML
    void handleBtnExcluirAluno(ActionEvent event) {

    }

}
