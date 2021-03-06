package com.gul.test;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

public class FormatedBorders {
	public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

		// Creating a PdfWriter
		String dest = "C:/itextExamples/addingImage.pdf";
		PdfWriter writer = new PdfWriter("addingImage.pdf");

		// Creating a PdfDocument
		PdfDocument pdf = new PdfDocument(writer);

		// Creating a Document
		Document document = new Document(pdf);

		// Creating an ImageData object
		String imFile = "D:/Fevicon Icon Bundle/Icon From Website/PSD-File-icon.png";
		ImageData data = ImageDataFactory.create(imFile);

		// Creating an Image object
		Image image = new Image(data);

		// Adding image to the document
		document.add(image);

		// Closing the document
		document.close();

		System.out.println("Image added");
	}
}
