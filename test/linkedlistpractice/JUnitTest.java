package linkedlistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author uddhav
 */
public class JUnitTest extends TestCase {
    public Integer[] intArr, intArr1;
    public ArrayList<Integer> arrList, arrList1;
    public MyLinkedList myLinkedList, myLinkedList1, myLinkedList2;
    
    public JUnitTest() {
        super();
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();  
        
        intArr = new Integer[]{1};
        arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(intArr));
        myLinkedList = new MyLinkedList(arrList);
        
        intArr1 = new Integer[]{10, 20, 30, 40};
        arrList1 = new ArrayList<>();
        arrList1.addAll(Arrays.asList(intArr1));
        myLinkedList1 = new MyLinkedList(arrList1);
        
        myLinkedList2 = new MyLinkedList(null);
    }
    
    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();        
    }
    
     @Test
     public void testReverseSingleValue() { 
         assertEquals(1, myLinkedList.reverse(myLinkedList.getHeadNode()).data);
     }
     
     @Test
     public void testReverseMultipleValues() { 
         assertEquals(40, myLinkedList1.reverse(myLinkedList1.getHeadNode()).data);
     }
     
     @Test
     public void testReverseNoValue() {  
         boolean myBoolean = false;
         if(myLinkedList1.reverse(myLinkedList2.getHeadNode()) == null) {
             myBoolean = true;
         }
           assertEquals(true, myBoolean);
     }
     
}
