package com.dietician.pages;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PdfPage {
	
	private WebDriver driver;
	
	public PdfPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean hasPdfExtensionInURL() {
		String url = driver.getCurrentUrl();
		
		if(url.contains(".pdf")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean verifyPDFContent(String contentText) throws Exception {
		String url = driver.getCurrentUrl();
        String pdfContent = readPDFContent(url);

        if(pdfContent.contains(contentText)) {
        	return true;
        } else {
        	return false;
        }
    }
	
	
	/**
	 * @param appUrl
	 * @return
	 * @throws Exception
	 * URL: https://www.edureka.co/community/51076/read-pdf-content-on-a-browser-using-selenium-webdriver
	 */
	public String readPDFContent(String appUrl) throws Exception {

        URL url = new URL(appUrl);
        InputStream input = url.openStream();
        BufferedInputStream fileToParse = new BufferedInputStream(input);
        PDDocument document = null;
        String output = null;

        try {
            document = PDDocument.load(fileToParse);
            output = new PDFTextStripper().getText(document);
            System.out.println(output);

        } finally {
            if (document != null) {
                document.close();
            }
            fileToParse.close();
            input.close();
        }
        return output;
    }
	
	

}
