package InputOutput;

import java.io.BufferedWriter; 
import java.io.FileWriter;     
import java.io.IOException;    

public class WriterFile {
    public static void main(String[] args) {
    	 
    			BufferedWriter writer=null;
    			try {
    			
    		writer= new BufferedWriter(new FileWriter("example.txt" , true));
    			writer.write("Hello Learners ");
    			writer.newLine();
    			System.out.println("Successfully Written to file");
    			}
    			catch(IOException e)
    			{
    				System.out.println("An error occurred while writing to the file: "  +e.getMessage());
    	 
    			}
    			finally
    			{
    				try
    				{
    					if(writer !=null)
    					 writer.close();
    				}
    				catch(IOException e)
    				{
    					System.out.println("Error while closing the writer: " +e.getMessage());
    				}
    			}
    			}
    		}
    	 
    	 