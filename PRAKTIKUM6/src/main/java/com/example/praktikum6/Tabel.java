package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("Nama");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getItems().add(new Mahasiswa(1, "123456", "Gandul"));
        tabel.getItems().add(new Mahasiswa(2, "234567", "Agus"));
        tabel.getItems().add(new Mahasiswa(3, "345678", "Udin"));
        tabel.getItems().add(new Mahasiswa(4, "456789", "Tiara"));
        tabel.getItems().add(new Mahasiswa(5, "567890", "Shandy"));
        tabel.getItems().add(new Mahasiswa(6, "678901", "Kurama"));
        tabel.getItems().add(new Mahasiswa(7, "789012", "Syam"));
        tabel.getItems().add(new Mahasiswa(8, "890123", "Sasuke"));
        tabel.getItems().add(new Mahasiswa(9, "901234", "Naruto"));
        tabel.getItems().add(new Mahasiswa(10, "012345", "Nagato"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
