package no.tornado;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.controlsfx.control.SegmentedButton;

import java.io.IOException;

/**
 * A simple JavaFX application with a dependency on ControlsFX. Nothing interesting here :)
 */
public class FxlDemo extends Application {
	public void start(Stage stage) throws Exception {
		stage.setTitle("hernad-test open");
		stage.initStyle(StageStyle.UNDECORATED);

		Label label = new Label(stage.getTitle());
		label.setStyle("-fx-font-size: 25");

		// Alibi for including ControlsFX Dependency :)
		SegmentedButton fxcontrol = new SegmentedButton(new ToggleButton("One"), new ToggleButton("Two"), new ToggleButton("Three"));

		Button exitButton = new Button("Run");
		exitButton.setStyle("-fx-font-weight: bold");
		//exitButton.setOnAction(event -> Platform.exit());
		exitButton.setOnAction( event -> this.runExec() );
		VBox root = new VBox(label, fxcontrol, exitButton);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		root.setPadding(new Insets(25));
        root.setStyle("-fx-border-color: lightblue");

		stage.setScene(new Scene(root));
		stage.show();
	}

	private void runExec() {

		ProcessBuilder	 processBuilder;
		processBuilder = new ProcessBuilder("open", "/Users/ernadhusremovic/F18/F18_knowhow/F18");
		try {
			processBuilder.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*



 */