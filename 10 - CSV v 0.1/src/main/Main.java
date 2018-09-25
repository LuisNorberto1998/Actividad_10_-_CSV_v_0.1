package main;

import models.ModelCsv;
import views.ViewCsv;
import controllers.ControllerCsv;
/**
 *
 * @author Norberto
 */
public class Main {
    private static ModelCsv modelCsv;
    private static ViewCsv viewCsv;
    private static ControllerCsv controllerCsv;
    
    public static void main(String[] args) {
        modelCsv = new ModelCsv();
        viewCsv = new ViewCsv();
        controllerCsv = new ControllerCsv(modelCsv, viewCsv);
    }

}
