module client.app {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.rmi;
    requires java.desktop;
    requires remote.obj;

    exports sudoku;
    exports sudoku.services;
    exports sudoku.servicesImpls;
    exports sudoku.controllers;
}