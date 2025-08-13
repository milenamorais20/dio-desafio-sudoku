package sudoku.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGmeButton extends JButton {

    public FinishGmeButton(final ActionListener actionListener) {
        this.setText("Concluir");
        this.addActionListener(actionListener);
    }
}
