package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("How many  employess will be registered ? ");
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			
			System.out.println("Emplyoee #" + (i +1)+":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, name, salary);
			
			list.add(funcionario);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.print("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		
		for(Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		sc.close();
		
	}
	
	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	} 

}
