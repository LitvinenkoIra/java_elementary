package com.java.utils.usage;

import com.java.courses.utils.Utils;
import org.joda.time.DateTime;

public class UtilsTest {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        Utils utils = new Utils();
        utils.printArray(array);

        DateTime dateTime = new DateTime();
        int dateOfMonth = dateTime.getDayOfMonth();

        System.out.println(dateOfMonth);
    }
}
