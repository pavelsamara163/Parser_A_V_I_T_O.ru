package Parser;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserSayt {


    public static void main(String args[]) throws IOException {

            List<parser> parserList = new ArrayList<>();
            String arg = "?p=";

            for(int i = 0; i < 1;i++) {
                Document document = Jsoup.connect("https://m.avito.ru/samara/avtomobili" + arg + i).get();

                Elements h3Elements = document.getElementsByAttributeValue("class", "b-item js-catalog-item-enum ");

                h3Elements.forEach(h3Element -> {
                    Element element = h3Element;
                    String url = element.getElementsByClass("item-link").attr("href");
                    String title = element.child(0).getElementsByAttributeValue("class", "item-add-date").text();
                    parserList.add(new parser(url, title));
                });
               // parserList.forEach(System.out::println);
            }

                HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
                HSSFSheet hssfSheet = hssfWorkbook.createSheet("Проверка");


                int rowNum = 0;

                Row row = hssfSheet.createRow(rowNum);
                row.createCell(1).setCellValue("Автомобиль");
                row.createCell(2).setCellValue("Цена");
                row.createCell(3).setCellValue("Адресс");
                row.createCell(4).setCellValue("Дата");
                row.createCell(5).setCellValue("Бла-Бла");


                for (parser parserSayt : parserList) {
                    try {
                        createSheetHeader(hssfSheet, ++rowNum, parserSayt);
                    } catch (IOException e) {
                        System.out.println("Нихуя не записал");
                        e.printStackTrace();
                    }
                    try{
                        FileOutputStream out = new FileOutputStream(new File("C:\\Auto_Samara\\Samara.xls"));
                        hssfWorkbook.write(out);

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Обновил файл");
                    }

                    System.out.println("Excel файл успешно создан!");

                }


        }

private static void createSheetHeader(HSSFSheet sheet, int rowNum, parser parserSayt) throws IOException {
        Row row = sheet.createRow(rowNum);

        row.createCell(1).setCellValue(parserSayt.getName());
        row.createCell(2).setCellValue(parserSayt.getUrl());

        }
    }

//System.setProperty("webdriver.gecko.driver","C:\\Users\\Павел\\Desktop\\SeleniumWebDriver\\geckodriver.exe");
class parser{
    public String url;
    public String name;

    public parser(String url,String name){
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public String toString() {
        return "parser{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }*/
}






