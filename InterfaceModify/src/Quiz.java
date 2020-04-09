
public class Quiz implements Measurable {
	
	private String name;
	private double score;
	
	/**
	 * Construct a country witha name and score.
	 * @param name student's name
	 * @param score total score of a student
	 */
	public Quiz (String Name, double Score)
	{
		
		this.name = Name;
		
		this.score = Score;
		
	}
	
	/**Measurable interface method to retrieve measure.
	 * @return the measured score
	 */
	public double getMeasure ()
	{
		
		return score;
		
	}
	

}
