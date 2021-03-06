package l2f.interpretation;

import java.util.Map;

import com.aliasi.corpus.ObjectHandler;


/**
 * The <code>LexiconMapHandler</code> interface specifies a single method
 * that applies to a LexiconMap. The standard usage for a
 * handler is to handle map generated by a {@link LexiconMapParser}.  
 */
public interface LexiconMapHandler extends ObjectHandler<Map<Long,String>> {
	/**
	 * Handle the constructed map.
	 */
	public void handle(Map<Long,String> map);	
}