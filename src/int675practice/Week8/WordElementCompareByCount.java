/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week8;

import java.util.Comparator;

/**
 *
 * @author INT675
 */
public class WordElementCompareByCount implements Comparator<WordElement> {

    @Override
    public int compare(WordElement o1,WordElement o2) {
        if(o2.getCount() == o1.getCount()){
            return o1.getWord().compareTo(o2.getWord());
        }
        else{
            return o1.getCount() - o2.getCount(); /*sort ASC*/
            //return o2.getCount() - o1.getCount(); /*sort DESC*/
            
        }
        
    }
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
