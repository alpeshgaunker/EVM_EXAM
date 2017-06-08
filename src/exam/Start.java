package exam;

import javax.swing.JOptionPane;

public class Start
{ public static void main(String[] a)
  {
    VoteTable table = new VoteTable();   

   
    boolean processing = true;
    while ( processing )
          { String s = JOptionPane.showInputDialog(
	                 "Please type the last name of your candidate:");
            if ( s == null ) 
                 { processing = false; }  
            else { if ( s.equals("Bush") )
	              { table.voteForBush(); }
                   else if ( s.equals("Kerry") )
		      { table.voteForKerry(); }
                   else if ( s.equals("Nader") )
		      { table.voteForNader(); }
		   else { } 
                 }
           }
     
     System.out.println( table.computeTotals() );
     System.exit(0);  
  }
}