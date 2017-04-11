package Parser;

import com.gargoylesoftware.htmlunit.WebClient;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Gamebomb {
            private WebDriver driver;
            private String baseUrl;
            private boolean acceptNextAlert = true;
            private StringBuffer verificationErrors = new StringBuffer();
            protected String FILE_NAME = "C:\\Auto_Samara\\Auto-Samara.xlsx";
           // private String PROXY = "104.236.203.134:8080";

     class parser {
                private String url;
                public String name;
                public String price;
                public String timeCity;


                private parser(String url,String name,String price,String timeCity){
                    this.name = name;
                    this.url = url;
                    this.price = price;
                    this.timeCity = timeCity;

                }



    public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }



               @Override
                public String toString() {
                    return "parser{" +
                            "url='" + url + '\'' +
                            ", name='" + name + '\'' +
                            '}';
                }
            }

    @Before
            public void setUp() throws Exception {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Павел\\Desktop\\SeleniumWebDriver\\chromedriver.exe");
                 baseUrl = "https://m.avito.ru/samara/avtomobili";

       // org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
       /* proxy.setHttpProxy(PROXY)
                .setFtpProxy(PROXY)
                .setSslProxy(PROXY);*/
       // DesiredCapabilities cap = new DesiredCapabilities();
       // cap.setCapability(CapabilityType.PROXY, proxy);

                driver = new ChromeDriver(/*cap*/);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
            private void pars() throws IOException, InterruptedException {

                List<DataModel> mod = new ArrayList<>();
                String async = "?async";
                String sayt = "https://m.avito.ru";


                Document document = Jsoup.connect(driver.getCurrentUrl())
                        .ignoreContentType(true)
                        .get();


                Elements elementsShow = document.getElementsByAttributeValue("class", "b-content-main ");
                elementsShow.forEach(elShow -> {
                    Element elementShow = elShow;
                    String auto = "";
                    try {
                        Thread.sleep(200);
                        auto = elementShow.child(1).getElementsByAttributeValue("class", "single-item-header b-with-padding").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                         auto = "";
                        e.printStackTrace();

                    }
                    String param = "";
                    try {
                        Thread.sleep(200);
                        param = elementShow.child(1).getElementsByAttributeValue("class", "param").get(0).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param = "";
                        e.printStackTrace();
                    }
                    String param1 = "";
                    try {
                        Thread.sleep(200);
                        param1 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(1).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param1 = "";
                        e.printStackTrace();
                    }
                    String param2 = "";
                    try {
                        Thread.sleep(200);
                        param2 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(2).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param2 = "";
                        e.printStackTrace();
                    }
                    String param3 = "";
                    try {
                        Thread.sleep(200);
                        param3 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(3).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param3 = "";
                        e.printStackTrace();
                    }
                    String param4 = "";
                    try {
                        Thread.sleep(200);
                        param4 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(4).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param4 = "";
                        e.printStackTrace();
                    }
                    String param5 = "";
                    try {
                        Thread.sleep(200);
                        param5 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(5).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param5 = "";
                        e.printStackTrace();
                    }
                    String param6 = "";
                    try {
                        Thread.sleep(200);
                        param6 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(6).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param6 = "";
                        e.printStackTrace();
                    }
                    String param7 = "";
                    try {
                        Thread.sleep(200);
                        param7 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(7).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param7 = "";
                        e.printStackTrace();
                    }
                    String param8 = "";
                    try {
                        Thread.sleep(200);
                        param8 = elementShow.child(1).getElementsByAttributeValue("class", "param").get(8).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param8 = "";
                        e.printStackTrace();
                    }

                    String param_last = "";
                    try {
                        Thread.sleep(200);
                        param_last = elementShow.child(1).getElementsByAttributeValue("class", "param param-last").get(0).text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        param_last = "";
                        e.printStackTrace();
                    }
                    String price = "";
                    try {
                        Thread.sleep(200);
                        price = elementShow.child(1).getElementsByAttributeValue("class", "price-value").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        price = "";
                        e.printStackTrace();
                    }
                    String readAuto = "";
                    try {
                        Thread.sleep(200);
                        readAuto = elementShow.child(1).getElementsByAttributeValue("class", "description-preview").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        readAuto = "";
                        e.printStackTrace();
                    }
                    String personContact = "";
                    try {
                        Thread.sleep(200);
                        personContact = elementShow.child(1).getElementsByAttributeValue("class", "person-name js-person-name").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        personContact = "";
                        e.printStackTrace();
                    }
                    String contact = "";
                    try {
                        Thread.sleep(200);
                        contact = elementShow.child(1).getElementsByAttributeValue("class", "person-name person-contact-name").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        contact = "";
                        e.printStackTrace();
                    }
                    String item_date = "";
                    try {
                        Thread.sleep(100);
                        item_date = elementShow.child(2).getElementsByAttributeValue("class", "item-add-date").text();
                    } catch (IndexOutOfBoundsException | InterruptedException e) {
                        item_date = "";
                        e.printStackTrace();
                    }

                    System.out.println(auto);
                    System.out.println(param);
                    System.out.println(param1);
                    System.out.println(item_date);

                    String finalAuto = auto;
                    String finalParam = param;
                    String finalParam1 = param1;
                    String finalParam2 = param2;
                    String finalParam3 = param3;
                    String finalParam4 = param4;
                    String finalParam5 = param5;
                    String finalParam6 = param6;
                    String finalParam7 = param7;
                    String finalParam8 = param8;
                    String finalParam_last = param_last;
                    String finalPrice = price;
                    String finalReadAuto = readAuto;
                    String finalPersonContact = personContact;
                    String finalContact = contact;
                    String finalItemdata = item_date;


                    Elements elements = document.getElementsByAttributeValue("class", "person-action button button-solid button-blue button-large action-link link action-show-number\n" +
                            " js-action-show-number  ");
                    elements.forEach(el -> {
                        Element element = el.child(0);
                        String url = element.html();
                        String title = document.body().getElementsByAttributeValueContaining("class", "person-action button button-solid button-blue button-large action-link link action-show-number\n" +
                                " js-action-show-number  ").attr("href");


                        Document doc;
                        try {
                            doc = Jsoup.connect(sayt + title + async)

                                    .ignoreContentType(true)
                                    .userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.134 Safari/537.36")
                                    .referrer(driver.getCurrentUrl())
                                    .followRedirects(true)
                                    .get();

                            String number = doc.body().text().substring(10, 25);
                            mod.add(new DataModel(finalAuto, finalParam, finalParam1,
                                    finalParam2, finalParam3, finalParam4, finalParam5, finalParam6, finalParam7, finalParam8,
                                    finalParam_last, finalPrice, finalReadAuto,
                                    finalPersonContact, finalContact, finalItemdata, number));


                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                        for (DataModel dataModel : mod){
                            try {
                                writeToXLS(dataModel);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    System.out.println("Excel файл успешно создан!");
                });
}
    private synchronized void writeToXLS(DataModel dataModel) throws IOException {
        java.nio.file.Path p =  Paths.get(FILE_NAME);
        String fileName = p.toString();

        if (!Files.exists(p)) {
            Files.createFile(p);
            try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(new File(fileName)))) {
                Workbook workbook = new XSSFWorkbook();
                workbook.createSheet("Авито");
                workbook.write(fos);
                workbook.close();
            }
        }


        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File(fileName)));


            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            int rowCount = sheet.getPhysicalNumberOfRows();

            Font hssfFont = workbook.createFont();
            hssfFont.setBold(true);
            hssfFont.setColor(HSSFColor.BLACK.index);


            CellStyle style = workbook.createCellStyle();
            style.setFont(hssfFont);
            style.setAlignment(CellStyle.ALIGN_CENTER);
            style.setWrapText(true);

            Row row = sheet.createRow(rowCount);
            Row row1 = sheet.createRow(0);

            row1.createCell(0).setCellStyle(style);
            row1.getCell(0).setCellValue("Автомобиль");
            row1.createCell(1).setCellStyle(style);
            row1.getCell(1).setCellValue("Каробка");
            row1.createCell(2).setCellStyle(style);
            row1.getCell(2).setCellValue("Бак");
            row1.createCell(3).setCellStyle(style);
            row1.getCell(3).setCellValue("Привод");
            row1.createCell(4).setCellStyle(style);
            row1.getCell(4).setCellValue("Кузов");
            row1.createCell(5).setCellStyle(style);
            row1.getCell(5).setCellValue("Положение руля");
            row1.createCell(6).setCellStyle(style);
            row1.getCell(6).setCellValue("Владельцев");
            row1.createCell(7).setCellStyle(style);
            row1.getCell(7).setCellValue("Цвет");
            row1.createCell(8).setCellStyle(style);
            row1.getCell(8).setCellValue("Кузов ц/н");
            row1.createCell(9).setCellStyle(style);
            row1.getCell(9).setCellValue("Пробег");
            row1.createCell(10).setCellStyle(style);
            row1.getCell(10).setCellValue("Цена");
            row1.createCell(11).setCellStyle(style);
            row1.getCell(11).setCellValue("Информация");
            row1.createCell(12).setCellStyle(style);
            row1.getCell(12).setCellValue("Контакт");
            row1.createCell(13).setCellStyle(style);
            row1.getCell(13).setCellValue("Контакт2");
            row1.createCell(14).setCellStyle(style);
            row1.getCell(14).setCellValue("Дата");
            row1.createCell(15).setCellStyle(style);
            row1.getCell(15).setCellValue("Телефон");

            for (int cellIndex = 0; cellIndex < rowCount + 1; cellIndex++) {
                row.createCell(cellIndex);
                row.createCell(0).setCellValue(dataModel.getAuto());
                row.createCell(1).setCellValue(dataModel.getMotor());
                row.createCell(2).setCellValue(dataModel.getBak());
                row.createCell(3).setCellValue(dataModel.getPrivod());
                row.createCell(4).setCellValue(dataModel.getModel());
                row.createCell(5).setCellValue(dataModel.getRule());
                row.createCell(6).setCellValue(dataModel.getPtc());
                row.createCell(7).setCellValue(dataModel.getColor());
                row.createCell(8).setCellValue(dataModel.getBroken());
                row.createCell(9).setCellValue(dataModel.getProbegName());
                row.createCell(10).setCellValue(dataModel.getPrice());
                row.createCell(11).setCellValue(dataModel.getRead());
                row.createCell(12).setCellValue(dataModel.getVladelec());
                row.createCell(13).setCellValue(dataModel.getContact());
                row.createCell(14).setCellValue(dataModel.getItem_data());
                row.createCell(15).setCellValue(dataModel.getNumber());
            }
            try (BufferedOutputStream fio = new BufferedOutputStream(new FileOutputStream(fileName))) {
                workbook.write(fio);
            }

    }

            @Test
            public void testGamebomb() throws  IOException {
                WebClient webClient = new WebClient();
                webClient.getOptions().setJavaScriptEnabled(true);
                webClient.getOptions().setActiveXNative(true);
                webClient.getOptions().setAppletEnabled(true);
                webClient.getOptions().setCssEnabled(true);

                List<parser> parserListNews = new ArrayList<>();

                String arg = "&p=";
                String use = "?user=1";

                for (int i = 1;i < 10; i++) {
                    Document document = Jsoup.connect(baseUrl + use + arg + i).get();
                    Elements h3Elements = document.getElementsByAttributeValue("class", "b-item js-catalog-item-enum");
                    h3Elements.forEach(h3Element -> {
                        Element element = h3Element;
                        String url = element.getElementsByClass("item-link").attr("href");
                       // String nameAuto = element.child(0).getElementsByClass("item-header").text();
                        //String price = element.child(0).getElementsByClass("item-price ").text();
                        //String timeCity = element.child(0).getElementsByClass("item-info").text();
                       // parserListNews.add(new parser(url,null,null,null));

                        try {
                            Thread.sleep(3000);
                            driver.get("https://m.avito.ru" + url);
                            Thread.sleep(2000);
                            pars();
                            Thread.sleep(2000);
                            driver.findElement(By.linkText("Показать номер")).click();
                            Thread.sleep(3000);

                        } catch (InterruptedException | IOException e) {
                            e.printStackTrace();
                        }
                    });
                }

            }

            @After
            public void tearDown() throws Exception {
                String verificationErrorString = verificationErrors.toString();
                if (!"".equals(verificationErrorString)) {
                    fail(verificationErrorString);
                }
            }

            private boolean isElementPresent(By by) {
                try {

                    driver.findElement(by);
                    return true;

                } catch (NoSuchElementException e) {
                    return false;
                }
            }

            private boolean isAlertPresent() {
                try {
                    driver.switchTo().alert();
                    return true;
                } catch (NoAlertPresentException e) {
                    return false;
                }
            }

            private String closeAlertAndGetItsText() {
                try {
                    Alert alert = driver.switchTo().alert();
                    String alertText = alert.getText();
                    if (acceptNextAlert) {
                        alert.accept();
                    } else {
                        alert.dismiss();
                    }
                    return alertText;
                } finally {
                    acceptNextAlert = true;
                }
            }
            }

