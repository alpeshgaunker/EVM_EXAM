public class TestModel
{ public static void main(String[] a)
  { VoteTable t = new VoteTable();

    System.out.println(t.computeTotals()); 

    t.voteForNader(); 
    System.out.println(t.computeTotals()); 

    t.voteForKerry();
    System.out.println(t.computeTotals());  
  }
}