package application.tableview.strategy;

import application.tableview.Skill;
import javafx.scene.control.TableView;

public class AnimationIdColumnStrategy extends ColumnStrategy {
  public AnimationIdColumnStrategy(TableView<Skill> tableView, int rowIndex) {
    super();
    this.tableView = tableView;
    this.rowIndex = rowIndex;
  }

  @Override
  public Object getValue() {
    return tableView.getItems().get(rowIndex).animationIdProperty().get();
  }

  @Override
  public void setValue(Object value) {
    String strValue = (String) value;
    if (strValue.matches(NUMBER_REGEX)) {
      tableView.getItems().get(rowIndex).animationIdProperty().set(strValue);
    }
  }

  @Override
  public boolean isInvokable(Object value) {
    String strValue = (String) value;
    return strValue.matches(NUMBER_REGEX);
  }
}
