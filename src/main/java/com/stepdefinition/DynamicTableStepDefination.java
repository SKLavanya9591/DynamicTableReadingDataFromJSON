package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.pageobjectmodel.DynamicTablePOM;

import io.cucumber.java.en.*;

public class DynamicTableStepDefination {
	DynamicTablePOM pom=new DynamicTablePOM();

	@Given("I open the Dynamic HTML Table")
	public void i_open_the_Dynamic_HTML_Table() throws InterruptedException {
		pom.openApplication();
	    
	}

	@When("Insert the values into Dynamic table reading JSON file")
	public void insert_the_values_into_Dynamic_table_reading_JSON_file() throws FileNotFoundException, IOException, ParseException, InterruptedException {
		pom.insertValuesIntoTheTable();
	   
	}

	@Then("Verify all the values are inserted inside the table are correct")
	public void verify_all_the_values_are_inserted_inside_the_table_are_correct() {
		pom.assertTheInsertedValues();
	    
	}

}
