package Payroll;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        double weeklyPayRoll;
        double salary;
        double totalSales;
        double salesPerc;
        int numItems;
        double earnPerItems;
        int workedHours;
        double hourPrice;
        double perSup;
        Vector<Employe> employee = new Vector<Employe>();
        Employe employeeTemp;

        System.out.println("enter number of employee");
        Scanner keyBoard = new Scanner(System.in);
        int numb = keyBoard.nextInt();
        while(numb > 0){
            System.out.println("si l'employe est un Patron press 0\n" + "si l'employe est un Travailleur Commission press 1\n"
            + "si l'employe est un Travailleur Piece press 2\n" + "si l'employe est un Travailleur Horaire press 3\n");
            int switcher = keyBoard.nextInt();
            switch (switcher){
                case 0:{
                    System.out.println("enter le nom et le prenom et le salaire du Patron");
                    firstName = keyBoard.next();
                    lastName = keyBoard.next();
                    weeklyPayRoll = keyBoard.nextDouble();
                    employee.addElement(new Patron(firstName, lastName, weeklyPayRoll));
                    break;
                }
                case 1:{
                    System.out.println("enter le nom, prenom, salaire, vente total et le poucentage de vente du Travailleur Commission");
                    firstName = keyBoard.next();
                    lastName = keyBoard.next();
                    salary = keyBoard.nextDouble();
                    totalSales = keyBoard.nextDouble();
                    salesPerc = keyBoard.nextDouble();
                    employee.addElement(new TravailleurCommission(firstName, lastName, salary, totalSales, salesPerc));
                    break;
                }
                case 2:{
                    System.out.println("enter le nom, prenom, nombre d'Items et le poucentage_Items du Travailleur Piece");
                    firstName = keyBoard.next();
                    lastName = keyBoard.next();
                    numItems = keyBoard.nextInt();
                    earnPerItems = keyBoard.nextDouble();
                    employee.addElement(new TravailleurPiece(firstName, lastName, numItems, earnPerItems));
                    break;
                }
                case 3:{
                    System.out.println("enter le nom, prenom, salaire, worked_hours hour_price per_hour du Travailleur Horaire");
                    firstName = keyBoard.next();
                    lastName = keyBoard.next();
                    workedHours = keyBoard.nextInt();
                    hourPrice = keyBoard.nextDouble();
                    perSup = keyBoard.nextDouble();
                    employee.addElement(new TravailleurHoraire(firstName, lastName, workedHours, hourPrice, perSup));
                    break;
                }
                default: System.out.println("Error: Your choice doesn't exist :3");
            }
            numb--;
        }

        Iterator<Employe> index = employee.iterator();
        while(index.hasNext()){
            employeeTemp = index.next();
            System.out.println(employeeTemp.getClass() + " " + employeeTemp);
        }
    }
}
