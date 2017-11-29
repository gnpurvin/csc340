/**
 * Copyright (c) 2017, MindFusion LLC - Bulgaria.
 */
package PikoLuna1;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.mindfusion.drawing.SolidBrush;
import com.mindfusion.spreadsheet.HorizontalAlignment;
import com.mindfusion.spreadsheet.IStyle;
import com.mindfusion.spreadsheet.Measure;
import com.mindfusion.spreadsheet.VerticalAlignment;
import com.mindfusion.spreadsheet.Workbook;
import com.mindfusion.spreadsheet.Worksheet;
import com.mindfusion.spreadsheet.WorksheetView;


public class LisaGrid
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				MainWindow window = new MainWindow();
				window.setTitle("JSpreadsheet Sample: Database Functions");
				window.setVisible(true);
			}
		});
	}
	
	public static class MainWindow extends JFrame
	{
		public MainWindow()
		{
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(1280, 1024);

			Workbook workbook = new Workbook();
			Worksheet worksheet = workbook.getWorksheets().add("Database Functions");

			WorksheetView view = new WorksheetView();
			view.setWorksheet(worksheet);
			add(view);

			// Initialize the worksheet
			worksheet.beginInit();
			worksheet.getRows().get(0, worksheet.getRows().getCount() - 1).setHeight(new Measure("24pt"));
			worksheet.getRows().get(0).getStyle().setFontBold(true);
			worksheet.getColumns().get(0).setWidth(new Measure("100pt"));
			worksheet.getColumns().get(1).setWidth(new Measure("100pt"));
			worksheet.getColumns().get(6).setWidth(new Measure("80pt"));
			worksheet.getColumns().get(4).setWidth(new Measure("100pt"));
			worksheet.getColumns().get(8).setWidth(new Measure("50pt"));
			worksheet.getColumns().get(7).setWidth(new Measure("125pt"));
			worksheet.getColumns().get(10).setWidth(new Measure("75pt"));
			worksheet.getColumns().get(11).setWidth(new Measure("75pt"));
			

	
			IStyle style;
			style = worksheet.getCellRanges().get(0, 0, worksheet.getColumns().getCount() - 1, worksheet.getRows().getCount() - 1).getStyle();
			style.setFontName("Segoe UI");
			style.setFontSize(14.0);
			style.setPaddingLeft(new Measure("4px"));
			style.setPaddingTop(new Measure("4px"));
			style.setPaddingRight(new Measure("4px"));
			style.setPaddingBottom(new Measure("4px"));
			style.setHorizontalAlignment(HorizontalAlignment.Left);
			style.setVerticalAlignment(VerticalAlignment.Middle);
	
		
			style = worksheet.getCellRanges().get("A1:L1").getStyle();
			style.setBackground(new SolidBrush(new Color(0xF4, 0xFA, 0xFF)));
	
	
			worksheet.getCells().get("A1").setData("Model");
			worksheet.getCells().get("B1").setData("Brand");
			worksheet.getCells().get("C1").setData("Rating");
			worksheet.getCells().get("D1").setData("Price");
			worksheet.getCells().get("E1").setData("Operating System");
			worksheet.getCells().get("F1").setData("Cores");
			worksheet.getCells().get("G1").setData("Processor");
			worksheet.getCells().get("H1").setData("Graphics Processor");
			worksheet.getCells().get("I1").setData("Storage");
			worksheet.getCells().get("J1").setData("RAM");
			worksheet.getCells().get("K1").setData("Display Size");
			worksheet.getCells().get("L1").setData("Display Type");
	
			worksheet.endInit();
		}

		private static final long serialVersionUID = 1L;
	}
}