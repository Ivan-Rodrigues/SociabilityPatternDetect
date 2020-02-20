package com.esper.Esper.util;

import com.esper.Esper.model.SocialUpdate;

public class ContextDriftUtil {

    public static Boolean isContext(String context, int typeContext, SocialUpdate socialUpdate){
        Boolean testContext = false;
        if (typeContext == 0){
            if (context.equals(socialUpdate.getCtxDay().toUpperCase()+"_")){
                testContext = true;
            }
        }else if (typeContext == 1){
            if ( context.equals(socialUpdate.getCtxWeek().toUpperCase()+"_")){
                testContext = true;
            }
        }
        return testContext;
    }
}
