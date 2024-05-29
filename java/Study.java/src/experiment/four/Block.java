package experiment.four;

import java.util.Date;

public class Block {
	private long index;
	private String hash;
    private String previousHash;
    private String data; 
    private Date timeStamp; 
    private int difficulty;
 
    public Block(long i,String data,String hash,String pHash,int d) {
    	super();
    	this.index = i;
    	this.data = data;
    	this.hash = hash;
    	this.previousHash = pHash;
    	this.difficulty = difficulty;
        this.timeStamp = new Date();
    }
	public long getIndex() {
    	
    	return index;
    }
    public String getHash() {
    	
    	return hash;
    }
    public String getPreviousHash() {
    	
    	return previousHash;
    }
    public String getData() {
    	
    	return data;
    }
    public Date getTimeStamp() {
    	
    	return timeStamp ;
    }

}
