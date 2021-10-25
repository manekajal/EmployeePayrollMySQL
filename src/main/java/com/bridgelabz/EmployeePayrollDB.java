package com.bridgelabz;

import java.sql.*;
import java.util.Enumeration;


public class EmployeePayrollDB {




       public static String jdbcUrl = "jdbc:mysql://localhost:3306/payroll_service?useSSl=false";
      public static   String userName = "root";
       public static String password = "Kajal@95";
    private static Connection connection;


    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
            listDrivers();
            try {
                System.out.println("Connecting to database" + jdbcUrl);
               Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
                System.out.println("Connection is successfull"+connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    public static Connection getConnection(){
        return connection;
    }
    private static void listDrivers() {
        Enumeration<Driver> driverlist = DriverManager.getDrivers();
        while (driverlist.hasMoreElements()) {
            Driver driver = driverlist.nextElement();
            System.out.println(" " + driver.getClass().getName());
        }

    }



}
