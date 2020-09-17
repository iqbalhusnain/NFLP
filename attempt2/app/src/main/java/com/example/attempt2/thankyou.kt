package com.example. attempt2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.attempt2.R
import com.example.attempt2.generate_sheet
import org.apache.poi.hssf.usermodel.HSSFFont
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream


class thankyou : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thankyou)
        val filename = intent.getStringExtra("filename")
        val sheet = findViewById<Button>(R.id.generate_sheet)
        val participantsNumbers = intent.getStringExtra("participantsNumbers")
        val file = File(filename)
        val fip = FileInputStream(file)
        val workbook = XSSFWorkbook(fip)
        val evaluator: FormulaEvaluator = workbook.creationHelper.createFormulaEvaluator()
        val sheet2: Sheet = workbook.createSheet("Classroom")
        val style: CellStyle = workbook.createCellStyle()
        style.setVerticalAlignment(VerticalAlignment.CENTER)
        val font: Font = workbook.createFont()
        font.fontName = HSSFFont.FONT_ARIAL
        font.fontHeightInPoints = 9.toShort()
        font.bold = true
        style.wrapText = true
        style.setAlignment(HorizontalAlignment.CENTER)
        style.setFont(font)
        val style2: CellStyle = workbook.createCellStyle()
        style2.wrapText = true
        style2.setAlignment(HorizontalAlignment.CENTER)
        style2.setVerticalAlignment(VerticalAlignment.CENTER)
        sheet.setOnClickListener {
            val row1 = sheet2.createRow(0);
            val row2 = sheet2.createRow(1)
            val row1cell1 = row1.createCell(0);
            val row2cell1 = row2.createCell(0)
            row1cell1.setCellValue("Sr. No.");
            row2cell1.setCellValue("1")
            row1cell1.cellStyle = style;
            row2cell1.cellStyle = style2
            sheet2.setColumnWidth(0, 8 * 256)
            val row1cell2 = row1.createCell(1);
            val row2cell2 = row2.createCell(1)
            row1cell2.setCellValue("District");
            row2cell2.cellFormula = "'Trainer Area'!D2"
            evaluator.evaluateFormulaCell(row2cell2);
            row1cell2.cellStyle = style;
            sheet2.setColumnWidth(1, 14 * 256);
            row2cell2.cellStyle = style2
            val row1cell3 = row1.createCell(2);
            val row2cell3 = row2.createCell(2)
            row1cell3.setCellValue("Bank Name");
            row1cell3.cellStyle = style;
            row2cell3.cellFormula = "'Trainer Area'!A2"
            evaluator.evaluateFormulaCell(row2cell3)
            sheet2.setColumnWidth(2, 20 * 256);
            row2cell3.cellStyle = style2
            val row1cell4 = row1.createCell(3);
            val row2cell4 = row2.createCell(3)
            row1cell4.setCellValue("Name of Field Trainer");
            row1cell4.cellStyle = style;
            row2cell4.cellFormula = "'Trainer Area'!F2"
            evaluator.evaluateFormulaCell(row2cell4)
            sheet2.setColumnWidth(3, 20 * 256);
            row2cell4.cellStyle = style2
            val row1cell5 = row1.createCell(4);
            val row2cell5 = row2.createCell(4)
            row1cell5.setCellValue("Field Trainer E-mail");
            row1cell5.cellStyle = style;
            sheet2.setColumnWidth(4, 20 * 256);row2cell5.cellStyle = style2
            val row1cell6 = row1.createCell(5);val row2cell6 = row2.createCell(5)
            row1cell6.setCellValue("Field Trainer Contact No.")
            row1cell6.cellStyle = style;
            row2cell6.cellFormula = "'Trainer Area'!G2"
            evaluator.evaluateFormulaCell(row2cell6)
            sheet2.setColumnWidth(5, 26 * 256);row2cell6.cellStyle = style2
            val row1cell7 = row1.createCell(6);val row2cell7 = row2.createCell(6)
            row1cell7.setCellValue("Session Date")
            row1cell7.cellStyle = style;
            row2cell7.cellFormula = "'Trainer Area'!H2"
            evaluator.evaluateFormulaCell(row2cell7)
            sheet2.setColumnWidth(6, 17 * 256);row2cell7.cellStyle = style2
            val row1cell8 = row1.createCell(7);val row2cell8 = row2.createCell(7)
            row1cell8.setCellValue("Venue/ Location of Session")
            row1cell8.cellStyle = style;
            row2cell8.cellFormula = "'Trainer Area'!E2"
            evaluator.evaluateFormulaCell(row2cell8)
            sheet2.setColumnWidth(7, 25 * 256);row2cell8.cellStyle = style2
            val row1cell9 = row1.createCell(8);val row2cell9 = row2.createCell(8)
            row1cell9.setCellValue("Name OF Institute Partner")
            row1cell9.cellStyle = style;
            row2cell9.cellFormula = "'Trainer Area'!C2"
            evaluator.evaluateFormulaCell(row2cell9)
            sheet2.setColumnWidth(8, 20 * 256);row2cell9.cellStyle = style2
            val row1cell10 = row1.createCell(9);val row2cell10 = row2.createCell(9)
            row1cell10.setCellValue("Session Beginning Time")
            row1cell10.cellStyle = style;
            row2cell10.cellFormula = "'Trainer Area'!I2"
            evaluator.evaluateFormulaCell(row2cell10)
            sheet2.setColumnWidth(9, 15 * 256);row2cell10.cellStyle = style2
            val row1cell11 = row1.createCell(10);val row2cell11 = row2.createCell(10)
            row1cell11.setCellValue("Session Ending Time")
            row1cell11.cellStyle = style;
            row2cell11.cellFormula = "'Trainer Area'!J2"
            evaluator.evaluateFormulaCell(row2cell11)
            sheet2.setColumnWidth(10, 15 * 256);row2cell11.cellStyle = style2
            val row1cell12 = row1.createCell(11);val row2cell12 = row2.createCell(11)
            row1cell12.setCellValue("Session Status")
            row1cell12.cellStyle = style;row2cell12.setCellValue("Completed")
            sheet2.setColumnWidth(11, 13 * 256);row2cell12.cellStyle = style2
            val row1cell13 = row1.createCell(12);val row2cell13 = row2.createCell(12)
            row1cell13.setCellValue("Name Of Field Trainer.1")
            row1cell13.cellStyle = style;
            row2cell13.cellFormula = "'Trainer Area'!F2"
            evaluator.evaluateFormulaCell(row2cell13)
            sheet2.setColumnWidth(12, 20 * 256);row2cell13.cellStyle = style2
            val row1cell14 = row1.createCell(13);val row2cell14 = row2.createCell(13)
            row1cell14.setCellValue("Session Date.1")
            row1cell14.cellStyle = style;
            row2cell14.cellFormula = "'Trainer Area'!H2"
            evaluator.evaluateFormulaCell(row2cell14)
            sheet2.setColumnWidth(13, 25 * 256);row2cell14.cellStyle = style2
            val row1cell15 = row1.createCell(14);val row2cell15 = row2.createCell(14)
            row1cell15.setCellValue("Venue/Location of Session.1")
            row1cell15.cellStyle = style;
            row2cell15.cellFormula = "'Trainer Area'!E2"
            evaluator.evaluateFormulaCell(row2cell15)
            sheet2.setColumnWidth(14, 25 * 256);row2cell15.cellStyle = style2
            val row1cell16 = row1.createCell(15);val row2cell16 = row2.createCell(15)
            row1cell16.setCellValue("Name Of Institiute Partner.1")
            row1cell16.cellStyle = style;
            row2cell16.cellFormula = "'Trainer Area'!C2"
            evaluator.evaluateFormulaCell(row2cell16)
            sheet2.setColumnWidth(15, 20 * 256);row2cell16.cellStyle = style2
            val row1cell17 = row1.createCell(16);val row2cell17 = row2.createCell(16)
            row1cell17.setCellValue("Session Beginning Time.1")
            row1cell17.cellStyle = style;
            row2cell17.cellFormula = "'Trainer Area'!I2"
            evaluator.evaluateFormulaCell(row2cell17)
            sheet2.setColumnWidth(16, 15 * 256);row2cell17.cellStyle = style2
            val row1cell18 = row1.createCell(17);val row2cell18 = row2.createCell(17)
            row1cell18.setCellValue("Session Ending Time.1")
            row1cell18.cellStyle = style;
            row2cell18.cellFormula = "'Trainer Area'!J2"
            evaluator.evaluateFormulaCell(row2cell18)
            sheet2.setColumnWidth(17, 15 * 256);row2cell18.cellStyle = style2
            val row1cell19 = row1.createCell(18);val row2cell19 = row2.createCell(18)
            row1cell19.setCellValue("Male Participants")
            row1cell19.cellStyle = style;
            row2cell19.cellFormula = "COUNTIF('Participants Detail'!C2:C41 , \"Male\")";
            evaluator.evaluateFormulaCell(row2cell19)
            sheet2.setColumnWidth(18, 8 * 256);row2cell19.cellStyle = style2
            val row1cell20 = row1.createCell(19);val row2cell20 = row2.createCell(19)
            row1cell20.setCellValue("Female Participants")
            row1cell20.cellStyle = style;
            row2cell20.cellFormula = "COUNTIF('Participants Detail'!C2:C41 , \"Female\")"
            evaluator.evaluateFormulaCell(row2cell20)
            sheet2.setColumnWidth(19, 8 * 256);row2cell20.cellStyle = style2
            val row1cell21 = row1.createCell(20);val row2cell21 = row2.createCell(20)
            row1cell21.setCellValue("Total Number Of Participants")
            row1cell21.cellStyle = style;
            row2cell21.cellFormula = "'Trainer Area'!K2"
            evaluator.evaluateFormulaCell(row2cell21)
            sheet2.setColumnWidth(20, 20 * 256);row2cell21.cellStyle = style2
            val row1cell22 = row1.createCell(21);val row2cell22 = row2.createCell(21)
            row1cell22.setCellValue("A/C Opened Male")
            row1cell22.cellStyle = style;
            row2cell22.cellFormula = "COUNTIFS('Participants Detail'!C2:C41,\"Male\",'Participants Detail'!J2:J41,\"Y\")"
            evaluator.evaluateFormulaCell(row2cell22)
            sheet2.setColumnWidth(21, 15 * 256);row2cell22.cellStyle = style2
            val row1cell23 = row1.createCell(22);val row2cell23 = row2.createCell(22)
            row1cell23.setCellValue("A/C Opened Female")
            row1cell23.cellStyle = style;
            row2cell23.cellFormula = "COUNTIFS('Participants Detail'!C2:C41,\"Female\",'Participants Detail'!J2:J41,\"Y\")"
            evaluator.evaluateFormulaCell(row2cell23)
            sheet2.setColumnWidth(22, 15 * 256);row2cell23.cellStyle = style2
            val row1cell24 = row1.createCell(23);val row2cell24 = row2.createCell(23)
            row1cell24.setCellValue("Total A/C Opened")
            row1cell24.cellStyle = style;
            row2cell24.cellFormula = "COUNTIF('Participants Detail'!J2:J41, \"Y\")"
            evaluator.evaluateFormulaCell(row2cell24)
            sheet2.setColumnWidth(23, 15 * 256);row2cell24.cellStyle = style2
            val fileOut = FileOutputStream(filename)
            workbook.write(fileOut);
            fileOut.close()
            workbook.close()

            val intent = Intent(this@thankyou, generate_sheet::class.java)
            intent.putExtra("filename", filename)
            intent.putExtra("participantsNumbers", participantsNumbers)
            startActivity(intent)
        }

    }
}
