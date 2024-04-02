package org.example.pruebagui;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Populate {

    public static void construirCredenciales(FileWriter fw, String usuario, String password) throws IOException {
        fw.write(usuario);
        fw.write(":");
        fw.write(Cifrar.palabraCifrada(password));
        fw.write("\n");
    }
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/main/resources/org/example/pruebagui/credenciales.txt");
            construirCredenciales(fw, "admin", "1234");
            construirCredenciales(fw, "test", "hola.1234");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
