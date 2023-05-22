package general;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileOperations {

	public static void main(String[] args) throws IOException {

		String myFilePath = "/home/sagar/eclipse-workspace/JavaPractice/src/resources/MyFile.txt";
		File myFile = new File(myFilePath);
		Boolean isExists = false;
		String myFileNewPath = "/home/sagar/eclipse-workspace/JavaPractice/src/resources/MyRenamedFile.txt";
		File myNewFile = new File(myFileNewPath);

		// Creates a file
		if (myFile.createNewFile()) {
			System.out.println("File created");
		} else {
			System.out.println("File already exists with name " + myFile.getName() + " on provded path.");
		}

		// Writes to the file
		FileWriter fw = new FileWriter(myFile);
		fw.write("Hello my text file..!!");
		fw.close();
		System.out.println("Wrote successfully in file");

		// Read from the file
		Scanner sc = new Scanner(myFile);
		if (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

		// Append to the file
		FileWriter fw2 = new FileWriter(myFile, true);
		fw2.append("Append to my text file..!!");
		fw2.close();
		System.out.println("Appended successfully to file");

		// Read from file
		Scanner sc2 = new Scanner(myFile);
		while (sc2.hasNext()) {
			System.out.println(sc2.nextLine());
		}

		// Check if a string exists in file or not
		System.out.println("Searching....");
		Scanner sc3 = new Scanner(myFile);

		while (sc3.hasNext()) {
			if (sc3.nextLine().contains("Hello")) {
				isExists = true;
			}
		}
		if (isExists == true) {
			System.out.println("Present");
		} else {
			System.out.println("Absent");
		}
		
		
		// Rename file
		myFile.renameTo(myNewFile);
	
		// Delete File
		myNewFile.delete();
	}

}
