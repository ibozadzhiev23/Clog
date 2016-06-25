package about.article;

import java.io.Serializable;

public class CatchWord implements Serializable{

	private static final long serialVersionUID = 1L;
	private String catchWord;
	
	public CatchWord(String catchWord){
		this.catchWord = catchWord;
	}
	
	@Override
	public String toString(){
		return catchWord;
	}
	 @Override
	    public boolean equals(Object o) {
	        if (o == this) return true;
	        if (!(o instanceof CatchWord)) return false;
	        CatchWord b = (CatchWord)o;
	        return b.catchWord.equals(catchWord);
	    }
}
