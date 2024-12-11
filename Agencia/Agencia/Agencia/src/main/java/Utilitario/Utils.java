package Utilitario;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    static NumberFormat formatandovalores = new DecimalFormat("R$ #,##0.00");
    
    public static String doubleToString(Double valor){
    return formatandovalores.format(valor);
}
    
}
