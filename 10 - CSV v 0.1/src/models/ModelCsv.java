package models;

import java.io.*;

/**
 *
 * @author Norberto
 */
public class ModelCsv {

    private String base;
    private String path;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Metodo que guarda el texto obtenido del metodo text en un archivo .CSV
     *
     * @param path Ruta del archivo
     * @param message Texto que se guardara en el archivo .csv
     */
    public void openBase(String message, String path) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, true);
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                System.out.println("///////////////////////////////////////////");
                System.out.println(message);
                printWriter.println(message);
                printWriter.close();
            }
        } catch (IOException err) {
            System.err.println("error " + err.getMessage());
        }
    }

    /**
     * Metodo que guardara la cadena obtenida en el archivo csv
     *
     * @param name Nombre que se obtiene de jtfName
     * @param email Email que se obtiene de jtfEmail
     * @return
     */
    public String text(String name, String email) {
        String file = name + "," + email + "\n";
        System.out.println(file);
        return file;
    }
}
