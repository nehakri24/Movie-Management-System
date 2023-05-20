package com.hcl.gl.main;

import java.util.*;
import com.hcl.gl.dao.MovieDao;

public class Main 
{
	public static void main(String[] args) 
	{
		int noOfMovies,choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total number of movies");
		noOfMovies=sc.nextInt();
        MovieDao movieDao=new MovieDao(noOfMovies);  //OBJECT FOR DAO in class
		
		do
		{
			System.out.println("************Movie Management System Menu************");
			System.out.println("1. Adding a Movie in the Library");
			System.out.println("2. Updating a Movie in the Library");
			System.out.println("3. Deleting a Movie from the Library");
			System.out.println("4. Searching a Movie in the Library");
			System.out.println("5. Assign movie to a category");
			System.out.println("6. View All movies");
			System.out.println("0. Exit the application");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1: System.out.println("Add");
					movieDao.addMovie();
					break;

			case 2: 
					movieDao.updateMovie();
							break;

			case 3: System.out.println("Delete");
			break;

			case 4: movieDao.searchMovie();
			break;

			case 5: movieDao.assigneeMovie();
					
					break;
			case 6: movieDao.viewAllMovies();
			break;
			case 0: System.out.println("Exit");
			break;
			
			default: System.out.println("Please try again");

			}

		}
		while(choice!=0);


	}
}


















