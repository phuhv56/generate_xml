package com.gen.xml;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.gen.xml.GenContract.genId;

public class Main {
    public static void main(String[] args) throws IOException {
        genDebtHistories();
    }

    public static void genDebtHistories() throws IOException {
        String xml = "<Row>\n" +
                "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">%s</Data><NamedCell ss:Name=\"C_\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"C_\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s63\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"C_\"/></Cell>\n" +
                "   </Row>\n";
        String file = "/Users/gem/Debt20190909.xml";
        FileOutputStream fos = new FileOutputStream(file, true);
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
        outStream.write(Template.headerd.getBytes());
        for (int i = 1; i <= 25000; i++) {
            int total = genInt();
            String amount = "0";
            if (total > 0) {
                amount = String.valueOf(total * 100000);
            }
            String value = String.format(xml, total, amount, genId(i));
            outStream.write(value.getBytes());
        }

        outStream.write(Template.footerd.getBytes());

        outStream.close();
        System.out.println(file);
    }

    private static int genInt() {
        final java.util.Random random = new java.util.Random();
        int index = random.nextInt(2);
        return index;
    }

}
