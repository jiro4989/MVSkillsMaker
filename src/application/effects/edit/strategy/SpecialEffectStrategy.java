package application.effects.edit.strategy;

import javafx.scene.control.ComboBox;

class SpecialEffectStrategy extends EditStrategy {
  private ComboBox<String> comboBox;

  public SpecialEffectStrategy() {
  }

  public SpecialEffectStrategy(ComboBox<String> aComboBox) {
    comboBox = aComboBox;
  }


  @Override
  String formatToContentText(int codeId, int dataId, double value1, double value2) {
    return "逃げる";
  }

  @Override
  String convertJsonString() {
    return null;
  }

  @Override
  void setValue(int dataId, double value1, double value2) {
    comboBox.getSelectionModel().select(dataId);
  }
}
