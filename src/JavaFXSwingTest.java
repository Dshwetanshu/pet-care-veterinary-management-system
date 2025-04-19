import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import javax.swing.*;

public class JavaFXSwingTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // This will initialize the JavaFX runtime
            JFXPanel fxPanel = new JFXPanel();

            JFrame frame = new JFrame("JavaFX in Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.add(fxPanel);
            frame.setVisible(true);

            Platform.runLater(() -> {
                StackPane root = new StackPane();
                root.getChildren().add(new Label("Hello from JavaFX!"));

                Scene scene = new Scene(root, 400, 300);
                fxPanel.setScene(scene);
            });
        });
    }
}
