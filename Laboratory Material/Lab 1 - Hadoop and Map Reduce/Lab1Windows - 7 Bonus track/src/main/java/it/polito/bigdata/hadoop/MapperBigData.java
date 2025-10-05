package it.polito.bigdata.hadoop;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


/**
 * Basic MapReduce Project - Mapper for 2-grams
 */
class MapperBigData extends Mapper<
                    LongWritable, // Input key type
                    Text,         // Input value type
                    Text,         // Output key type
                    IntWritable> {// Output value type
    
    protected void map(
            LongWritable key,   // Input key type
            Text value,         // Input value type
            Context context) throws IOException, InterruptedException {

            // Split each sentence in words. Use whitespace(s) as delimiter 
    		// (=a space, a tab, a line break, or a form feed)
    		// The split method returns an array of strings
            String[] words = value.toString().split("\\s+");
            
            // Iterate over the set of words
            for(int i = 0; i < words.length - 1; i++) {
            	// Transform word case for both words in the pair
                String word1 = words[i].toLowerCase();
                String word2 = words[i + 1].toLowerCase();

                // Create the 2-gram by concatenating the two words with a space in between
                String bigGram = word1 + " " + word2;

                // emit the pair (2-gram, 1)
                context.write(new Text(bigGram), new IntWritable(1));
            }
    }
}
