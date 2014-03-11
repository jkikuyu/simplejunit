/*
 * @author Jude Kikuyu
 * Created on Feb 10, 2014
 */
package com.dai.junit.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class AddNumberImpl implements AddNumber {

    Logger logger = Logger.getLogger(AddNumberImpl.class);

    public int doAdd() {

        logger.debug( "Entering method, doAdd()" );

        return 0;
    }

    public static void main(String args[]) {

        String log4jXmlPath 
            = System.getProperty( "log4j.configuration" );

        System.out.println("log4jXmlPath = " + log4jXmlPath);

        if ( log4jXmlPath != null ) {

            DOMConfigurator.configure(log4jXmlPath);
        } 
        else {
            BasicConfigurator.configure();
        }

        AddNumber aNum = new AddNumberImpl();
        int total = aNum.doAdd();

        System.out.println("total = " + total);
    }
}
