package dev.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Parser {
    
    public static Date getDateArgument(int position, String input) throws Exception {

        String token = input.split(" ")[position];

        return new SimpleDateFormat("dd/MM/yyyy")
                    .parse(token);

    }

    public static int getPositiveIntegerArgument(int position, String input) throws Exception {

        try {

            return Integer.parseInt(input.split(" ")[position]);

        } catch (Exception e) {
    
            throw e;

        }

    }

}
