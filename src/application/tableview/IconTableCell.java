package application.tableview;

import java.io.File;

import application.tableview.icon.IconIndexChooserController;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class IconTableCell extends TableCell<Skill, String> {
  private static File iconImageFile;
  private HBox hBox;
  private ImageView imageView;
  private Label label;

  public IconTableCell() {
    super();
    imageView = new ImageView();
    label = new Label();

    hBox = new HBox();
    hBox.setSpacing(10);
    hBox.getChildren().add(imageView);
    hBox.getChildren().add(label);
  }

  @Override
  protected void updateItem(String item, boolean empty) {
    super.updateItem(item, empty);
    if (item != null) {
      int iconIndex = Integer.parseInt(item);
      Image image = IconIndexChooserController.getSelectedIconImageView(iconImageFile, iconIndex);
      imageView.setImage(image);
      label.setText(item);
      setGraphic(hBox);
    }
  }

  static void setIconImageFile(File file) {
    iconImageFile = file;
  }
}
