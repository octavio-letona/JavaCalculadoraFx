/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.octavioletona.system;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class Principal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
       // nodos
       VBox raiz = new VBox();
       //escena
       Scene escena = new Scene (raiz);
       // caragra escena y mostrar escenario ´principal
       escenarioPrincipal.setTitle("Calculadora de Octavio");
       escenarioPrincipal.setScene(escena);
       escenarioPrincipal.show();
       
    }
    
}
