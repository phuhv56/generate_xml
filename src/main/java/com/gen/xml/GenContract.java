package com.gen.xml;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class GenContract {

    public static void main(String[] args) throws IOException {
        genContract();
    }

    public static void genContract() throws IOException {

        String xml = "<Row>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "    <Cell ss:StyleID=\"s64\"><Data ss:Type=\"String\">%s</Data><NamedCell\n" +
                "      ss:Name=\"A\"/></Cell>\n" +
                "   </Row>\n";
        String file = "/Users/gem/Contract20191006.xml";
        FileOutputStream fos = new FileOutputStream(file, true);
        DataOutputStream outStream = new DataOutputStream(new BufferedOutputStream(fos));
        outStream.write(Template.header.getBytes());
        for (int i = 2500000; i <= 2501000; i++) {
            String value = String.format(xml, genId(i), genFullName(),
                    "88" + genZipCode(), genName(), genName(),
                    genPhone(),
                    genName() + "@gmail.com",
                    genName() + ".com/url/link/net", genDate(), genName() + " " + genName(),
                    getGender(),
                    genBirthday(),
                    genName()
            );
            outStream.write(value.getBytes());
        }

        outStream.write(Template.footer.getBytes());

        outStream.close();
        System.out.println(file);
    }

    private static String genPhone() {
        List<String> list = new ArrayList<String>();
        list.add("0988777441");
        list.add("0988777223");
        list.add("0988777332");
        list.add("0988777334");
        list.add("0988777339");
        list.add("0988777338");
        list.add("0988777337");
        list.add("0988777336");
        list.add("0988777335");
        return getRandomList(list);
    }

    public static String genId(int i) {
        return String.format("%08d", i);
    }

    public static String genFullName() {
        List<String> list = new ArrayList<String>();
        list.add("John Wick");
        list.add("Captain America");
        list.add("Dinatalee");
        list.add("Thunder Thor");
        list.add("Jarvics");
        list.add("Cameliaa");
        list.add("Gankplank");
        list.add("Olaf");
        list.add("Shyvana");
        list.add("Sivir");
        return getRandomList(list);
    }

    public static String getRandomList(List<String> list) {
        final java.util.Random random = new java.util.Random();
        //0-4
        int index = random.nextInt(list.size());
        return list.get(index);

    }

    public static String genName() {
        // class variable
        final String pre = "BHKLMNCDGTVPQRS";
        final String lexicon = "AEIOU";
        final String suf = "XYZW";

        final java.util.Random rand = new java.util.Random();

        StringBuilder builder = new StringBuilder();
        builder.append(pre.charAt(rand.nextInt(pre.length())));
        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        builder.append(suf.charAt(rand.nextInt(suf.length())));
        return builder.toString();
    }

    public static String getGender() {
        // class variable
        final String pre = "FM";

        final java.util.Random rand = new java.util.Random();

        StringBuilder builder = new StringBuilder();
        builder.append(pre.charAt(rand.nextInt(pre.length())));
        return builder.toString();
    }


    public static String genZipCode() {
        // class variable
        final String lexicon = "0123456789";

        final java.util.Random rand = new java.util.Random();

        StringBuilder builder = new StringBuilder();

        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
        builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));

        return builder.toString();
    }

    public static String genDate() {
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1950, 2000);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.YEAR) + "/" + (String.format("%02d", gc.get(gc.MONTH) + 1)) + "/" + String.format("%02d", gc.get(gc.DAY_OF_MONTH));
    }

    public static String genBirthday() {
        List<String> list = new ArrayList<String>();
        list.add("1994/02/08");
        list.add("1992/02/08");
        list.add("1993/02/08");
        list.add("1997/02/08");
        list.add("1999/02/08");
        list.add("1994/02/08");

        return getRandomList(list);
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
