/***********************************************************************
 * Module:  MetaDataXLS.java
 * Author:  Paloschi
 * Purpose: Defines the Class MetaDataXLS
 ***********************************************************************/

package metaData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import metaData.util.Atributo;
import metaData.util.Data;
import metaData.util.Elemento;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/** @pdOid 42d6ae60-a2f2-4949-88d6-bf46a6135e5b */

 /**
     * This method is used to display the Excel content to command line.
     *     
* @param xlsPath
     */
public class MetaDataXLS extends AbstractMetaDataGraph {

    private Data dados;
    
    @Override
    public Data getData() {
       return dados;
    }

    @Override
    public void generateData(String path) throws FileNotFoundException {
        
       // Data dt = new Data();
        
      //  Elemento e = new Elemento();
        
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("File not found in the specified path.");
            e.printStackTrace();
        }

        POIFSFileSystem fileSystem = null;

        try {
            dados = new Data();
        
          
             
            fileSystem = new POIFSFileSystem(inputStream);

            HSSFWorkbook workBook = new HSSFWorkbook(fileSystem);
            HSSFSheet sheet = workBook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();


            for (Row row : sheet) {
                for (Cell cell : row) {
                    
                 
                        
                        try {
                           // Atributo at = (Atributo) cell.getRichStringCellValue();
                            if(cell.getRowIndex()==0){
                                 Elemento el = new Elemento();
                                 el.setNome(cell.getRichStringCellValue().toString());
                                 dados.addElemento(el);
                            }
                            
                            cell.getRichStringCellValue();

                    } catch (Exception e) {
                            Atributo at = new Atributo();
                            at.setNome(cell.getRow().getCell(0).getStringCellValue());
                            at.setValor(cell.getNumericCellValue());
                      
                                int position = 0;
                                for(Elemento ee : dados.getElemento() ){
                                    
                                    System.out.println("------------------------------------------------");
                                    System.out.println(ee.getNome());
                                    System.out.println(sheet.getRow(0).getCell(cell.getColumnIndex()).getRichStringCellValue());
                                    
                                    if(sheet.getRow(0).getCell(cell.getColumnIndex()).getRichStringCellValue().toString().equals( ee.getNome())){
                                        ee.addAtributo( at );
                                    }
                                    
                                    position++;
                                }
                    
                            System.out.println(cell.getNumericCellValue());                            
                        
                    }
                
                }
            }
            
            }
         catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
       
        
      //  Atributo
        
        
      
    }
   /** @pdOid 45ca0d5d-a21d-40e2-b50e-5402242ae96b */



}