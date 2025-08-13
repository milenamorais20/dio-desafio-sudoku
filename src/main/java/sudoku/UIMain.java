package sudoku;

import sudoku.ui.custom.screen.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UIMain {
    public static void main(String[] args) {
        final var gameConig = Stream.of(args)
                .collect(Collectors
                        .toMap(k -> k.split(";")[0],
                                v -> v.split(";")[1]
                        ));
        var mainScreen = new MainScreen(gameConig);
        mainScreen.buildMainScreen();
    }
}
