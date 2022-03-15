package com.car.application.carapp.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.car.application.carapp.beans.Car;


@Service("carService")
public class CarServiceImpl implements ICarService {

	
	  private List<Car> carList;
	  
	  public CarServiceImpl(){
		  carList = new ArrayList<Car>();
		  carList = getCarsFromExcel();		  
	  }
	
	
		
	private List<Car> getCarsFromExcel() {
		// TODO Auto-generated method stub
		List<Car> list = new ArrayList<Car>();
		try {
		    File file = ResourceUtils.getFile("classpath:excel/car.xslx");
		    FileInputStream fis = null;
		    fis = new FileInputStream(file.getAbsolutePath());
		    @SuppressWarnings("resources")
		    Workbook workbook = new XSSFWorkbook(fis);
		    int numberOfSheets = workbook.getNumberOfSheets();
		    for(int i=0;i<numberOfSheets;i++) {
		    	Sheet sheet = workbook.getSheetAt(i);
		    	Iterator<Row> rowIterator =sheet.iterator();
		    	
		    }
		}catch(Exception e){
			
		}
		return null;
	}






	@Override
	public Car getCarbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Car> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
