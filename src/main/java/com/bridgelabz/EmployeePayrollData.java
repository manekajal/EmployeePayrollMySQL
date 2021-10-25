package com.bridgelabz;



import java.sql.*;
import java.sql.Connection;

public class EmployeePayrollData {


    public static void createEmployee(){

        try{
            Connection connection=EmployeePayrollDB.getConnection();
            Statement statement = connection.createStatement();
            String insert=String.format("INSERT INTO employee_payroll(name,gender,salary,start)" + "VALUES('BILL','M', 12356,'2021-21/02')");
            int executeUpdate = statement.executeUpdate(insert);
            if(executeUpdate ==1){
                System.out.println("Table is updated..");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



}
