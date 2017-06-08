public class VoteTable
{
  private int[] vote; 
  
  public VoteTable()
  { vote = new int[3]; } 

  
  public void voteForBush()
  { vote[0] = vote[0] + 1; }

  
  public void voteForKerry()
  { vote[1] = vote[1] + 1; }

  
  public void voteForNader()
  { vote[2] = vote[2] + 1; }

  /** computeTotals reports the votes for the three candidates
    * @return a string that lists the candidates and their votes. */
  public String computeTotals()
  { return   "Bush = " + vote[0] + "\n"
           + "Kerry = " + vote[1] + "\n"
           + "Nader= " + vote[2] + "\n" ; }
}