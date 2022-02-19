
import java.util.ArrayList;
import java.io.*;

class Main {

  public static ArrayList createEmails( ArrayList<String> firstNames, ArrayList<String> lastNames)
  {
    ArrayList<String> emails = new ArrayList<String>();

    for ( int i = 0; i < firstNames.size(); i++ )
    {
      emails.add( firstNames.get(i) + "." + lastNames.get(i) + "@gmail.com");
    }

    return emails;
  }

  public static void printEmails( ArrayList<String> emails)
  {
    for ( int i = 0; i < emails.size(); i++ )
    {
      System.out.println(emails.get(i));
    }

  }

  
  public static void main(String[] args) {
    ArrayList<String> firstNames = new ArrayList<String>();

    ArrayList<String> lastNames = new ArrayList<String>();
    //add first and last names from list
    File firstFile = new File("FirstNames.txt");
    File lastFile = new File("LastNames.txt");
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(firstFile));
      BufferedReader br2 = new BufferedReader(new FileReader(lastFile));
      String st;
      String st2;
      while ((st = br.readLine()) != null && (st2 = br2.readLine()) != null )
      {
        // System.out.println(st);
        firstNames.add(st);
        // System.out.println(st2);
        lastNames.add(st2);
      }
    }
    catch ( IOException ex )
    {
      System.out.println(ex);
    }
    
    //concatenate first and last name with some email provider, gmail, aol, yahoo, and .com/.org/edu

    printEmails(createEmails( firstNames, lastNames));
      
  }
}
