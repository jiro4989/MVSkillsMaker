package application.tableview.strategy.cell;

import application.tableview.Skill;
import javafx.scene.control.TableView;

public class Message1ColumnStrategy extends ColumnStrategy {
  public Message1ColumnStrategy(TableView<Skill> tableView, int rowIndex) {
    super();
    this.tableView = tableView;
    this.rowIndex = rowIndex;
  }

  @Override
  public Object getValue() {
    return tableView.getItems().get(rowIndex).message1Property().get();
  }

  @Override
  public void setValue(Object value) {
    tableView.getItems().get(rowIndex).message1Property().set((String) value);
  }

  @Override
  public boolean isInvokable(Object value) {
    return true;
  }

  @Override
  public String defaultValue(String value) {
    return null;
  }
}
