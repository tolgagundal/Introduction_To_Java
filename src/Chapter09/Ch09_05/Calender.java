package Chapter09.Ch09_05;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
    public static void main(String[] args) {

        GregorianCalendar object = new GregorianCalendar();

        System.out.println(object.get(GregorianCalendar.YEAR) +"/"+
                object.get(GregorianCalendar.MONTH) +"/"+
                object.get(GregorianCalendar.DAY_OF_MONTH));

        object.setTimeInMillis(1234567898765L);

        System.out.println(object.get(GregorianCalendar.YEAR) +"/"+
                object.get(GregorianCalendar.MONTH) +"/"+
                object.get(GregorianCalendar.DAY_OF_MONTH));


    }



}
