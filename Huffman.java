import java.util.*;

public class Huffman{

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter your sentence: ");
       String sentence = in.nextLine();
       String binaryString="";      //this stores the string of binary code
       
       
       for(int i=0; i < sentence.length(); i++){        //go through the sentence
           int decimalValue = (int)sentence.charAt(i);      //convert to decimal
           String binaryValue = Integer.toBinaryString(decimalValue);      //convert to binary
           for(int j=7;j>binaryValue.length();j--){
               binaryString+="0";           //this loop adds in those pesky leading zeroes
            }
           binaryString += binaryValue+" "; //add to the string of binary
       }
       System.out.println(binaryString);    //print out the binary
       
              
       int[] array = new int[256];      //an array to store all the frequencies
       
       for(int i=0; i < sentence.length(); i++){    //go through the sentence
           array[(int)sentence.charAt(i)]++;    //increment the appropriate frequencies
           
       }
       
       
       PriorityQueue < Tree >  PQ = new PriorityQueue < Tree >() ;  //make a priority queue to hold the forest of trees    
        
       
       for(int i=0; i<array.length; i++){ //go through frequency array
           if(array[i]>0){ //print out non-zero frequencies - cast to a char
                System.out.println("'"+(char)i+"' appeared "+array[i]+((array[i] == 1) ? " time" : " times"));
     
               Tree oak = new Tree();
               oak.frequency = array[i];
               Node temp = new Node();
               temp.letter = (char)i;
               oak.root = temp;
               PQ.add(oak);
                      
            }
        }
        
        
        while(PQ.size()>1){             //while there are two or more Trees left in the forest
           
        	Tree leftChild = PQ.poll();
        	Tree rightChild = PQ.poll();
            Tree parent = new Node();//cant add the nodes
            PQ.offer(parent);
           
        }
        
        Tree HuffmanTree = PQ.poll();   //now there's only one tree left - get its codes
        
        
        //FILL THIS IN:
        
        //get all the codes for the letters and print them out
        //call the getCode() method on the HuffmanTree Tree object for each letter in the sentence

        //print out all the info

    }

	
	}      
}