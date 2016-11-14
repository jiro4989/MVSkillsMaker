package strategy;

import application.Skill;
import javafx.scene.control.TableView;

public class FormulaColumnStrategy extends ColumnStrategy {
  public FormulaColumnStrategy(TableView<Skill> tableView, int rowIndex) {
    super();
    this.tableView = tableView;
    this.rowIndex = rowIndex;
  }

  @Override
  public Object getValue() {
    return tableView.getItems().get(rowIndex).formulaProperty().get();
  }

  @Override
  public void setValue(Object value) {
    tableView.getItems().get(rowIndex).setFormula((String) value);
  }
}
