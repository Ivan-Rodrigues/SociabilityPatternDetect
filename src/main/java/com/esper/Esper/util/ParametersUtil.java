
package com.esper.Esper.util;

import com.esper.Esper.enums.ContextEnum;

/**
 * A class of static methods that return EPLQueries
 * @author ivanrmoura
 */
public class ParametersUtil {


    public static String CONTEXT = ContextEnum.THURSDAY_.toString();

    //Parâmetros da arquitetura
    public static int SNAPSHOT = 3;
    public static double PARAM_SLOT = 0.5;
    public static double MIN_SUPP = 0.02;
    public static double NUM_SLOTS =  24 / PARAM_SLOT;
    public static double PHI = 0.7;

   //Ler dataset
    public static String UID = "u52";
    public static String WEEK = "Week5";
    public static String PATH = "dataset/pattern_u02.txt";
}
