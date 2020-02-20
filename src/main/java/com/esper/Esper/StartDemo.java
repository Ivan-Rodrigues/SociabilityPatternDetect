
package com.esper.Esper;

import com.esper.Esper.builder.SociabilityPattern;
import com.esper.Esper.enums.ContextEnum;
import com.esper.Esper.util.EventGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point for the Demo. Run this from your IDE, or from the command line using 'mvn exec:java'.
 */
public class StartDemo {

    /** Logger */
    private static Logger LOG = LoggerFactory.getLogger(StartDemo.class);

    
    /**
     * Main method - start the Demo!
     */
    public static void main(String[] args) {

        LOG.debug("Starting...");

        // Load spring config
        //ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "application-context.xml" });
        //BeanFactory factory = (BeanFactory) appContext;
        // Start Demo
        //EventGenerator generator = (EventGenerator) factory.getBean("eventGenerator");
        //generator.startSending();
        EventGenerator generator = new EventGenerator();
        generator.receiverStream();

        SociabilityPattern sociabilityPattern = new SociabilityPattern
                .Builder(ContextEnum.MONDAY_.toString(), 50.0)
                .setRootTopic("com/lsdi/sociability")
                .setAbnormalBehavior(true)
                .setChangeBehavior(true)
                .build();



    }

}
