package edu.csupomona.cs480.data;

import java.util.Date;


/**
 * The basic user object.
 */
public class Problem {

	/** The unique problem Id */
    private String problemID;
    
    private String title;
    
      /** The  */
    private String quater;
    
    /** The  */
   private String year;
   /** The  */
  private String week;
    /**  */    
    private String pdfURL;
    
    /** The timestamp when the user is being created */
    private String creationTime = new Date(System.currentTimeMillis()).toString();

    public String getId() {
        return problemID;
    }

    public void setId(String problemID) {
        this.problemID = problemID;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQuater() {
		return quater;
	}

	public void setQuater(String quater) {
		this.quater = quater;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public String getweek() {
		return week;
	}

	public void setWeek(String quater) {
		this.quater = quater;
	}


	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
}
