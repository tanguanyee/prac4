/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class P4Q1 {
public static void main(String []args){
    
        Employee emp1 = new Employee("GY",5000.00);
        Employee emp2 = new Employee("JY");
        emp2.setSalary(5600.00);
        /* //part b
        System.out.println("Name:" + emp1.getName());
        System.out.println("Current Salary:" + emp1.getSalary());
        
        emp1.raiseSalary(8);
        System.out.println("New Salary:" + emp1.getSalary());
        */
        
        //part c
        if (emp1.getSalary()>emp2.getSalary()) {
            System.out.println(emp1.getName()+" "+emp1.getSalary());
        }else{
             System.out.println(emp2.getName()+" "+emp2.getSalary());
        }
        
        System.out.printf("%.2f + %.2f = %.2f\n",emp1.getSalary(),emp2.getSalary(),emp1.getSalary()+emp2.getSalary());
    }}
